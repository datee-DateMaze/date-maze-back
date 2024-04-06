package com.datee.datemaze.schedule.dto;

import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleDTO {
    private Long schNo; // 일정 번호
    private Long memberNo; // 회원 번호
    private String memberName; // 회원 닉네임
    private Date schDate; // 일정 날짜
    private String schTitle; // 일정 제목
}
