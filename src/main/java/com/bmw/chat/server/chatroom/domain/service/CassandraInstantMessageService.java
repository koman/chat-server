package com.bmw.chat.server.chatroom.domain.service;

//@Service
public class CassandraInstantMessageService /*implements InstantMessageService*/ {

//	@Autowired
//	private InstantMessageRepository instantMessageRepository;
//
//	@Autowired
//	private ChatRoomService chatRoomService;
//
//	@Override
//	public void appendInstantMessageToConversations(InstantMessage instantMessage) {
//		if (instantMessage.getText().contains("joined us :)") || instantMessage.getText().contains("left us :(")) {
//			return;
//		}
//		if (instantMessage.isFromAdmin() || instantMessage.isPublic()) {
//			ChatRoom chatRoom = chatRoomService.findById(instantMessage.getChatRoomId());
//
//			chatRoom.getConnectedUsers().forEach(connectedUser -> {
//				instantMessage.appendToUserConversation(connectedUser.getUsername());
//				instantMessageRepository.save(instantMessage);
//			});
//		} else {
//			instantMessage.appendToUserConversation(instantMessage.getFromUser());
//			instantMessageRepository.save(instantMessage);
//
//			instantMessage.appendToUserConversation(instantMessage.getToUser());
//			instantMessageRepository.save(instantMessage);
//		}
//	}
//
//	@Override
//	public List<InstantMessage> findAllInstantMessagesFor(String username, String chatRoomId) {
//		return instantMessageRepository.findInstantMessagesByUsernameAndChatRoomId(username, chatRoomId);
//	}
}
