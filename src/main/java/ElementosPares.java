

import java.util.Scanner;

public class ElementosPares {
    private int[]vetor;
    private int x;

    public ElementosPares(int[] vetor, int x) {
        this.vetor = vetor;
        this.x = x;
    }
    
   public int calculaPares(){
    int count = 0;
         for (int i=0; i<vetor.length; i++){
             for (int j=0; j<vetor.length; j++){
                 if (vetor[i] - vetor[j] == x){
                    count++;
                 }
             }
         }
         return count;
   }
    

}
