package uscs;

public class TesteEmpregado {

    public static void main(String[] args) {
        Empregado e1 = new Empregado("Paulo Silva", "Gerente Financeiro", 15400.00);
        Empregado e2 = new Empregado();
        e2.setNome("Ana Paula");
        e2.setCargo("Analista de Sistemas");
        e2.setSalario(10700.00);
        
        e1.ImprimeEmpregado();
        e2.ImprimeEmpregado();
        Empregado.TotalFuncionarios();
    }
}
