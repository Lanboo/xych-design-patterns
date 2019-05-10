package com.xych.decorator.battercake.v1;

public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake);
        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg);
        BattercakeWithEggAndSausage battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage);
    }
}
