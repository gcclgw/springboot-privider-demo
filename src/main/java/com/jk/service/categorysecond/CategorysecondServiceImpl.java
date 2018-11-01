package com.jk.service.categorysecond;

import com.jk.mapper.categorysecond.CategorysecondMapper;
import com.jk.model.category.Category;
import com.jk.model.categorysecond.Categorysecond;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorysecondServiceImpl implements CategorysecondService {

    @Autowired
    private CategorysecondMapper categorysecondMapper;

    /**
     * 根据一级查二级
     */
    @Override
    public List<Categorysecond> queryOneAndTwo() {
        return categorysecondMapper.queryOneAndTwo();
    }

    /**
     * 查询二级
     * @return
     */
    @Override
    public List<Categorysecond> queryCategorysecond() {
        return categorysecondMapper.queryCategorysecond();
    }

    /**
     * 删除二级
     */
    @Override
    public void delCategorysecond(String csid) {
        categorysecondMapper.delCategorysecond(csid);
    }

    /**
     * 新增二级
     */
    @Override
    public void saveCategorysecond(Categorysecond categorysecond) {
        categorysecondMapper.saveCategorysecond(categorysecond);
    }

    /**
     * 回显
     */
    @Override
    public Categorysecond querysecondByid(Integer scid) {
        return categorysecondMapper.querysecondByid(scid);
    }

    /**
     * 修改二级
     */
    @Override
    public void editSecond(Categorysecond categorysecond) {
        categorysecondMapper.editSecond(categorysecond);
    }

    /**
     * 下拉框
     * @return
     */
    @Override
    public List<Category> querycate() {
        return categorysecondMapper.querycate();
    }


}
