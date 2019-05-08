package com.xych.delegation.simple;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Leader implements IEmployee {
    private Map<String, IEmployee> map = new ConcurrentHashMap<>();

    public Leader() {
        init();
    }

    private void init() {
        map.put("login", new EmployeeA());
        map.put("ssh", new EmployeeB());
    }

    @Override
    public void doing(String command) {
        this.map.get(command).doing(command);
    }
}
