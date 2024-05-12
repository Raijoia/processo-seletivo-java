package candidatura;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
		analisarCandidato(2000.0);
		analisarCandidato(2200.0);
		analisarCandidato(1500.0);
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
