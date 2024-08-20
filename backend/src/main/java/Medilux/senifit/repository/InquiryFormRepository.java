package Medilux.senifit.repository;

import Medilux.senifit.domain.InquiryForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InquiryFormRepository extends JpaRepository<InquiryForm, Long> {

    InquiryForm findByEmail(String email);

    Optional<InquiryForm> findById(Long userId);
}
