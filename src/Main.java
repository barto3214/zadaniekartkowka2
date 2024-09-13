import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static <list> void main(String[] args) {
        ArrayList<Integer> wylosowane = wylosujliczby(10);
        LinkedList<Integer> wpisane = czytajliczby(5);
        ArrayList<Integer> trafione = sprawdzktorepowt(wylosowane, wpisane);
        System.out.println("wylosowane");
        wypiszlistę(wylosowane);
        System.out.println("Liczby wpisane");
        wypiszlistę(wpisane);
        System.out.println("Liczby trafione");
        wypiszlistę(trafione);
    }

    /**
     * wylosuj liczby = metoda, która losuje liczby całkowite z zakresu 1-100
     * @param ile - lista wylosowanych wartości
     * @return lista z wylosowanymi wart
     */

    private static ArrayList <Integer> wylosujliczby (int ile){
        ArrayList <Integer> tablicaliczblosowych = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            tablicaliczblosowych.add((int) (Math.random() * 100 + 1));
        }
        //wypisywanie tablicy
        for (int elem : tablicaliczblosowych) {
            System.out.println(elem + " ");
        }
        return tablicaliczblosowych;
    }

    /**
     * czytaj liczby = funkcja wczytująca liczby z klawiatury
     *
     * @param ile - lista wpisanych wartości
     * @return listę wpisanych wart
     */
    private static LinkedList<Integer> czytajliczby (int ile){
        Scanner klawiatura = new Scanner(System.in);

        LinkedList<Integer> listaklawiatura = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj " + ile + " liczb");
            int wpisanaliczba = klawiatura.nextInt();
            listaklawiatura.add(wpisanaliczba);

        }
        return listaklawiatura;
    }
    private static void wypiszlistę(List<Integer>lista){
        for (Integer element :lista){
            System.out.println(element + ", ");
        }
    }
    private static ArrayList<Integer> sprawdzktorepowt(ArrayList<Integer> wpisane,LinkedList<Integer> wylosowane){
        ArrayList<Integer> trafione = new ArrayList<>();
        for (Integer element:trafione) {
            if(wpisane.contains(element)) {
                trafione.add(element);
            }
        }
        return trafione;
    }

}
