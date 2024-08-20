package Medilux.senifit.service;

import Medilux.senifit.domain.Image;
import Medilux.senifit.domain.Page;
import Medilux.senifit.dto.PageDTO;
import Medilux.senifit.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class HomeService {

    private final ImageRepository imageRepository;
    public PageDTO findContent(Page page) {
        List<Image> images = imageRepository.findByPage(page);

        PageDTO pageDTO = new PageDTO();
        pageDTO.setPage(page);
        pageDTO.setPath(images.stream().map(Image::getPath).collect(Collectors.toList()));

        return pageDTO;
    }
}
