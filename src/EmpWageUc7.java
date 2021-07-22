public class EmpWageUc7 {

    //class variables or global variables
    //CONSTANTS
    final static int IS_PRESENT = 1;
    final static int IS_FULL_TIME = 1;
    final static int FULL_TIME_WORKING_HRS = 8;
    final static int PART_TIME_WORKING_HRS = 4;
    static int WAGE_PER_HR;
    static int WORKING_DAYS_IN_MONTH;
    static int MAX_WORKING_HRS;

    //company details
    public static void company(String company_name, int wagePerHr, int workingDaysPerMonth,int workingHrsPerMonth) {
        WAGE_PER_HR = wagePerHr;
        WORKING_DAYS_IN_MONTH = workingDaysPerMonth;
        MAX_WORKING_HRS = workingHrsPerMonth;
    }
    //To calculate wage of employee
    public static int employeeWage(int workingHrs) {
        int dailyWage = workingHrs * WAGE_PER_HR;
        return dailyWage;
    }
    //main method
    public static void main(String[] args) {
        //VARIABLES
        int dayOfMonth = 0;
        int empDailyWage = 0;
        int empMonthlyWage = 0;
        int totalWorkingHrs = 0;
        String company1 = "Burger King";
        String company2 = "Pizza Hut";
        String company3 = "McDonalds";
        String company4 = "KFC";

        //calling company-method for distinct company
        company(company1, 30, 15, 60); // company_name, wagePerHr, workingDaysPerMonth, workingHrsPerMonth
        //CONDITION AND CALCULATION
        while((dayOfMonth < WORKING_DAYS_IN_MONTH) && (totalWorkingHrs < MAX_WORKING_HRS)) {
            int checkPresence = (int) (Math.random() * 10 % 2);
            int checkWorkingTime = (int) (Math.random() * 10 % 2);
            switch(checkPresence) {
                case IS_PRESENT:
                    switch(checkWorkingTime) {
                        case IS_FULL_TIME:
                            empDailyWage = employeeWage(FULL_TIME_WORKING_HRS);
                            totalWorkingHrs += FULL_TIME_WORKING_HRS;
                            break;
                        default:
                            empDailyWage = employeeWage(PART_TIME_WORKING_HRS);
                            totalWorkingHrs += PART_TIME_WORKING_HRS;
                            break;
                    }
                    empMonthlyWage += empDailyWage;
                    break;
                default:
            }
            dayOfMonth++;
        }
        System.out.println("Employee monthly wage is:"+company1+" "+empMonthlyWage);
    }

}
