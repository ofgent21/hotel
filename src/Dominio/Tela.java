package Dominio;

import java.io.IOException;

public class Tela {
	public static void telaMenu() {
		l2();
		System.out.println("GERENCIAMENTO DE HOTEL");
		l1();
		System.out.println("1 - CLIENTES - Cadastro Novo ");
		System.out.println("2 - CLIENTES - Listagem");
		System.out.println("3 - CLIENTES - Edição e Exclusão");
		Tela.l1();
		System.out.println("4 - QUARTOS - Cadastro Novo");
		System.out.println("5 - QUARTOS - Listagem");
		System.out.println("6 - QUARTOS - Edição e Exclusão");
		System.out.println("7 - QUARTOS - Chek In");
		System.out.println("8 - QUARTOS - Chek Out");
		Tela.l1();
		System.out.println("20 - Insere Dados Exemplo");
		System.out.println("30 - Limpa Registros");
		Tela.l0();
		System.out.println("0 - Fecha Sistema");
		l2();
	}

	public static void limpaTela() throws InterruptedException, IOException {
		

	}

	public static void l0() {
		System.out.println("");
	}

	public static void l1() {
		System.out.println("---------------------------------------------------------");
	}

	public static void l2() {
		System.out.println("=========================================================");
	}

	public static void mok() {
		System.out.println("======= Registro Alterado com Sucesso ====================");
	}

	public static void tfinal() {
		l0();
		l2();
		l2();
		l1();
		l1();
		System.out.println("---- OBRIGADO POR UTILIZAR O SISTEMA DO HOTEL -------");
		l1();
		l1();
		l2();
		l2();

	}

}
