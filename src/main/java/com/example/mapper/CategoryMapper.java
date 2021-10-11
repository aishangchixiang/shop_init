package com.example.mapper;

import com.example.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface CategoryMapper {
    List<Category> selectCategoryList();
}
