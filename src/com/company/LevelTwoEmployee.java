package com.company;

import java.util.List;
import java.util.Queue;

public class LevelTwoEmployee implements Manager{
    private Manager manager ;
    private List<Employee>  levelTwoEmployeList;
    @Override
    public void nextChain(Manager manager) {
        this.manager = manager;
        this.levelTwoEmployeList=EmployeeManagement.filterEmployeeByLevel(2);
    }

    @Override
    public Employee handle(Request request) {
        for(Employee emp:levelTwoEmployeList){
            if(emp.isFree()){
                emp.setFree(false);
                System.out.println("Successfully handled at level two");
                return emp;
            }

        }
        Employee emp= manager.handle(request);
        return emp;


    }
}
