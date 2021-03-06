package cw2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Produkty {

    private static final int ADD_PRODUCT = 0;
    private static final int EXIT = 1;
    private static final int DISCARD_PRODUCT = 0;
    private static final int REPLACE_PRODUCT = 1;

    private Set<Product> products = new HashSet<>();
    Scanner skan = new Scanner(System.in);

    void mainLoop(){
        int option;
        do{
            printOption();
            option = readOption();
            evaluateOption(option);
        }while (option !=EXIT);
    }

    private int readOption() {
        System.out.println("Wybierz opcje: ");
        int option = skan.nextInt();
        skan.nextLine();
        return option;
    }

    private void evaluateOption(int option) {
        if(option == ADD_PRODUCT){
            addNextProduct();
        }else if(option == EXIT){
            printProducts();
        }else
            System.out.println("Niepoprawny wybór!");
    }

    private void addNextProduct() {
        Product product = createNewProduct();
        if(products.contains(product)){
            askAndReplaceProduct(product);
        }else 
            addProduct(product);;
    }

    private void askAndReplaceProduct(Product product) {
        System.out.println("Znaleziono produkt o takiej nazwie, co chcesz zrobic: ?");
        System.out.println("Zignoruj produkt - " + DISCARD_PRODUCT);
        System.out.println("Nadpisz produkt - " + REPLACE_PRODUCT);
        int option = skan.nextInt();
        skan.nextLine();
        if(option == REPLACE_PRODUCT){
            products.remove(product);
            products.add(product);
        }else {
            System.out.println("W bazie pozostawiono poprzedni produkt");
        }
    }

    private void addProduct(Product product) {
        products.add(product);
        System.out.println("Produkt dodany do bazy");
    }

    private Product createNewProduct() {
        System.out.println("Podaj nazwe produktu");
        String name = skan.nextLine();
        System.out.println("Podaj cene produktu");
        double cena = skan.nextDouble();
        return new Product(name,cena);
    }

    private void printProducts() {
        System.out.println("Wszystkie produkty: ");
        for(Product produkty : products)
            System.out.println(produkty);
    }

    private void printOption() {
        System.out.println("Dostępne opcje: ");
        System.out.println("Dodaj nowy produkt: " + ADD_PRODUCT);
        System.out.println("Wyjdz z programu: " + EXIT);
    }
}
