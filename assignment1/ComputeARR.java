package assignment1;
import stdlib.*;
public class ComputeARR {

	public static void main(String[] args) {
		algs31.BinarySearchST<String, Double> ratings = new algs31.BinarySearchST<String, Double>();
		ratings.put("********", 4.0);
		ratings.put("*******", 3.5);
		ratings.put("******", 3.0);
		ratings.put("*****", 2.5);
		ratings.put("****", 2.0);
		ratings.put("***", 1.5);
		ratings.put("**", 1.0);
		ratings.put("*", 0.5);
		StdIn.fromFile("data/a1ratings.txt");
		String[] allRatings = StdIn.readAllStrings();
		double totalRating = 0.0;
		for (String rating: allRatings) {
			totalRating += ratings.get(rating);
		}
		StdOut.println("The average rating is " + totalRating / allRatings.length + ".");

	}
}


