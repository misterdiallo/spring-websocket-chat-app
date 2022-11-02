package com.misterdiallo.backend.spring_chat_app.data.group;

import com.misterdiallo.backend.spring_chat_app.data.ConversationEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Table(name = "group_table")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GroupEntity  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name_group", nullable = false)
    private String name_group;

    @Column(name = "description_group",  columnDefinition="text")
    private String description_group;

    @Column(name = "picture_group",  columnDefinition="text")
    private String picture_group;

    @Column(name = "created_at", nullable = false)
    private Date created_at;

    @Column(name = "update_at" )
    private Date update_at;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "conversation_id")
    private ConversationEntity conversation_id;



//    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//    private Set<GroupEntity> group_id;
}
