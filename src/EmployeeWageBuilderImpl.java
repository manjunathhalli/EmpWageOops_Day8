public class EmployeeWageBuilderImpl implements IEmpWageBuilder{

    //Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private List<Company> companyList;

    public void computeEmpWage() {

        for(int i = 0; i < companyList; i++) {

            int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
            // Computation
            while(totalEmpHrs <= companyList.get(i).getMaxHoursPerMonth() && totalWorkingDays < companyList.get(i).getNumOfWorkingDays()) {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch(empCheck) {
                    case IS_PART_TIME:
                        empHrs = 4;
                        break;
                    case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                    default:
                        empHrs = 0;
                }
                totalEmpHrs += empHrs;
                System.out.println("Day#: " + totalWorkingDays + "Emp Hr: " +empHrs);
            }

            int totalEmpWage = totalEmpHrs * companyList.get(i).getEmpRatePerHour();
            companyList.get(i).setTotalEmpWage(totalEmpWage);
        }

        public void addCompany(Company company) {
            companyList.add(company);
        }

        public void retrieveTotalWages() {
            for(Company company : companyList) {
                System.out.println("Company [company= " + company.getCompany() + ", empRatePerHour= " + company.getEmpRatePerHour() +
                        ", numberOfWorkingDays= " + company.getNumberOfWorkingDays() + ", maxHourPerMonth= " + company.getMaxHourPerMonth() +
                        ", totalEmpWage= " + company.getTotalEmpWage() + "]");
            }
        }
        public static void main(String[] args) {
            Company c1 = new Company("DMart", 20, 30, 150);
            Company c2 = new Company("Reliance", 10, 25, 100);
            EmployeeWageBuilderImpl builder = new EmployeeWageBuilder();
            builder.addCompany(c1);
            builder.addComapny(c2);
            builder.retrieveTotalWages();
        }

}
