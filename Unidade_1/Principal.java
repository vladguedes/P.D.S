package Unidade_1;

public class Principal {
    public static void main(String[] args) {
        Pessoa amiga = new Pessoa();
            amiga.nome = "Lara";
            amiga.idade = 18;

            System.out.printf("Nome: %s\nIdade: %d", amiga.nome, amiga.idade);
    }
}

