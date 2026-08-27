public class Principal {

    public static void main(String[] args){

        No<String> obj = new No<String>("Eshilley");
        No<Pessoa> objP = new No<Pessoa>(new Pessoa("Victoria", 26, new Endereco("A", 10, "B")));
        No<Integer> objI = new No<Integer>(7);
        
        
        //obj.setNextNo(obj1);
        obj.setNextNo(new No<String>("Maria Clara"));
        obj.getNextNo().setNextNo(new No<String>("Lune"));        
        /*
        System.out.println(obj.getDado());
        System.out.println(obj.getNextNo().getDado());
        System.out.println(obj.getNextNo().getNextNo().getDado());

        */
        No<String> aux = obj;
        while (aux != null) {
            System.out.println(aux.getDado());
            aux = aux.getNextNo();
        }
        
        System.out.println(objP.getDado().toString());
        System.out.println(objI.getDado());
    }   
}