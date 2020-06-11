package com.personal.haodanmall.product;

import com.personal.haodanmall.product.entity.BrandEntity;
import com.personal.haodanmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class HaodanmallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");

        brandService.save(brandEntity);
        System.out.println("保存成功。。。。");
    }

}
