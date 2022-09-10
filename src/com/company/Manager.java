package com.company;

public interface Manager {
    public void nextChain(Manager manage);
    public Employee handle(Request request);
}
