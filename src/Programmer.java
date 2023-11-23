public class Programmer extends Employee
{
    private int noProjects;

    private double GAIN_FACTOR_PROJECTS = 200;


    //Programmer: name, birthYear, nbProjects, rate
    public Programmer(String name, int birthYear, int noProjects) {
        super(name,birthYear);
        if(IsValidateInputs(noProjects)){
            this.noProjects = noProjects;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
        System.out.println("We have a new employee  :" + this.getName()+ " , a Programmer.");
    }

    public Programmer(String name, int birthYear, int noProjects, int occupationRate) {
        super(name,birthYear,occupationRate);
        if(IsValidateInputs(noProjects)){
            this.noProjects = noProjects;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
        System.out.println("We have a new employee  :" + this.getName()+ " , a Programmer.");
    }

    public Programmer(String name, int birthYear, int noProjects, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        if(IsValidateInputs(noProjects)){
            this.noProjects = noProjects;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
        System.out.println("We have a new employee  :" + this.getName()+ " , a Programmer.");
    }

    public Programmer(String name, int birthYear, int noProjects, int occupationRate, Vehicle vehicle) {
        super(name, birthYear, occupationRate, vehicle);
        if(IsValidateInputs(noProjects)){
            this.noProjects = noProjects;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
        System.out.println("We have a new employee  :" + this.getName()+ " , a Programmer.");
    }

    private boolean IsValidateInputs(int noProjects) {
        return noProjects >= 0;
    }

    public double getGAIN_FACTOR_PROJECTS() {
        return GAIN_FACTOR_PROJECTS;
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
        return this.getName() + " has an Occupation rate:" + this.getOccupationRate()
                + "% and completed " + this.getNoProjects() + " projects. \n "
                + "His/Her estimated annual income is " + this.annualincome();
    }
}
