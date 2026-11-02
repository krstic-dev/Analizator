# Analizator i memorija brojeva (Java Console App)

Konzolni Java program koji omogućava unos proizvoljnog broja elemenata, dinamički alocira cjelobrojni niz u memoriji, prati statistiku (pozitivni, negativni, nule, suma) te na kraju filtrira i ispisuje samo parne brojeve.

---

## 📌 Funkcionalnosti programa

1. **Dinamička alokacija memorije:** Korisnik unosi željenu količinu brojeva $N$, na temelju čega se instancira niz odgovarajuće veličine (`int[] brojevi = new int[n]`).
2. **Obrada u realnom vremenu:** Tijekom samog unosa kroz `for` petlju program:
   - Dodaje unešeni broj u akumulator `suma`.
   - Kategorizira brojeve kroz `if - else if - else` strukturu (pozitivni, negativni, nule).
   - Sprema unesenu vrijednost na odgovarajući indeks u nizu.
3. **Prikaz stanja memorije:** Cjelokupan niz spremljenih brojeva ispisuje se odjednom putem biblioteke `java.util.Arrays.toString()`.
4. **Naknadna analiza podataka:** Program prolazi kroz spremljeni niz dodatnom petljom i pomoću modulo operatora (`brojevi[i] % 2 == 0`) izdvaja i ispisuje isključivo parne brojeve.

---

## 🛠️ Korišteni koncepti i sintaksa

* **Konzolni unos:** `java.util.Scanner` (`nextInt()`)
* **Strukture podataka:** Dinamički jednodimenzionalni niz (`int[]`), svojstvo `.length`
* **Pomoćne klase:** `java.util.Arrays` za formatirani ispis niza
* **Petlje:** `for` petlje za unos, spremanje i naknadno filtriranje elemenata
* **Operatori:** Aritmetički akumulator (`suma += broj` / `suma = suma + broj`), relacijski operatori i modulo (`%`)

---

## 💻 Primjer izlaza na konzoli

```text
Koliko brojeva zelite da proverite?
5
Unesite 1. broj: 
10
Unesite 2. broj: 
-3
Unesite 3. broj: 
0
Unesite 4. broj: 
7
Unesite 5. broj: 
4
Broj pozitivnih je: 2
Broj negativnih je: 1
Broj nula je: 1
Ukupna suma je: 18
========================================
Memorija unosa: [10, -3, 0, 7, 4]
Parni brojevi iz memorije: 10 0 4
