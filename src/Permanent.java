public class Permanent extends Contract {
    private int daysWorked;
    private double fixMonthSalary;
    private int numberOfChildren;
    private boolean civilStatus;
    private double moneyPremium;

    // Constructor to initialize Permanent employee with relevant information
    public Permanent(int numberOfChildren, boolean civilStatus, double fixMonthSalary, double moneyPremium, int daysWorked) {
        this.numberOfChildren = numberOfChildren;
        this.civilStatus = civilStatus;
        this.daysWorked = daysWorked;
        this.fixMonthSalary = fixMonthSalary;
        this.moneyPremium = moneyPremium;
    }

    public boolean isCivilStatus() {
        return civilStatus;
    }

    //check for marital status
    public void setCivilStatus(boolean civilStatus) {
        this.civilStatus = civilStatus;
    }

    //getter and setter methods
    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public double getFixMonthSalary() {
        return fixMonthSalary;
    }

    public void setFixMonthSalary(double fixMonthSalary) {
        this.fixMonthSalary = fixMonthSalary;
    }

    public double getMoneyPremium() {
        return moneyPremium;
    }

    public void setMoneyPremium(double moneyPremium) {
        this.moneyPremium = moneyPremium;
    }

    // Method to get contract information in a formatted string
    public String getContractInfo() {
        String civilStatusStr = civilStatus ? "is married" : "is not married";
        return String.format("He/She %s and has %d children. \nHe/She has worked for %d days, and upon contract, the monthly salary is %.2f\n",
                civilStatusStr, numberOfChildren, daysWorked, accumulatedSalary(daysWorked));
    }

    // Method to calculate the accumulated salary based on the number of days worked
    public double accumulatedSalary(int daysWorked) {
        return (daysWorked*(fixMonthSalary + getChildrenBonus()))/ Management.workingDaysPerMonth;
    }

    // Private method to calculate the bonus based on the number of children
    private double getChildrenBonus() {
        return civilStatus ? moneyPremium * numberOfChildren : 0;
    }
}
