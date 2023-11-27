public class Programmer extends Employee
{
    private int noProjects;

    private final double GAIN_FACTOR_PROJECTS = 200;


    // Constructor for a Programmer with basic information and number of projects
    public Programmer(String name, int birthYear, int noProjects) {
        super(name,birthYear);
        if(IsValidateInputs(noProjects)){
            this.noProjects = noProjects;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
        System.out.println("We have a new employee  :" + this.getName()+ " , a Programmer.");
    }

    // Constructor for a Programmer with basic information, number of projects, and occupationRate
    public Programmer(String name, int birthYear, int noProjects, int occupationRate) {
        super(name,birthYear,occupationRate);
        if(IsValidateInputs(noProjects)){
            this.noProjects = noProjects;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
        System.out.println("We have a new employee  :" + this.getName()+ " , a Programmer.");
    }

    // Constructor for a Programmer with basic information, number of projects, and a vehicle
    public Programmer(String name, int birthYear, int noProjects, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        if(IsValidateInputs(noProjects)){
            this.noProjects = noProjects;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
        System.out.println("We have a new employee  :" + this.getName()+ " , a Programmer.");
    }

    // Constructor for a Programmer with basic information, number of projects, occupationRate, and a vehicle
    public Programmer(String name, int birthYear, int noProjects, int occupationRate, Vehicle vehicle) {
        super(name, birthYear, occupationRate, vehicle);
        if(IsValidateInputs(noProjects)){
            this.noProjects = noProjects;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
        System.out.println("We have a new employee  :" + this.getName()+ " , a Programmer.");
    }

    // Helper method to validate the input for the number of projects
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

    // Method to calculate the annual income of the Programmer
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

    // Method to provide information about the Programmer's contract
    @Override
    public String contractInfo() {
        return this.getName() + " is a Programmer " + getContract().getContractInfo();
    }

    // Method to generate a string representation of the Programmer
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

    // Helper method to provide additional information about the Programmer
    private String GetProgrammerInfo() {
        return this.getName() + " has an Occupation rate:" + this.getOccupationRate()
                + "% and completed " + this.getNoProjects() + " projects. \n "
                + "His/Her estimated annual income is " + this.annualincome();
    }
}
