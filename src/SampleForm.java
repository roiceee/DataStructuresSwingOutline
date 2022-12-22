import javax.swing.*;
import java.awt.*;

public class SampleForm {
    private JPanel mainForm;
    private JPanel actionsContainer;
    private JLabel actionLabel;
    private JLabel outputLabel;
    private JButton addButton;
    private JButton deleteButton;
    private JButton action3Button;
    private JTextArea output;
    private JButton action4Button;
    private JButton action5Button;
    private JLabel title;
    private JPanel actionDiv;
    private JPanel outputDiv;
    private JPanel titleDiv;

    public SampleForm() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Data Structure Visualizer");
        frame.setContentPane(new SampleForm().mainForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setIconImage(new ImageIcon("src/logo.png").getImage());
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

}
