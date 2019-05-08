package com.xych.strategy.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class XiamenNotifyStrategy implements INotifyStrategy {
    @Override
    public void handleNotifyRet(String notifyStr) {
        log.info("厦门回执处理:{}", notifyStr);
    }
}
