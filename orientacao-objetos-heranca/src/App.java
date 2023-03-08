class App {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();

        //Upcasts
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente_ = new Funcionario();
        //Downcasts, deve ser evitado
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
