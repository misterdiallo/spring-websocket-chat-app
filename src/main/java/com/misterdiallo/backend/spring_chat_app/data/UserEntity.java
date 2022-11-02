package com.misterdiallo.backend.spring_chat_app.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name_user")
    private String name_conversation;

    @Column(name = "creator_user_conversation", nullable = false)
    private String creator_user_conversation;

    @Column(name = "email_user", unique = true, nullable = false)
    private String email_user;

    @Column(name = "phone_user", unique = true, nullable = false)
    private String phone_user;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password_user", unique = true, columnDefinition = "TEXT", nullable = true)
    private String password_user;

    @Column(name = "photo_user", columnDefinition = "TEXT", nullable = true)
    private String photo_user;

    @Column(name = "first_open_id_user", unique = true, nullable = true)
    private String first_open_id_user;

    @Column(name = "second_open_id_user", unique = true, nullable = true)
    private String second_open_id_user;

    @Column(name = "third_open_id_user", unique = true, nullable = true)
    private String third_open_id_user;

    @Column(name = "created_at", nullable = false)
    private Date created_at;


    @Column(name = "update_at", nullable = true )
    private Date update_at;




}
