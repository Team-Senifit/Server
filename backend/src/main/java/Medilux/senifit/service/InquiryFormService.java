package Medilux.senifit.service;

import Medilux.senifit.domain.InquiryForm;
import Medilux.senifit.dto.InquiryFormDTO;
import Medilux.senifit.repository.InquiryFormRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class InquiryFormService {

    private final InquiryFormRepository inquiryFormRepository;

    @Transactional
    public Long saveInquiryForm(InquiryFormDTO request) {

        InquiryForm uploadInquiryForm = new InquiryForm();

        uploadInquiryForm.setName(request.getName());
        uploadInquiryForm.setPhone(request.getPhone());
        uploadInquiryForm.setContent(request.getContent());
        uploadInquiryForm.setEmail(request.getEmail());

        inquiryFormRepository.save(uploadInquiryForm);
        return uploadInquiryForm.getId();
    }

}
