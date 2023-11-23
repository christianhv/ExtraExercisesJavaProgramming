package be.abis.acca.test;

import be.abis.acca.model.*;

public class TestMain {

    public static void main(String[] args) {
        Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","Belgium","BE");
        Company c = new Company("Abis",a);
        Person p1 = new Person("Ann","Smits",35,c);
        Person p2 = new Person("John","Doe",54);

        System.out.println("----------------------Persons-----------------------------------");
        Person[] persons = {p1,p2};
        for (Person p:persons){
            p.printInfo();
        }

        System.out.println("\n----------------------Courses-----------------------------------");
        Course co1 = new Course("Java",5,500,true);
        Course co2 = new Course("SQL",2,375,false);
        Course co3 = new Course("TDD",3,600,false);
        Course co4 = new Course("XML",1,387,false);
        
        Course[] courses = {co1,co2,co3,co4};
        for (Course course : courses){
           course.printInfo();
        }

        System.out.println("\n----------------------Abis Employees-----------------------------------");
        AbisEmployee ae1 = new AbisEmployee("Sandy","Schillebeeckx",42,5123.65,new Address("Some street","4","Kessel-Lo","BE"));
        ae1.printInfo();

        System.out.println("\n----------------------Net salary-----------------------------------");
        System.out.println("Current net salary of "+ ae1.getFirstName() + " is " + ae1.calculateNetSalary());

        System.out.println("\n----------------------Salary history-----------------------------------");
        AbisEmployee ae2 = new AbisEmployee("Peter","Vanroose",62,23,2700.,5600.,new Address("Some other street","14","Kessel-Lo","BE"));
        ae2.printSalaryHistory();

        System.out.println("\n----------------------Roles-----------------------------------");
        AbisEmployee ae3 = new AbisEmployee("Yvette","Van den Acker",69,4600.,new Address("Some street","4","Haacht","BE"));
        AbisEmployee ae4 = new AbisEmployee("Arnout","Veugelen",38,4600.,new Address("Some street","4","Kessel-Lo","BE"));
        ae1.setRoles(new Role[]{new Instructor()});
        ae2.setRoles(new Role[]{new Instructor()});
        ae3.setRoles(new Role[]{new Accountant()});
        ae4.setRoles(new Role[]{new Instructor(),new Manager(),new SalesRepresentative()});

        System.out.println("\n----------------------Performing role-----------------------------------");
        ae1.findRole("instructor").doJob();
    }
}
