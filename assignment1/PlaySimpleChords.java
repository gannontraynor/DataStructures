package assignment1;
import stdlib.*;
public class PlaySimpleChords {

	public static void main(String[] args) {
		algs31.BinarySearchST<String, Double> frequencies = new algs31.BinarySearchST<String, Double>();
		StdIn.fromFile("data/notes_frequencies.txt");
		while (StdIn.hasNextLine()) {
			String line = StdIn.readLine();
			String[] fields = line.split("\\s+");
			String name = fields[0];
			double value = Double.parseDouble(fields[1]);
			frequencies.put(name, value);
		}
		StdIn.fromFile("data/sample_simple_chords.txt");
		while (StdIn.hasNextLine()) {
			String line = StdIn.readLine();
			String[] fields = line.split("\\s+");
			double freq1= frequencies.get(fields[0]);
			double freq2 = frequencies.get(fields[1]);
			double time = Double.parseDouble(fields[2]);
			playChord(time, freq1, freq2);
		}
	}
	
	public static void playChord(double duration, double... frequencies) {
		final int sliceCount = (int) (StdAudio.SAMPLE_RATE * duration);
		final double[] slices = new double[sliceCount+1];
		for (int i = 0; i <= sliceCount; i++) {
			for (double frequency: frequencies) {
				slices[i] += Math.sin(2 * Math.PI * i * frequency / StdAudio.SAMPLE_RATE);
			}
			slices[i] /= frequencies.length;
		}
		StdAudio.play(slices);
	}

}
