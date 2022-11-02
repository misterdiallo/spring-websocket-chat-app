package com.misterdiallo.backend.spring_chat_app.data.simple;

import com.misterdiallo.backend.spring_chat_app.data.ConversationEntity;
import org.springframework.data.repository.CrudRepository;

public interface SimpleMessageRepository extends CrudRepository<SimpleMessageEntity, Long> {
}
