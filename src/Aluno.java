public class Aluno {
    int id;
    String nome;
    float nota;

    Aluno(int id, String nome, float nota){
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    }

    public static float media(Aluno[] alunos){
        float soma = 0;
        for(Aluno aluno : alunos){
            soma += aluno.nota;
        }
        return soma / alunos.length;
    }


}

