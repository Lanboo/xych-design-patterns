package com.xych.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Translator {
    private Employee employee;

    public Translator(Employee employee) {
        this.employee = employee;
    }

    public void translate() {
        this.employee.newsConference();
        log.info("Translators are translating synchronously.");
    }
}
