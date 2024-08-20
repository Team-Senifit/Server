package Medilux.senifit.repository;

import Medilux.senifit.domain.Image;
import Medilux.senifit.domain.InquiryForm;
import Medilux.senifit.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByPage(Page pageType);
}
