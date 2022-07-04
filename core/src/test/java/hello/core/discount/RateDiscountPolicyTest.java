package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10퍼센트 할인율이 적용되어야 한다.")
    void discount() {
        // given
        Member member = new Member(1L, "cho", Grade.VIP);
        //when
        int discountAmount = discountPolicy.discount(member, 10000);
        //then
        assertThat(discountAmount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 10퍼센트 할인율이 적용되지 않아야 한다.")
    void notDiscount () {
        Member member = new Member(1L, "cho", Grade.BASIC);
        int discountAmount = discountPolicy.discount(member, 10000);

        assertThat(discountAmount).isEqualTo(0);
    }

}