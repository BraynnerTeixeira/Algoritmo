import java.util.*;

class Algorithm {

     private List<Customer> clientes = new ArrayList<Customer>();

     void insert(Customer cliente) {
        this.clientes.add(cliente);
    }

     void fila(){
         for(int i=0; i<clientes.size(); i++){
                clientes.sort(new adicionar());
                System.out.println(clientes.get(i));
        }
    }

    static class adicionar implements Comparator<Customer> {
        public int compare(Customer c1, Customer c2) {
            if (c1.idade > c2.idade) return -1;
            else if (c1.idade < c2.idade) return +1;
            else return 0;
        }
    }

    void sair(){
        for(int i=0; i<1; i++){
           clientes.remove(i);
           System.out.println(clientes);
        }
    }
}
