package com.bmw.chat.server.chatroom.domain.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("chatrooms")
@Data
@NoArgsConstructor
public class ChatRoom {
	
	@Id
	private String id;
	private String name;
	private String description;
	private List<ChatRoomUser> connectedUsers = new ArrayList<>();

	public ChatRoom(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public List<ChatRoomUser> getConnectedUsers() {
		return connectedUsers;
	}
	public void addUser(ChatRoomUser user) {
		this.connectedUsers.add(user);
	}
	public void removeUser(ChatRoomUser user) {
		this.connectedUsers.remove(user);
	}
	public int getNumberOfConnectedUsers(){
		return this.connectedUsers.size();
	}

}
