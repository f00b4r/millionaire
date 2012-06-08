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

    public int getSafePoint() {
        return safePoint;
    }

    public void setSafePoint(int safePoint) {
        this.safePoint = safePoint;
    }

    public int getSafePointScore() {
        return safePointScore;
    }

    public void setSafePointScore(int safePointScore) {
        this.safePointScore = safePointScore;
    }
}
