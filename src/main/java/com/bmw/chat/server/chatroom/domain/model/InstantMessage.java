package com.bmw.chat.server.chatroom.domain.model;


import lombok.Data;

@Data
public class InstantMessage {
	
	private String chatRoomId;
	private String fromUser;
	private String toUser;
	private String text;
//
//	public InstantMessage() {
//		this.date = new Date();
//	}
//
//	public boolean isPublic() {
//		return Strings.isNullOrEmpty(this.toUser);
//	}
//	public boolean isFromAdmin() {
//		return this.fromUser.equals(SystemUsers.ADMIN.getUsername());
//	}
//	public void appendToUserConversation(String username) {
//		this.username = username;
//	}
}
