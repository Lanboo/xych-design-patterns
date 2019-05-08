package com.xych.strategy.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UniformNotifyStrategy implements INotifyStrategy {
    @Override
    public void handleNotifyRet(String notifyStr) {
        log.info("统一回执处理:{}", notifyStr);
    }
}
