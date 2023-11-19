public class Temporary extends Contract
{
    private int HourlyWage;
    private double HoursMonth;

    public Temporary(int hourlyWage, int hoursMonth) {
        super();

        this.HourlyWage = hourlyWage;
        this.HoursMonth = hoursMonth;
    }

    public int getHourlyWage() {
        return HourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
        HourlyWage = hourlyWage;
    }

    public double getHoursMonth() {
        return HoursMonth;
    }

    public void setHoursMonth(double hoursMonth) {
        HoursMonth = hoursMonth;
    }

    @Override
    public String GetContractinfo() {
        return "he is temporary employee with " + this.getHourlyWage() +
                " \n hourly salary and he has worked for " + this.getHoursMonth()+
                " hours \n";
    }
}
