
package arredondarnota;
import java.util.Scanner;

public class ArredondarNota {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("informe o nome do aluno");
        String aluno = input.nextLine();
        System.out.println("informe a primeira nota do " +aluno);
        double not1 = input.nextDouble();
      
         System.out.println("informe a segunda nota do " +aluno);
         double not2 = input.nextDouble();
          System.out.println("informe a terceira nota do " +aluno);
          double not3 = input.nextDouble();
          
          
         double media = ((not1+not2+ not3)/3);
         
         if (media >= 0.6){
            double MediaArredondada = Math.ceil(media);
            System.out.println( "a media do (a)  " +aluno+ " e " +MediaArredondada);
           
             
         }
         else {
             
              double MediaArredondada = Math.floor(media);
             System.out.println("a media do (a) " +aluno+ " e " +MediaArredondada);
         }
            
               System.out.println(+media);   
    }
    
}
