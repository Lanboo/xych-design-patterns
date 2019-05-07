package com.xych.proxy.cglibproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dao {
    public void save() {
        log.info("ADaoImpl:save");
    }

    public void update() {
        log.info("ADaoImpl:update");
    }
}
