package com.jk.mapper.category;


import com.jk.model.category.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CategoryMapper {

    /**
     * 查询一级
     * @return
     */
    @Select("select * from category")
    List<Category> querycategory();

    /**
     * 删除一级
     * @param category
     */
    @Delete("delete from category where cid = #{cid}")
    void delCategory(@Param("cid") String cid);


    /**
     * 新增一级
     * @param category
     */
    @Insert("insert into category (cname) values (#{cname})")
    void addCategory(Category category);

    /**
     * 回显
     * @return
     */
    @Select("select * from category where cid = #{id}")
    Category toEditList(Integer id);

    /**
     * 修改
     * @param category
     */
    @Update("update category set cname = #{cname} where cid = #{cid}")
    void editcate(Category category);

    /**
     * 根据一级删二级
     * @param cid
     */
    @Delete("delete from categorysecond where cid = #{cid}")
    void delCategorysecond(String cid);
}