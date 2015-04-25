package game.HT8;


public class TimeBasedEmployee extends Employee {


    public TimeBasedEmployee() {
        this("Default Time Base Name");
    }

    public TimeBasedEmployee(String name) {
        super(name);
        super.setSalary(calculateSalary());
        super.setType(Settings.getTIME_BASED_EMPLOYEE_TYPE_ID());


    }


    public float calculateSalary() {


        return (float) (20.8 * 8 * Settings.getHOUR_RATE());
    }
}
