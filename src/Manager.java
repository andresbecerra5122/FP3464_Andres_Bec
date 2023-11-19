public class Manager extends Employee
{
    private int travelledDays;

    private int newClients;

    private double GAIN_FACTOR_CLIENT = 500;

    private double GAIN_FACTOR_TRAVEL = 100;


    public Manager(String name, int birthYear, int newClients, int travelledDays,
                   int occupationRate ) {
        super(name, birthYear,occupationRate);
        this.travelledDays = travelledDays;
        this.newClients = newClients;
        System.out.println("We have a new employee  :" + this.getName()+ " , a Manager.");
    }

    // Manager: name, birthYear, nbClients, nbTravelDays, rate

    public Manager(String name, int birthYear, int newClients, int travelledDays, Vehicle vehicle) {
        super(name, birthYear, 10,vehicle);
        this.travelledDays = travelledDays;
        this.newClients = newClients;
        System.out.println("We have a new employee  :" + this.getName()+ " , a Manager.");


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

    @Override
    public String contractInfo() {
        return this.getName() + " is a Manager " + getContract().GetContractinfo();
    }

    public String toString(){

        String Total = "Name: " + this.getName()+ ", a Manager \n" +
                    "Age: " + this.getAge() + "\n";

        Vehicle vehicle = this.getVehicle();
        if(vehicle != null)
        {
            Total = Total + vehicle.toString();
        }
        Total = Total + GetManagerInfo();
        return Total;
    }

    private String GetManagerInfo() {
        return this.getName() + " has an Occupation rate:" + this.getOcupationRate()
                + "% he/she travelled " + this.getTravelledDays() + " days and has brought "
                + this.getNewClients() + " new clients. \n " +
                "His/Her estimated annual income is " + this.annualincome();
    }
}
