package game;

public class Settings {

    private int difficult;
    private int lightRadius;

    public Settings(int selectedDifficult, String playerName) {
        if (playerName.equalsIgnoreCase("Cheater")) {
            difficult = 0;
        } else {
            difficult = selectedDifficult;
        }
        lightRadius = calculateLightRadius(difficult);


    }

    public int getLightRadius() {
        return lightRadius;

    }

    private int calculateLightRadius(int difficult) {
        int calculatedLightRadius = 1;
        if (difficult == 0) {
            calculatedLightRadius = 100;
        }
        if (difficult == 1) {
            calculatedLightRadius = 2;
        }
        return calculatedLightRadius;
    }


}




	


