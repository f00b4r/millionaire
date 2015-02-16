package component.data;

import entity.Answer;
import entity.Question;
import entity.QuestionSet;
import java.util.ArrayList;

/**
 *
 * @author stuchl4n3k
 */
public class QuestionSetSource {

    public ArrayList<QuestionSet> loadQuestionSets() {
        ArrayList<QuestionSet> sets = new ArrayList<>();

        // todo: JAXB load
        QuestionSet set = new QuestionSet();
        set.setQuestion(new Question("Semik byl?", 1000));
        set.setAnswerA(new Answer("Kun", true));
        set.setAnswerB(new Answer("Pes", false));
        set.setAnswerC(new Answer("Jehne", false));
        set.setAnswerD(new Answer("Slepice", false));
        sets.add(set);
        set = new QuestionSet();
        set.setQuestion(new Question("Java je?", 2000));
        set.setAnswerA(new Answer("Polský velbloud", false));
        set.setAnswerB(new Answer("Poloostrov", false));
        set.setAnswerC(new Answer("Programovací jazyk", true));
        set.setAnswerD(new Answer("Hovězí jazyk", false));
        sets.add(set);

        return sets;
    }

}
