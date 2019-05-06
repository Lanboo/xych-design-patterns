package com.xych.prototype;

import java.math.BigInteger;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import com.xych.prototype.mapstruct.dto.UserDto;
import com.xych.prototype.mapstruct.entity.User;
import com.xych.prototype.mapstruct.mapmappper.UserMapMapper;
import com.xych.prototype.simple.model.UserBean;

public class AppTest {
    @Test
    public void test1() throws CloneNotSupportedException {
        UserBean userBean = new UserBean();
        userBean.setName("XYCH");
        userBean.setAge(18);
        UserBean userBean2 = userBean.copy();
        System.out.println(userBean == userBean2);
        System.out.println(userBean.getName() == userBean2.getName());
    }

    @Test
    public void test2() {
        UserMapMapper userMapMapper = Mappers.getMapper(UserMapMapper.class);
        User user = getUser();
        UserDto userDto = userMapMapper.toDto(user);
        System.out.println(userDto);
    }

    private static User getUser() {
        User user = new User();
        user.setId(BigInteger.ONE);
        user.setName("xych");
        user.setSex("male");
        user.setAmount(10000L);
        return user;
    }
}
