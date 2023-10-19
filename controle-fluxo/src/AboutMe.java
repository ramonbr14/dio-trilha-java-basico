    import java.util.InputMismatchException;
import java.util.Locale;
    import java.util.Scanner;

    
public class AboutMe {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();  
        
        System.out.println("Digite sua altura: ");
        Double altura = scanner.nextDouble();



        System.out.println("ola Me chamo " + nome.toUpperCase() + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println(" Minha altura é " + altura + " cm");
        System.out.println("ola Me chamo " + nome.toUpperCase() + " ,");
        scanner.close();

    } catch (InputMismatchException e) {
            System.out.println("Bota somente numeros!");
    }
    }
}
