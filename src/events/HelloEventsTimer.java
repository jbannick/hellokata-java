import java.util.Timer;
import java.util.TimerTask;

public class HelloEventsTimer {
	public final static int ONE_SECOND = 1000;
	static int fCount = 0;
	public static void main(String...args) {
		System.out.println("Hello Events Timer!");
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.printf("Tick %s\n", fCount);
				fCount++;
				if (fCount > 5) {
					timer.cancel();
					System.out.println("I'm stopped");
				}
			}
		}, 0, ONE_SECOND);
	}
}
