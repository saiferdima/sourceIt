package game.HT8;

/**
 * Created with IntelliJ IDEA.
 * User: Shaff
 * Date: 24.04.15
 * Time: 22:16
 * To change this template use File | Settings | File Templates.
 */
public class Launcher {

    public static void main(String[] args) {

        Employee[] employeeArray = DataBaseEmulator.getSomeEmployeeFromDB();
        DataBaseEmulator.sortEmployeeBySalaryAndName(employeeArray);
        Messager.printEmployeesData(employeeArray);
        System.out.println("First five names from list:");
        System.out.println(employeeArray[0].getName());
        System.out.println(employeeArray[1].getName());
        System.out.println(employeeArray[2].getName());
        System.out.println(employeeArray[3].getName());
        System.out.println(employeeArray[4].getName());
        System.out.println("Last 3 Ids from list:");
        System.out.println(employeeArray[employeeArray.length - 1].getId());
        System.out.println(employeeArray[employeeArray.length - 2].getId());
        System.out.println(employeeArray[employeeArray.length - 3].getId());


    }
}
