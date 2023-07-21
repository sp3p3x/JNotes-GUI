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
        // mainFrame.getContentPane().removeAll();
        // mainFrame.revalidate();
        // mainFrame.repaint();
    }

    void inputUI() {

        JButton button = new JButton("SAVE AS NEW");
        JTextArea input = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(input);

        input.setEditable(true);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // scrollPane.setPreferredSize(new Dimension(250, 250));
        // input.setFont(new Font("Serif", Font.ITALIC, 16));
        input.setLineWrap(true);
        input.setWrapStyleWord(true);

        button.setBounds(230, 430, 150, 80);
        input.setBounds(20, 70, 560, 300);
        scrollPane.setBounds(20, 70, 560, 300);

        mainFrame.add(input);
        mainFrame.add(scrollPane);
        mainFrame.add(button);
    }

    public static void main(String[] args) {
        new JNotesGUI();
    }
}
