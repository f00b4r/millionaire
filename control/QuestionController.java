package control;

import entity.QuestionSet;
import java.util.ArrayList;

/**
 *
 * @author Felix
 */
public class QuestionController {

    private MainController context;
    private ArrayList<QuestionSet> questions;
    
    public QuestionController(MainController context) {
        this.context = context;
    }

    public void loadQuestions() {
        // @todo: nacitani otazek z JAXB
    }
    
    public QuestionSet getSet(int price) {
        // @todo: vratit spravny nahodny set podle ceny
        return null;
    }
    
    public void pick() {
        
    }

}
