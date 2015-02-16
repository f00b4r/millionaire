package entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Felix
 */
@XmlRootElement
public class Question {

    private String message;
    private int amount;

    public Question() {
    }

    public Question(String message, int amount) {
        this.message = message;
        this.amount = amount;
    }

    /**
     * Get the value of awards
     *
     * @return the value of awards
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Set the value of awards
     *
     * @param awards new value of awards
     */
    public void setAmount(int amount) {
        this.amount = amount;
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
