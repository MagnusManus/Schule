import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame {
    public JFrame frame;
    public String user1;
    public String user2;
    public JButton loginButton;

    // Frame für die Spielerauswahl, das ein bestehendes gameFrame übergeben bekommt
    public LoginFrame(GameFrame gameFrame) {
        frame = new JFrame();
        frame.setLayout(new GridBagLayout());
        frame.setTitle("Spielerauswahl");
        frame.setSize(900, 750);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // GridBagConstraints für die Anordnung der Elemente im Grid
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 1, 10); // Abstand um jedes Element herum

        // Beispiel-Label hinzufügen
        JLabel label1 = new JLabel("Spieler 1: ");
        gbc.gridx = 0; // Spalte 0
        gbc.gridy = 0; // Zeile 0
        gbc.anchor = GridBagConstraints.WEST; // linksbündig
        frame.add(label1, gbc);

        // Textfeld für Spieler 1
        JTextField textField1 = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        frame.add(textField1, gbc);

        JLabel label2 = new JLabel("Spieler 2: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        frame.add(label2, gbc);

        // Textfeld für Spieler 2
        JTextField textField2 = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        frame.add(textField2, gbc);

        // Start-Button hinzufügen
        JButton loginButton = new JButton("Spiel starten");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(loginButton, gbc);

        frame.setVisible(true);

        // ActionListener für den Start-Button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user1 = textField1.getText(); // Speichern des Benutzernamens Spieler 1
                user2 = textField2.getText(); // Speichern des Benutzernamens Spieler 2

                frame.dispose(); // Schließt das aktuelle Fenster (Spielerauswahl)

                // Setzt das Hauptspiel-Fenster auf sichtbar
                gameFrame.setFrameVisible(true);
            }
        });
    }

    public String getUser1() {
        return user1;
    }

    public String getUser2() {
        return user2;
    }
}
