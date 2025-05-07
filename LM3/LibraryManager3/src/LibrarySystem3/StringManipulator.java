package LibrarySystem3;

public class StringManipulator {

    static String toUpperCaseTitle(String title) {
        String titleUpperCase = title.toUpperCase(); // Split the sentence into individual words
        return titleUpperCase;
    }
    
    static String toUpperCaseName(String name) {
        
        char nameAsCharArray[] = name.toCharArray();
        for (int i = 0; i < nameAsCharArray.length; i++)
            if (nameAsCharArray[i] == ' ') {
                nameAsCharArray[i + 1] = Character.toUpperCase(nameAsCharArray[i + 1]);
                if (Character.isLetter(nameAsCharArray[0])) {
                    nameAsCharArray[0] = Character.toUpperCase(nameAsCharArray[0]);
                }
            }
        return String.valueOf(nameAsCharArray);
    }
}
//4. String Manipulation
//Implement the following methods:
//    Convert the titles of all books to uppercase and output them.
//    Format the names of members so that only the first letter is uppercase (e.g. "anna" → "Anna").
