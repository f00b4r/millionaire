package component;

import control.MainController;
import control.QuestionController;
import entity.Amounts;
import entity.QuestionSet;
import java.util.Hashtable;
import javax.swing.JLabel;

/**
 *
 * @author Felix
 */
public class MainFrame extends javax.swing.JFrame {

    private QuestionController controller = MainController.getInstance().getQuestionController();
    private MainController context = MainController.getInstance();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        initMyComponents();
    }

    private void initMyComponents() {
        Hashtable<Integer, JLabel> awards = new Hashtable<>();
        for (Amounts a : Amounts.values()) {
            awards.put(new Integer(a.getValue()), new JLabel(String.valueOf(a.getValue())));
        }
        awardsSlider.setLabelTable(awards);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        awardsPanel = new javax.swing.JPanel();
        awardsSlider = new javax.swing.JSlider();
        mainPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        question = new javax.swing.JTextPane();
        answerA = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        answerB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        answerC = new javax.swing.JLabel();
        answerD = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        answerDbutton = new javax.swing.JButton();
        answerCbutton = new javax.swing.JButton();
        answerBbutton = new javax.swing.JButton();
        answerAbutton = new javax.swing.JButton();
        statusPanel = new javax.swing.JPanel();
        status = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        playMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        awardsPanel.setBackground(new java.awt.Color(153, 180, 209));
        awardsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        awardsSlider.setMaximum(1000);
        awardsSlider.setMinorTickSpacing(50);
        awardsSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        awardsSlider.setPaintLabels(true);
        awardsSlider.setPaintTicks(true);
        awardsSlider.setSnapToTicks(true);
        awardsSlider.setValue(0);

        javax.swing.GroupLayout awardsPanelLayout = new javax.swing.GroupLayout(awardsPanel);
        awardsPanel.setLayout(awardsPanelLayout);
        awardsPanelLayout.setHorizontalGroup(
            awardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(awardsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(awardsSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        awardsPanelLayout.setVerticalGroup(
            awardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(awardsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(awardsSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setText("Otazka");

        question.setEditable(false);
        question.setMaximumSize(new java.awt.Dimension(800, 600));
        question.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setViewportView(question);

        jLabel2.setText("A)");

        jLabel3.setText("B)");

        jLabel4.setText("C)");

        jLabel5.setText("D)");

        jLabel12.setText("Napovedy");

        jButton1.setText("50 na 50");

        jButton2.setText("50 na 50");

        jButton3.setText("50 na 50");

        answerDbutton.setText("D");
        answerDbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        answerDbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerDbuttonActionPerformed(evt);
            }
        });

        answerCbutton.setText("C");
        answerCbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        answerCbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerCbuttonActionPerformed(evt);
            }
        });

        answerBbutton.setText("B");
        answerBbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        answerBbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerBbuttonActionPerformed(evt);
            }
        });

        answerAbutton.setText("A");
        answerAbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        answerAbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerAbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 331, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(answerD, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(answerC, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(answerB, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(answerA, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(answerAbutton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(answerBbutton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(answerCbutton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(answerDbutton, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)))
                                .addGap(0, 114, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(answerA)
                    .addComponent(answerAbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(answerBbutton)
                    .addComponent(answerB)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(answerCbutton)
                    .addComponent(answerC)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(answerDbutton)
                    .addComponent(answerD)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        status.setText("Status");

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(status)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jMenu3.setText("Soubor");

        playMenu.setText("Nova hra");
        playMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playMenuActionPerformed(evt);
            }
        });
        jMenu3.add(playMenu);

        exitMenu.setText("Skoncit");
        jMenu3.add(exitMenu);

        menu.add(jMenu3);

        jMenu4.setText("Otazkovnik");

        jMenuItem3.setText("Spravovat otazky");
        jMenu4.add(jMenuItem3);

        menu.add(jMenu4);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(awardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(awardsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }//GEN-END:initComponents

    private void answerAbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerAbuttonActionPerformed
        controller.pick(QuestionController.Answers.A);
    }//GEN-LAST:event_answerAbuttonActionPerformed

    private void answerBbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerBbuttonActionPerformed
        controller.pick(QuestionController.Answers.B);
    }//GEN-LAST:event_answerBbuttonActionPerformed

    private void answerCbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerCbuttonActionPerformed
        controller.pick(QuestionController.Answers.C);
    }//GEN-LAST:event_answerCbuttonActionPerformed

    private void answerDbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerDbuttonActionPerformed
        controller.pick(QuestionController.Answers.D);
    }//GEN-LAST:event_answerDbuttonActionPerformed

    private void playMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playMenuActionPerformed
        context.play();
    }//GEN-LAST:event_playMenuActionPerformed

    public void play() {
        QuestionSet set = controller.getSet(1000);
        question.setText(set.getQuestion().getMessage());
        answerA.setText(set.getAnswerA().getMessage());
        answerB.setText(set.getAnswerB().getMessage());
        answerC.setText(set.getAnswerC().getMessage());
        answerD.setText(set.getAnswerD().getMessage());

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerA;
    private javax.swing.JButton answerAbutton;
    private javax.swing.JLabel answerB;
    private javax.swing.JButton answerBbutton;
    private javax.swing.JLabel answerC;
    private javax.swing.JButton answerCbutton;
    private javax.swing.JLabel answerD;
    private javax.swing.JButton answerDbutton;
    private javax.swing.JPanel awardsPanel;
    private javax.swing.JSlider awardsSlider;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem playMenu;
    private javax.swing.JTextPane question;
    private javax.swing.JLabel status;
    private javax.swing.JPanel statusPanel;
    // End of variables declaration//GEN-END:variables
}
