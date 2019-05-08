package com.xych.strategy;

public class App {
    /**
     * 业务场景：该公司某个业务有很多上游渠道，交易完成后的异步通知大多都遵循同一套格式，但是厦门的回执不一样，需要特出处理
     */
    public static void main(String[] args) {
        String xiamenNotifyStr = "this is xiamen notify str";
        String beijinNotifyStr = "this is beijing notify str";
        NotifyProcessor processor = new NotifyProcessor();
        processor.handleNotifyRet("beijing", beijinNotifyStr);
        processor.handleNotifyRet("xiamen", xiamenNotifyStr);
    }
}
