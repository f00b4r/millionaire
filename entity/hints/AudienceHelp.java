package entity.hints;

import entity.Answer;
import entity.QuestionSet;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Felix
 */
public class AudienceHelp implements IHintStrategy {

    /**
     * /**
     * Applies audience help hint on a given set of questions.
     * As a result, the correct answer will be hinted with probability
     * of 2/3.
     * @param questionSet
     * @return hinted answer
     */
    @Override
    public Answer[] applyHint(QuestionSet questionSet) {
        Answer[] answers = questionSet.getAnswers();
        ArrayList<Answer> activeAnswers = new ArrayList<>();

        // Get the correct answer.
        Answer correctAnswer = questionSet.getCorrectAnswer();

        // Find all the answers that have not been removed yet,
        // except the correct one.
        for (Answer answer : answers) {
            if (!answer.isRemoved() && answer != correctAnswer) {
                activeAnswers.add(answer);
            }
        }

        // Now there is n: the count of wrong active answers.
        int n = activeAnswers.size();

        // Put the correct answer to the list (2*n) times.
        for (int i=0; i<n; i++) {
            activeAnswers.add(correctAnswer);
        }

        // Now pick random answer from new array and hint it.
        Random rand = new Random(System.nanoTime());
        int index = rand.nextInt(activeAnswers.size());
        Answer randAnswer = activeAnswers.get(index);
        randAnswer.setHinted(true);

        return new Answer[]{randAnswer};
    }
}
