package reader;

import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class t {
	public static void main(String[] a) throws Exception {
		System.out.println(Files.readAllLines(Paths.get(new Scanner(System.in).nextLine())).stream().flatMap(l -> Arrays
				.stream(l.replace("\uFEFF", "").trim().replace(',', '.').replace(';', ' ').split("\\s+")).map(x -> {
					try {
						return Double.parseDouble(x);
					} catch (Exception e) {
						return null;
					}
				})).filter(Objects::nonNull).toList());
	}
}
