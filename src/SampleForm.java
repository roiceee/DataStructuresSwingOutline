import javax.swing.*;
import java.util.ArrayList;

public class SampleForm {
    private JPanel mainForm;
    private JPanel actionsContainer;
    private JLabel actionLabel;
    private JLabel outputLabel;
    private JButton addButton;
    private JButton deleteButton;
    private JButton getButton;
    private JTextArea output;
    private JButton containsButton;
    private JButton sizeButton;
    private JLabel title;
    private JPanel actionDiv;
    private JPanel outputDiv;
    private JPanel titleDiv;

    //add data structure here
    //ArrayList<String> list = new ArrayList<>();


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

    public String getInput(String message) {
        return JOptionPane.showInputDialog(message);
    }

    public void showOutput(Object object) {
        output.setText(object.toString());
    }

}
