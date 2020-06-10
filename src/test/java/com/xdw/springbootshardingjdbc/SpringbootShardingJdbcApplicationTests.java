package com.xdw.springbootshardingjdbc;

import com.xdw.springbootshardingjdbc.entity.User;
import com.xdw.springbootshardingjdbc.mapper.Order1Mapper;
import com.xdw.springbootshardingjdbc.mapper.UserMapper;
import com.xdw.springbootshardingjdbc.service.impl.Order1ServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootShardingJdbcApplicationTests {

  @Autowired private Order1ServiceImpl order1Service;
  @Autowired private Order1Mapper order1Mapper;
  @Autowired private UserMapper userMapper;

  @Test
  public void contextLoads() {
   /* for (int i = 1; i <=20; i++) {
      Order1 order1 = new Order1();
      order1.setUserId(1l);
      order1.setPrice(BigDecimal.valueOf(1));
      order1Mapper.save(order1);
    }*/

 /*   List<Order1> order1s = order1Mapper.getList();
    System.out.println(order1s);*/
    List<User> order1s = userMapper.selectList(null);
    System.out.println(order1s);
  }
}
