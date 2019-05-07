package com.xych.proxy.jdkproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BDaoImpl implements IDao {
    @Override
    public void save() {
        log.info("BDaoImpl:save");
    }

    @Override
    public void update() {
        log.info("BDaoImpl:update");
    }
}
