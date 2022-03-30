package com.example.sample;

import java.io.Serializable;

public class Department implements Serializable {
    String name;
    Employee leader;

    public String getName() {
        return name;
    }

    public Employee getLeader() {
        return leader;
    }

    public Department(String name, Employee leader) {
        this.name = name;
        this.leader = leader;
    }
}
