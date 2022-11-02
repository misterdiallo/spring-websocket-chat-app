package com.misterdiallo.backend.spring_chat_app.data.group;

import com.misterdiallo.backend.spring_chat_app.data.ConversationEntity;
import com.misterdiallo.backend.spring_chat_app.data.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@Table(name = "user_group")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserGroupEntity  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "alias_user_group", nullable = false)
    private String alias_user_group;

    @Column(name = "created_at", nullable = false)
    private Date created_at;

    @Column(name = "update_at", nullable = true )
    private Date update_at;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "group_id", nullable = false)
    private GroupEntity group_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UserEntity user_id;
}
