package Medilux.senifit.dto;

import Medilux.senifit.domain.Page;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PageDTO {

    @Enumerated(EnumType.STRING)
    private Page page;

    private List<String> path;
}
