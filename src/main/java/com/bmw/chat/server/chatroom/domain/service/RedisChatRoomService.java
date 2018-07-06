package com.bmw.chat.server.chatroom.domain.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import com.bmw.chat.server.chatroom.domain.model.ChatRoom;
import com.bmw.chat.server.chatroom.domain.model.ChatRoomUser;
import com.bmw.chat.server.chatroom.domain.model.InstantMessage;
import com.bmw.chat.server.chatroom.domain.repository.ChatRoomRepository;
import com.bmw.chat.server.utils.Destinations;
import com.bmw.chat.server.utils.SystemMessages;

@Service
public class RedisChatRoomService implements ChatRoomService {

    @Autowired
    private SimpMessagingTemplate webSocketMessagingTemplate;

    @Autowired
    private ChatRoomRepository chatRoomRepository;

    @Override
    public ChatRoom save(ChatRoom chatRoom) {
        return chatRoomRepository.save(chatRoom);
    }

    @Override
    public ChatRoom findById(String chatRoomId) {
        return chatRoomRepository.findOne(chatRoomId);
    }

    @Override
    public ChatRoom join(ChatRoomUser joiningUser, ChatRoom chatRoom) {
        chatRoom.addUser(joiningUser);
        chatRoomRepository.save(chatRoom);

        sendPublicMessage(SystemMessages.welcome(chatRoom.getId(), joiningUser.getUsername()));
        updateConnectedUsersViaWebSocket(chatRoom);
        return chatRoom;
    }

    @Override
    public ChatRoom leave(ChatRoomUser leavingUser, ChatRoom chatRoom) {
        sendPublicMessage(SystemMessages.goodbye(chatRoom.getId(), leavingUser.getUsername()));

        chatRoom.removeUser(leavingUser);
        chatRoomRepository.save(chatRoom);

        updateConnectedUsersViaWebSocket(chatRoom);
        return chatRoom;
    }

    @Override
    public void sendPublicMessage(InstantMessage instantMessage) {
        webSocketMessagingTemplate.convertAndSend(
                Destinations.ChatRoom.publicMessages(instantMessage.getChatRoomId()),
                instantMessage);
    }

    @Override
    public void sendPrivateMessage(InstantMessage instantMessage) {
        webSocketMessagingTemplate.convertAndSendToUser(
                instantMessage.getToUser(),
                Destinations.ChatRoom.privateMessages(instantMessage.getChatRoomId()),
                instantMessage);

        webSocketMessagingTemplate.convertAndSendToUser(
                instantMessage.getFromUser(),
                Destinations.ChatRoom.privateMessages(instantMessage.getChatRoomId()),
                instantMessage);
    }

    @Override
    public List<ChatRoom> findAll() {
        return (List<ChatRoom>) chatRoomRepository.findAll();
    }

    private void updateConnectedUsersViaWebSocket(ChatRoom chatRoom) {
        webSocketMessagingTemplate.convertAndSend(
                Destinations.ChatRoom.connectedUsers(chatRoom.getId()),
                chatRoom.getConnectedUsers());
    }
}
