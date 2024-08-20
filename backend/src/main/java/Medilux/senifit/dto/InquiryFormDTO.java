package Medilux.senifit.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InquiryFormDTO {

    @NonNull
    private String name;

    @NonNull
    private String phone;

    @NonNull
    private String content;

    @NonNull
    private String email;
}
