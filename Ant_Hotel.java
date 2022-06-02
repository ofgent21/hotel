package Hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Ant_Hotel {

	public static void main(String[] args) throws InterruptedException {

		String clienteCodigo, clienteNome, clienteDataNascimento, clienteEmail, clienteTelefone, clienteCidade,
				clienteUF, clienteFumante, clienteStatus, clienteQuarto = "";
		String opQuartoNumero, opQuartoPosicao, opQuartoFumante, opQuartoValorDiaria, opQuartoQtdeCamas,
				opQuartoQtdePessoas, opQuartoChekIn, opQuartoChekOut, opQuartoStatus, opQuartoCodCliente;
		int vez = 1;
		int op;
		int vezCadastroCliente;
		int codCadastroAtual = 1;
		int vezQuarto = 1;
		ArrayList<Ant_Clientes> clientes = new ArrayList<Ant_Clientes>();
		ArrayList<Ant_Quartos> quartos = new ArrayList<Ant_Quartos>();
		Scanner in = new Scanner(System.in);
		do {
			op = in.nextInt();
			if (op == 0) {
				vez = 1;
				break;
			}

			switch (op) {
			case 0: {
				continue;
			}

			case 1: {}
			case 2: {}

			case 3: {

			case 4: {
				do {


					vez = 0;
					vezQuarto = 0;
					break;

				} while (vezQuarto != 0);
			}

			case 5: {
				
				vez = 0;
				break;
			}

			case 6: {}

			case 7: {
				System.out.println("====== QUARTO CHECK IN ==================== ");
				vez = 0;
				break;
			}

			case 8: {
				System.out.println("====== CHECK OUT============================");
				vez = 0;
				break;
			}

			case 9: {
				// System.out.println("OPÇÃO 09 EM DESENVOLVIMENTO");
				vez = 0;
				break;
			}

			default: {
				System.out.println("OPÇÃO INVÁLIDA");
				vez = 0;
			}

			}

		} while (vez != 1);

		in.close();

	}

	
}