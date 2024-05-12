package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");

//		selecaoCandidatos();
//		imprimirSelecionados();
		ligarCandidatos();
	}
	
	static void ligarCandidatos() {
		String[] candidatos = {"RAÍ", "Julia", "CRISTIANE", "EDUARDO", "MONIQUE"};
		
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativaRealizada = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando) {
				tentativaRealizada++;
			} else System.out.println("Contato realizado com sucesso");
		} while(continuarTentando && tentativaRealizada < 3);
		
		if(atendeu) {
			System.out.println("Conseguimos contato com " + candidato + " na " + tentativaRealizada + " vez");
		} else {
			System.out.println("Não conseguimos contato com " + candidato + ", numero maximo de tentativas excedidos");
		}
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionados() {
		String[] candidatos = {"RAÍ", "Julia", "CRISTIANE", "EDUARDO", "MONIQUE"};
		
		for(String candidato: candidatos) {
			System.out.println("O candidato " + candidato + " foi selecionado");
		}
	}
	
	static void selecaoCandidatos() {
		String[] candidatos = {"RAÍ", "Julia", "CRISTIANE", "EDUARDO", "MONIQUE", "VANDA", "ALEMAO", "BIANCA", "CLEIDE", "CHARLIE"};
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou esse valor de salário " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				candidatosSelecionados++;
				System.out.println("O candidato " + candidato + " Foi selecionado para a vaga");
			}
			candidatoAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		} else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
	}
}
