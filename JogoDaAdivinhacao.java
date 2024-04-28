import java.util.Scanner;
import java.util.Random;   
public class JogoDaAdivinhacao
{
    public static void main (String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        Random random= new Random();
        int respostaUsuario=0;
        int A=0;
        A=random.nextInt(100);
        do
        {
        
            System.out.println("Adivinhe o numero");
             try 
            {
                respostaUsuario = scanner.nextInt();
           
                if(respostaUsuario > A)
                {
                    System.out.println("O número que eu pensei é menor que o seu");
                }
                else if(respostaUsuario<A)
                {
                    System.out.println("O número que eu pensei é maior que o seu");
                } 
            }
            catch(java.util.InputMismatchException e) 
            {
                System.out.println("Digite um número!");
                scanner.nextLine();
            }
            
    
        }
         while(respostaUsuario !=A);
        System.out.println("Acertou!");
    }
}
    