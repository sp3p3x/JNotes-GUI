import java.lang.Thread;
import java.awt.event.*;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;

public class JNotesGUI {

    JFrame mainFrame = new JFrame();

    JNotesGUI() {
        mainFrame.setSize(600, 600);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);

        mainUI();
    }

    void mainUI() {
        
        navigateButton("New Note", 230, 50, 150, 80, "input");
        
    }

    void inputUI() {

        navigateButton("main");

        JButton saveButton = new JButton("SAVE AS NEW");
        JTextArea input = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(input);

        input.setEditable(true);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        Font font = new Font("Comic Sans", Font.PLAIN, 18);
        input.setFont(font);
        input.setForeground(Color.BLACK);
        input.setLineWrap(true);
        input.setWrapStyleWord(true);

        saveButton.setBounds(230, 490, 150, 40);
        scrollPane.setBounds(20, 50, 560, 420);

        mainFrame.add(scrollPane);
        mainFrame.add(saveButton);
        mainFrame.add(scrollPane);

        validate();
    }

    void navigateButton(String text, int x, int y, int width, int height, String ui) {
        JButton navigateButton = new JButton(text);
        navigateButton.setBounds(x, y, width, height);
        mainFrame.add(navigateButton);
        navigateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
                if (ui == "main") {
                    mainUI();
                } else if (ui == "input") {
                    inputUI();
                }
            }
        });
    }

    void navigateButton(String ui) {
        String text = "back";
        int x = 20;
        int y = 10;
        int width = 70;
        int height = 30;
        JButton navigateButton = new JButton(text);
        navigateButton.setBounds(x, y, width, height);
        mainFrame.add(navigateButton);
        navigateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
                if (ui == "main") {
                    mainUI();
                } else if (ui == "input") {
                    inputUI();
                }
            }
        });
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

    void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            ;
        }
    }

    public static void main(String[] args) {
        new JNotesGUI();
    }
}