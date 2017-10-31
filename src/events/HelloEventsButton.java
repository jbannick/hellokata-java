import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class HelloEventsButton extends JFrame {
    boolean fHaveBeenPushed = false;

    public HelloEventsButton() {
        final JButton button = new JButton("Hello. Push me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (fHaveBeenPushed) {
                    System.out.println("Goodbye");
                    System.exit(0);
                }
                fHaveBeenPushed = true;
                button.setText("Push me again");
            }
        });
        getContentPane().add(button);
        pack();
        setVisible(true);
    }

    public static void main(String... args) {
        System.out.println("Hello Events Button!");
        new HelloEventsButton();
    }
}
