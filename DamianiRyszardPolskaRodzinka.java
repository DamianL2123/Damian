public public class DamianiRyszardPolskaRodzinka {
    
    public static void main(String[] args) {
        int n = 100;
        boolean[] liczbypierwsze = new boolean[n + 1];
        
        sito(liczbypierwsze );
        wyswietl(liczbypierwsze );
    }
    
    static void sito(boolean[] liczbypierwsze ) {
        int n = liczbypierwsze .length - 1;
        double sqrtN = Math.sqrt(n);
        
        
        for (int i = 0; i <= n; i++) {
            liczbypierwsze [i] = true;
        }
        
       
        for (int i = 2; i <= sqrtN; i++) {
            if (liczbypierwsze [i]) {
                for (int j = i * i; j <= n; j += i) {
                    liczbypierwsze [j] = false;
    }
    }
    }
    }
    static void wyswietl(boolean[] pierwsze) {
        System.out.println("Liczby pierwsze ");
        for (int i = 2; i < liczbypierwsze .length; i++) {
            if (liczbypierwsze [i]) {
                System.out.print(i + ",");
    }
    }
    }
} 
