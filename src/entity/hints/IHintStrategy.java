package entity.hints;

import entity.Answer;
import entity.QuestionSet;

/**
 *
 * @author Felix
 */
public interface IHintStrategy {

    public Answer[] applyHint(QuestionSet questionSet);

}
