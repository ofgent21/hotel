package Dominio;

public class Clientes_Config {

		private String codCliente;
		private String clienteNome;
		private String clienteDataNascimento;
		private String clienteEmail;
		private String clienteTelefone;
		private String clienteCidade;
		private String clienteUF;
		private String clienteFumante;
		private String clienteStatus;
		private String clienteQuarto;

	// Source =>Generate Constructor Using Fields
		public String getClienteQuarto() {
			return clienteQuarto;
		}

		public void setClienteQuarto(String ClienteQuarto) {
			this.clienteQuarto = ClienteQuarto;
		}

		public String getCodCliente() {
			return codCliente;
		}

		public void setCodCliente(String codCliente) {
			this.codCliente = codCliente;
		}

		public String getClienteNome() {
			return clienteNome;
		}

		public void setClienteNome(String clienteNome) {
			this.clienteNome = clienteNome;
		}

		public String getClienteDataNascimento() {
			return clienteDataNascimento;
		}

		public void setClienteDataNascimento(String clienteDataNascimento) {
			this.clienteDataNascimento = clienteDataNascimento;
		}

		public String getClienteEmail() {
			return clienteEmail;
		}

		public void setClienteEmail(String clienteEmail) {
			this.clienteEmail = clienteEmail;
		}

		public String getClienteTelefone() {
			return clienteTelefone;
		}

		public void setClienteTelefone(String clienteTelefone) {
			this.clienteTelefone = clienteTelefone;
		}

		public String getClienteCidade() {
			return clienteCidade;
		}

		public void setClienteCidade(String clienteCidade) {
			this.clienteCidade = clienteCidade;
		}

		public String getClienteUF() {
			return clienteUF;
		}

		public void setClienteUF(String clienteUF) {
			this.clienteUF = clienteUF;
		}

		public String getClienteFumante() {
			return clienteFumante;
		}

		public void setClienteFumante(String clienteFumante) {
			this.clienteFumante = clienteFumante;
		}

		public String getClienteStatus() {
			return clienteStatus;
		}

		public void setClienteStatus(String clienteStatus) {
			this.clienteStatus = clienteStatus;
		}

		public Clientes_Config(String codCliente, String clienteNome, String clienteDataNascimento, String clienteEmail,
				String clienteTelefone, String clienteCidade, String clienteUF, String clienteFumante,
				String clienteStatus, String clienteQuarto) {
			super();
			this.setCodCliente(codCliente);
			this.setClienteNome(clienteNome);
			this.setClienteDataNascimento(clienteDataNascimento);
			this.setClienteEmail(clienteEmail);
			this.setClienteTelefone(clienteTelefone);
			this.setClienteCidade(clienteCidade);
			this.setClienteUF(clienteUF);
			this.setClienteFumante(clienteFumante);
			this.setClienteStatus(clienteStatus);
			this.setClienteQuarto(clienteQuarto);
		}

	// Source - Generate to String

		@Override
		public String toString() {
			return " Código: " + getCodCliente()+ "  Quarto vinculado: " + getClienteQuarto() + "\n " + "Nome: " + getClienteNome() + " Data de Nascimento: "
					+ getClienteDataNascimento() + "\n Email: " + getClienteEmail() + " Telefone: " + getClienteTelefone()
					+ "\n Cidade: " + getClienteCidade() + " UF: " + getClienteUF() + " Fumante?: " + getClienteFumante()
					+ " Status: " + getClienteStatus() ;
		}

	}


