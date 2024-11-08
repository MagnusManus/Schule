import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame {
    public JFrame frame;

    // Frame für das Hauptspiel
    public GameFrame(String title, int width, int height) {
        frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setVisible(false);

    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrameVisible(boolean visible) {
        frame.setVisible(visible);
    }
}
