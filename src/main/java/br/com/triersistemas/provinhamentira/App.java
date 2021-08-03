package br.com.triersistemas.provinhamentira;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	
	public static void validarDocumento() {
		String documento = "03962673270";
		char[] cpf;
		cpf = new char[11];
		BigDecimal[] cpfValido;
		cpfValido = new BigDecimal[11];
		int j = 0;
		List<BigDecimal> cpfCalculo = new ArrayList<>();
		List<BigDecimal> cpfMulti = new ArrayList<>();
		BigDecimal multi = BigDecimal.valueOf(1);
		BigDecimal multi2 = BigDecimal.valueOf(0);
		BigDecimal soma = BigDecimal.valueOf(0);
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
		
		System.out.println(DV1);

	}
	

    public static void main(String[] args) {
       validarDocumento();
    }
}
