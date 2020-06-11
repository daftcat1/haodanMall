package com.personal.haodanmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.personal.common.utils.PageUtils;
import com.personal.haodanmall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author haodan
 * @email sunlightcs@gmail.com
 * @date 2020-06-11 20:03:46
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

