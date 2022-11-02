package com.misterdiallo.backend.spring_chat_app.data;

import org.springframework.data.repository.CrudRepository;

public interface ConversationRepository extends CrudRepository<ConversationEntity, Long> {
}
