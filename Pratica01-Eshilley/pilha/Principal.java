public class Principal{
    public static void main(String[] args){
        Pilha<String> pilha = new Pilha<String>("Letras");

        pilha.push("Python");
        pilha.push("Java");
        pilha.push("C++");
        pilha.imprimePilha();

        System.out.println("Linguagem: " + pilha.pop() + " removido!");
        System.out.println("Topo: " + pilha.peek());

        pilha.push("PHP");
        pilha.push("JavaScript");
        pilha.imprimePilha();
    }
}