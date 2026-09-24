public class Principal {
    public static void main(String[] args) {
 
        ListaDupla<Produto> lista = new ListaDupla<Produto>("Produtos");

        lista.addInicio(new Produto("Mesa", 50));
        lista.addFinal(new Produto("Cadeira", 70));
        lista.addMeio(new Produto("Pia", 100), 1);
        lista.imprimeLista();

        System.out.println("Produto removido: " + lista.removeMeio(1));
 
        lista.addInicio(new Produto("Torneira", 21));
        lista.addFinal(new Produto("Prato", 5));
        lista.imprimeLista();
    }
}