public class Principal{
    public static void main(String[] args){
        Fila<Integer> fila = new Fila<Integer>("Números Inteiros");

        fila.imprimeFila();
        fila.enfileirar(54);
        fila.enfileirar(33);
        fila.enfileirar(22);
        fila.enfileirar(11);
        fila.imprimeFila();

        /*
        System.out.println("Dado: " + fila.desenfileirar() + " removido!");
        */
        Integer total = 0;
        for(int i = 0; i < 3; i++){
            total += fila.desenfileirar();
        }
        System.out.println("Total: " + total);
    }
}