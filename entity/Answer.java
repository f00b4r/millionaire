package entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Felix
 */
@XmlRootElement
public class Answer {

    private String message;
    private boolean correct;

    public Answer() {
    }

    public Answer(String message, boolean correct) {
        this.message = message;
        this.correct = correct;
    }

    /**
     * Get the value of correct
     *
     * @return the value of correct
     */
    public boolean isCorrect() {
        return correct;
    }

    /**
     * Set the value of correct
     *
     * @param correct new value of correct
     */
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    /**
     * Get the value of message
     *
     * @return the value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set the value of message
     *
     * @param message new value of message
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
