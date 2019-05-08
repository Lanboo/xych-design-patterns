package com.xych.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.xych.strategy.strategy.INotifyStrategy;
import com.xych.strategy.strategy.UniformNotifyStrategy;
import com.xych.strategy.strategy.XiamenNotifyStrategy;

public class NotifyProcessor {
    private static Map<String, INotifyStrategy> notifyStrategyMap = new ConcurrentHashMap<>();
    static {
        notifyStrategyMap.put("*", new UniformNotifyStrategy());
        // 可以映射关系放到配置文件中
        notifyStrategyMap.put("xiamen", new XiamenNotifyStrategy());
    }

    public void handleNotifyRet(String type, String notifyStr) {
        INotifyStrategy notifyStrategy = notifyStrategyMap.get(type);
        if(notifyStrategy == null) {
            notifyStrategy = notifyStrategyMap.get("*");
        }
        notifyStrategy.handleNotifyRet(notifyStr);
    }
}
