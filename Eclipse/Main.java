package main;
import java.util.Scanner;

import cadastro.Empregado;
import cadastro.Gerente;
import cadastro.Vendedor;

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Lê os dados do empregado
	        System.out.println("Informe o nome do empregado:");
	        String nomeEmpregado = scanner.nextLine();
	        
	        System.out.println("Informe o salario do empregado:");
	        double salarioEmpregado = scanner.nextDouble();
	        
	        Empregado empregado = new Empregado(nomeEmpregado, salarioEmpregado);
	        System.out.println("Empregado:  " + empregado.toString());
	        
	        // Lê os dados do gerente
	        scanner.nextLine(); // Limpa o buffer
	        System.out.println("\nInforme o nome do gerente:");
	        String nomeGerente = scanner.nextLine();
	        
	        System.out.println("Informe o salario do gerente:");
	        double salarioGerente = scanner.nextDouble();
	        
	        scanner.nextLine(); // Limpa o buffer
	        System.out.println("Informe o departamento do gerente:");
	        String departamentoGerente = scanner.nextLine();
	        
	        Gerente gerente = new Gerente(nomeGerente, salarioGerente, departamentoGerente);
	        System.out.println("Gerente: " + gerente.toString());
	        
	        // Lê os dados do vendedor
	        System.out.println("\nInforme o nome do vendedor:");
	        String nomeVendedor = scanner.nextLine();
	        
	        System.out.println("Informe o salario do vendedor:");
	        double salarioVendedor = scanner.nextDouble();
	        
	        System.out.println("Informe o percentual de comissao do vendedor:");
	        double percentualComissaoVendedor = scanner.nextDouble();
	        
	        Vendedor vendedor = new Vendedor(nomeVendedor, salarioVendedor, percentualComissaoVendedor);
	        System.out.println("Vendedor: " + vendedor.toString());
	        System.out.println("Salario do vendedor com comissao: " + vendedor.calcularSalario());
	        
	        scanner.close();
	    }
	}