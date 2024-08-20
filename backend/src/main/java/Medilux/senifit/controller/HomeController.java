package Medilux.senifit.controller;


import Medilux.senifit.domain.Page;
import Medilux.senifit.dto.InquiryFormDTO;
import Medilux.senifit.dto.PageDTO;
import Medilux.senifit.service.HomeService;
import Medilux.senifit.service.InquiryFormService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final InquiryFormService inquiryFormService;
    private final HomeService homeService;


    @PostMapping("/contact")
    public ResponseEntity<?> contact(@RequestBody InquiryFormDTO requestInquiry) {

        try {
            Long res = inquiryFormService.saveInquiryForm(requestInquiry);
            return ResponseEntity.ok(res);
        } catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup"; // Refers to signup.html in the templates directory
    }

    @GetMapping("/home")
    public ResponseEntity<?> home() {
        try {
            Page page = Page.HOME;
            PageDTO res = homeService.findContent(page);
            return ResponseEntity.ok(res);
        } catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/company")
    public ResponseEntity<?> company() {
        try {
            Page page = Page.COMPANY;
            PageDTO res = homeService.findContent(page);
            return ResponseEntity.ok(res);
        } catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/apply")
    public ResponseEntity<?> apply() {
        try {
            Page page = Page.APPLY;
            PageDTO res = homeService.findContent(page);
            return ResponseEntity.ok(res);
        } catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
