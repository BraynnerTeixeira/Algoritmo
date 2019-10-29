class Customer {
    private String nome;
    int idade;

    Customer(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Fila{" + nome + ',' + idade + '}';
    }

}
