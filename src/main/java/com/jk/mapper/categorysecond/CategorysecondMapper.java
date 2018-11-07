package com.jk.mapper.categorysecond;

import com.jk.model.category.Category;
import com.jk.model.categorysecond.Categorysecond;
import com.jk.model.commodity.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CategorysecondMapper {



    /**
     * 查询二级
     * @return
     */
    @Select("select * from categorysecond")
    List<Categorysecond> queryCategorysecond();


    /**
     * 删除二级
     */
    @Delete("delete from categorysecond where csid = #{csid}")
    void delCategorysecond(String csid);


    /**
     * 新增二级
     */
    @Insert("insert into categorysecond (csname,cid) values(#{csname},${cid})")
    void saveCategorysecond(Categorysecond categorysecond);


    /**
     * 回显
     */
    @Select("select * from categorysecond where csid = #{scid}")
    Categorysecond querysecondByid(Integer scid);

    /**
     * 修改二级
     */
    @Update("update categorysecond set csname = #{csname},cid = #{cid} where csid = #{csid}")
    void editSecond(Categorysecond categorysecond);

    /**
     * 下拉框
     * @return
     */
    @Select("select * from category")
    List<Category> querycate();

    /**
     * 根据二级查商品
     */
    @Select("SELECT * FROM categorysecond")
    List<Categorysecond> queryOneAndTwo();

    //查询一级表
    @Select("select * from category")
    List<Category> queryCategory();

    /**
     * 根据分类查询商品
     */
    @Select("SELECT p.* FROM product p,category c,categorysecond s WHERE c.cid = s.cid \n" +
            "AND s.csid = p.csid")
    List<Product> queryProductByCid();
}
