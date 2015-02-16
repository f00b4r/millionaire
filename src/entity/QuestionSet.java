package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Felix
 */
@XmlRootElement(name = "set")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class QuestionSet {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;
    private static final int MAX_ANSWERS = 4;
    private Question question;
    private Answer[] answers;

    public QuestionSet() {
        this.answers = new Answer[MAX_ANSWERS];
    }

    public QuestionSet(Question question) {
        this.question = question;
        this.answers = new Answer[MAX_ANSWERS];
    }

    public QuestionSet(Question question, Answer answerA, Answer answerB, Answer answerC, Answer answerD) {
        this.question = question;
        this.answers = new Answer[MAX_ANSWERS];
        this.answers[A] = answerA;
        this.answers[B] = answerB;
        this.answers[C] = answerC;
        this.answers[D] = answerD;
    }

    public Answer getAnswerA() {
        return answers[A];
    }

    public void setAnswerA(Answer answerA) {
        this.answers[A] = answerA;
    }

    public Answer getAnswerB() {
        return answers[B];
    }

    public void setAnswerB(Answer answerB) {
        this.answers[B] = answerB;
    }

    public Answer getAnswerC() {
        return answers[C];
    }

    public void setAnswerC(Answer answerC) {
        this.answers[C] = answerC;
    }

    public Answer getAnswerD() {
        return answers[D];
    }

    public void setAnswerD(Answer answerD) {
        this.answers[D] = answerD;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public boolean isCorrect(Answer a) {
        return a.isCorrect();
    }

    public boolean isCorrectA() {
        return answers[A].isCorrect();
    }

    public boolean isCorrectB() {
        return answers[B].isCorrect();
    }

    public boolean isCorrectC() {
        return answers[C].isCorrect();
    }

    public boolean isCorrectD() {
        return answers[D].isCorrect();
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public Answer getCorrectAnswer() {
        for (int i=0; i<MAX_ANSWERS; i++) {
            if (answers[i].isCorrect()) {
                return answers[i];
            }
        }
        throw new UnsupportedOperationException("No correct answer found");
    }
}
