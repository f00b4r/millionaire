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

    public QuestionController(MainController context) {
        this.context = context;
    }

    public void loadQuestions() {
        // @todo: nacitani otazek z JAXB
    }

    public QuestionSet getSet(int price) {
        QuestionSet set = new QuestionSet();
        set.setQuestion(new Question("Semik byl?", 1000));
        set.setAnswerA(new Answer("Kun", true));
        set.setAnswerB(new Answer("Pes", false));
        set.setAnswerC(new Answer("Jehne", false));
        set.setAnswerD(new Answer("Slepice", false));
        return set;

    }

    public void pick(Answers answer) {
    }
}
