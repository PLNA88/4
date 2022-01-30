public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI,
        b) zadeklarować 2 metody,
        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI,
        d) zadeklarować 3 metody,
        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI,
        f) zadeklarować 3 metody,
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI,
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI,
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować:
        --Code/Prawy myszy-->Generate-->getters/setters/toString),
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola,
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola,
        c) wypisać metody toString() wszystkich objektów,
        */

        /* zad.4* - Dla chętnych (bez dodatkowych punktów),
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5* - Dla chętnych (bez dodatkowych punktów),
        a) stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę,
        b) dokończyć implementację metod z interfejsów,
        c) stworzyć pola w metodzie main() i wywołać metody
        */

        Student student1 = new Student("Barney", "Stinson", 23, "Zarządzania", "Biznes", 887766);
        student1.toString();
        Student student2 = new Student("Marshall", "Eriksen", 28, "Administracji", "Prawo", 995533);
        student2.toString();

        Pracownik pracownik1 = new Pracownik("Ted","Modby", 29, "Wykładowca", "Nauczania", 4);
        pracownik1.toString();
        Pracownik pracownik2 = new Pracownik("Lily","Aldrin", 27, "Przedszkolanka", "Nauczania", 3);
        pracownik2.toString();

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(pracownik1);
        System.out.println(pracownik2);
    }
}