import java.io.*;

public class RainfallProgram {
	public static void main(String[] args) throws IOException {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

		RainfallStats stats = new RainfallStats();
		System.out.println("Enter rainfall measurements (in mm), or \"end\" to stop.");

		while (true) {
			System.out.print("> ");
			String line = keyboard.readLine();
			if ("end".equals(line)) {
				break;
			}
			try {
				stats.addMeasurement(Double.parseDouble(line));
			} catch (NumberFormatException e) {
				System.out.println("Cannot be parsed");
			} catch (InvalidRainfallException e) {
				System.out.println("Measurement must not be Negative");
			}

		}
		System.out.println(stats.getCount() + " measurement(s) entered.");
		try {
			System.out.println("Mean rainfall: " + stats.getMean() + " mm");
			System.out.println("Maximum rainfall: " + stats.getMax() + " mm");
		} catch (IllegalStateException e) {
		}
	}
}
