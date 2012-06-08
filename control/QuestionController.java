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
    private QuestionSet actualSet;
    private IHintStrategy hintStrategy;

    public QuestionController(MainController context) {
        this.context = context;
        this.questionSetSource = new QuestionSetSource();
    }

    public void loadQuestions() {
        questionSets = questionSetSource.loadQuestionSets();
    }

    public QuestionSet getCurrentSet() {
        return actualSet;
    }

    public void nextSet() {
        int i = questionSets.indexOf(actualSet);
        if (i < questionSets.size()) {
            actualSet = questionSets.get(i + 1);
        } else {
            actualSet = null;
        }
    }

    public boolean pick(Answers answer) {
        if (answer == Answers.A) {
            return actualSet.isCorrectA();
        } else if (answer == Answers.B) {
            return actualSet.isCorrectB();
        } else if (answer == Answers.C) {
            return actualSet.isCorrectC();
        } else if (answer == Answers.D) {
            return actualSet.isCorrectD();
        }

        throw new IllegalArgumentException();
    }

    public void setHintStrategy(IHintStrategy hintStrategy) {
        this.hintStrategy = hintStrategy;
    }

    public Answer[] hint() {
        return hintStrategy.applyHint(actualSet);
    }
}
