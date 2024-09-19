package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {
		
		double trinn_0 = 0.0;
		double trinn_1 = 0.017;
		double trinn_2 = 0.040;
		double trinn_3 = 0.136;
		double trinn_4 = 0.166;
		double trinn_5 = 0.176;
		
		int inn = parseInt(showInputDialog("Inntekt: "));
		
		if (inn <= 208050) {
			
			double skatt = inn * trinn_0;
			
			System.out.println("Du skal betale " + skatt + "kroner i trinnskatt");
			
		} else if (inn <= 292850) {
			
			double skatt = inn * trinn_1;
			
			System.out.println("Du skal betale " + skatt + "kroner i trinnskatt");
			
		} else if (inn <= 670000) {
			
			double skatt = inn * trinn_2;
			
			System.out.println("Du skal betale " + skatt + "kroner i trinnskatt");
			
		} else if (inn <= 937900) {
			
			double skatt = inn * trinn_3;
			
			System.out.println("Du skal betale " + skatt + "kroner i trinnskatt");
			
		} else if (inn <= 1350000) {
			
			double skatt = inn * trinn_4;
			
			System.out.println("Du skal betale " + skatt + "kroner i trinnskatt");
			
		} else {
			
			double skatt = inn * trinn_5;
			
			System.out.println("Du skal betale " + skatt + "kroner i trinnskatt");
			
			
		}

	}

}
