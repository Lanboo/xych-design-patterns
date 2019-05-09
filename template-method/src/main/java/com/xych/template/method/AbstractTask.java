package com.xych.template.method;

import java.util.List;

public abstract class AbstractTask<T> {
    public void task() {
        List<T> datas = getData();
        doTask(datas);
    }

    /**
     * 获取数据
     * @Author XYCH
     * @CreateDate 2019年5月9日下午2:22:00
     */
    protected abstract List<T> getData();

    protected abstract void doTask(List<T> datas);
}
