public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
            - String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
            - void liczbaOkien(int value); // użycie jak setter
            - void liczbaMieszkancow(int value); // użycie jak setter
            - void kolorDomu(KolorEnum kolor); // użycie jak setter
            - double wyliczCene(double powierzchnia, double cena);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie (nie deklarujemy tej metody w interfejsie),
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól,
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom,
        d) sprawdzić czy idzie wywołać z obu instancji objektu (deklaracja z interfejsu i z klasy)
        metodę której nie ma zadeklarowane w interfejsie Budynek, ale jest dopisana w klassie Dom,
        */


        Dom dom1 = new Dom(95, 25, 10, "Warszawa", "Konstruktorska", "12", "4", "02-673", 15, 3,KolorEnum.beżowy, 8000, 3, 1 );
        dom1.toString();
        System.out.println(dom1);

        Budynek dom2 = new Dom(150, 30, 10, "Warszawa", "Wołoska", "14", "2", "02-675", 23, 2, KolorEnum.biały, 9000, 2, 5);
        dom2.toString();
        System.out.println(dom2);

    }
}
