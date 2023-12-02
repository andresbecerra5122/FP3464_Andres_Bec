public class Manager extends Employee
{
    private int travelledDays;

    private int newClients;

    private final double GAIN_FACTOR_CLIENT = 500;

    private final double GAIN_FACTOR_TRAVEL = 100;


    // Constructor for a Manager with basic information, newClients, and travelledDays
    public Manager(String name, int birthYear, int newClients, int travelledDays ) {
        super(name, birthYear);
        if(IsValidateInputs(travelledDays, newClients)){
            this.travelledDays = travelledDays;
            this.newClients = newClients;
        }else {
            throw new IllegalArgumentException("invalid input for travel days or client number");
        }
    }

    // Constructor for a Manager with basic information, newClients, travelledDays, and occupationRate
    public Manager(String name, int birthYear, int newClients, int travelledDays, int occupationRate){
        super(name, birthYear, occupationRate);
        if(IsValidateInputs(travelledDays, newClients)){
            this.travelledDays = travelledDays;
            this.newClients = newClients;
        }else {
            throw new IllegalArgumentException("invalid input for travel days or client number");
        }
    }

    // Constructor for a Manager with basic information, newClients, travelledDays, and a vehicle
    public Manager(String name, int birthYear, int newClients, int travelledDays, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        if(IsValidateInputs(travelledDays, newClients)){
            this.travelledDays = travelledDays;
            this.newClients = newClients;
        }else {
            throw new IllegalArgumentException("invalid input for travel days or client number");
        }
    }

    // Constructor for a Manager with basic information, newClients, travelledDays, occupationRate, and a vehicle
    public Manager(String name, int birthYear, int newClients, int travelledDays, int occupationRate, Vehicle vehicle){
        super(name, birthYear, occupationRate, vehicle);
        if(IsValidateInputs(travelledDays, newClients)){
            this.travelledDays = travelledDays;
            this.newClients = newClients;
        }else {
            throw new IllegalArgumentException("invalid input for travel days or client number");
        }
    }

    // Helper method to validate inputs for newClients and travelledDays
    private boolean IsValidateInputs(int travelledDays, int newClients) {
        return travelledDays >= 0 && newClients >= 0;
    }

    //getter and setter methods
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

    public double getGAIN_FACTOR_CLIENT() {
        return GAIN_FACTOR_CLIENT;
    }

    public double getGAIN_FACTOR_TRAVEL() {
        return GAIN_FACTOR_TRAVEL;
    }

    // Method to calculate the annual income of the Manager
    @Override
    public double annualincome() {
        double base = getMontlyIncome() * 12;
        double extra = GAIN_FACTOR_CLIENT *  getNewClients();
        double extra2 = GAIN_FACTOR_TRAVEL * getTravelledDays();
        return extra + base + extra2 ;
    }

    // Method to provide information about the Manager's contract
    @Override
    public String contractInfo() {
        return this.getName() + " is a Manager " + getContract().getContractInfo();
    }

    // Method to generate a string representation of the Manager

    public String toString(){
        return super.toString() + GetManagerInfo();
    }

    // Helper method to provide additional information about the Manager
    private String GetManagerInfo() {
        return this.getName() + " has an Occupation rate:" + this.getOccupationRate()
                + "% he/she travelled " + this.getTravelledDays() + " days and has brought "
                + this.getNewClients() + " new clients. \n " +
                "His/Her estimated annual income is " + this.annualincome();
    }
}
