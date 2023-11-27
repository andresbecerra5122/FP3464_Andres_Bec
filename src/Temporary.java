public class Temporary extends Contract {
    private int hourlyWage;
    private double hoursMonth;

    public Temporary(int hourlyWage, double hoursMonth) {
        this.hourlyWage = hourlyWage;
        this.hoursMonth = hoursMonth;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursMonth() {
        return hoursMonth;
    }

    public void setHoursMonth(double hoursMonth) {
        this.hoursMonth = hoursMonth;
    }

    @Override
    public String getContractInfo() {
        return String.format("He is a temporary employee with %d hourly salary, and he has worked for %.2f hours.\n",
                hourlyWage, hoursMonth);
    }
}
