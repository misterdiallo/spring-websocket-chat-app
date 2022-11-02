package com.misterdiallo.backend.spring_chat_app.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "type_message")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TypeMessageEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name_user")
    private String name_conversation;

    @Column(name = "email_user", unique = true, nullable = false)
    private String email_user;

    @Column(name = "created_at", nullable = false)
    private Date created_at;

    @Column(name = "update_at", nullable = true )
    private Date update_at;




}
