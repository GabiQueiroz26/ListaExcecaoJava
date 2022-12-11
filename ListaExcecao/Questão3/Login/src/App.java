import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String usuario, senha;
        System.out.println("Informe o usuario: ");
        usuario = sc.next();
        System.out.println("Informe a senha: ");
        senha = sc.next();

        try {
            if(usuario.equals("Gabi") && senha.equals("123")){
                throw new Exception("Login efetuado");
            } else{
                System.out.println("Login ou senha nao correspondem");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

}
