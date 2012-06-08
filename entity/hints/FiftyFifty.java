package entity.hints;

import entity.Answer;
import entity.QuestionSet;
import java.util.Random;

/**
 *
 * @author Felix
 */
public class FiftyFifty implements IHintStrategy {

    /**
     * Applies 50-50 hint on a given set of questions.
     * As a result, two answers will be hinted - one of those
     * is correct and the other is randomly selected from
     * the incorrect ones.
     * @param questionSet
     * @return hinted answers
     */
    @Override
    public Answer[] applyHint(QuestionSet questionSet) {
        // Get the correct answer.
        Answer correctAnswer = questionSet.getCorrectAnswer();

        // Find random incorrect answer.
        Answer incorrectAnswer = null;
        Answer[] answers = questionSet.getAnswers();
        Random rand = new Random(System.nanoTime());
        while (true) {
            int i = rand.nextInt(answers.length);
            if (!answers[i].isCorrect()) {
                incorrectAnswer = answers[i];
                break;
            }
        }

        // Now mark those two answers hinted.
        correctAnswer.setHinted(true);
        incorrectAnswer.setHinted(true);

        // And the others removed.
        for (Answer answer : answers) {
            if (answer != correctAnswer && answer != incorrectAnswer) {
                answer.setRemoved(true);
            }
        }

        return new Answer[]{correctAnswer, incorrectAnswer};
    }

}
