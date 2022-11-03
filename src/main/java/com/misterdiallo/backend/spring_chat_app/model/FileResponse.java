package com.misterdiallo.backend.spring_chat_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FileResponse {
    private String name;
    private String uri;
    private String type;
    private long size;
}
