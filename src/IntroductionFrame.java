import javax.swing.*;
import java.awt.*;

public class IntroductionFrame {
    JFrame iF;
    ContinueButtons exit;

    public IntroductionFrame() {
        Introduction intro = new Introduction(350, 200);

        exit = new ContinueButtons(1, 1);

        iF = new JFrame();
        iF.setSize(500, 350);
        iF.setLocationRelativeTo(null);
        iF.setLayout(new BorderLayout());
        iF.add(intro.getIntroduction(), BorderLayout.NORTH);
        iF.add(exit.getContinueButton(), BorderLayout.CENTER);

        iF.setVisible(true);

    }

    public JFrame getIntroductionFrame() {
        return iF;
    }
}
