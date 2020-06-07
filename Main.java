import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Gil-PC\\Downloads\\wpbc.data";
		Adaline adaline = new Adaline();
		double bias = Math.random();
		double rate = 0.001;
		adaline.getNeuron().set_Inputs_Desire(path);
		adaline.getNeuron().normalize();
		long startTime = System.nanoTime();
		adaline.train(100000, 0.6666667, bias, rate);
		long stopTime = System.nanoTime();
		adaline.test();
		adaline.test_training();
		//System.out.println("\n" + "nanoTime: " + (stopTime - startTime));
		System.out.println("\n" + "time in seconds:  " + (double)(stopTime - startTime) / 1000000000);
	}
}
