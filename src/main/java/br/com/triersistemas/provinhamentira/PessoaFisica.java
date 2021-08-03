package br.com.triersistemas.provinhamentira;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PessoaFisica extends Pessoa {

	private String cpf;

	public PessoaFisica() {
		this.cpf = super.getDoc();
	}

	public void validarDocumento() {
		String documento = super.getDoc();
		char[] cpf;
		cpf = new char[11];
		BigDecimal[] cpfValido;
		cpfValido = new BigDecimal[11];
		int j = 0;
		List<BigDecimal> cpfCalculo = new ArrayList<>();
		List<BigDecimal> cpfMulti = new ArrayList<>();
		BigDecimal multi = BigDecimal.valueOf(1);
		BigDecimal multi2 = BigDecimal.valueOf(0);
		BigDecimal soma = null;
		BigDecimal DV1 = BigDecimal.valueOf(0);
		BigDecimal DV2 = BigDecimal.valueOf(0);
		
		// conversao para ser ultilizado
		for (int i = 0; i < cpf.length; i++) {
			cpf[i] = documento.toCharArray()[i];

			cpfValido[j] = BigDecimal.valueOf(cpf[i]);
		}
		// preencher lista dos 9 primeiros digitos
		for (int i = 0; i < cpf.length - 2; i++) {
			cpfCalculo.add(cpfValido[i]);
		}
		// multiplcar cpf respectivamente
		for (int i = 0; i < cpfCalculo.size(); i++) {
			BigDecimal resul = multi.multiply(BigDecimal.valueOf(cpfCalculo.indexOf(i)));
			cpfMulti.add(resul);
			multi.add(BigDecimal.valueOf(1));
			
			soma = soma.add(BigDecimal.valueOf(cpfMulti.indexOf(i)));
			
			DV1 = soma.remainder(BigDecimal.valueOf(11));
		}
		
		for (int i = 0; i < cpfCalculo.size(); i++) {
			BigDecimal resul = multi2.multiply(BigDecimal.valueOf(cpfCalculo.indexOf(i)));
			cpfMulti.add(resul);
			multi2.add(BigDecimal.valueOf(1));
			
			soma = soma.add(BigDecimal.valueOf(cpfMulti.indexOf(i)));
			
			DV2 = soma.remainder(BigDecimal.valueOf(11));
		}
		
		

	}

	public String gerarDocumento() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDocumentoFormatado() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	

}
