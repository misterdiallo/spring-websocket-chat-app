package com.misterdiallo.backend.spring_chat_app.storage;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "storage")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StorageProperties {

    private String location;



}
