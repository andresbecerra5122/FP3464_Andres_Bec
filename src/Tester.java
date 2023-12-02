public class Tester extends Employee
{
    private int noBugs;

     private final double GAIN_FACTOR_ERROR = 10;

    // Constructor for a Tester with basic information and number of bugs
    public Tester(String name, int birthYear, int noBugs) {
        super(name, birthYear);
        if(IsValidateInputs(noBugs)){
            this.noBugs = noBugs;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
    }

    // Constructor for a Tester with basic information, number of bugs, and occupationRate
    public Tester(String name, int birthYear, int noBugs, int occupationRate) {
        super(name, birthYear, occupationRate);
        if(IsValidateInputs(noBugs)){
            this.noBugs = noBugs;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
    }

    // Constructor for a Tester with basic information, number of bugs, and a vehicle
    public Tester(String name, int birthYear, int noBugs, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        if(IsValidateInputs(noBugs)){
            this.noBugs = noBugs;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
    }

    // Constructor for a Tester with basic information, number of bugs, occupationRate, and a vehicle
    public Tester(String name, int birthYear, int noBugs, int occupationRate, Vehicle vehicle) {
        super(name, birthYear, occupationRate, vehicle);
        if(IsValidateInputs(noBugs)){
            this.noBugs = noBugs;
        }else {
            throw new IllegalArgumentException("invalid input for number of projects");
        }
    }

    // Helper method to validate the input for the number of bugs
    private boolean IsValidateInputs(int noBugs) {
        return noBugs >= 0;
    }

    public double getGAIN_FACTOR_ERROR() {
        return GAIN_FACTOR_ERROR;
    }


    public int getNoBugs() {
        return noBugs;
    }

    public void setNoBugs(int noBugs) {
        this.noBugs = noBugs;
    }

    // Method to calculate the annual income of the Tester
    @Override
    public double annualincome() {
        double base = getMontlyIncome() * 12;
        double extra = GAIN_FACTOR_ERROR *  getNoBugs();
        return extra + base ;

    }

    //method to change to contract
    @Override
    public void signContract(Contract p1) {
          this.setContract(p1);
    }

    //method to get contract info

    @Override
    public String contractInfo() {
        return this.getName() + " is a Tester " + getContract().getContractInfo();
    }

    // Method to generate a string representation of the Tester
    public String toString(){
        return super.toString() + GetTesterInfo();
    }

    // Helper method to provide additional information about the Tester
    private String GetTesterInfo() {
        return this.getName() + " has an Occupation rate:" + this.getOccupationRate()
                + "% and corrected " + this.getNoBugs() + " Bugs. \n "
                + "His/Her estimated annual income is " + this.annualincome();
    }
}
