/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_mdmj;

/**
 *
 * @author SBC4
 */
   import java.util.Scanner;
public class Kalkulator_mdmj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     		int berat, tinggi;
		Scanner input = new Scanner(System.in);

		System.out.println("Berapa Berat Badan-mu");
		berat = input.nextInt();

		System.out.println("Berapa Tinggi Badan-mu");
		tinggi = input.nextInt();

		if (berat < 50 || tinggi < 160) {
			System.out.println("Maaf, anda tidak bisa masuk");
		}
		else {
			System.out.println("Selamat, anda bisa masuk!");
		}

	}

}
