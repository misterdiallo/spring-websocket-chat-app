package com.misterdiallo.backend.spring_chat_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateGroupMessageModel {
    private String group_id;
    private String send_user_id;
    private String receiver_user_id;
    private String message_body;
}
