public class PowersOfTwo {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		int i = 0;
		int powersOfTwo = 1;
		while (i <= n) {
			System.out.println(i + " " + powersOfTwo);
			powersOfTwo = 2 * powersOfTwo;
			i++;
		}
	}
}