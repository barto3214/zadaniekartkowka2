import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <list> void main(String[] args) {

        System.out.println("Hello world!");
        //tablica- musi mieć rozmiar zdefiniowany jak w c++
        int [] tablicaliczblosowych= new int [6];
        for(int i = 0;i< tablicaliczblosowych.length;i++){
            tablicaliczblosowych[i]= (int) (Math.random() * 100 + 1);
        }
        //wypisywanie tablicy
        for(int elem : tablicaliczblosowych){
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
            int liczba = (int) (Math.random() * 100 +1);
            Listaliczblosowych.add(liczba);
        }
        System.out.println("Wylosowana lista: ");
        for (Integer element : Listaliczblosowych) {
            System.out.println(element + " ");
        }
        System.out.println(Listaliczblosowych);
        //losowanie bez powt
        List <Integer> listalosowychbezpowt = new ArrayList<>();
        int liczba;
        for (int i = 0; i < 6; i++) {
            liczba = (int) (Math.random() * 100 + 1);
            while (listalosowychbezpowt.contains(liczba)){
                liczba = (int) (Math.random() * 100 + 1);     //zrobić to!!!
            }
            System.out.println(liczba);
        }
    }
}