package hello.core;

import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        basePackages = "hello.core.member",
//        basePackageClasses = AutoAppConfig.class, // default : hello.core 아래의 모든 패키지
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {


//    수동 우선 적용 but 충동 시 실행안됨
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository () {
//        return new MemoryMemberRepository();
//    }

}