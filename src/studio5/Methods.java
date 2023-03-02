package studio5;

import edu.princeton.cs.introcs.StdDraw;

public class Methods {

	/**
	 * Compute the (Euclidean) distance between two points.
	 *
	 * @param x1 x-coordinate of a point
	 * @param y1 y-coordinate of a point
	 * @param x2 x-coordinate of another point
	 * @param y2 y-coordinate of another point
	 * @return the Euclidean distance between (x1,y1) and (x2,y2)
	 */
	public static double distanceBetween(double x1, double y1, double x2, double y2) {
		double distance = 0;
		distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return distance;
	}

	/**
	 * Draw a bull's eye at the given location with the given radius.
	 *
	 * @param x      the x coordinate of the center of the bull's eye
	 * @param y      the y coordinate of the center of the bull's eye
	 * @param radius the radius of the bull's eye
	 */
	public static void drawBullsEye(double x, double y, double radius) {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x, y, radius);

		// TODO: Draw the remaining rings of the bull's eye
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledCircle(x, y, (0.75)*radius);
		// Blue ring with 3.0/4.0 the radius
		// suggested rgb values: 0, 109, 219

		

		// Red ring with 1.0/2.0 the radius
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(x, y, (0.5)*radius);
		// suggested rgb values: 146, 0, 0

		

		// Yellow ring with 1.0/4.0 the radius
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(x, y, (0.25)*radius);
		// suggested rgb values: 255, 255, 109

		
	}

	/**
	 * Return a new String which is the original source String with all occurrences
	 * of the target character substituted by the replacement String.
	 * 
	 * @param source      the source String
	 * @param target      the target character to be replaced
	 * @param replacement the replacement String
	 * 
	 * @return the String which results from substituting all of the target
	 *         characters in the source String with the replacement String
	 */
	public static String substituteAll(String source, char target, String replacement) {
		String result = "";
		char[] array = source.toCharArray();
		for (int i = 0;i<source.length();i++) {
			if (array[i]==target) {
				result += replacement;
			}
			else {
				result += array[i];
			}
		}
		return result;
	}

	/**
	 * Compute the sum of elements in an array
	 * 
	 * @param values an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++)
		{
			sum += values[i];
		}
		
		return sum;
	}

	/**
	 * Return an array of a given size filled with the provided value
	 * 
	 * @param length the length of the returned array
	 * @param value  the value to fill the array with
	 * @return and array of size that's filled with value
	 */
	public static int[] filledArray(int length, int value) {
		int[] values = new int[length]; // FIXME: Create an array of the appropriate size
		for (int i=0;i<values.length;i++) {
			values[i]=value;
		}

		

		return values;
	}
/*
 * @param values the values to fill the array with
 * @return the mean of the sum of the array values
 */
	public static double arrayMean(int[] values) {
		return (double) arraySum(values)/(values.length);  
	}


	
}
