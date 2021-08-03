
//criar uma classe abstrata(Chamada Pessoa) Construtor: String Documento 
//											Atributo: String Documento
//2 classes que vao herdar de pessoa (Pessoa Fisica, Pessoa Juridica)
//Metodo polimorfo Validar documento das 2 pessoas
//Devolvento True or False
//BONUS: Criar metodo polimorfismo "Gerar Documento", retornando String documentoNovo
//BONUSBONUS: getDocumentoFormatado.

package br.com.triersistemas.provinhamentira;

public abstract class Pessoa {
	
	private String documento;
	
	public Pessoa(String doc) {
		this.documento = doc;
	}
	
	public String getDoc() {
		return this.documento;
	}
	
	public abstract Boolean validarDocumento();
	
	public abstract String gerarDocumento();
	
	public abstract String getDocumentoFormatado();
	
}
