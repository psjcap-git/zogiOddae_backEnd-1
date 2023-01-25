package com.zerobase.user.member.dto.form;

import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberForm {

    @NotEmpty(message = "닉네임은 필수입니다.")
    private String name;
    @NotEmpty(message = "이메일은 필수입니다.")
    private String email;
}
