package com.xdw.springbootshardingjdbc.service.impl;

import com.xdw.springbootshardingjdbc.entity.User;
import com.xdw.springbootshardingjdbc.mapper.UserMapper;
import com.xdw.springbootshardingjdbc.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wdx
 * @since 2020-06-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
