package com.personal.haodanmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.personal.common.utils.PageUtils;
import com.personal.haodanmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author haodan
 * @email sunlightcs@gmail.com
 * @date 2020-06-11 20:03:47
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

