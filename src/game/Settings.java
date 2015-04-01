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
        lightRadius = calculateLightRadius(selectedDifficult);


    }

    private int calculateLightRadius(int difficult) {
        int calculatedlightRadius;
        if (difficult == 0) {
            calculatedlightRadius = 100;
        }
        if (difficult == 1) {
            calculatedlightRadius = 2;
        } else
            calculatedlightRadius = 1;
        return calculatedlightRadius;
    }
}

	


