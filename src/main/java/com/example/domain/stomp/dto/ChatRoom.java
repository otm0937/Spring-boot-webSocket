package com.example.domain.stomp.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class ChatRoom {
    private String roomId;
    private String name;

    public static ChatRoom create(String name) {
        var chatRoom = new ChatRoom();
        chatRoom.roomId = UUID.randomUUID().toString();
        chatRoom.name = name;
        return chatRoom;
    }
}
