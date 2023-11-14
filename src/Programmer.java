public class Programmer extends Employee
{
    private int noProjects;

    private double GAIN_FACTOR_PROJECTS = 200;



    public Programmer(String name, int birthYear, int monthlyIncome) {
        super(name,birthYear,monthlyIncome,100);
    }

    public Programmer(String name, int birthYear, int monthlyIncome, int occupationRate, Vehicle vehicle) {
        super(name,birthYear,monthlyIncome,occupationRate,vehicle);
    }

    public Programmer(String name, int birthYear, int monthlyIncome, int occupationRate) {
        super(name,birthYear,monthlyIncome,occupationRate);
    }

    public Programmer(String name, int birthYear, int monthlyIncome, Vehicle vehicle) {
        super(name,birthYear,monthlyIncome,100,vehicle);
    }

    public int getNoProjects() {
        return noProjects;
    }

    public void setNoProjects(int noProjects) {
        this.noProjects = noProjects;
    }

    @Override
    public double annualincome() {
        double base = getMontlyIncome() * 12;
        double extra = GAIN_FACTOR_PROJECTS *  getNoProjects();
        return extra + base ;
    }
}
