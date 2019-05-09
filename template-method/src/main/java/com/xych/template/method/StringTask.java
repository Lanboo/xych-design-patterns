package com.xych.template.method;

import java.util.Arrays;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringTask extends AbstractTask<String> {
    @Override
    protected List<String> getData() {
        log.info("String type data");
        List<String> objs = Arrays.asList(new String[] { "a", "b", "c" });
        return objs;
    }

    @Override
    protected void doTask(List<String> datas) {
        log.info("process String data");
        log.info("{}", datas);
    }
}
