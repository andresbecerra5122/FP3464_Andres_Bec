public class Programmer extends Employee
{
    private int noProjects;

    private double GAIN_FACTOR_PROJECTS = 200;


    //Programmer: name, birthYear, nbProjects, rate
    public Programmer(String name, int birthYear, int noProjects) {
        super(name,birthYear,100);
        System.out.println("We have a new employee  :" + this.getName()+ " , a Programmer.");
        this.noProjects = noProjects;
    }

    public Programmer(String name, int birthYear, int noProjects, int occupationRate, Vehicle vehicle) {
        super(name,birthYear,occupationRate,vehicle);
        this.noProjects = noProjects;
        System.out.println("We have a new employee  :" + this.getName()+ " , a Programmer.");
    }

    public Programmer(String name, int birthYear, int noProjects, int occupationRate) {
        super(name,birthYear,occupationRate);
        this.noProjects = noProjects;
        System.out.println("We have a new employee  :" + this.getName()+ " , a Programmers.");
    }

    public Programmer(String name, int birthYear, int noProjects, Vehicle vehicle) {
        super(name,birthYear,100,vehicle);
        this.noProjects = noProjects;
        System.out.println("We have a new employee  :" + this.getName()+ " , a Programmer.");
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

    @Override
    public void signContract(Contract p1) {
     this.setContract(p1);
    }

    @Override
    public String contractInfo() {
        return this.getName() + " is a Programmer " + getContract().GetContractinfo();
    }

    public String toString(){

        String Total = "Name: " + this.getName()+ ", a Programmer \n" +
                "Age: " + this.getAge() + "\n";

        Vehicle vehicle = this.getVehicle();
        if(vehicle != null)
        {
            Total = Total + vehicle.toString();
        }
        Total = Total + GetProgrammerInfo();
        return Total;
    }

    private String GetProgrammerInfo() {
        return this.getName() + " has an Occupation rate:" + this.getOcupationRate()
                + "% and completed " + this.getNoProjects() + " projects. \n "
                + "His/Her estimated annual income is " + this.annualincome();
    }
}
