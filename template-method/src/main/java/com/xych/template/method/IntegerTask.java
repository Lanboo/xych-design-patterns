package com.xych.template.method;

import java.util.Arrays;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IntegerTask extends AbstractTask<Integer> {
    @Override
    protected List<Integer> getData() {
        log.info("Integer type data");
        List<Integer> objs = Arrays.asList(new Integer[] { 1, 2, 3, 4 });
        return objs;
    }

    @Override
    protected void doTask(List<Integer> datas) {
        log.info("process Integer data");
        log.info("{}", datas);
    }
}
