package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class memberServiceTest {
    private final MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        Member member = new Member(1L, "cho", Grade.VIP);

        memberService.join(member);
        Member findMember = memberService.findMember(2L);

        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
