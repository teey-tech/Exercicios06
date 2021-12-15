package br.com.generation.heranca;

public class ExecutaTudo {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		
		c1.setNome("Cesar");
		c1.setIdade(12);
		
		System.out.println("**********************");
		
		System.out.println("Cachorro");
		System.out.println("Nome: "+ c1.getNome());
		System.out.println("Idade: "+ c1.getIdade());
		c1.setCorrer();
		c1.setlatir();
		
		System.out.println("**********************");
		
		Cavalo ca1 = new Cavalo();
		ca1.setNome("Ronald");
		ca1.setIdade(10);
		
		System.out.println("Cavalo");
		System.out.println("Nome: "+ ca1.getNome());
		System.out.println("Idade: "+ ca1.getIdade());
		ca1.setCorrer();
		ca1.setRelinchar();
		
		System.out.println("**********************");
		
		Preguica p1 = new Preguica();
		p1.setNome("Bixo");
		p1.setIdade(2);
		
		System.out.println("Preguiça");		
		System.out.println("Nome: "+ p1.getNome());
		System.out.println("Idade: "+ p1.getIdade());
		p1.setCrir();
		p1.setSubirArvore();
		
		System.out.println("**********************");

	}

}
