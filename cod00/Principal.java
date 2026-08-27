import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();


        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Esh", 19);
        Pessoa obj3 = new Pessoa();
        Pessoa obj4 = new Pessoa("Victoria", 26,new Endereco("Rua Maria Martins", 525, "Juliana"));

        System.out.println("Digite o nome: ");
        obj3.setNome(input.nextLine());
        //String nome = input.nextLine();

        System.out.print("Digite a idade: ");
        obj3.setIdade(input.nextInt());
        //int idade = input.nextInt();

        //obj3.setNome(nome);
        //obj3.setIdade(idade);

        System.out.println("Nome:" + obj1.getNome());
        System.out.println("Idade:" + obj1.getIdade());

        System.out.println("Nome:" + obj2.getNome());
        System.out.println("Idade:" + obj2.getIdade());

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());

        listaP.add(obj1);
        listaP.add(obj2);
        listaP.add(obj3);
        listaP.add(obj4);

        /*for(Pessoa auxP : listaP){
            System.out.println(auxP.toString());
        }*/

        listaP.get(0).setNome("Victoria");
        listaP.get(0).setIdade(26);
        System.out.println(listaP.get(0).toString());
        System.out.println(obj1.toString());

        input.close();

    }

}
