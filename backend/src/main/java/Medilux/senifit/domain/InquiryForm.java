package Medilux.senifit.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InquiryForm {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inquiry_id")
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String phone;

    @NonNull
    private String content;

    @NonNull
    private String email;

    public InquiryForm(String name, String phone, String content, String email) {

    }
}
