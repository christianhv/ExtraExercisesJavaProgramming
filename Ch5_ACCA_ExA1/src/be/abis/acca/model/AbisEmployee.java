package be.abis.acca.model;

public class AbisEmployee extends Person {

    private double grossSalary;
    private Address homeAddress;

    public AbisEmployee(String firstName, String lastName, int age, double salary, Address homeAddress) {
        super(firstName, lastName, age);
        Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","Belgium","BE");
        Company c = new Company("Abis",a);
        this.setCompany(c);
        this.grossSalary = salary;
        this.homeAddress = homeAddress;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("The employee lives in " + this.getHomeAddress().getTown() + " and earns " + grossSalary + " per month.");
    }

}
