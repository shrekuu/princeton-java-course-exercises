public class Ruler {

	public static void main(String[] args) {
		String ruler1 = " 1 ";
		String ruler2 = ruler1 + " 2 "  + ruler1;
		String ruler3 = ruler2 + " 3 "  + ruler2;
		String ruler4 = ruler3 + " 4 "  + ruler3;
		String ruler5 = ruler4 + " 5 "  + ruler4;

		System.out.print(ruler1);
		System.out.print(ruler2);
		System.out.print(ruler3);
		System.out.print(ruler4);
		System.out.print(ruler5);
	}
}