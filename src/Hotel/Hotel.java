package Hotel;

import java.util.ArrayList;
import java.util.Scanner;

import Dominio.Clientes_Config;
import Dominio.Quartos_Config;
import Dominio.Tela;

public class Hotel {

	public static void main(String[] args) {
		String clienteCodigo = "0", clienteNome, clienteDataNascimento, clienteEmail, clienteTelefone, clienteCidade,
				clienteUF, clienteFumante, clienteStatus, clienteQuarto;
		String opQuartoNumero, opQuartoPosicao, opQuartoFumante, opQuartoValorDiaria, opQuartoQtdeCamas,
				opQuartoQtdePessoas, opQuartoChekIn, opQuartoChekOut, opQuartoStatus, opQuartoCodCliente;
		ArrayList<Clientes_Config> clientes = new ArrayList<Clientes_Config>();
		ArrayList<Quartos_Config> quartos = new ArrayList<Quartos_Config>();

		int vez = 0;
		int op = 0;
		// WHILE PRINCIPAL
		Scanner in = new Scanner(System.in);
		while (vez != 1) {
			try {
				// programa Inicio
				Tela.telaMenu();

				op = in.nextInt();

				switch (op) {
				case 0: {
					vez = 1;
					break;
				} // FIM CASE 0
				case 1: {
					in.nextLine();
					int codCadastroAtual = clientes.size() + 1;
					Tela.l2();
					System.out.println("======= CADASTRO DE CLIENTES ============================");
					Tela.l1();
					int vezCadastroCliente = 1;
					// INICIO WHILE CADASTRO CLIENTE
					while (vezCadastroCliente != 0) {
						System.out.println("0 - SAI");
						Tela.l0();

						clienteCodigo = Integer.toString(codCadastroAtual);
						System.out.println("Código do Cliente :  " + clienteCodigo);
						System.out.println("Nome do cliente: ");

						clienteNome = in.next();
						if (clienteNome.equals("0")) {
							break;
						}
						System.out.println("Data de Nascimento do cliente: ");
						clienteDataNascimento = in.next();
						System.out.println("Email do cliente: ");
						clienteEmail = in.next();
						System.out.println("Telefone do cliente: ");
						clienteTelefone = in.next();
						System.out.println("Cidade do cliente: ");
						clienteCidade = in.next();
						System.out.println("UF do cliente: ");
						clienteUF = in.next();
						int confirmaFumante = 0;
						clienteFumante = "";
						while (confirmaFumante != 1) {

							System.out.println("O cliente é fumante? ");
							clienteFumante = in.next();
							in.nextLine();
							if (clienteFumante.equals("S") || clienteFumante.equals("N")) {
								confirmaFumante = 1;
							} else {
								System.out.println("Digite S ou N");
							}
						}
						// System.out.println("Quarto Vinculado: ");
						clienteQuarto = "0";
						clienteStatus = "N";
						System.out.println("Confirma a inclusão? S ou N : ");
						String confirmaInclusaoDoCliente = in.next();
						if (confirmaInclusaoDoCliente.equals("S")) {
							Clientes_Config registro1 = new Clientes_Config(clienteCodigo, clienteNome,
									clienteDataNascimento, clienteEmail, clienteTelefone, clienteCidade, clienteUF,
									clienteFumante, clienteStatus, clienteQuarto);
							clientes.add(registro1);
							System.out.println("CLIENTE REGISTRADO COM SUCESSO....... ");
						}
						codCadastroAtual++;
						Tela.l2();
					} /////// FIM WHILE CADASTRO

					break;
				} // FIM CASE 1
				case 2: {
					Tela.limpaTela();
					Tela.l2();
					System.out.println("LISTAGEM DE CLIENTES");
					Tela.l2();
					for (Clientes_Config c : clientes) {
						System.out.println(c);
						Tela.l1();
					}
					Tela.l2();
					System.out.println("Total de Clientes: " + clientes.size());
					Tela.l2();

					break;
				} // FIM CASE 2
				case 3: {
					System.out.println("=========== EDIÇÃO DE CLIENTES=======");
					System.out.println("Insira o Código do Cliente: ");

					String codTemp = in.next();
					boolean encontrado = false;
					for (int i = 0; i < clientes.size(); i++) {

						Clientes_Config ucodTemp = clientes.get(i);

						if (codTemp.equals(ucodTemp.getCodCliente())) {
							int indiceAlterar = i;
							// String codigoAlterar = ucodTemp.getCodCliente();
							Tela.l2();
							System.out.println(" === CLIENTE LOCALIZADO == na posição: " + indiceAlterar);
							System.out.println(ucodTemp);
							Tela.l2();
							System.out.println("===== SELECIONE SUA OPÇÃO DE EDIÇÃO DO CADASTRO =======");
							System.out.println("  1 - Nome do Cliente");
							System.out.println("  2 - Data de Nascimento do Cliente");
							System.out.println("  3 - Email do Cliente");
							System.out.println("  4 - Telefone do Cliente");
							System.out.println("  5 - Cidade do Cliente");
							System.out.println("  6 - UF do Cliente");
							System.out.println("  7 - Fumante s/n");
							System.out.println("  8 - Status Ativo/Inativo");
							Tela.l2();
							System.out.println("  9 - CHECK IN ");
							System.out.println(" 10 - CHECK OUT ");
							Tela.l1();
							System.out.println(" 99 - EXCLUIR O CLIENTE");
							Tela.l1();
							System.out.println("  0 - Sair sem alterar");
							int opAlt = in.nextInt();
							in.nextLine();
							switch (opAlt) {

							case 1: {
								Tela.l2();
								System.out.println("===  MODO ALTERAÇÃO DE NOME DO CLIENTE ====================");
								System.out.print("Nome Atual do Cliente : ");
								System.out.println(ucodTemp.getClienteNome());
								System.out.print("INFORME NOVO NOME DO CLIENTE: ");

								String novoNome = in.next();
								Tela.l2();
								System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");
								int opConfirma = in.nextInt();
								if (opConfirma == 1) {
									ucodTemp.setClienteNome(novoNome);
									Tela.mok();
								}
								break;
							}
							case 2: {
								Tela.l2();
								System.out.println("=====  MODO ALTERAÇÃO DATA DE NASCIMENTO DO CLIENTE ========");
								System.out.print("Data de Nascimento Atual do Cliente : ");
								System.out.println(ucodTemp.getClienteDataNascimento());
								System.out.print("INFORME A NOVA DATA DE NASCIMENTO: ");
								String novaDataNascimento = in.next();
								Tela.l2();
								System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");
								int opConfirma = in.nextInt();
								if (opConfirma == 1) {
									ucodTemp.setClienteDataNascimento(novaDataNascimento);
									Tela.mok();
								}
								break;

							}
							case 3: {
								Tela.l2();
								System.out.println("===== MODO ALTERAÇÃO DO EMAIL DO CLIENTE =============");
								System.out.print("Email Atual do Cliente: ");
								System.out.println(ucodTemp.getClienteEmail());
								System.out.print("INFORME NOVO EMAIL: ");
								String novoEmail = in.next();
								Tela.l2();
								System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");
								int opConfirma = in.nextInt();
								if (opConfirma == 1) {
									ucodTemp.setClienteEmail(novoEmail);
									Tela.mok();
								}
								break;
							}
							case 4: {
								Tela.l2();
								System.out.println("===== MODO ALTERAÇÃO DO TELEFONE DO CLIENTE ===========");
								System.out.print("Telefone Atual do Cliente: ");
								System.out.println(ucodTemp.getClienteTelefone());
								System.out.print("INFORME NOVO TELEFONE: ");
								String novoTelefone = in.next();
								Tela.l2();
								System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");
								int opConfirma = in.nextInt();
								if (opConfirma == 1) {
									ucodTemp.setClienteTelefone(novoTelefone);
									Tela.mok();
								}
								break;
							}
							case 5: {
								Tela.l2();
								System.out.println("======= MODO ALERAÇÃO CIDADE DO CLIENTE =================");
								System.out.print("Cidade Atual do Cliente: ");
								System.out.println(ucodTemp.getClienteCidade());
								System.out.print("INFORME A NOVA CIDADE: ");
								String novaCidade = in.next();
								Tela.l2();
								System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");
								int opConfirma = in.nextInt();
								if (opConfirma == 1) {
									ucodTemp.setClienteCidade(novaCidade);
									Tela.mok();
								}
								break;
							}
							case 6: {
								Tela.l2();
								System.out.println("===== MODO ALTERAÇÃO DO ESTADO (UF) DO CLIENTE =======");
								System.out.print("Estado Atual do Cliente: ");
								System.out.println(ucodTemp.getClienteUF());
								System.out.print("INFORME O NOVO ESTADO: ");
								String novaUF = in.next();
								Tela.l2();
								System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");
								int opConfirma = in.nextInt();
								if (opConfirma == 1) {
									ucodTemp.setClienteUF(novaUF);
									Tela.mok();
								}
								break;

							}
							case 7: {
								Tela.l2();
								System.out.println("===== MODO ALTERAÇÃO DE STATUS FUMANTE (S/N) DO CLIENTE ==");
								System.out.println("Status Atual do Cliente. Fumante? " + ucodTemp.getClienteFumante());
								int confirmaFumante = 0;
								String novoFumante = "";
								while (confirmaFumante == 0) {
									System.out.print("Informe o Novo Status do Cliente. Fumante: ");
									novoFumante = in.next();
									in.nextLine();
									if (novoFumante.equals("S") || (novoFumante.equals("N"))) {
										confirmaFumante = 1;

									} else {
										System.out.println("Digite S ou N para prosseguir");
									}
								}
								Tela.l2();
								Tela.mok();
								System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");
								int opConfirma = in.nextInt();
								if (opConfirma == 1) {
									ucodTemp.setClienteFumante(novoFumante);
									Tela.mok();
								}

							}

								break;

							// INICIO ALTERAÇÃO STATUS
							case 8: {
								Tela.l2();
								System.out.println("== MODO ALTERAÇÃO DE STATUS (ATIVO/INATIVO) DO CLIENTE =====");
								System.out.print("Status Atual do Cliente: ");
								System.out.println(ucodTemp.getClienteStatus());
								Tela.l1();
								System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");
								int opConfirma = in.nextInt();
								if (opConfirma == 1) {
									if (ucodTemp.getClienteStatus() == "ATIVO") {
										ucodTemp.setClienteStatus("INATIVO");
										Tela.mok();

									} else {
										ucodTemp.setClienteStatus("ATIVO");
										Tela.mok();
									}
								}
								break;
							}
							// FIM ALTERAÇÃO STATUS
							case 9: {
								String FUMA = ucodTemp.getClienteFumante();
								Tela.l2();
								System.out.println("=== MODO CHEK IN (VÍNCULO DE QUARTO AO CLIENTE) ==== ");
								Tela.l0();
								System.out.print("Quarto Atual Vinculado ao Cliente: ");
								System.out.println(ucodTemp.getClienteQuarto());
								Tela.l2();
								System.out.println("=== REGISTRAR/ALTERAR QUARTO PARA O CLIENTE? ==== ");
								System.out.println("===             1-Sim     2-Não");
								int qop = in.nextInt();
								in.nextLine();
								if (qop == 1) {
									System.out.println("Quarto para quantas pessoas? ");
									int qtspessoas = in.nextInt();
									in.nextLine();

									int qtsqok = 0;

									System.out.println("=== QUARTOS LOCALIZADOS PARA O CLIENTE INFORMADO... ");
									for (int contaquarto = 0; contaquarto < quartos.size(); contaquarto++) {
										Quartos_Config fumante = quartos.get(contaquarto);

										if (FUMA.equals(fumante.getQuartoFumante()) && fumante.getQuartoChekIn() == ""
												&& Integer.parseInt(fumante.getQuartoQtdePessoas()) >= qtspessoas) {
											System.out.print(fumante.getQuartoNumero());
											if (contaquarto == 5) {
												System.out.println(fumante.getQuartoNumero());
											}

											qtsqok = qtsqok + 1;
										}

									}
									if (qtsqok < 1) {
										Tela.l1();
										System.out.println(
												"==== NÃO EXISTEM QUARTOS DISPONIVEIS PARA O CLIENTE INFORMADO.....  ");
										Tela.l1();
										break;
									}
									Tela.l0();
									System.out.println("INFORME NOVO QUARTO PARA O CLIENTE: ");
									String novoQuarto = in.next();
									Tela.l2();
									System.out.println("=== CONFIRMA A ALTERAÇÃO: 1 - Sim   2 - Não");
									int opConfirma = in.nextInt();
									if (opConfirma == 1) {

										for (int contaquarto = 0; contaquarto < quartos.size(); contaquarto++) {
											Quartos_Config fumante1 = quartos.get(contaquarto);
											if (FUMA.equals(fumante1.getQuartoFumante())
													&& fumante1.getQuartoChekIn() == ""
													&& Integer.parseInt(fumante1.getQuartoQtdePessoas()) >= qtspessoas
													&& novoQuarto.equals(fumante1.getQuartoNumero())) {
												fumante1.setQuartoStatus("N");
												fumante1.setQuartoChekIn(Integer.toString(qtspessoas)+ " hospedadas");
												fumante1.setQuartoCodCliente(codTemp);

											}
										}

										ucodTemp.setClienteQuarto(novoQuarto);
										Tela.mok();
									}
								} /// fim do qop
								break;

							}

							case 10: {
								// inicio do Check OUT
								Tela.l2();
								System.out.println(" MODO CHECK OUT - Desvincular Quarto para o Cliente ");
								Tela.l2();
								for (int contadorFecha = 0; contadorFecha < quartos.size(); contadorFecha++) {
									Quartos_Config fechaQuarto = quartos.get(contadorFecha);
									if (codTemp.equals(fechaQuarto.getQuartoCodCliente())) {
										System.out.println("Localizado Registro de Quarto "
												+ fechaQuarto.getQuartoCodCliente() + " para o Cliente Informado.");
										Tela.l2();
										Tela.l0();
										Tela.l0();
										Tela.l0();
										System.out.println(" DESVINCULA QUARTO ? S ou N ");
										String confirmaCheckOut = in.next();
										if (confirmaCheckOut.equals("S"))
											;
										fechaQuarto.setQuartoCodCliente("0");
										fechaQuarto.setQuartoStatus("S");
										fechaQuarto.setQuartoChekIn("0");
										

										for (int contadorFechaCliente = 0; contadorFechaCliente < clientes
												.size(); contadorFechaCliente++) {
											Clientes_Config clienteOut = clientes.get(contadorFechaCliente);
											if (codTemp.equals(clienteOut.getCodCliente())) {
												clienteOut.setClienteQuarto("");
												System.out.println("Sucesso. Registro Cliente Atualizado com Check Out..... ");
											}
										}

										System.out.println(" Sucesso. Registro de Quarto Atualizado com Check Out.....  ");

									}

								}

								// FIM do Check OUT
								break;
							}

							case 99: {

								Tela.l2();
								System.out.println("====   ATENÇÃO  ====== MODO EXCLUSÃO =======");
								Tela.l1();
								Tela.l1();
								System.out.println("Tem certeza : 999 - SIM   Qualquer tecla - NÃO");

								int excluiCliente = in.nextInt();

								if (excluiCliente == 999) {
									clientes.remove(i);
									Tela.l2();
									Tela.mok();
								}

								break;

							}
							case 0: {
								System.out.println("Sair sem alterar");
								break;
							}

							}

							encontrado = true;
							break;
						}

					}

					if (!encontrado) {
						System.out.println("Cliente Não Encontrado");
					}

					vez = 0;

					break;
				} // FIM CASE 3
				case 4: {
					Tela.l2();
					System.out.println("====== CADASTRO DE NOVO QUARTO ============ ");
					Tela.l1();
					System.out.println("Insira o Número do Quarto: ");
					opQuartoNumero = in.next();
					System.out.println("Quarto Posição: ");
					opQuartoPosicao = in.next();
					int opfum = 0;
					opQuartoFumante = "";
					while (opfum != 1) {
						System.out.println("Fumante S/N: ");
						opQuartoFumante = in.next();
						in.nextLine();
						if (opQuartoFumante.equals("S") || opQuartoFumante.equals("N")) {
							opfum = 1;

						} else {
							System.out.println(" Digite S ou N ");
						}
					}

					System.out.println("Valor da Diaria: ");
					opQuartoValorDiaria = in.next();
					System.out.println("Quantidade de Camas: ");
					opQuartoQtdeCamas = in.next();
					System.out.println("Quantidade de Pessoas: ");
					opQuartoQtdePessoas = in.next();
					// System.out.println("Data Check In");
					opQuartoChekIn = "";
					// System.out.println("Data Check Out?");
					opQuartoChekOut = "";
					// System.out.println("Liberado S/N: ");
					opQuartoStatus = "S";
					// System.out.println("Cliente Vinculado: ");
					opQuartoCodCliente = "0";
					System.out.println("Confirma a Inclusão? 1-Sim  2-Não : ");
					int confirma = in.nextInt();
					in.nextLine();
					if (confirma == 1) {
						Quartos_Config registro2 = new Quartos_Config(opQuartoNumero, opQuartoPosicao, opQuartoFumante,
								opQuartoValorDiaria, opQuartoQtdeCamas, opQuartoQtdePessoas, opQuartoChekIn,
								opQuartoChekOut, opQuartoStatus, opQuartoCodCliente);

						quartos.add(registro2);
					}
					break;
				} // FIM CASE 4
				case 5: {
					Tela.l2();
					System.out.println("============ QUARTO RELATORIO  ============ ");
					for (Quartos_Config d : quartos) {
						System.out.println(d);
						Tela.l1();
					}
					Tela.l2();
					System.out.println("Total de Quartos: " + quartos.size());
					Tela.l2();
					break;
				} // FIM CASE 5
				case 6: {

					Tela.l2();
					System.out.println("====== QUARTOS EDIÇÃO E ALTERAÇÃO ==================== ");
					Tela.l1();
					System.out.println("Insira o Número do Quarto: ");
					String codQuartoTemp = in.next();
					for (int i = 0; i < quartos.size(); i++) {
						Quartos_Config tempCodQua = quartos.get(i);
						if (codQuartoTemp.equals(tempCodQua.getQuartoNumero()))
							;
						{
							int indQuartoAlterar = i;
							Tela.l2();
							System.out.println("=======  Quarto LOCALIZADO na posição: " + indQuartoAlterar);
							System.out.println(tempCodQua);
							Tela.l2();
							System.out.println("=== Qual o registro a ser alterado? ======= ");
							System.out.println("  1 - Posição");
							System.out.println("  2 - Fumante S/N");
							System.out.println("  3 - Valor da diária");
							System.out.println("  4 - Quantidade de Camas");
							System.out.println("  5 - Quantidade de Pessoas");
							// System.out.println(" 6 - Chek In");
							// System.out.println(" 7 - Chek Out");
							// System.out.println(" 8 - Status do Quarto");
							System.out.println("  9 - Vínculo Cliente");
							System.out.println(" 99 - EXCLUIR O QUARTO");
							System.out.println("  0 - Sair sem alterar");
							int opAltQua = in.nextInt();

							switch (opAltQua) {

							case 1: {
								Tela.l2();
								System.out.println("========== Posição ========== ");
								System.out.println(tempCodQua.getQuartoPosicao());
								System.out.println("INFORME O NOVO VALOR: ");
								Tela.l2();
								String novaPosicao = in.next();
								System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
								int opQuaConfirma = in.nextInt();
								if (opQuaConfirma == 1) {
									tempCodQua.setQuartoPosicao(novaPosicao);
									Tela.mok();
								}
								break;
							}

							case 2: {
								Tela.l2();
								System.out.println("========== Fumante S/N ========== ");
								System.out.println("Status atual do Quarto: " + tempCodQua.getQuartoFumante());
								int confirmaFumanteQuarto = 0;
								String novoFumante = "";
								while (confirmaFumanteQuarto == 0) {
									System.out.println("INFORME O NOVO STATUS (S) OU (N): ");
									Tela.l2();
									novoFumante = in.next();
									if (novoFumante.equals("S") || novoFumante.equals("N")) {
										confirmaFumanteQuarto = 1;
									} else {
										System.out.println("Insira S ou N para fumante ....");
									}

								}
								System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
								int opQuaConfirma = in.nextInt();
								if (opQuaConfirma == 1) {
									tempCodQua.setQuartoFumante(novoFumante);
									Tela.mok();
								}
								break;
							}

							case 3: {
								Tela.l2();
								System.out.println("========== Valor da diária ========== ");
								System.out.println(tempCodQua.getQuartoValorDiaria());
								System.out.println("INFORME O NOVO VALOR: ");
								Tela.l2();
								String novaDiaria = in.next();
								System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
								int opQuaConfirma = in.nextInt();
								if (opQuaConfirma == 1) {
									tempCodQua.setQuartoValorDiaria(novaDiaria);
									Tela.mok();
								}
								break;
							}

							case 4: {
								Tela.l2();
								System.out.println("========== Quantidade de Camas ========== ");
								System.out.println(tempCodQua.getQuartoQtdeCamas());
								System.out.println("INFORME O NOVO VALOR: ");
								Tela.l2();
								String novaCamas = in.next();
								System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
								int opQuaConfirma = in.nextInt();
								if (opQuaConfirma == 1) {
									tempCodQua.setQuartoQtdeCamas(novaCamas);
									Tela.mok();
								}
								break;
							}

							case 5: {
								Tela.l2();
								System.out.println("========== Quantidade de Pessoas ========== ");
								System.out.println(tempCodQua.getQuartoQtdePessoas());
								System.out.println("INFORME O NOVO VALOR: ");
								Tela.l2();
								String novaQPessoas = in.next();
								System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
								int opQuaConfirma = in.nextInt();
								if (opQuaConfirma == 1) {
									tempCodQua.setQuartoQtdePessoas(novaQPessoas);
									Tela.mok();
								}
								break;
							}

							case 6: {
								/*
								 * Tela.l2(); System.out.println("========== Check In ========== ");
								 * System.out.println(tempCodQua.getQuartoChekIn());
								 * System.out.println("INFORME O NOVO VALOR: "); Tela.l2(); String novoCKin =
								 * in.next();
								 * System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
								 * int opQuaConfirma = in.nextInt(); if (opQuaConfirma == 1) {
								 * tempCodQua.setQuartoChekIn(novoCKin); Tela.mok(); }
								 */
								break;
							}

							case 7: {
								/*
								 * Tela.l2(); System.out.println("========== Check Out ========== ");
								 * System.out.println(tempCodQua.getQuartoChekOut());
								 * System.out.println("INFORME O NOVO VALOR: "); Tela.l2(); String novoCKout =
								 * in.next();
								 * System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
								 * int opQuaConfirma = in.nextInt(); if (opQuaConfirma == 1) {
								 * tempCodQua.setQuartoChekOut(novoCKout); Tela.mok(); }
								 */
								break;
							}

							case 8: {
								/*
								 * Tela.l2(); System.out.println("========== Status do Quarto ========== ");
								 * System.out.println(tempCodQua.getQuartoStatus());
								 * System.out.println("INFORME O NOVO VALOR: "); Tela.l2(); String novoSta =
								 * in.next();
								 * System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
								 * int opQuaConfirma = in.nextInt(); if (opQuaConfirma == 1) {
								 * tempCodQua.setQuartoStatus(novoSta); Tela.mok(); }
								 */
								break;
							}

							case 9: {
								Tela.l2();
								System.out.println("========== Vínculo Cliente ========== ");
								System.out.println(tempCodQua.getQuartoCodCliente());
								System.out.println("INFORME O NOVO VALOR: ");
								Tela.l2();
								String novCodCliente = in.next();
								System.out.println("===== CONFIRMA A ALTERAÇÃO:   1- Sim   2- Não ======= ");
								int opQuaConfirma = in.nextInt();
								if (opQuaConfirma == 1) {
									tempCodQua.setQuartoCodCliente(novCodCliente);
									Tela.mok();
								}
								break;
							}

							case 99: {
								Tela.l2();
								System.out.println("========== EXCLUIR O QUARTO ========== ");
								Tela.l2();
								System.out.println("====   ATENÇÃO  ====== MODO EXCLUSÃO =======");
								Tela.l1();
								Tela.l1();
								System.out.println("Tem certeza : 999 - SIM   Qualquer tecla - NÃO");

								int excluiQuarto = in.nextInt();

								if (excluiQuarto == 999) {
									quartos.remove(i);
									Tela.l2();
									Tela.mok();
								}
								break;
							}

							case 0: {
								Tela.l2();
								System.out.println("========== Sair sem alterar ========== ");
								break;
							}

							}

						} //// if encontra o número do quarto

					}

					vez = 0;

					break;
				} // FIM CASE 6
				case 7: {
					break;
				} // FIM CASE 7
				case 8: {
					break;
				} // FIM CASE 8
				case 9: {
					break;
				} // FIM CASE 9
				case 10: {
					break;
				} // FIM CASE 10

				case 20: {
					////// inicio de dados de exemplo
					for (int dtemp = clientes.size() + 1; dtemp <= 5; dtemp++) {

						String c1 = Integer.toString(dtemp), c2 = "CLIENTE_EXEMPLO" + dtemp, c3 = "01/01/2022",
								c4 = "email@email.com.br", c5 = "(48)9999-9999", c6 = "CIDADE", c7 = "UF", c8 = "N",
								c9 = "INATIVO", c10 = "0";
						Clientes_Config exemplo1 = new Clientes_Config(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10);
						clientes.add(exemplo1);
					}
					////// fim de dados de exemplo

					break;
				}

				case 30: {
					clientes.clear();
					quartos.clear();
					break;
				}

				} // FIM DO SWITCH PRINCIPAL OP

				// programa fim
			} catch (Exception e) {
				vez = 0;
				in.nextLine();

			} finally {

			}
		}

		// fim do WHILE PRINCIPAL
		Tela.tfinal();
		in.close();
	} // FIM ARGS

} // FIM CLASS HOTEL
