package com.bmw.chat.server.chatroom.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.bmw.chat.server.chatroom.domain.model.ChatRoom;

public interface ChatRoomRepository extends CrudRepository<ChatRoom, String> {

}
