package Dominio;

public class Quartos_Config {



		public String quartoNumero;
		public String quartoPosicao;
		public String quartoFumante;
		public String quartoValorDiaria;
		public String quartoQtdeCamas;
		public String quartoQtdePessoas;
		public String quartoChekIn;
		public String quartoChekOut;
		public String quartoStatus;
		public String quartoCodCliente;

		@Override
		public String toString() {
			return " Quarto Número: " + quartoNumero + " Liberado?: " + quartoStatus + "\n Posicao: " + quartoPosicao
					+ "  Fumante S/N: " + quartoFumante + "\n Qtde Camas: " + quartoQtdeCamas + "  Qtde Pessoas: "
					+ quartoQtdePessoas + "\n Pessoas no Quarto Atualmente:  " + quartoChekIn + "  Check Out: " + quartoChekOut
					+ "\n Cliente: " + quartoCodCliente + "  Valor Diária: " + quartoValorDiaria ;
		}


		

		public Quartos_Config(String quartoNumero, String quartoPosicao, String quartoFumante, String quartoValorDiaria,
				String quartoQtdeCamas, String quartoQtdePessoas, String quartoChekIn, String quartoChekOut,
				String quartoStatus, String quartoCodCliente) {
			super();
			this.quartoNumero = quartoNumero;
			this.quartoPosicao = quartoPosicao;
			this.quartoFumante = quartoFumante;
			this.quartoValorDiaria = quartoValorDiaria;
			this.quartoQtdeCamas = quartoQtdeCamas;
			this.quartoQtdePessoas = quartoQtdePessoas;
			this.quartoChekIn = quartoChekIn;
			this.quartoChekOut = quartoChekOut;
			this.quartoStatus = quartoStatus;
			this.quartoCodCliente = quartoCodCliente;
		}
		public String getQuartoNumero() {
			return quartoNumero;
		}
		
		public void setQuartoNumero(String quartoNumero) {
			this.quartoNumero = quartoNumero;
		}

		public String getQuartoPosicao() {
			return quartoPosicao;
		}

		public void setQuartoPosicao(String quartoPosicao) {
			this.quartoPosicao = quartoPosicao;
		}

		public String getQuartoFumante() {
			return quartoFumante;
		}

		public void setQuartoFumante(String quartoFumante) {
			this.quartoFumante = quartoFumante;
		}

		public String getQuartoValorDiaria() {
			return quartoValorDiaria;
		}

		public void setQuartoValorDiaria(String quartoValorDiaria) {
			this.quartoValorDiaria = quartoValorDiaria;
		}

		public String getQuartoQtdeCamas() {
			return quartoQtdeCamas;
		}

		public void setQuartoQtdeCamas(String quartoQtdeCamas) {
			this.quartoQtdeCamas = quartoQtdeCamas;
		}

		public String getQuartoQtdePessoas() {
			return quartoQtdePessoas;
		}

		public void setQuartoQtdePessoas(String quartoQtdePessoas) {
			this.quartoQtdePessoas = quartoQtdePessoas;
		}

		public String getQuartoChekIn() {
			return quartoChekIn;
		}

		public void setQuartoChekIn(String quartoChekIn) {
			this.quartoChekIn = quartoChekIn;
		}

		public String getQuartoChekOut() {
			return quartoChekOut;
		}

		public void setQuartoChekOut(String quartoChekOut) {
			this.quartoChekOut = quartoChekOut;
		}

		public String getQuartoStatus() {
			return quartoStatus;
		}

		public void setQuartoStatus(String quartoStatus) {
			this.quartoStatus = quartoStatus;
		}

		public String getQuartoCodCliente() {
			return quartoCodCliente;
		}

		public void setQuartoCodCliente(String quartoCodCliente) {
			this.quartoCodCliente = quartoCodCliente;
		}

	
	
	
} // fim class Quartos_Config
