import javax.swing.*;
import java.awt.*;

public class FirstFrame extends JFrame{
    public Dimension screenSize;

    public FirstFrame() {
        FirstFrameLabel firstFrameFirstLabel = new FirstFrameLabel();
        setTitle("TicTacToe");

        getContentPane().setBackground(Color.BLACK);
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height -30);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        add(firstFrameFirstLabel);

        setVisible(true);
    }
}
