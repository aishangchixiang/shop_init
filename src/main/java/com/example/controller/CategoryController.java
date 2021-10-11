package com.example.controller;

import com.example.entity.Category;
import com.example.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    //进入categorylist页面
    @RequestMapping("/tocategorylist")
    public ModelAndView toCategoryList()
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("categorylist");
        return mv;
    }
    @ResponseBody
    @RequestMapping("/getcategorylist")
    public List<Category> getCategoryList()
    {
        List<Category> list;
        list=categoryService.selectCategoryList();
        return list;
    }
}
