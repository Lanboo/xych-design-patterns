package com.xych.adapter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Translator translator = new Translator(new Employee());
        translator.translate();
        new Reporter().record();
    }
}
