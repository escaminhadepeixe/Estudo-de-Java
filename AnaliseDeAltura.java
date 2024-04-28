//O programa deve coletar o gênero e altura de dez pessoas, em seguida deve calcular a quantidade total de mulheres e a media da altura masculina

import java.util.Scanner;

public class AnaliseDeAltura
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        double[] altura= new double[10];
        String[] genero= new String[10];
        Double mediaAlturaHomens=0.0;
        int qtMulheres=0;
        for(int i=0; i<10; i++)
        {
            System.out.println("Digite a altura do individuo");
            try 
            {
                altura[i]= scanner.nextDouble();
                scanner.nextLine();
                do
                {
                    System.out.println("Digite o genero do individuo (masculino ou feminino)");
                    genero[i]= scanner.nextLine();
                    
                    if(!genero[i].equals("masculino") && !genero[i].equals("feminino"))
                    {
                        System.out.println("Digite novamente de maneira válida!");
                    }
                }
                while(!genero[i].equals("masculino") && !genero[i].equals("feminino"));
            }
            
            catch(java.util.InputMismatchException e)
            {
                System.out.println("Digite um caracter válido!");
                scanner.nextLine();
            }
            
        }
        for(int i=0; i<10; i++)
        {
            
            if(genero[i].equals("feminino"))
            {
                qtMulheres= qtMulheres+1;
            }
            else
            {
                mediaAlturaHomens=altura[i]+mediaAlturaHomens;
            }
        }
        mediaAlturaHomens= mediaAlturaHomens/(10-qtMulheres);
        System.out.printf("%d mulheres \n", qtMulheres);
        System.out.printf("%.2f altura media masculina", mediaAlturaHomens);
        
    }
}
    