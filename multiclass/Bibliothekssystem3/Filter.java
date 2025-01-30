package Bibliothekssystem3;

public class Filter {

	// Filter books by category
	public static void filterBooksByCategory(String category) {
		for (int i = 0; i < Data.books.length; i++) {
			Book currentBook = Data.books[i];
			if (currentBook.category.equals(category)) {
				System.out.println(currentBook);
			}
		}
	}

	// Filter books by availability
	public static void filterBooksByAvailability(boolean isAvailable) {
		for (int i = 0; i < Data.books.length; i++) {
			Book currentBook = Data.books[i];
			if (currentBook.isAvailable == isAvailable) {
				System.out.println(currentBook);
			}
		}
	}

	// Filter members by name
	public static void filterMembersByName(String name) {
		for (int i = 0; i < Data.members.length; i++) {
			Member currentMember = Data.members[i];
			if (currentMember.name.equals(name)) {
				System.out.println(currentMember);
			}
		}
	}

	// Filter loans by member name
	public static void filterLoansByMember(String memberName) {
		for (int i = 0; i < Data.loans.length; i++) {
			Loan currentLoan = Data.loans[i];
			if (currentLoan.memberName.equals(memberName)) {
				System.out.println(currentLoan);
			}
		}
	}

}
//3. Funktionen zum Filtern
//Implementiere folgende Filtermethoden:
//    filterBooksByCategory(String category): Zeigt alle Bücher einer bestimmten Kategorie.
//    filterBooksByAvailability(): Zeigt alle verfügbaren Bücher.
//    filterMembersByName(String name): Zeigt Mitglieder mit einem bestimmten Namen.
//    filterLoansByMember(String memberName): Zeigt alle Leihvorgänge eines bestimmten Mitglieds.
