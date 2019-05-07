package com.xych.proxy.jdkproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Log {
    public void doSaveLog() {
        log.info("Log:save");
    }

    public void doUpdateLog() {
        log.info("Log:update");
    }
}
