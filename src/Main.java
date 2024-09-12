import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static <list> void main(String[] args) {

        System.out.println("Hello world!");
        //tablica- musi mieć rozmiar zdefiniowany jak w c++
        int[] tablicaliczblosowych = new int[6];
        for (int i = 0; i < tablicaliczblosowych.length; i++) {
            tablicaliczblosowych[i] = (int) (Math.random() * 100 + 1);
        }
        //wypisywanie tablicy
        for (int elem : tablicaliczblosowych) {
            System.out.println(elem + " ");
        }
        //wypełnianie kolekcji wartościami losowymi
        //kolekcja = przechowuje tylko typy złożone, nie musi mieć zdefiniowanego rozmiaru
        //interface
        //list -> ArrayList,LinkedList
        //set ->HashSet
        //map ->
        List<Integer> Listaliczblosowych = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int) (Math.random() * 100 + 1);
            Listaliczblosowych.add(liczba);
        }
        System.out.println("Wylosowana lista: ");
        for (Integer element : Listaliczblosowych) {
            System.out.println(element + " ");
        }
        System.out.println(Listaliczblosowych);
        //losowanie bez powt
        List<Integer> listalosowychbezpowt = new ArrayList<>();
        int liczba;

        for (int i = 0; i < 6; i++) {
            liczba = (int) (Math.random() * 100 + 1);
            while (listalosowychbezpowt.contains(liczba)) {
                liczba = (int) (Math.random() * 100 + 1);     //zrobić to!!!
            }
            System.out.println(liczba);
        }
        /*
         * lista - indeksowana, uporządkowana, elementy nieunikatowe
         * zbiór - nieideksowany(zazwyczaj), nieuporządkowana(zazwyczaj), elementy unikatowe
         * */

        // zbiór - też zawsze typu złożonego
        HashSet<Integer> zbior = new HashSet<>();
        while (zbior.size() < 6) {
            liczba = (int) (Math.random() * 100 + 1);
            zbior.add(liczba);
        }
        System.out.println("Zbiór: ");
        System.out.println(zbior);
        //lista liczb wczytywanych z klawiatury

        Scanner klawiatura = new Scanner(System.in);
        /*
        List<Integer> listaklawiatura = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Wpisz liczbę z klawiatury");
            int wpisanaliczba = klawiatura.nextInt();
            listaklawiatura.add(wpisanaliczba);

        }
            */
        //lista liczb wczytywanych z klawiatury i losowanych
        int liczba2 = 0;
        int trafione =0;
        List<Integer> Listaliczblosowych2 = new ArrayList<>();
        List<Integer> listaklawiatura2 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            liczba2 = (int) (Math.random() * 6 + 1);
            Listaliczblosowych2.add(liczba2);
            System.out.println("Wpisz liczbę z klawiatury");
            int wpisanaliczba = klawiatura.nextInt();
            listaklawiatura2.add(wpisanaliczba);
            if(Listaliczblosowych.contains(liczba2)){
                trafione += 1;
            }
        }



        System.out.println("Wylosowana lista: ");
        System.out.println(Listaliczblosowych2);
        System.out.println("Wpisana lista: ");
        System.out.println(listaklawiatura2);
        System.out.println("Trafiłeś: ");
        System.out.println(trafione);

    }
}