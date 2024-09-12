public class Main {
    public static void main(String[] args) {

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


    }
}