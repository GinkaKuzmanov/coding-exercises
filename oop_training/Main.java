package oop_training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        int countOfEmp = Integer.parseInt(reader.readLine());
        List<Employee> employees = new ArrayList<>();

        while(countOfEmp-- > 0)
        {
            String [] tokens = reader.readLine().split("\\s+");

            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];

            //now what i have sought after: coordinating the length of input!!!
            //we use SWITCH to manipulate the length;
            Employee employee = null;
            switch(tokens.length){
                case 4:
                    employee = new Employee(name,salary,position,department);
                    break;
                case 5:
                    if(tokens[4].matches("\\d+")){
                        int age = Integer.parseInt(tokens[4]);
                        employee = new Employee(name,salary,position,department,age);
                    }else{
                     String email = tokens[4];
                     employee = new Employee(name,salary,position,department,email);
                    }
                    break;
                case 6:
                    String email = tokens[4];
                    int age = Integer.parseInt(tokens[5]);
                    employee = new Employee(name,salary,position,department,email,age);
                    break;

            }
            //we enter each employee separately after 'switch' filtration
            employees.add(employee);
        }
        //collect->grouping by returns -> map<Department,List<Emoloyee>>
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet()
                .stream()
                .sorted((e1,e2) -> Double.compare(e2.getValue().stream().mapToDouble(Employee::getSalary)
                        .average().getAsDouble(),e1.getValue().stream()
                        .mapToDouble(Employee::getSalary).average().getAsDouble()))
                .limit(1)
                .forEach(dep ->{
                    StringBuilder result = new StringBuilder();
                    result.append(String.format("Highest Average Salary: %s",dep.getKey())).append(System.lineSeparator());
                    dep.getValue()
                            .stream()
                            .sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder()))
                            .forEach( employee -> result.append(employee).append(System.lineSeparator()));

                    System.out.println(result.toString());
                });
        ;


    }

}


