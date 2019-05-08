package com.xych.delegation.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        log.info("我是员工A，我现在开始干{}工作", command);
    }
}
