package game;

public class Game {

    public static void main(String[] args) {
        start();
        test();
        stop();


    }

    public static void start() {
        Messenger mes = new Messenger();
        mes.showMessage("Game started...\nLoading....");

    }

    public static void stop() {
        Messenger mes = new Messenger();
        mes.showMessage("GAME OVER");

    }


    public static void test() {
        Messenger mes = new Messenger();
        mes.showMessage("Please. Select Player Name");
        String writedPlayerName = getWritedPlayerName();
        Player newPlayer = new Player(writedPlayerName);
        mes.showMessage("Please Select difficult");
        int selectedDifficult = getWritedPlayerdifficult();
        mes.showMessage("Hello " + newPlayer.playerName + "\nYou select difficult = " + selectedDifficult);
        Settings newSettings = new Settings(selectedDifficult, writedPlayerName);


    }

    private static String getWritedPlayerName() {
        //TODO Implement logic to save player name entered from keyboard

        String playerName = "defaultPlayerName";
        return playerName;

    }

    private static int getWritedPlayerdifficult() {
        //TODO Implement logic to save difficult entered from keyboard

        int playerDifficult = 1;
        return playerDifficult;

    }

}
