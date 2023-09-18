import javax.print.DocFlavor.STRING;

public class Operadores {
    
    public static void main(String[] args) throws Exception {
    System.out.println("Operadores relacionais");
    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if(numero1 < numero2){
        System.out.println("A nossa Condição é verdadeira");
    }

     System.out.println("numeroum é igual a numerodois? " + simNao);

    simNao = numero1 != numero2;

    String nomeUm = "RAINHA";
    String nomeDois = "RAINHA";

    System.out.println(nomeUm.equals(nomeDois));

    System.out.println("Operadores booleanos");

    boolean condicao1 = true;
    boolean condicao2 = false;

    if(condicao1 && condicao2){
        System.out.println("As duas condições são surpresa");
    }
    if(condicao1 || condicao2){
                System.out.println("uma das concições é verdadeira");
    
    }
        System.out.println("As duas condições são surpresa");
    
        System.out.println("Isso é tudo pessoal");
    
    /*
    
    String nomeCompleto = "LINGUAGEM " + "JAVA 2023";
    String concatenacao = "?";
    System.out.println(nomeCompleto);


    //concatenação
    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);
    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);
    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);
    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);
    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);
        
    
    //Interações matematicas

    int numero = 5;

    numero = - numero;
    System.out.println(numero);
    numero = numero * -1;    
    System.out.println(numero);   
    
    int a = 1;
    int b = 1;
    if(a==b)
        System.out.println("verdadeiro");
    else
        System.out.println("falso");
     // d      
    */}

}