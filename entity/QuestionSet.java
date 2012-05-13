package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Felix
 */
@XmlRootElement(name = "set")
@XmlAccessorType(XmlAccessType.FIELD)
public class QuestionSet {

    private Question question;
    private Answer answerA;
    private Answer answerB;
    private Answer answerC;
    private Answer answerD;

    public QuestionSet() {
    }

    public QuestionSet(Question question) {
        this.question = question;
    }

    public QuestionSet(Question question, Answer answerA, Answer answerB, Answer answerC, Answer answerD) {
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
    }

    public Answer getAnswerA() {
        return answerA;
    }

    public void setAnswerA(Answer answerA) {
        this.answerA = answerA;
    }

    public Answer getAnswerB() {
        return answerB;
    }

    public void setAnswerB(Answer answerB) {
        this.answerB = answerB;
    }

    public Answer getAnswerC() {
        return answerC;
    }

    public void setAnswerC(Answer answerC) {
        this.answerC = answerC;
    }

    public Answer getAnswerD() {
        return answerD;
    }

    public void setAnswerD(Answer answerD) {
        this.answerD = answerD;
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
        return answerA.isCorrect();
    }

    public boolean isCorrectB() {
        return answerB.isCorrect();
    }

    public boolean isCorrectC() {
        return answerC.isCorrect();
    }

    public boolean isCorrectD() {
        return answerD.isCorrect();
    }
}
