/*
 * ============================================================================
 * ZADATAK: ANALIZATOR POZITIVNIH I NEGATIVNIH BROJEVA
 * ============================================================================
 * 
 * 1. Pomoću Scanner-a zatražiti od korisnika unos broja elemenata:
 *    "Koliko brojeva zelite da unesete: " -> učitati u int varijablu n
 * 
 * 2. Prije petlje pripremiti i inicijalizirati brojače i sumu:
 *    - int brPozitivnih = 0;
 *    - int brNegativnih = 0;
 *    - int brNula = 0;
 *    - int suma = 0;
 * 
 * 3. Napraviti for petlju koja se izvršava tačno n puta (od 0 do n):
 *    - U svakom krugu zatražiti unos trenutnog broja
 *    - Dodati uneseni broj na ukupnu sumu
 *    - Pomoću if - else if - else strukture provjeriti vrijednost:
 *        * ako je broj > 0  -> uvećati brPozitivnih
 *        * ako je broj < 0  -> uvećati brNegativnih
 *        * u suprotnom (== 0) -> uvećati brNula
 * 
 * 4. Nakon završetka petlje ispisati rezultate:
 *    - Broj pozitivnih brojeva
 *    - Broj negativnih brojeva
 *    - Broj nula
 *    - Ukupnu sumu svih unesenih brojeva
 * ============================================================================
 */
package zadatak;

import java.util.Arrays;
import java.util.Scanner;

class Zadatak {

    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);
        int brojPoz = 0;
        int brojNeg = 0;
        int brNula = 0;
        int suma = 0;
        int broj;

        System.out.println("Koliko brojeva zelite da proverite?");
        int n = unos.nextInt();
        int[] brojevi = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite " + (i + 1) + (". broj: "));
            broj = unos.nextInt();
            brojevi[i] = broj;
            suma = suma + broj;

            if (broj < 0) {
                brojNeg++;

            } else if (broj > 0) {
                brojPoz++;

            } else {
                brNula++;
            }

        }

        System.out.println("Broj pozitivnih je: " + brojPoz);
        System.out.println("Broj negativnih je: " + brojNeg);
        System.out.println("Broj nula je: " + brNula);
        System.out.println("Ukupna suma je: " + suma);
        System.out.println("===============================================");
        System.out.println("Memorija unosa: " + Arrays.toString(brojevi));
        System.out.print("Parni brojevi iz memorije: ");
        for (int i = 0; i < brojevi.length; i++) {
            if (brojevi[i] % 2 == 0) {
                System.out.print(brojevi[i] + " ");
            }
        }
        System.out.println();
    }
}
