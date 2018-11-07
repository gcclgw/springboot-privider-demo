package com.jk.service.category;

import com.jk.mapper.category.CategoryMapper;
import com.jk.model.category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService
{

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 一级查询
     * @return
     */
    @Override
    public List<Category> querycategory() {
        return categoryMapper.querycategory();
    }

    /**
     * 一级删除
     * @param category
     */
    @Override
    public void delCategory(String cid) {
        categoryMapper.delCategory(cid);
        categoryMapper.delCategorysecond(cid);
    }

    /**
     * 新增一级
     * @param category
     */
    @Override
    public void addCategory(Category category) {
        categoryMapper.addCategory(category);
    }

    /**
     * 回显
     * @return
     */
    @Override
    public Category toEditList(Integer id) {
        return categoryMapper.toEditList(id);
    }

    /**
     * 修改
     * @param category
     */
    @Override
    public void editcate(Category category) {
        categoryMapper.editcate(category);
    }
}
