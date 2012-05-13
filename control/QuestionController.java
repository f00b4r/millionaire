package control;

import entity.Answer;
import entity.Question;
import entity.QuestionSet;
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
    private ArrayList<QuestionSet> questions;
    private QuestionSet actualSet;

    public QuestionController(MainController context) {
        this.context = context;
    }

    public void loadQuestions() {
        // @todo: nacitani otazek z JAXB
    }

    public QuestionSet getSet(int price) {
        actualSet = new QuestionSet();
        actualSet.setQuestion(new Question("Semik byl?", 1000));
        actualSet.setAnswerA(new Answer("Kun", true));
        actualSet.setAnswerB(new Answer("Pes", false));
        actualSet.setAnswerC(new Answer("Jehne", false));
        actualSet.setAnswerD(new Answer("Slepice", false));
        return actualSet;

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
}
