package seminar6.hw1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop(16,256,"Windows","black");
        Brand b1 = new Brand("Asus","USA");
        l1.addBrand(b1);
        Laptop l2 = new Laptop(16,512,"Windows","black");
        Brand b2 = new Brand("Lenovo","USA");
        l2.addBrand(b2);
        Laptop l3 = new Laptop(8,256,"Linux","white");
        Brand b3 = new Brand("Lenovo","Russia");
        l3.addBrand(b3);
        Laptop l4 = new Laptop(16,512,"macOs","black");
        Brand b4 = new Brand("M1","USA");
        l4.addBrand(b4);
        Laptop l5 = new Laptop(8,512,"Windows","white");
        Brand b5 = new Brand("Acer","Russia");
        l5.addBrand(b5);
        Laptop l6 = new Laptop(8,512,"Linux","black");
        Brand b6 = new Brand("Asus","USA");
        l6.addBrand(b6);
        Laptop l7 = new Laptop(16,512,"macOs","white");
        Brand b7 = new Brand("M2","Russia");
        l7.addBrand(b7);
        Laptop l8 = new Laptop(8,256,"macOs","white");
        Brand b8 = new Brand("M1","USA");
        l8.addBrand(b8);
        Set<Laptop> laptop = new HashSet<>();
        laptop.add(l1);
        laptop.add(l2);
        laptop.add(l3);
        laptop.add(l4);
        laptop.add(l5);
        laptop.add(l6);
        laptop.add(l7);
        laptop.add(l8);
        Laptop FilterLaptop = new Laptop();
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}
