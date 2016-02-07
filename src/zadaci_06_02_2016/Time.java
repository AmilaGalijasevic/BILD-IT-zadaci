package zadaci_06_02_2016;

import java.util.Date;

public class Time {

	long sec;
	long min;
	long hour;

	@SuppressWarnings("deprecation")
	public Time() {
		// gets the time
		Date date = new Date(System.currentTimeMillis());
		this.sec = date.getSeconds();
		this.min = date.getMinutes();
		this.hour = date.getHours();
	}

	public Time(long elapseTime) {
		setTime(elapseTime);
	}

	public Time(long sec, long min, long hour) {
		super();
		this.sec = sec;
		this.min = min;
		this.hour = hour;
	}

	// getters
	public long getSec() {
		return sec;
	}

	public long getMin() {
		return min;
	}

	public long getHour() {
		return hour;
	}

	// calculates time from millieseconds
	public String setTime(long elapseTime) {

		this.sec = elapseTime / 1000;
		this.min = sec / 60;
		this.sec = sec % 60;
		this.hour = min / 60;
		this.min = min % 60;
		this.hour = hour % 24;
		String s = hour + ":" + min + ":" + sec;
		return s;

	}

	@Override
	public String toString() {
		return "Time [" + hour + ":" + min + ":" + sec + "]";
	}

}
