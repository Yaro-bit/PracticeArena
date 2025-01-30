package Bibliothekssystem2;

public class Main {

	public static void main(String[] args) {
		Book book[] = {new Book("Java für orsch","daniel varga","ISBN123824",true),
				new Book("Java für orsch 2","daniel varga","ISBN123824",true),
				new Book("deppad schaun","yaroslav woll","ISBN123824",true),
		};
		Contact contact[] = {new Contact("Adolf Hitler","+432312312321","arschloch@mail.orsch", null)
		};

		for(int i = 0; i<book.length;i++) {
			System.out.println(book[i]);
		}
		
	}

}
//name = "unbekannt";
//telno = "unbekannt";
//email = "unbekannt";
//adress = "unbekannt";