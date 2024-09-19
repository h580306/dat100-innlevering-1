package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {

		int a = 90;
		int b = 80;
		int c = 60;
		int d = 50;
		int e = 40;
		int f = 0;

		for (int i = 1; i <= 10; i++) {

			int poeng = parseInt(showInputDialog("Skriv inn poengsum: "));

			if (poeng >= a && poeng <= 100) {		

				System.out.println("Karakter A");

			} else if (poeng >= b && poeng <a) {

				System.out.println("Karakter B");

			} else if (poeng >= c && poeng <= b) {

				System.out.println("Karakter C");

			} else if (poeng >= d && poeng <= c) {

				System.out.println("Karakter D");

			} else if (poeng >= e && poeng <= d) {

				System.out.println("Karakter E");

			} else if (poeng >= f && poeng <= e) {

				System.out.println("Karakter F");

			} else {
				
				showMessageDialog(null, "Ugyldig poengsum");
				poeng = parseInt(showInputDialog("Skriv inn poengsum på nytt:"));
			
			}
		}
	}

}
