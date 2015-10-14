// Strýček Donald si pamatuje zadávaný vstup a neustále ho opakuje.
// Konec programu je zadáním prázdného řetězce.

package strycekdonald;

import java.util.ArrayList;
import java.util.Scanner;

public class StrycekDonald {

    public static void main(String[] args) {
        ArrayList<String> seznam = new ArrayList<String>();
        Scanner vstup = new Scanner(System.in);
        System.out.print("Vlož něco: ");
        String něco = vstup.nextLine();
        // opakuj dokud není zadán prázdný vstup
        while (! něco.isEmpty()) {
            seznam.add(něco);
            System.out.print("Zapamatováno: ");
            // vypíšeme celý seznam
            for (String s: seznam) {
                System.out.print(s+" ");
            }
            System.out.println();
            System.out.print("Vlož něco: ");
            něco = vstup.nextLine();
        }
    }    
}
