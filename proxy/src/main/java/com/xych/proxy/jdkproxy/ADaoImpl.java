package com.xych.proxy.jdkproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ADaoImpl implements IDao {
    @Override
    public void save() {
        log.info("ADaoImpl:save");
    }

    @Override
    public void update() {
        log.info("ADaoImpl:update");
    }
}
