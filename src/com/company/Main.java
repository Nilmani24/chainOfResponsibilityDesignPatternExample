package com.company;

public class Main {

    public static void main(String[] args) {
	    Employee e1 = new Employee();
        e1.setEmplId(1);
        e1.setFree(true);
        e1.setLevel(1);
        e1.setName("nil");

        Employee e2 = new Employee();
        e2.setEmplId(2);
        e2.setFree(true);
        e2.setLevel(2);
        e2.setName("nilmani");

        Employee e3 = new Employee();
        e3.setEmplId(3);
        e3.setFree(true);
        e3.setLevel(3);
        e3.setName("nilmanip");

        EmployeeManagement.addEmployee(e1);
        EmployeeManagement.addEmployee(e2);
        EmployeeManagement.addEmployee(e3);

        Manager levelOneEmployee = new LevelOneEmployee();
        Manager levelTwo = new LevelTwoEmployee();
        Manager levelThree=new LevelThreeEmployee();

        levelOneEmployee.nextChain(levelTwo);
        levelTwo.nextChain(levelThree);
        levelThree.nextChain(null);

        levelOneEmployee.handle(new Request(1,"nil"));
        levelOneEmployee.handle(new Request(2,"nil"));
        levelOneEmployee.handle(new Request(3,"nil"));
        levelOneEmployee.handle(new Request(4,"nil"));
        levelOneEmployee.handle(new Request(5,"nil"));

    }
}
