package com.ecc.sycoracle.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ecc.sycoracle.mapper.UserMapper2;
import com.ecc.sycoracle.pojo.User;
import com.ecc.sycoracle.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sunyc
 * @create 2022-07-05 16:58
 */
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper2, User> implements UserService {
}
