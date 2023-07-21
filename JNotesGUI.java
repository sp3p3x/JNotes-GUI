import javafx.scene.text.Font;
import java.lang.Thread;
import java.awt.event.*;
import javax.swing.*;

public class JNotesGUI {

    JFrame mainFrame = new JFrame();

    JNotesGUI() {
        mainFrame.setSize(600, 600);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);

        inputUI();
        // try {
        // Thread.sleep(3000);
        // } catch (InterruptedException e) {
        // ;
        // }
    }

    void mainUI() {
        JButton saveButton = new JButton("mainui");
        saveButton.setBounds(230, 430, 150, 80);
        mainFrame.add(saveButton);

    }

    void inputUI() {

        backButton("null", 0, 0, 100, 100);

        JButton saveButton = new JButton("SAVE AS NEW");
        JTextArea input = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(input);

        input.setEditable(true);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // scrollPane.setPreferredSize(new Dimension(250, 250));
        // input.setFont(new Font("Serif", Font.ITALIC, 16));
        input.setLineWrap(true);
        input.setWrapStyleWord(true);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
                mainUI();
            }
        });

        saveButton.setBounds(230, 430, 150, 80);
        input.setBounds(20, 70, 560, 300);
        scrollPane.setBounds(20, 70, 560, 300);

        mainFrame.add(saveButton);
        mainFrame.add(input);
        mainFrame.add(scrollPane);

        validate();
    }

    void backButton(String text, int x, int y, int width, int height) {
        JButton backButton = new JButton(text);
        backButton.setBounds(x, y, width, height);
        mainFrame.add(backButton);
    }

    // resets the current ui by removing all elements and revalidating the window
    void reset() {
        mainFrame.getContentPane().removeAll();
        validate();
    }

    // to make sure all the added elements are being rendered
    void validate() {
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    public static void main(String[] args) {
        new JNotesGUI();
    }
}
