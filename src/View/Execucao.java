package View;

import model.PessoaFisica;

public class Execucao {
	
	public static void main(String[] args) {
		// TODO Auto-genereted method stub
		PessoaFisica pf = new PessoaFisica();
		
		pf.setcpf(277769267);
		pf.setBairro("Jardim Ipanema");
		pf.setCep(27120800);
		pf.setTelefone(37565694);
		
		System.out.println("getcpf + pf.setcpf");
	}
	
	
}
