package com.personal.haodanmall.product.dao;

import com.personal.haodanmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author haodan
 * @email sunlightcs@gmail.com
 * @date 2020-06-11 20:03:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
