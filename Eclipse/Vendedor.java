package cadastro;

public class Vendedor extends Empregado {
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calcularSalario() {
        return salario + (salario * comissao / 100);
    }

    @Override
    public String toString() {
        double salarioComComissao = calcularSalario();
        return "\nNome: " + nome + ", Salario sem comissao: " + salario + 
               ", Salario com comissao: " + salarioComComissao + 
               ", Percentual de comissao: " + comissao;
    }
}