package com.datee.datemaze.couple.entity;


import com.datee.datemaze.util.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;


@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "couple")
@DynamicInsert
@DynamicUpdate
/* 커플 엔티티 */
public class Couple extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "couple_no")
    @NotNull
    private Long coupleNo; // 커플 번호

    @Column(name = "couple_name")
    private String coupleName; // 커플명

    @Column(name = "member1_no")
    @NotNull
    private Long member1No; // 회원1 번호

    @Column(name = "member2_no")
    @NotNull
    private Long member2No; // 회원2 번호

//    @Column(name = "cal_no")
//    @NotNull
//    private Long calNo; // 캘린더 번호

    @Column(name = "couple_date")
    @NotNull
    private Date coupleDate; // 커플 시작일
}