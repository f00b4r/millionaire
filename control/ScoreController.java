package control;

/**
 *
 * @author Felix
 */
public class ScoreController {

    private MainController context;
    private int score;
    private int safePoint;
    private int safePointScore;

    public ScoreController(MainController context) {
        this.context = context;
        this.score = 0;
        this.safePoint = 0;
        this.safePointScore = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
