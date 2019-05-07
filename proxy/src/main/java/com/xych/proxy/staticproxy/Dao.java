package com.xych.proxy.staticproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dao {
    public void save() {
        log.info("Dao:保存了一个Pojo信息");
    }
}
