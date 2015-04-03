package game;

/**
 * @author PopazovDK
 */
public class Game {

    public static void main(String[] args) {
        Messenger mes = new Messenger();
        Map map = new Map(3, 3);
        Cell[][] maze = map.getMaze();
        map.displayAllCellInfo(maze);

        //   mes.showMessage(maze[0][0].getAllCells());
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
        mes.showMessage("Light radius = " + newSettings.getLightRadius());

    }

    private static String getWritedPlayerName() {
        //TODO Implement logic to save player name entered from keyboard

        String playerName = "Cheaterr";
        return playerName;

    }

    private static int getWritedPlayerdifficult() {
        //TODO Implement logic to save difficult entered from keyboard

        int playerDifficult = 2;
        return playerDifficult;

    }

}
