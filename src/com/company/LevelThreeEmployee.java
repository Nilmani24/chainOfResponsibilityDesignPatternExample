package com.company;

import java.util.List;

public class LevelThreeEmployee implements Manager{
    private Manager manager ;
    private List<Employee> levelThreeEmployee;
    @Override
    public void nextChain(Manager manager) {
        this.manager = manager;
        this.levelThreeEmployee=EmployeeManagement.filterEmployeeByLevel(3);
    }

    @Override
    public Employee handle(Request request) {
        for(Employee emp:levelThreeEmployee){
            if(emp.isFree()){
                emp.setFree(false);
                System.out.println("Successfully handled at level three");
                return emp;
            }

        }
       return null;


    }
}
