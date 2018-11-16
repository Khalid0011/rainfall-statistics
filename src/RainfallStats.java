import java.util.ArrayList;
import java.util.List;

public class RainfallStats {
	public List<String> values = new ArrayList<>();

	RainfallStats() {

	}

	public int getCount() {
		// TODO Auto-generated method stub
		return values.size();
	}

	public double getMean() throws IllegalStateException {

		if (values.size() == 0) {
			throw new IllegalStateException();
		}
		double total = 0;
		for (String values : values) {
			total = total + Double.parseDouble(values);
		}
		return total / getCount();

	}

	public double getMax() throws IllegalStateException {
		// TODO Auto-generated method stub
		double maxvalue = 0;
		if (values.size() == 0) {
			throw new IllegalStateException();
		} else {

			for (String values : values) {
				if (Double.parseDouble(values) > maxvalue) {
					maxvalue = Double.parseDouble(values);
				}
			}
		}
		return maxvalue;

	}

	public void addMeasurement(double value) throws InvalidRainfallException {
		// TODO Auto-generated method stub
		if (value < 0) {
			String message = "Measurement must not be Negative was," + value;
			throw new InvalidRainfallException(message);
		}

		else {
			values.add(Double.toString(value));
		}

	}

}
