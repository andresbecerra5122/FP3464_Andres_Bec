public class Manager extends Employee
{
    private int travelledDays;

    private int newClients;

    private double GAIN_FACTOR_CLIENT = 500;

    private double GAIN_FACTOR_TRAVEL = 100;


    public Manager(String name, int birthYear, double monthlyIncome, int occupationRate,
                   int travelledDays, int newClients ) {
        super(name, birthYear, monthlyIncome, occupationRate);
        this.travelledDays = travelledDays;
        this.newClients = newClients;
    }

    public Manager(String name, int birthYear, int monthlyIncome, int occupationRate, Vehicle vehicle) {
        super(name, birthYear, monthlyIncome, occupationRate,vehicle);
    }

    public Manager(String name, int birthYear, int monthlyIncome, int occupationRate, int travelledDays) {
        super(name, birthYear, monthlyIncome, occupationRate);
        this.travelledDays = travelledDays;
    }

    public int getTravelledDays() {
        return travelledDays;
    }

    public void setTravelledDays(int travelledDays) {
        this.travelledDays = travelledDays;
    }

    public int getNewClients() {
        return newClients;
    }

    public void setNewClients(int newClients) {
        this.newClients = newClients;
    }

    @Override
    public double annualincome() {
        double base = getMontlyIncome() * 12;
        double extra = GAIN_FACTOR_CLIENT *  getNewClients();
        double extra2 = GAIN_FACTOR_TRAVEL * getTravelledDays();
        return extra + base ;
    }
}
