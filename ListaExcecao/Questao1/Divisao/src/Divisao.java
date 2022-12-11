import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

    Scanner sc = new Scanner(System.in);
        

    int n1;
    int n2;
    double divisao;
    


    public void Calcula() throws Exception {
        try{
            System.out.println("Digite um numero: ");
            n1 = sc.nextInt();
            System.out.println("Digite outro numero:");
            n2 = sc.nextInt();
            divisao = n1/n2;
            if(divisao >= 1 ){
                System.out.println("A divisao de " + n1 + " por "+ n2 + " é " + divisao);
            }else{
                throw new Exception();
            }
        }catch(ArithmeticException e){
            System.out.println("Não é possivel dividir por zero!");
        }
        catch(InputMismatchException e){
            System.out.println("Erro! Não é possivel dividir algo que nao seja numeros! ");
        }
    }


    
}
