package hello.login.domain.member;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class Member {

    private Long id;

    @NotBlank
    private String loginId; //로그인 ID
    @NotBlank
    private String name; //사용자 이름
    @NotBlank
    private String password; //로그인 비밀번호
}
