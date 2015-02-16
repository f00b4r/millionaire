package control;

import component.data.QuestionSetSource;
import entity.Answer;
import entity.QuestionSet;
import entity.hints.IHintStrategy;
import java.util.ArrayList;

/**
 *
 * @author Felix
 */
public class QuestionController {

    public static enum Answers {

        A, B, C, D;
    }
    private MainController context;
    private QuestionSetSource questionSetSource;
    private ArrayList<QuestionSet> questionSets;
    private QuestionSet currentSet;
    private IHintStrategy hintStrategy;
    private int score;
    private int safePoint;

    public QuestionController(MainController context) {
        this.context = context;
        this.questionSetSource = new QuestionSetSource();
        this.score = 0;
        this.safePoint = 0;
    }

    public void loadQuestions() {
        questionSets = questionSetSource.loadQuestionSets();
    }

    public ArrayList<QuestionSet> getQuestions() {
        return questionSets;
    }

    public QuestionSet getCurrentSet() {
        return currentSet;
    }

    public int getCurrentSetIndex() {
        return questionSets.indexOf(currentSet);
    }

    public boolean hasMoreQuestions() {
        if (getQuestions() == null) {
            return false;
        }
        return getCurrentSetIndex() < getQuestions().size() - 1;
    }

    public void nextSet() {
        int i = getCurrentSetIndex();
        if (i < questionSets.size() - 1) {
            currentSet = questionSets.get(i + 1);
        } else {
            currentSet = null;
        }
    }

    public boolean pick(Answers answer) {
        if (answer == Answers.A) {
            return currentSet.isCorrectA();
        } else if (answer == Answers.B) {
            return currentSet.isCorrectB();
        } else if (answer == Answers.C) {
            return currentSet.isCorrectC();
        } else if (answer == Answers.D) {
            return currentSet.isCorrectD();
        }

        throw new IllegalArgumentException();
    }

    public void setHintStrategy(IHintStrategy hintStrategy) {
        this.hintStrategy = hintStrategy;
    }

    public Answer[] hint() {
        return hintStrategy.applyHint(currentSet);
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
        if (safePoint == 0) {
            return 0;
        }
        return questionSets.get(safePoint).getQuestion().getAmount();
    }
}
