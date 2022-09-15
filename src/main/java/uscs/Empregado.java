package uscs;

public class Empregado {
    private int codigoEmpregado = 0;
    private String nome;
    private String cargo;
    private double salario;
    private static int quantidadeEmpregados = 0;
    
    public int getCodigoEmpregado() {
        return codigoEmpregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public Empregado(){
        codigoEmpregado = quantidadeEmpregados + 1;
        quantidadeEmpregados++;
    }
    
    public Empregado(String nome, String cargo, double salario){
        codigoEmpregado = quantidadeEmpregados + 1;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        quantidadeEmpregados++;
    }
    
    public void ImprimeEmpregado(){
        System.out.printf("Funcionario #%d:\n", codigoEmpregado);
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Cargo: %s\n", cargo);
        System.out.printf("Salario: R$%.2f\n\n", salario);
    }
    
    public static void TotalFuncionarios(){
        System.out.println("Quantidade total de Empregados: " + quantidadeEmpregados);
    }

}
