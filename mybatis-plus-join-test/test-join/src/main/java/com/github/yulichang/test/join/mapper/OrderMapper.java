package com.github.yulichang.test.join.mapper;

import com.github.yulichang.test.join.entity.OrderDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends MyBaseMapper<OrderDO> {

}
