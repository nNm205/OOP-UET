public class Game {
    private int score;

    public Game() {
        score = 0;
    }

    public Game(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        Game game1 = new Game();
        Game game2 = new Game(100);
        Game game3 = null;
        System.out.println(game1.score);
        System.out.println(game2.score);
    }
}
