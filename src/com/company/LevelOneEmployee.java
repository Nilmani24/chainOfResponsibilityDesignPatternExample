package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOneEmployee implements  Manager{
    private Manager manager ;
    private List<Employee> levelOneEmployeeList;
    private  Queue<Request> levelOneWaitingQueue;
    @Override
    public void nextChain(Manager manager) {
        this.manager = manager;
        this.levelOneEmployeeList= EmployeeManagement.filterEmployeeByLevel(1);
        this.levelOneWaitingQueue = new LinkedList<>();
    }

    @Override
    public Employee handle(Request request) {
        for(Employee emp:levelOneEmployeeList){
            if(emp.isFree()){
                emp.setFree(false);
                System.out.println("Successfully handled at level one");
                return emp;
            }

        }
        Employee emp= manager.handle(request);
        if(emp == null) {

            levelOneWaitingQueue.add(request);
            System.out.println("Request not handled added on waiting queue ,queue size :"+ levelOneWaitingQueue.size());

        }

        return emp;


    }
}
