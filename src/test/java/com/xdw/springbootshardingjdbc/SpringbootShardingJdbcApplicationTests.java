package com.xdw.springbootshardingjdbc;

import com.xdw.springbootshardingjdbc.entity.Order1;
import com.xdw.springbootshardingjdbc.mapper.Order1Mapper;
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

  @Test
  public void contextLoads() {
    List<Order1> order1s = order1Service.list(null);
    System.out.println(order1s);
  }
}
