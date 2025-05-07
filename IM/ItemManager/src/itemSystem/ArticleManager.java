package itemSystem;

import java.util.ArrayList;

public class ArticleManager {
    private static ArrayList<String> articles = new ArrayList<>();

    public static void input(String item) {
        articles.add(item);
    }

    public static void display() {
        if (articles.isEmpty()) {
            System.out.println("No items available.");
        } else {
            for (String item : articles) {
                System.out.println(item);
            }
        }
    }
}
