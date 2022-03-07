

import java.util.Arrays;

public class CalculaMediana {
    
     private int[] vetor;
     public CalculaMediana(int []vetor){
        this.vetor=vetor;
     }
         
    public int calculaMediana(){
        Arrays.sort(vetor);
        
        return vetor[(vetor.length/2)];
    }
    public void imprimeVetor(){
        for (int i : vetor) {
            System.out.print(i+ " ");
        }
    }
    
   
}
