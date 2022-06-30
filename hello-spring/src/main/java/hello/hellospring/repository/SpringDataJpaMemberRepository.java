package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository  {

    // => JPQL : select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
    //findBy... 으로 작성 시 자동으로 조회하는 기능을 만들 수 있음
    // Spring data Jpa : 인터페이스 작성만으로 crud기능을 사용할 수 있음.
}
