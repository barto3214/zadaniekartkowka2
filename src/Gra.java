import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gra {
    private ArrayList<Integer> wylosowane;
    private LinkedList<Integer> wpisane;
    private ArrayList<Integer> trafione;

    private void wylosujliczby (int ile){
        wylosowane = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            wylosowane.add((int) (Math.random() * 100 + 1));
        }
        //wypisywanie tablicy
        for (int elem : wylosowane) {
            System.out.println(elem + " ");
        }

    }

    /**
     * czytaj liczby = funkcja wczytująca liczby z klawiatury
     * @param ile - lista wpisanych wartości
     * @return listę wpisanych wart
     */
    private void czytajliczby (int ile){
        Scanner klawiatura = new Scanner(System.in);

        wpisane = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj " + ile + " liczb");
            int wpisanaliczba = klawiatura.nextInt();
            wpisane.add(wpisanaliczba);

        }

    }
    private void wypiszlistę(List<Integer> lista){
        for (Integer element :lista){
            System.out.println(element + ", ");
        }
    }
    private void sprawdzktorepowt(){
        trafione = new ArrayList<>();
        for (Integer element:trafione) {
            if(wpisane.contains(element)) {
                trafione.add(element);
            }
        }
    }
    private void zagrajmy(){
        wylosujliczby(20);
        czytajliczby(5);
        sprawdzktorepowt();
        System.out.println("Trafione: ");
        wypiszlistę(trafione);
        System.out.println("Wpisane: ");
        wypiszlistę(wpisane);
        System.out.println("Wylosowane: ");
        wypiszlistę(wylosowane);
    }
}
