import javax.swing.*;

public class SimpleForm {
    private JPanel MainFrame;
    private JLabel FirstLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleForm");
        frame.setContentPane(new SimpleForm().MainFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
