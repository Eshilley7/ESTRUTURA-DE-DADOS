public class Principal{
    public static void main(String[] args) {
        //Lista de Alunos
        Lista<String> lista = new Lista<String>("Alunos");

        lista.addInicio("Eshilley");
        lista.addInicio("Victoria");
        lista.addInicio("Lune");
        
        lista.imprimeLista();
    }
}