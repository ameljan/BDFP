// jawnosc zmiennych get/set
// konstrukcja czy sensowna
// Boze, jakie to prostacki program. Robic metody parametrowe czy nie? patrz Insert()

 package MojaPaka;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Testowa {
    public static void main(String[] args) throws FileNotFoundException {
        boolean repeat;
        String yesOrNot;

        do {
            Insert insert = new Insert();
            CheckInserted checkInserted = new CheckInserted();
            GetDate getDate = new GetDate();  // czemu nie moge wywolac GetDate.getDate(); ???

            Scanner read = new Scanner(System.in);
            System.out.println("\n If you want to try once more press 'Y' or 'y'");
            yesOrNot = read.nextLine();
            repeat = (yesOrNot.equals("Y") || yesOrNot.equals("y"));
        }
        while (repeat);
    }
}
