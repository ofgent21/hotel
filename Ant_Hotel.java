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

			case 6: {
				l2();
				System.out.println("====== QUARTOS EDIÇÃO E ALTERAÇÃO ==================== ");
				l1();
				System.out.println("Insira o Número do Quarto: ");
				String codQuartoTemp = in.next();
				for (int i = 0; i < quartos.size(); i++) {
					Ant_Quartos tempCodQua = quartos.get(i);
					if (codQuartoTemp.equals(tempCodQua.getQuartoNumero()))
						;
					{
						int indQuartoAlterar = i;
						l2();
						System.out.println("=======  Quarto LOCALIZADO na posição: " + indQuartoAlterar);
						System.out.println(tempCodQua);
						l2();
						System.out.println("=== Qual o registro a ser alterado? ======= ");
						System.out.println("  1 - Posição");
						System.out.println("  2 - Fumante S/N");
						System.out.println("  3 - Valor da diária");
						System.out.println("  4 - Quantidade de Camas");
						System.out.println("  5 - Quantidade de Pessoas");
						System.out.println("  6 - Chek In");
						System.out.println("  7 - Chek Out");
						System.out.println("  8 - Status do Quarto");
						System.out.println("  9 - Vínculo Cliente");
						System.out.println(" 99 - EXCLUIR O QUARTO");
						System.out.println("  0 - Sair sem alterar");
						int opAltQua = in.nextInt();

						switch (opAltQua) {

						case 1: {
							l2();
							System.out.println("========== Posição ========== ");
							System.out.println(tempCodQua.getQuartoPosicao());
							System.out.println("INFORME O NOVO VALOR: ");
							l2();
							String novaPosicao = in.next();
							System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
							int opQuaConfirma = in.nextInt();
							if (opQuaConfirma == 1) {
								tempCodQua.setQuartoPosicao(novaPosicao);
								mok();
							}
							break;
						}

						case 2: {
							l2();
							System.out.println("========== Fumante S/N ========== ");
							System.out.println(tempCodQua.getQuartoFumante());
							System.out.println("INFORME O NOVO VALOR: ");
							l2();
							String novoFumante = in.next();
							System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
							int opQuaConfirma = in.nextInt();
							if (opQuaConfirma == 1) {
								tempCodQua.setQuartoFumante(novoFumante);
								mok();
							}
							break;
						}

						case 3: {
							l2();
							System.out.println("========== Valor da diária ========== ");
							System.out.println(tempCodQua.getQuartoValorDiaria());
							System.out.println("INFORME O NOVO VALOR: ");
							l2();
							String novaDiaria = in.next();
							System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
							int opQuaConfirma = in.nextInt();
							if (opQuaConfirma == 1) {
								tempCodQua.setQuartoValorDiaria(novaDiaria);
								mok();
							}
							break;
						}

						case 4: {
							l2();
							System.out.println("========== Quantidade de Camas ========== ");
							System.out.println(tempCodQua.getQuartoQtdeCamas());
							System.out.println("INFORME O NOVO VALOR: ");
							l2();
							String novaCamas = in.next();
							System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
							int opQuaConfirma = in.nextInt();
							if (opQuaConfirma == 1) {
								tempCodQua.setQuartoQtdeCamas(novaCamas);
								mok();
							}
							break;
						}

						case 5: {
							l2();
							System.out.println("========== Quantidade de Pessoas ========== ");
							System.out.println(tempCodQua.getQuartoQtdePessoas());
							System.out.println("INFORME O NOVO VALOR: ");
							l2();
							String novaQPessoas = in.next();
							System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
							int opQuaConfirma = in.nextInt();
							if (opQuaConfirma == 1) {
								tempCodQua.setQuartoQtdePessoas(novaQPessoas);
								mok();
							}
							break;
						}

						case 6: {
							l2();
							System.out.println("========== Check In ========== ");
							System.out.println(tempCodQua.getQuartoChekIn());
							System.out.println("INFORME O NOVO VALOR: ");
							l2();
							String novoCKin = in.next();
							System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
							int opQuaConfirma = in.nextInt();
							if (opQuaConfirma == 1) {
								tempCodQua.setQuartoChekIn(novoCKin);
								mok();
							}
							break;
						}

						case 7: {
							l2();
							System.out.println("========== Check Out ========== ");
							System.out.println(tempCodQua.getQuartoChekOut());
							System.out.println("INFORME O NOVO VALOR: ");
							l2();
							String novoCKout = in.next();
							System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
							int opQuaConfirma = in.nextInt();
							if (opQuaConfirma == 1) {
								tempCodQua.setQuartoChekOut(novoCKout);
								mok();
							}
							break;
						}

						case 8: {
							l2();
							System.out.println("========== Status do Quarto ========== ");
							System.out.println(tempCodQua.getQuartoStatus());
							System.out.println("INFORME O NOVO VALOR: ");
							l2();
							String novoSta = in.next();
							System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
							int opQuaConfirma = in.nextInt();
							if (opQuaConfirma == 1) {
								tempCodQua.setQuartoStatus(novoSta);
								mok();
							}
							break;
						}

						case 9: {
							l2();
							System.out.println("========== Vínculo Cliente ========== ");
							System.out.println(tempCodQua.getQuartoCodCliente());
							System.out.println("INFORME O NOVO VALOR: ");
							l2();
							String novCodCliente = in.next();
							System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
							int opQuaConfirma = in.nextInt();
							if (opQuaConfirma == 1) {
								tempCodQua.setQuartoCodCliente(novCodCliente);
								mok();
							}
							break;
						}

						case 99: {
							l2();
							System.out.println("========== EXCLUIR O QUARTO ========== ");
							l2();
							System.out.println("====   ATENÇÃO  ====== MODO EXCLUSÃO =======");
							l1();
							l1();
							System.out.println("Tem certeza : 999 - SIM   Qualquer tecla - NÃO");

							int excluiQuarto = in.nextInt();

							if (excluiQuarto == 999) {
								quartos.remove(i);
								l2();
								mok();
							}
							break;
						}

						case 0: {
							l2();
							System.out.println("========== Sair sem alterar ========== ");
							break;
						}

						}

					} //// if encontra o número do quarto

				}

				vez = 0;
				break;
			}

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