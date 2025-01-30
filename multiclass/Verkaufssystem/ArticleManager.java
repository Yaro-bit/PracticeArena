package Verkaufssystem;

import java.util.ArrayList;

public class ArticleManager {
    private static ArrayList<String> articles = new ArrayList<>();

    public static void input(String article) {
        articles.add(article);
    }

    public static void display() {
        if (articles.isEmpty()) {
            System.out.println("Es sind keine Artikel verfügbar.");
        } else {
            for (String article : articles) {
                System.out.println(article);
            }
        }
    }
}
