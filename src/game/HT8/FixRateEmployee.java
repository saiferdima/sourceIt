package game.HT8;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Shaff
 * Date: 24.04.15
 * Time: 22:37
 * To change this template use File | Settings | File Templates.
 */
public class FixRateEmployee extends Employee {

    public FixRateEmployee() {
        this("Default Fix salary Name");
    }

    public FixRateEmployee(String name) {
        super(name);
        super.setSalary(calculateSalary());
        super.setType(Settings.getFIX_RATE_EMPLOYEE_TYPE_ID());


    }


    public float calculateSalary() {
        Random random = new Random();
        float salary = Settings.getMIN_SALARY() + ((random.nextInt(9) * Settings.getMIN_SALARY()) / 10);

        return salary;
    }
}
