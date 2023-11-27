public class Temporary extends Contract {
    private double hourlyWage;
    private int hoursMonth;

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
    public double accumulatedSalary() {
        return hoursMonth * hourlyWage;
    }
    @Override
    public String getContractInfo() {
        return String.format("He is a temporary employee with %.2f hourly salary, and he has worked for %d hours.\n",
                hourlyWage, hoursMonth);
    }
}
