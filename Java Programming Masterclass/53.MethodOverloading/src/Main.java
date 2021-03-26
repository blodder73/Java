public class Main {
    public static void main(String[] args) {
        calculatedScore("Tim", 500);
        int newScore = calculatedScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculatedScore(75);
        calculatedScore();
    }

    public static int calculatedScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculatedScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculatedScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }
}
