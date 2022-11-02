package com.misterdiallo.backend.spring_chat_app.data.simple;

import com.misterdiallo.backend.spring_chat_app.data.ConversationEntity;
import com.misterdiallo.backend.spring_chat_app.data.TypeMessageEntity;
import com.misterdiallo.backend.spring_chat_app.data.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "simpleMessage")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SimpleMessageEntity  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "conversation_id", nullable = false)
    private ConversationEntity conversation_id;

    @Column(name = "body_message_simple", nullable = false)
    private String body_message_simple;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sender_user_id", nullable = false)
    private UserEntity sender_user_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "receiver_user_id", nullable = false)
    private UserEntity receiver_user_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_message_id")
    private TypeMessageEntity type_message_id;

    @Column(name = "parent_message_id")
    private String parent_message_id;

    @Column(name = "type_of_type_message", unique = true, nullable = false)
    private String type_of_type_message;

    @Column(name = "created_at", nullable = false)
    private Date created_at;

    @Column(name = "update_at", nullable = true )
    private Date update_at;

}


