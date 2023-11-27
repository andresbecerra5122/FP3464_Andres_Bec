public class Temporary extends Contract {
    private double hourlyWage;
    private int hoursMonth;

    // Constructor to initialize Temporary employee with hourly wage and hours worked per month
    public Temporary(int hourlyWage, int hoursMonth) {
        this.hourlyWage = hourlyWage;
        this.hoursMonth = hoursMonth;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursMonth() {
        return hoursMonth;
    }

    public void setHoursMonth(int hoursMonth) {
        this.hoursMonth = hoursMonth;
    }

    // Method to calculate the accumulated salary based on hourly wage and hours worked
    public double accumulatedSalary() {
        return hoursMonth * hourlyWage;
    }

    // Override method to get contract information in a formatted string
    @Override
    public String getContractInfo() {
        return String.format("He is a temporary employee with %.2f hourly salary, and he has worked for %d hours.\n",
                hourlyWage, hoursMonth);
    }
}
