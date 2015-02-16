package entity;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Felix
 */
@XmlRootElement
public class Answer {

    private String message;
    private boolean correct;
    private boolean hinted;
    private boolean removed;

    public Answer() {
        this.message = null;
        this.correct = false;
        this.hinted = false;
        this.removed = false;
    }

    public Answer(String message, boolean correct) {
        this.message = message;
        this.correct = correct;
        this.hinted = false;
        this.removed = false;
    }

    /**
     * @return true if this answer is removed
     */
    @XmlTransient
    public boolean isRemoved() {
        return removed;
    }

    /**
     * @param removed true if this answer is removed
     */
    public void setRemoved(boolean removed) {
        this.removed = removed;
    }

    /**
     * Tells if this answer is hinted.
     * @return true if this answer is hinted
     */
    public boolean isHinted() {
        return hinted;
    }

    /**
     * Sets hinted state for this answer.
     * @param hinted
     */
    public void setHinted(boolean hinted) {
        this.hinted = hinted;
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
