package com.example.loginapi.dto.Signup;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@NoArgsConstructor
@Setter
public class MemberSignupResponseDto {
    private Long memberId;
    private String email;
    private String password;
    private LocalDateTime regdate;
    private String pic;
}
