import java.util.Arrays;
import java.util.List;
public class Equals {

		public static void main(String[] args) {
			List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

			System.out.println(names.contains("Bob")); // Output: true
			System.out.println(names.contains("David")); // Output: false

		}

	}
