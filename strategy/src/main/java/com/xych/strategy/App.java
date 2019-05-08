package com.xych.strategy;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String xiamenNotifyStr = "this is xiamen notify str";
        String beijinNotifyStr = "this is beijing notify str";
        NotifyProcessor processor = new NotifyProcessor();
        processor.handleNotifyRet("beijing", beijinNotifyStr);
        processor.handleNotifyRet("xiamen", xiamenNotifyStr);
    }
}
