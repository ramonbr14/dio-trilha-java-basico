public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(int x=0; x<alunos.length;x++){
            System.out.println("O Aluno no índice x = "+x+" é " + alunos[x]);
        }
    
        for(String aluno : alunos){
            System.out.println("Chamando o Aluno: "+ aluno);
        }
    }
}