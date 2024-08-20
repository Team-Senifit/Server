package Medilux.senifit.service;

import Medilux.senifit.domain.Member;
import Medilux.senifit.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> findAllMembers() {

        return memberRepository.findAll();
    }
}
