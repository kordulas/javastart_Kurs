package cw2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

class WordsRemover {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj wyraz nr " + (i + 1));
            words.add(scanner.nextLine());
        }

        System.out.println("Podaj tekst do odfiltrowania:");
        String filterWord = scanner.nextLine();
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.toLowerCase(Locale.ROOT).contains(filterWord.toLowerCase(Locale.ROOT)))
                iterator.remove();
    }
        System.out.println(words);
    }
}