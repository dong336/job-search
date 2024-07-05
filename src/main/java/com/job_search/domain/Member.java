package com.job_search.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "member", indexes = {
        @Index(name = "IDX_MEMBER_1", columnList = "user_id", unique = true)
})
@Getter @Setter
@NoArgsConstructor
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String type;

    private String userId;

    private String userPw;

    private String name;

    private String telNo;

    private String address;
}
