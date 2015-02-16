package millionar;

import component.MainFrame;
import control.MainController;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Felix
 */
public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.bootstrap();
    }

    private void bootstrap() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                MainFrame view = new MainFrame();
                view.setVisible(true);
                MainController.getInstance().setView(view);
            }
        });
    }
}
