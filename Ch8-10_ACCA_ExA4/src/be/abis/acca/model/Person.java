package be.abis.acca.model;

import be.abis.acca.exception.AgeException;
import be.abis.acca.exception.PersonShouldBeAdultException;
import be.abis.acca.exception.PersonShouldNotBeRetiredException;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class Person implements Comparable<Person>{

    private static int personCounter;
    private int personNumber;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Company company;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        personNumber=++personCounter;
    }

    public Person(String firstName, String lastName, LocalDate birthDate, Company company) {
        this(firstName, lastName, birthDate);
        this.company = company;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int calculateAge() throws PersonShouldBeAdultException, PersonShouldNotBeRetiredException {
        int age = Period.between(birthDate,LocalDate.now()).getYears();
        if (age<18) throw new PersonShouldBeAdultException("You are too young",this);
        if (age>67) throw new PersonShouldNotBeRetiredException("You should be enjoying life",this);
        return age;
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    public void printInfo() throws AgeException {
        Company c = this.company;
        System.out.println("Person " + personNumber + ": " + firstName + " " + lastName + " (" + this.calculateAge() + " years old)" + ((c!=null)?" works for " + c.getName() + " in " + c.getAddress().getTown() +".":" is not employed for the moment."));
    }

    @Override
    public int compareTo(Person o) {
        return this.personNumber-o.personNumber;
    }

    public static class AgeComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            int returnValue = 0;
            try {
                int agePerson1 = o1.calculateAge();
                int agePerson2 = o2.calculateAge();
                returnValue = agePerson1- agePerson2;
            } catch (PersonShouldBeAdultException ex) {
                if(ex.getPerson().equals(o1)) returnValue = -200;
                else returnValue=+200;
            } catch (PersonShouldNotBeRetiredException e) {
                if(e.getPerson().equals(o1)) returnValue = +200;
                else returnValue=-200;
            }
            return returnValue;
        }

    }

    public static class FirstNameComparator implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.firstName.compareTo(o2.firstName);
        }
    }
}
