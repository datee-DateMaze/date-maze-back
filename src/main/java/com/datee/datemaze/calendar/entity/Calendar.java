package com.datee.datemaze.calendar.entity;

import com.datee.datemaze.couple.entity.Couple;
import com.datee.datemaze.util.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "calendar")
@DynamicInsert
@DynamicUpdate
/* 캘린더 entity */
public class Calendar extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cal_no")
    private Long calNo; // 캘린더 번호

    @OneToOne
    @JoinColumn(name = "couple_no")
    private Couple couple; // 커플
}
