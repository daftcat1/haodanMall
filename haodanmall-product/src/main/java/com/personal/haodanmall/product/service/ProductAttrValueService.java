package com.personal.haodanmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.personal.common.utils.PageUtils;
import com.personal.haodanmall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author haodan
 * @email sunlightcs@gmail.com
 * @date 2020-06-11 20:03:46
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

