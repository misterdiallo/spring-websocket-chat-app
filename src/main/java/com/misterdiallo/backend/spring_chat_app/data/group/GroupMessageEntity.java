package com.misterdiallo.backend.spring_chat_app.data.group;

import com.misterdiallo.backend.spring_chat_app.data.TypeMessageEntity;
import com.misterdiallo.backend.spring_chat_app.data.group.GroupEntity;
import com.misterdiallo.backend.spring_chat_app.data.group.UserGroupEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "groupMessage")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GroupMessageEntity  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "group_id", nullable = false)
    private GroupEntity group_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "send_user_message_group", nullable = false)
    private UserGroupEntity send_user_message_group;

    @Column(name = "send_time_message_group", nullable = false)
    private Date send_time_message_group;

    @Column(name = "message_body_group", nullable = false, columnDefinition = "TEXT")
    private String message_body_group;

    @Column(name = "created_at", nullable = false)
    private Date created_at;

    @Column(name = "update_at", nullable = true )
    private Date update_at;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_message_id", nullable = false)
    private TypeMessageEntity type_message_id;



}
