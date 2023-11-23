package be.abis.acca.model;

public class Course {

    private String title;
    private int numberOfDays;
    private double pricePerDay;
    private boolean priorKnowledgeRequired;

    public Course(String title, int numberOfDays, double pricePerDay, boolean priorKnowledgeRequired) {
        this.title = title;
        this.numberOfDays = numberOfDays;
        this.pricePerDay = pricePerDay;
        this.priorKnowledgeRequired = priorKnowledgeRequired;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isPriorKnowledgeRequired() {
        return priorKnowledgeRequired;
    }

    public void setPriorKnowledgeRequired(boolean priorKnowledgeRequired) {
        this.priorKnowledgeRequired = priorKnowledgeRequired;
    }

    public double calculateTotalPrice(){
        double total=numberOfDays*pricePerDay;
        if (numberOfDays<3 && !priorKnowledgeRequired)total*=1.21;
        return total;
    }



}
