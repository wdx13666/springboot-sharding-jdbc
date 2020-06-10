package com.xdw.springbootshardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xdw.springbootshardingjdbc.entity.Order1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wdx
 * @since 2020-06-08
 */
public interface Order1Mapper extends BaseMapper<Order1> {

    @Select("select * from order")
    List<Order1> getList();

    @Insert("insert into order(price,user_id) values (#{price},#{userId})")
    int save(Order1 order1);
}
