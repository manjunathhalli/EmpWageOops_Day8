public class EmployeeAttendance {

    //Constants variables
    public static final int IS_ABSENT = 0;
    public static final int IS_PRESENT = 1;

    public static int present() {
        int emp_Check = (int) Math.floor(Math.random() * 10 ) % 2;
        switch(emp_Check) {
            case IS_ABSENT:System.out.println("Employee is absent");
                break;
            case IS_PRESENT:System.out.println("Employee is present");
                break;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(present());
    }
}
