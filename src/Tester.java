public class Tester extends Employee
{
    private int noBugs;

     private double GAIN_FACTOR_ERROR = 10;

    public Tester(String name, int birthYear, int monthlyIncome, int occupationRate) {
        super(name, birthYear, monthlyIncome, occupationRate);
    }

    public Tester(String name, int birthYear, int monthlyIncome, int occupationRate, Vehicle vehicle) {
        super(name, birthYear, monthlyIncome, occupationRate, vehicle);
    }
    public int getNoBugs() {
        return noBugs;
    }

    public void setNoBugs(int noBugs) {
        this.noBugs = noBugs;
    }

    @Override
    public double annualincome() {
        double base = getMontlyIncome() * 12;
        double extra = GAIN_FACTOR_ERROR *  getNoBugs();
        return extra + base ;

    }
}
