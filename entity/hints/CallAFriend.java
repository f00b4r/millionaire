package entity.hints;

import entity.Answer;
import entity.QuestionSet;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Felix
 */
public class CallAFriend implements IHintStrategy {

    /**
     * Applies call a friend hint on a given set of questions.
     * As a result, random answer will be hinted (the friend won't help much:)
     * @param questionSet
     * @return hinted answer
     */
    @Override
    public Answer[] applyHint(QuestionSet questionSet) {
        Answer[] answers = questionSet.getAnswers();
        ArrayList<Answer> activeAnswers = new ArrayList<>();

        // Find all the answers that have not been removed yet.
        for (Answer answer : answers) {
            if (!answer.isRemoved()) {
                activeAnswers.add(answer);
            }
        }

        // Pick a random one.
        Random rand = new Random(System.nanoTime());
        int index = rand.nextInt(activeAnswers.size());
        Answer randAnswer = activeAnswers.get(index);
        randAnswer.setHinted(true);

        return new Answer[]{randAnswer};
    }

}
