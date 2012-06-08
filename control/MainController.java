package control;

import component.MainFrame;

/**
 *
 * @author Felix
 */
public class MainController {

    private MainFrame view;
    private QuestionController questionController;

    private MainController() {
        questionController = new QuestionController(this);
    }

    public MainFrame getView() {
        return view;
    }

    public void setView(MainFrame view) {
        this.view = view;
    }

    public QuestionController getQuestionController() {
        return questionController;
    }

    public static MainController getInstance() {
        return MainControllerHolder.INSTANCE;
    }

    public void newGame() {
        questionController.loadQuestions();
    }

    private static class MainControllerHolder {

        private static final MainController INSTANCE = new MainController();
    }
}
