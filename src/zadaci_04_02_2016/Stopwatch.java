package zadaci_04_02_2016;

public class Stopwatch {
	private long startTime;
	private long endTime;

	public Stopwatch() {

		startTime = System.currentTimeMillis();
	}

	// getters and setters
	public double getStartTime() {

		return startTime = System.currentTimeMillis();
	}

	// sets start time using method for millieseconds
	public void setStartTime(long startTime) {
		setStartTime(System.currentTimeMillis());
		this.startTime = startTime;
	}

	public double getEndTime() {
		return endTime = System.currentTimeMillis();
	}

	public void setEndTime(long endTime) {
		setEndTime(System.currentTimeMillis());
		this.endTime = endTime;
	}

	// method start
	public void start(long startTime) {
		setStartTime(System.currentTimeMillis());
	}

	// method stop
	public void stop(long endTime) {
		setEndTime(System.currentTimeMillis());

	}

	// get elapsed time by subtracting end time and start time
	public long getElapsedTime() {
		long elapsedTime = endTime - startTime;
		return elapsedTime;
	}
}
