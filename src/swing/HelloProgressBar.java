import javax.swing.*;
import java.awt.*;

public class HelloProgressBar extends JFrame {
    public HelloProgressBar() {
        super("HelloProgressBar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton goBtn = new JButton("Go");
        goBtn.setPreferredSize(new Dimension(200, 23));
        goBtn.addActionListener(e -> {
            go();
        });

        getContentPane().add(goBtn, BorderLayout.CENTER);

        pack();
    }

    private void go() {
        PBarDbox pb = new PBarDbox(this);
        pb.setLocationRelativeTo(this);

        OurWorker ow = new OurWorker(pb);

        try {
            ow.execute();
            pb.setVisible(true);
            Object value = ow.get();
            System.out.println(String.format("Got %s", value.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String... args) {
        System.out.println("Hello Progress Bar!");

        HelloProgressBar hpb = new HelloProgressBar();
        hpb.setVisible(true);
    }

    class PBarDbox extends JDialog {
        private JProgressBar pbar;

        PBarDbox(JFrame parent) {
            super(parent, "Progress", true);

            pbar = new JProgressBar(0, 100);

            getContentPane().add(pbar, BorderLayout.CENTER);

            pack();
        }

        void setProgress(final int value) {
            pbar.setValue(value);
        }
    }

    class OurWorker extends SwingWorker {

        PBarDbox pbdb;

        OurWorker(PBarDbox pbdb) {
            super();
            this.pbdb = pbdb;
        }

        @Override
        protected Object doInBackground() throws Exception {
            System.out.println("Executing in background");

            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);

                int j = (i + 1) * 10;
                System.out.println(j);

                Runnable r = () -> {
                    pbdb.setProgress(j);
                };

                SwingUtilities.invokeLater(r);
            }
            return "Our Value";
        }

        @Override
        protected void done () {
            pbdb.setVisible(false);
            System.out.println("Done");
        }
    }
}
