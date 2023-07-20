package vn.iviettech.springbootmvc.converter;

import vn.iviettech.springbootmvc.domain.Category;
import vn.iviettech.springbootmvc.entity.CategoryEntity;

public class CategoryConverter {
    public static Category toModel(CategoryEntity entity) {
        Category category = new Category();
        category.setId(entity.getId());
        category.setName(entity.getName());
        category.setDescription(entity.getDescription());
        return category;
    }
}