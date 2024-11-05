import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("Digite quantos alunos vao ser inseridos: ");
        i = sc.nextInt();
        sc.nextLine();

        Aluno[] alunos = new Aluno[i];

        for(int j = 0; j < i; j++){
        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite uma nota: ");
        float nota = sc.nextFloat();
        sc.nextLine();
        alunos[j] = new Aluno(j, nome, nota);
            if(j == i - 1){
                for(j = 0; j < i; j++){
                    System.out.printf("Id do aluno: %d\n", alunos[j].id + 1);

                    System.out.printf("Nome do aluno: %s\n", alunos[j].nome);

                    System.out.printf("Nota do aluno: %.1f\n\n", alunos[j].nota);
                }
            }

           
        }
        System.out.println("Media: " + Aluno.media(alunos));
    }
}
