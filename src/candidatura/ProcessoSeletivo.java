package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");

		selecaoCandidatos();
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
