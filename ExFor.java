package estruturaCondicional;

public class ExFor {

	public static void main(String[] args) {
		String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";

		for(String name : names) {
			System.out.print(name + ", ");
		}
	}

}
