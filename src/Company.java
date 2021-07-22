public class Company {

    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;

    public Company(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getEmpRatePerHour() {
        return empRatePerHour;
    }

    public void setEmpRatePerHour(int empRatePerHour) {
        this.empRatePerHour = empRatePerHour;
    }

    public int getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }

    public void setNumberOfWorkingDays(int numberOfWorkingDays) {
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    public int getMaxHoursPerMonth() {
        return maxHoursPerMonth;
    }

    public void setMaxHoursPerMonth(int maxHoursPerMonth) {
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for Company: " + company + " is: " + totalEmpWage;
    }
}
