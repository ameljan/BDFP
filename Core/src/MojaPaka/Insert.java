package MojaPaka;

import java.util.Scanner;

public class Insert {

    private static String p = "";

    public static String getP() {
        return p;
    }

//    public Insert() {
//        Insert.insert(p);
//    }
//
//    public static String insert(String pipi) { // czy robic prametrowe metody czy nie???
//        p = pipi;
//        System.out.println("Type your PESEL number:");
//        Scanner read = new Scanner(System.in);
//        p = read.nextLine();
//        return p;
//    }

    public Insert() {
        Insert.insert();
    }

    /**
     * metoda prosi o podanie numeru PESEL
     * i wczytuje podany ciag znakow
     */
    public static void insert() { // czy da sie zrobic NIE-static??? i czy to ma sens?
        p = "";
        System.out.println("Type your PESEL number:");
        Scanner read = new Scanner(System.in);
        p = read.nextLine();
    }

}

