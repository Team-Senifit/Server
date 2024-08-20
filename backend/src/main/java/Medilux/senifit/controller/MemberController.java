package Medilux.senifit.controller;


import Medilux.senifit.domain.Member;
import Medilux.senifit.repository.MemberRepository;
import Medilux.senifit.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/members")
public class MemberController {

    private final MemberRepository memberRepository;
    private final MemberService memberService;


    @Autowired
    public MemberController(MemberRepository memberRepository, MemberService memberService) {
        this.memberRepository = memberRepository;
        this.memberService = memberService;
    }


    @PostMapping("/join")
    public String signUpMember(Member member, RedirectAttributes redirectAttributes) {
        Member savedMember = memberRepository.save(member);
        if (savedMember == null) {
            redirectAttributes.addFlashAttribute("errorMessage", "Error: Member name exists.");
            return "redirect:/signup";
        }
        return "redirect:/"; // Redirect after registration
    }


    @PostMapping("/login")
    public String userLogin(Member member, RedirectAttributes redirectAttributes) {
        System.out.println("MemberController.userLogin");
        System.out.println("member = " + member.getUsername());

        if (member.getId() != null)
            return "redirect:/routinePage";
        else
            return "redirect:/";
    }

    @GetMapping
    @ResponseBody
    public List<Member> getAllMembers() {
        return memberService.findAllMembers();
    }
}
