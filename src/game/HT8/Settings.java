package game.HT8;

/**
 * Created with IntelliJ IDEA.
 * User: Shaff
 * Date: 24.04.15
 * Time: 23:13
 * To change this template use File | Settings | File Templates.
 */
public class Settings {
    private static float HOUR_RATE = 10;
    private static float MIN_SALARY = 1200;
    private static int currentEmployeeId = 1;
    private static int FIX_RATE_EMPLOYEE_TYPE_ID = 1;
    private static int TIME_BASED_EMPLOYEE_TYPE_ID = 2;
    private static int FIX_RATE_EMPLOYEE_COUNT = 5;
    private static int TIME_BASED_EMPLOYEE_COUNT = 5;

    public static float getMIN_SALARY() {
        return MIN_SALARY;
    }

    public static int getCurrentEmployeeId() {
        return currentEmployeeId;
    }

    public static void increaseCurrentEmployeeId() {
        Settings.currentEmployeeId = Settings.currentEmployeeId + 1;
    }

    public static void setMIN_SALARY(float MIN_SALARY) {
        Settings.MIN_SALARY = MIN_SALARY;

    }

    public static float getHOUR_RATE() {
        return HOUR_RATE;
    }

    public static int getFIX_RATE_EMPLOYEE_TYPE_ID() {
        return FIX_RATE_EMPLOYEE_TYPE_ID;
    }

    public static int getTIME_BASED_EMPLOYEE_TYPE_ID() {
        return TIME_BASED_EMPLOYEE_TYPE_ID;
    }

    public static int getFIX_RATE_EMPLOYEE_COUNT() {
        return FIX_RATE_EMPLOYEE_COUNT;
    }

    public static int getTIME_BASED_EMPLOYEE_COUNT() {
        return TIME_BASED_EMPLOYEE_COUNT;
    }
}
