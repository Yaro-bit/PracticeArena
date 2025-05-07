package reader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;



public class FileTransformer {//path: C:\Users\yvo\Desktop\numbers.csv

	public static void main(String[] args) {

		List<String> str = extractYourFiles2String(); //extract files
		
		List<Double> num = new ArrayList<>();
		num = string2Double(str, num); //create list for doubles, turn string to number
		//System.out.println("List of doubles: " + num);
		
		int[][] array = List2DoubleArray2d(num);//Create 2d Array and round with int
		//System.out.println("2d Array: " + Arrays.deepToString(array));

		
		//how to hell i should turn that to pdf - i do not even know wtf is itext
	    try {
            // Step 1: Create a Document instance
            Document document = new Document();
            // Step 2: Create PdfWriter to write to file
        
            PdfWriter.getInstance(document, new FileOutputStream("C:/Users/yvo/Desktop/numbers.pdf"));
            // Step 3: Open the document
            document.open();

            // Step 4: Add content
            document.add(new Paragraph("Your numbers rounded: "+Arrays.deepToString(array)));
            document.add(new Paragraph("\n \n"));

            
            PdfPTable table = new PdfPTable(array[0].length);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    table.addCell(""+array[i][j]);
                }
            }
            document.add(table);
            
            // Step 5: Close the document
            document.close();

            System.out.println("PDF created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

		
	}

	private static int[][] List2DoubleArray2d(List<Double> num) {	//fullfill 2d array from list of int
		int size = num.size();
		int rows = 4;
		int cols = 4;
		int[][] array = new int[rows][cols];

		for (int i = 0; i < size; i++) {
			double valueForLoop = Math.round(num.get(i));
			int row = i / cols;
			int col = i % cols;
			array[row][col] = (int) valueForLoop;
		}
		return array;
	}

	private static List<Double> string2Double(List<String> str, List<Double> num) {// extract nums from string (delete
																					// all trash)
		for (String i : str) {
			i = removeBOM(i);// Trim leading and trailing whitespace, including BOM characters
			i = i.trim();
			i = i.replace(',', '.');
			i = i.replace(';', ' ');
			for (String val : i.split("\\s+")) {
				try {
					num.add(Double.parseDouble(val));
				} catch (NumberFormatException e) {
					System.out.println("Skipping invalid value: " + val);
				}
			}
		}
		return num;
	}

	private static String removeBOM(String str) { // delete hidden chars
		// Check if the string starts with the BOM character (UTF-8 BOM is 0xEF, 0xBB,
		// 0xBF)
		if (str.startsWith("\uFEFF")) {
			return str.substring(1);
		}
		return str;
	}

	private static List<String> extractYourFiles2String() { // extract files from defined path a saves string to List
		System.out.print("Enter your path: ");

		Scanner scan = new Scanner(System.in);
		String path = scan.nextLine();
		Path filePath = Paths.get(path);

		List<String> lines = null;

		try {
			lines = Files.readAllLines(filePath);
		} catch (IOException e) {
			System.out.println("Error while importing string - wrong implementation ?");
		}
		return lines;

	}
}
