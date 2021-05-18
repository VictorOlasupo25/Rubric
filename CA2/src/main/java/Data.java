
import java.util.ArrayList;

public class Data {

	private ArrayList<Integer> values;

	public Data(ArrayList<Integer> values) {
		this.values = values;
	}

	public int getCount() { //Get count  of prewritten values
		return values.size();
	}

    public int getSum() {
		int sum = 0;
		for (Integer value : values) {
			sum += value;
		}
		return sum;
	}

    public double getAverage() {
		return getSum() / getCount();
	}

    public int getMin() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) < min) {
				min = values.get(i);
			}
		}
		return min;
	}

    public int getMax() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < values.size(); i++) {
				if (values.get(i) > max) {
					max = values.get(i);
				}
		}
		return max;
	}

    public double getStandardDeviation() {

		double mean = getMean();
		double temp = 0;
		for (int i = 0; i < values.size(); i++) {
				temp += Math.pow(values.get(i) - mean, 2);
		}

		return Math.sqrt(temp / getCount());
	}

	private double getMean() {
		return getAverage();
	}

}

