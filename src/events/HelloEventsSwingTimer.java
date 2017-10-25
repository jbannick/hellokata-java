import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class HelloEventsSwingTimer {
	public final static int ONE_SECOND = 1000;
	static int fCount = 0;
	static Timer fTimer = null;
	public static void main(String...args) {
		System.out.println("Hello Events Swing Timer!");
		
		fTimer = new Timer(ONE_SECOND, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.printf("Tick %s\n", fCount);
				fCount++;
				if (fCount > 5) {
					fTimer.stop();
					System.out.println("I'm stopped");
				}
			}

		});
		
		fTimer.start();
	}
}
