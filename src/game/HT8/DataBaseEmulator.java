package game.HT8;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Shaff
 * Date: 25.04.15
 * Time: 0:31
 * To change this template use File | Settings | File Templates.
 */
public class DataBaseEmulator {

    public static Employee[] getSomeEmployeeFromDB() {
        Random rnd = new Random();
        int timeBasedEmployeeCount = Settings.getTIME_BASED_EMPLOYEE_COUNT();
        int fixRateEmployeeCount = Settings.getFIX_RATE_EMPLOYEE_COUNT();
        int length = timeBasedEmployeeCount + fixRateEmployeeCount;
        Employee[] arrayOfEmployee = new Employee[length];
        for (int i = 0; i < timeBasedEmployeeCount; i++) {
            arrayOfEmployee[i] = new TimeBasedEmployee("NewNameTBE" + rnd.nextInt(1000));
        }
        for (int i = timeBasedEmployeeCount; i < length; i++) {
            arrayOfEmployee[i] = new FixRateEmployee("NewNameFRE" + rnd.nextInt(1000));

        }


        return arrayOfEmployee;
    }

    public static Employee[] sortEmployeeBySalaryAndName(Employee[] employeeArray) {
        for (int i = 0; i < employeeArray.length - 1; i++) {
            for (int j = i + 1; j < employeeArray.length; j++) {
                if (employeeArray[i].getSalary() < employeeArray[j].getSalary()) {
                    Employee tempEmployee = employeeArray[i];
                    employeeArray[i] = employeeArray[j];
                    employeeArray[j] = tempEmployee;
                }
            }

        }
        sortEmployeeByName(employeeArray);
        return employeeArray;

    }

    public static Employee[] sortEmployeeByName(Employee[] employeeArray) {
        for (int i = 0; i < employeeArray.length - 1; i++) {
            for (int j = i + 1; j < employeeArray.length; j++) {
                if ((employeeArray[i].getSalary() == employeeArray[j].getSalary()) && (1 < (employeeArray[i].getName().compareTo(employeeArray[j].getName())))) {
                    Employee tempEmployee = employeeArray[i];
                    employeeArray[i] = employeeArray[j];
                    employeeArray[j] = tempEmployee;
                }

            }

        }

        return employeeArray;

    }


}
