package com.xych.proxy.staticproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Log {
    public void doLog() {
        // 额外事件：记录操作日志，记录登陆IP，判断权限，统计执行次数等
        log.info("Log:记录一些信息");
    }
}
