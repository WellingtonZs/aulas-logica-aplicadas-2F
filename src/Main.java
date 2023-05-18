public class Main {
    public static void main(String[] args) {
        //aula de orientação de objetos
        //declarar objetos
        Pessoa adao;
        //instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();
        //Definição do formato
        adao.nome = "Adão";
        adao.sobrenome = "Silva";
        eva.nome = "Eva";
        eva.sobrenome = "Silva";
        // Acionar comportamento
        adao.falar();
        eva.falar();
    }
}