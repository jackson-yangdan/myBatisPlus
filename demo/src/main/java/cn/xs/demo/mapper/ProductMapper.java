package cn.xs.demo.mapper;

import cn.xs.demo.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 三哥
 * @since 2020-02-27
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

}
