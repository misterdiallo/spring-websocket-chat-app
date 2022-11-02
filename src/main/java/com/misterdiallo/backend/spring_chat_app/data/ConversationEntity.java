package com.misterdiallo.backend.spring_chat_app.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "conversation")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ConversationEntity  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name_type_message", nullable = false)
    private String name_type_message;

    @Column(name = "type_of_type_message", unique = true, nullable = false)
    private String type_of_type_message;

    @Column(name = "created_at", nullable = false)
    private Date created_at;

    @Column(name = "update_at", nullable = true )
    private Date update_at;


}
