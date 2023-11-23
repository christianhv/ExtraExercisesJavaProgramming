package be.abis.acca.test;

import be.abis.acca.model.Address;
import be.abis.acca.model.Company;
import be.abis.acca.model.Person;

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



    }
}
