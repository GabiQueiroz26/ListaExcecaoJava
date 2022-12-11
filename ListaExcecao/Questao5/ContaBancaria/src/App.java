import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
    ContaBancaria conta = new ContaBancaria(2500.0, 1000.0);
    double saque = 0, deposito = 0;
    Scanner sc = new Scanner(System.in);

       
    System.out.print("insira o valor do depósito: ");
    deposito = sc.nextDouble();
        try{
             conta.depositar(deposito);
        }
        catch (Exception e){
            System.out.println("Erro ao depositar! Só aceita deposito até 1000 reais\n");
        }
             
        System.out.print("Insira o valor do saque: ");
        saque = sc.nextDouble();
            try{
               conta.sacar(saque);
            }
            catch (Exception e){
                if(saque > 500){
                    System.out.println("Erro ao sacar! Valor máximo disponível para saque é de 500 reais");
                }
                else{
                    System.out.println("Saldo indisponível");
                }
            }
                 
            }
        }
        

