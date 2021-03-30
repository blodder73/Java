package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int playerScore = 1500;
        String playerName = "Buddy";
        int playerPosition;
        playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition(playerName,playerPosition);

        playerName = "Mira";
        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition(playerName,playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Elmira",playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Ryuken",playerPosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000){
            return 1;
        } else if(playerScore >= 500){
            return 2;
        } else if(playerScore >= 100) {
            return 3;
        }

        return 4;
    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

}
