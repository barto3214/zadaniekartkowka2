import java.util.ArrayList;

public class Main {
    public static <list> void main(String[] args) {
        Gra gra1 = new Gra();
        gra1.zagrajmy();
        System.out.println(sitoeraztotenesa(200));

    }
    //do kartkowki
   static ArrayList<Integer> sitoeraztotenesa(int liczba){
        ArrayList<Boolean> logiczne = new ArrayList<>();
        logiczne.add(false);
        logiczne.add(false);
        for (int i = 2; i < liczba; i++) {
            logiczne.add(true);
        }
        //wykreślanie wielokrotności
        for (int i = 0; i < liczba; i++) {
            if(logiczne.get(i).equals(true)){
                for (int k = i*2; k < liczba; k += i) {
                    logiczne.set(k,false);
                }
            }
        }
        ArrayList<Integer> liczbypierwsze = new ArrayList<>();
        for (int i = 0; i < logiczne.size(); i++) {
            if(logiczne.get(i).equals(true)){
                liczbypierwsze.add(i);
            }
        }
        return liczbypierwsze;
    }
}

