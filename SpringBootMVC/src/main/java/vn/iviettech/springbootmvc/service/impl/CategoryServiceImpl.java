package vn.iviettech.springbootmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.iviettech.springbootmvc.converter.CategoryConverter;
import vn.iviettech.springbootmvc.domain.Category;
import vn.iviettech.springbootmvc.repository.CategoryRepository;
import vn.iviettech.springbootmvc.service.CategoryService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll()
                .stream()
                .map(CategoryConverter::toModel)
                .collect(Collectors.toList());
    }
}
