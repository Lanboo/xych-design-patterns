package com.xych.proxy.staticproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DaoStaticProxy {
    private Dao dao;
    private Log logger;

    public DaoStaticProxy(Dao dao, Log logger) {
        this.dao = dao;
        this.logger = logger;
    }

    public void save() {
        log.info("DaoStaticProxy:Start");
        this.logger.doLog();
        this.dao.save();
        log.info("DaoStaticProxy:End");
    }
}
