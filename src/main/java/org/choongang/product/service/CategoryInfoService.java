package org.choongang.product.service;

import lombok.RequiredArgsConstructor;
import org.choongang.product.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryInfoService {
    private final CategoryRepository categoryRepository;

    /**
     * 분류 개별 조회
     *
     * @param cateCd
     * @return
     */

}
