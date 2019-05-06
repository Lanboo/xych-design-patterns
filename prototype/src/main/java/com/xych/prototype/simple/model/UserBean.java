package com.xych.prototype.simple.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class UserBean extends Bean {
    private String name;
    private Integer age;

    @SuppressWarnings("unchecked")
    @Override
    public UserBean copy() throws CloneNotSupportedException {
        UserBean userBean = new UserBean();
        userBean.name = this.name;
        userBean.age = this.age;
        return userBean;
    }
}
