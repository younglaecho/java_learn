package hello.hellospring.repository;

import hello.hellospring.domain.Member;
// import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    // 테스트를 한 번 끝낼 때 마다 레포지토리를 비워 줄 필요가 있다.
    // 앞의 테스트가 이후의 테스트에 영향을 줄 수 있기 때문이다.
    @AfterEach // 각각의 메서드가 끝날 때 마다 실행되는 메서
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        //Assertions.assertEquals(result, null);
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring2").get();

        assertThat(result).isEqualTo(member2);
    }

    @Test
    public void findAll() {
        List<Member> actual = new ArrayList<>();
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member member3 = new Member();
        member3.setName("spring3");
        repository.save(member3);

        actual.add(member1);
        actual.add(member2);
        actual.add(member3);

        List<Member> all = repository.findAll();
        assertThat(all).isEqualTo(actual);
    }
}
