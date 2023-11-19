public class Permanent extends Contract {
    private int DaysWorked;

    private double FixMonthSalary;

    private int NumberOfChildren;

    private boolean CivilStatus;

    private double MoneyPremium;

    public Permanent(int numberOfChildren, boolean civilStatus, double fixMonthSalary, double moneyPremium, int daysWorked) {
        this.NumberOfChildren = numberOfChildren;
        this.CivilStatus = civilStatus;
        this.DaysWorked = daysWorked;
        this.FixMonthSalary = fixMonthSalary;
        this.MoneyPremium = moneyPremium;
    }

    public boolean isCivilStatus() {
        return CivilStatus;
    }

    public void setCivilStatus(boolean civilStatus) {
        CivilStatus = civilStatus;
    }

    public int getNumberOfChildren() {
        return NumberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        NumberOfChildren = numberOfChildren;
    }

    public int getDaysWorked() {
        return DaysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        DaysWorked = daysWorked;
    }

    public double getFixMonthSalary() {
        return FixMonthSalary;
    }

    public void setFixMonthSalary(double fixMonthSalary) {
        FixMonthSalary = fixMonthSalary;
    }

    public double getMoneyPremium() {
        return MoneyPremium;
    }

    public void setMoneyPremium(double moneyPremium) {
        MoneyPremium = moneyPremium;
    }

    public String GetContractinfo() {

        String civilStatus = this.isCivilStatus() ? "is married " : "is not married ";
        return "he/she " + civilStatus + "and he/she has " + this.getNumberOfChildren() +
                " children. \n he/she has worked for " + this.getDaysWorked() +
                " days and upon contract his/her monthly \n salary is " + this.GetRealMonthlySalary() + "\n";
    }

    private double GetRealMonthlySalary(){

        return this.getFixMonthSalary() + this.getchildrenBonus();
    }

    private double getchildrenBonus() {
        if(isCivilStatus())
        {
            return this.getMoneyPremium() * this.getNumberOfChildren();
        }
        else
        {
            return 0;
        }

    }


}
