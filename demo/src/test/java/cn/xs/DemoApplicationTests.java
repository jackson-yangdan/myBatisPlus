package cn.xs;

import cn.xs.demo.entity.Product;
import cn.xs.demo.mapper.ProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private ProductMapper productMapper;

    @Test
    void contextLoads() {

        Product product=new Product();
        product.setId(product.getId());
        product.setProductName("鸡蛋");
        product.setQuantity(30);
        productMapper.insert(product);
    }

}
