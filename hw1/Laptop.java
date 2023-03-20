package seminar6.hw1;

import java.util.*;

public class Laptop {
    private List<Brand> brands;
    private Integer ram;
    private Integer ssd;
    private String os;
    private String color;

    public Laptop() {
    }

    public Laptop(Integer ram, Integer ssd, String os, String color) {
        this.brands = new ArrayList<>();
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getSsd() {
        return ssd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public void addBrand(Brand brand) {
        brands.add(brand);
    }

    public Set<Laptop> newFilter(Set<Laptop> laptop) {
        Scanner sc = new Scanner(System.in);
        Set<Laptop> listL = new HashSet<>(laptop);
        System.out.println("Укажите номер(а) для фильтра: " +
                "\n1.Оперативная память" +
                "\n2.Жесткий диск" +
                "\n3.Операционная система" +
                "\n4.Цвет");
        String userNum = sc.nextLine();
        for (int i = 0; i < userNum.length(); i++) {
            if (1 == Character.getNumericValue(userNum.charAt(i))) {
                System.out.println("Укажите кол-во ram: 8 , 16");
                String ram = sc.nextLine();
                int n = Integer.parseInt(ram);
                for (Laptop a : laptop) {
                    if (n != a.ram) {
                        listL.remove(a);
                    }
                }
            }
            if (2 == Character.getNumericValue(userNum.charAt(i))) {
                System.out.println("Укажите размер ssd: 256 , 512");
                String ssd = sc.nextLine();
                int b = Integer.parseInt(ssd);
                for (Laptop a : laptop) {
                    if (b != a.ssd) {
                        listL.remove(a);
                    }
                }
            }
            if (3 == Character.getNumericValue(userNum.charAt(i))) {
                System.out.println("Укажите  операционную систему: Windows , macOs, Linux");
                String c = sc.nextLine().toLowerCase();
                for (Laptop a : laptop) {
                    if ((c.equals(a.os.toLowerCase())) == false) {
                        listL.remove(a);
                    }
                }
            }
            if (4 == Character.getNumericValue(userNum.charAt(i))) {
                System.out.println("Укажите  операционную систему: black , white");
                String d = sc.nextLine().toLowerCase();
                for (Laptop a : laptop) {
                    if ((d.equals(a.color.toLowerCase())) == false) {
                        listL.remove(a);
                    }
                }
            }
        }
        return listL;
    }
    @Override
    public String toString(){
        return "\n Laptop - " + brands + "\n ram - " +
                ram + "\n ssd - " +
                ssd + "\n os - " +
                os + "\n color - " +
                color + "\n ";
    }
}
