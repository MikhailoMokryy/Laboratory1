package lab_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class DataInput {

	public static Long getLong() throws IOException {
		String s = getString();
		Long value = Long.valueOf(s);
		return value;
	}

	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	public static Integer getInt() {
		while (true) {
			String s = "";
			try {
				s = getString();
				Integer value = Integer.valueOf(s);
				return value;
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("Please , enter int!");
			}
		}
	}

	public static Double getDouble() {
		while (true) {
			String s = "";
			try {
				s = getString();
				Double value = Double.valueOf(s);
				return value;
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("Please , enter double!");
			}
		}
	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s;
		try {
			s = br.readLine();
			return s;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Something goes wrong!";
	}

	public static String getName() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s;
		try {
			s = br.readLine();
			return s;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Something goes wrong!";
	}

	public static boolean compareStrings(String first, String second) {
		String copy;
		boolean result = true;
		if (first.length() < second.length()) {
			copy = first;
			first = second;
			second = copy;
		}
		for (int i = 0; i < second.length(); i++) {
			if (second.charAt(i) != first.charAt(i)) {
				result = false;
				break;
			}
		}
		return result;
	}

}