//package MojaPaka;
//
//import java.io.FileNotFoundException;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Scanner;
//
///**
// * Created by Krystian on 23.03.2017.
// */
//
//public class BirthdayDateFromPESEL {
//    public static String p = "";
//    private boolean doOrNot;
//    private long l;
//
//    public static void main(String[] args) throws FileNotFoundException {
//        boolean repeat = false;
//        String yesOrNot;
//        do {
////proba uzycia obiektu klasy Insert zeby czyscic klase main, ale nie wiem jak w innych klasach uzyc pola p z klasy Insert
////            Insert insertObject = new Insert();
////            insertObject.insert();
////            System.out.println(insertObject.p);
//
//            BirthdayDateFromPESEL pesel = new BirthdayDateFromPESEL();
//
//            pesel.insert();
//            pesel.checkInserted();
//            pesel.getDate();
//
//            System.out.println("If you want to check another PESEL press Y");
//            Scanner read = new Scanner(System.in);
//            yesOrNot = read.nextLine();
//            repeat = (yesOrNot.equals("Y") || yesOrNot.equals("y")); //było:  repeat = (yesOrNot.equals("Y") || yesOrNot.equals("y")?true:false);  mozna tez przy pomocy IF-a
//        }
//        while (repeat); //było: while (repeat == true);
//    }
//
//    private void insert() {
//        System.out.println("Write your PESEL number:");
//        Scanner read = new Scanner(System.in);
//        p = read.nextLine();
//    }
//
//    public boolean isNumber() {
//        try {
//            l = Long.parseLong(p);
//        } catch (NumberFormatException e) {
//            return false;
//        }
//        return true;
//    }
//
////    public boolean validate() {
////        int checkSum;
////        int checkSumLength;
////        int a = Integer.parseInt(p.substring(0, 1));
////        int b = Integer.parseInt(p.substring(1, 2));
////        int c = Integer.parseInt(p.substring(2, 3));
////        int d = Integer.parseInt(p.substring(3, 4));
////        int e = Integer.parseInt(p.substring(4, 5));
////        int f = Integer.parseInt(p.substring(5, 6));
////        int g = Integer.parseInt(p.substring(6, 7));
////        int h = Integer.parseInt(p.substring(7, 8));
////        int i = Integer.parseInt(p.substring(8, 9));
////        int j = Integer.parseInt(p.substring(9, 10));
////
////        checkSum = 9 * a + 7 * b + 3 * c + 1 * d + 9 * e + 7 * f + 3 * g + 1 * h + 9 * i + 7 * j;
////
////        checkSumLength = Integer.toString(checkSum).length(); //zamieniam sume kontrolna na string aby miec dlugosc stringu
////        if (p.substring(10, 11).equals(Integer.toString(checkSum).substring(checkSumLength - 1, checkSumLength))) { // if last sign in p equals to last sign checksum
////            return true;
////        } else {
////            return false;
////        }
////    }
//
//    public void checkInserted() {
//        System.out.println("\n" + "Inserted PESEL number is: ---> " + p + " <---");
//        if (0 == p.length()) {
//            System.out.println("You didn't insert anything!");
//        } else if (isNumber()) {
//            if (l < 0) {
//                System.out.println("You inserted negative number!");
//            } else {
//                if (p.length() > 0 && p.length() != 11) {// chyba mozna bez pierw. warunku
//                    System.out.println("You inserted incorrect number." + "\n" + "Length of every pesel number must contains 11 digits!" + "\n" + "Inserted number is " + p.length() + " digit(s) long.");
//                }
//                //System.out.println("MA 11 CYFR");
//                else if (Validate.validate()) {
//                    doOrNot = true;
//                } else {
//                    System.out.println("Invalid data inserted - check sum is incorrect!");
//                }
//            }
//        } else {
//            System.out.println("Just numbers allowed, not other signs!");
//        }
//    }
//
//    private void getDate() {
//
//        if (doOrNot) {
//            String day = p.substring(4, 6);
//            String month = p.substring(2, 4);
//            String year = p.substring(0, 2);
//
//            int m = Integer.valueOf(month);
//            int y = Integer.valueOf(year);
//            int d = Integer.valueOf(day);
//
//            if (m > 12 && m < 33) {
//                y = 2000 + y;
//                m = m - 20;
//            } else if (m > 32 && m < 53) {
//                y = 2100 + y;
//                m = m - 40;
//            } else if (m > 52 && m < 73) {
//                y = 2200 + y;
//                m = m - 60;
//            } else if (m > 72 && m < 93) {
//                y = 1800 + y;
//                m = m - 80;
//            } else {
//                y = 1900 + y;
//            }
//
//            year = Integer.toString(y);
//            month = Integer.toString(m);
///* validation: set birth date exists or not*/
//            DateFormat format = new SimpleDateFormat("yyyy.MM.dd");
//            try {
//                format.parse(year + "." + month + "." + day); //=> Ok, rolls to "Wed Mar 03 00:00:00 PST 2010".
//                format.setLenient(false);
//                format.parse(year + "." + month + "." + day); //=> Throws ParseException "Unparseable date".
//                System.out.println(String.format("\n" + "Your date of birth is: %04d.%02d.%02d\n\n", y, m, d));
//
//            } catch (ParseException e) {
//                System.out.println("Incorrect numbers describing date of birth!\n" + "Pay attention to digit 5 and 6!");
//            }
//        }
//    }
//}
//
//
////public class BirthdayDateFromPESEL {
////    private String p = "";
////    private boolean doOrNot;
////    private long l;
////
////    public static void main(String[] args) throws FileNotFoundException {
////
////
////        BirthdayDateFromPESEL pesel = new BirthdayDateFromPESEL();
////        pesel.insert();
////        pesel.checkInserted();
////        pesel.getDate();
////
////    }
////
////    private void insert() {
////        System.out.println("Write your PESEL number:");
////        Scanner read = new Scanner(System.in);
////        p = read.nextLine();
////    }
////
////    public boolean isNumber() {
////        try {
////            l = Long.parseLong(p);
////        } catch (NumberFormatException e) {
////            return false;
////        }
////        return true;
////    }
////
////    public void checkInserted() {
////        System.out.println("\n" + "Inserted PESEL number is: ---> " + p + " <---");
////        if (0 == p.length()) {
////            System.out.println("You didn't insert anything!");
////        }
////        else if (isNumber()) {
////            if (l < 0) {
////                System.out.println("You inserted negative number!");}
////
////            else {
////                if(p.length() > 0 && p.length() != 11) {// chyba mozna bez pierw. warunku
////                    System.out.println("You inserted incorrect number." + "\n" + "Length of every pesel number must contains 11 digits!" + "\n" + "Inserted number is " + p.length() + " digit(s) long.");
////                } else {
////                    //System.out.println("MA 11 CYFR");
////                    doOrNot = true;
////                }
////            }
////
////        } else {
////            System.out.println("Just numbers allowed, not other signs!");
////        }
////    }
////
////    private void getDate() {
////
////        if (doOrNot) {
////            String day = p.substring(4, 6);
////            String month = p.substring(2, 4);
////            String year = p.substring(0, 2);
////
////            int m = Integer.valueOf(month);
////            int y = Integer.valueOf(year);
////            int d = Integer.valueOf(day);
////
////            if (m > 12 && m < 33) {
////                y = 2000 + y;
////                m = m - 20;
//////                year = Integer.toString(y);
//////                month = Integer.toString(m);
////            } else if (m > 32 && m < 53) {
////                y = 2100 + y;
////                m = m - 40;
////            } else if (m > 52 && m < 73) {
////                y = 2200 + y;
////                m = m - 60;
////            } else if (m > 72 && m < 93) {
////                y = 1900 + y;
////                m = m - 80;
////            } else {
////                y = 1900 + y;
////            }
////
////            year = Integer.toString(y);
////            month = Integer.toString(m);
////// sprawdzam czy podana w peselu data urodzin wystepuje naprawde
////            DateFormat format = new SimpleDateFormat("yyyy.MM.dd");
////            try {
////                format.parse(year + "." + month + "." + day); //=> Ok, rolls to "Wed Mar 03 00:00:00 PST 2010".
////                format.setLenient(false);
////                format.parse(year + "." + month + "." + day); //=> Throws ParseException "Unparseable date".
////                System.out.println(String.format("\n" + "Your date of birth is: %04d.%02d.%02d", y, m, d));
////
////            } catch (ParseException e) {
////                System.out.println("Incorrect numbers describing date of birth!\n" + "Pay attention to digit 5 and 6!");
////            }
////        }
////    }
////}
//
///* ostatni dzialajacy kod
//
//import java.io.FileNotFoundException;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Scanner;
//
//public class BirthdayDateFromPESEL {
//    private String p = "";
//    private boolean doOrNot;
//
//    public static void main(String[] args) throws FileNotFoundException {
//        BirthdayDateFromPESEL pesel = new BirthdayDateFromPESEL();
//        pesel.insert();
//        pesel.checkInserted();
//        pesel.getDate();
//
////        DateFormat format = new SimpleDateFormat("yyyy.MM.dd");
////        format.parse("2010.02.31"); //=> Ok, rolls to "Wed Mar 03 00:00:00 PST 2010".
////        format.setLenient(false);
////        format.parse("2010.02.31"); //=> Throws ParseException "Unparseable date".
//    }
//
//    private void insert() {
//        System.out.println("Write your PESEL number:");
//        Scanner read = new Scanner(System.in);
//        p = read.nextLine();
//    }
//
//    public boolean isNumber() {
//        try {
//            Long.parseLong(p);
//        } catch (NumberFormatException e) {
//            return false;
//        }
//        return true;
//    }
//
//    public void checkInserted() {
//        System.out.println("\n" + "Inserted PESEL number is: ---> " + p + " <---");
//        if (0 == p.length()) {
//            System.out.println("You didn't insert anything!");
//        } else if (isNumber()) {
//            if (p.length() > 0 && p.length() != 11) {// chyba mozna bez pierw. warunku
//                System.out.println("You inserted incorrect number." + "\n" + "Length of every pesel number must contains 11 digits!" + "\n" + "Inserted number is " + p.length() + " digit(s) long.");
//            } else {
//                //System.out.println("MA 11 CYFR");
//                doOrNot = true;
//            }
//        } else {
//            System.out.println("Just numbers allowed, not other signs!");
//        }
//    }
//
//    private void getDate() {
//        if (doOrNot) {
//            String day = p.substring(4, 6);
//            String month = p.substring(2, 4);
//            String year = p.substring(0, 2);
//
//            int m = Integer.valueOf(month);
//            int y = Integer.valueOf(year);
//            int d = Integer.valueOf(day);
//
//            if (m > 12 && m < 33) {
//                y = 2000 + y;
//                m = m - 20;
//            } else if (m > 32 && m < 53) {
//                y = 2100 + y;
//                m = m - 40;
//            } else if (m > 52 && m < 73) {
//                y = 2200 + y;
//                m = m - 60;
//            } else if (m > 72 && m < 93) {
//                y = 1900 + y;
//                m = m - 80;
//            } else {
//                y = 1900 + y;
//            }
//            System.out.println(String.format("\n" + "Your date of birth is: %04d.%02d.%02d", y, m, d));
//        }
//    }
//}
//*/
//
//
//
///*
//public class BirthdayDateFromPESEL {
//    private String p = "";
//
//    public static void main(String[] args) throws FileNotFoundException {
//        BirthdayDateFromPESEL pesel = new BirthdayDateFromPESEL();
//        pesel.insert();
//        pesel.checkInserted();
//        pesel.getDate();
//    }
//
//    private void insert() {
//        System.out.println("Write your PESEL number:");
//        Scanner read = new Scanner(System.in);
//        p = read.nextLine();
//    }
//
//    private void getDate() {
//        int x = p.length();
////        System.out.println("x = " + x);
//        if (11 == x) {
//            try {
//                String day = p.substring(4, 6);
////                System.out.println("Test: day " + day);
//
//                String month = p.substring(2, 4);
////                System.out.println("Test month " + month);
//
//                String year = p.substring(0, 2);
////                System.out.println("Test year " + year);
//
//                int m = Integer.valueOf(month);
//                int y = Integer.valueOf(year);
//                int d = Integer.valueOf(day);
//
//                if (m > 12) {
//                    y = 2000 + y;
////                    System.out.println("Test y + 2000: " + y);
//                    m = m - 20;
////                    System.out.println("Test m z odjetym 20: " + m);
//                } else {
//                    y = 1900 + y;
////                    System.out.println("Test y + 1900: " + y);
////                    System.out.println("Test m dla M<12: " + m);
//                }
//                System.out.println(String.format("\n" + "Your date of birth is: %d.%d.%d", y, m, d));
//            } catch (NumberFormatException e) {
//                System.out.println("You didn't catch me!");
//            }
//        }
//    }
//
//    public void checkInserted() {
//        int x = p.length();
////        System.out.println("x = " + x);
//        if (0 == x) {
//            System.out.println("You didn't insert any number :)");
//        } else if (x > 0) {
//            try {
//                long isDigit = Long.valueOf(p);
////                System.out.println("Value of isDigit is:" + isDigit);
//            } catch (NumberFormatException e) {
//                System.out.println("Please use ONLY numbers :)");
//            }
//
//            if (x > 0 && x != 11) {
//                System.out.println("You inserted incorrect number." + "\n" + "Length of every pesel number must contains 11 digits!" + "\n" + "Inserted number is " + x + " digits long. Look below:");
//            }
//        }
//        System.out.println("\n" + "Inserted PESEL number is: ---> " + p + " <---");
//    }
//}
//*/
//
////-----------------------------------------------------------------
////
////        for (int j = 0, j = x, j++){
//
////        }
////    }
////}
////  ((null!=s) && Character.isDigit(s.charAt(0)))
////        lub
////        Character.isDigit((s?s:"X").charAt(0))
//
//
////    int getMonth() {
////        String month = p.substring(2, 4);
////        System.out.println("Test: month " + month);
////        int m = Integer.valueOf(month);
//////        if (mo > 12) {
//////            int m = mo - 20;
//////            System.out.println("Test m z odjetym 20:" + m);
//////        }
//////        else {
//////        System.out.println("Test m bez odejm 20:" + mo);
////      while (m > 12) {
////            m = m - 20;
////            System.out.println("Test m z odjetym 20:" + m);
////        }
////        return m;
////    }
////
////
//
////    int getYear() {   // robie razem year i month bo nie wiem jak skorzystac z "m" z jednej metody w drugiej
////        String year = p.substring(0, 2);
////        System.out.println("Test: year " + year);
////        if (m > 12) {
////            int y = 2000 + Integer.valueOf(year);
////            System.out.println("Test y:" + y);
////        } else {
////            int y = 1900 + Integer.valueOf(year);
////            System.out.println("Test y:" + y);
////        }
////        return y;
////    }
