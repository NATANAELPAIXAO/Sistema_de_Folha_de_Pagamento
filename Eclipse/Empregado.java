package cadastro;

public class Empregado {
    protected double salario;
    protected String nome;

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + ", Salario: " + salario;
    }
}
