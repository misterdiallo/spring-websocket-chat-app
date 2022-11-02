package com.misterdiallo.backend.spring_chat_app.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateSimpleMessageModel {
    private String sender_user_id;
    private String receiver_user_id;
    private String message_body;
    private String parent_message;
}
