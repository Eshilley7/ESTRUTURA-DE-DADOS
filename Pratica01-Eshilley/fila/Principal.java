public class Principal{
    public static void main(String[] args){
        Fila<String> fila = new Fila<String>("Nomes alunos");

        fila.enfileirar("Eshilley");
        fila.enfileirar("Daniel");
        fila.enfileirar("Isaac");
        fila.imprimeFila();

        System.out.println("Nome: " + fila.desenfileirar() + " removido!");
        System.out.println(fila.getPrimeiroNo());
        
        fila.enfileirar("Robson");
        fila.enfileirar("Amanda");
        fila.imprimeFila();
    }
}