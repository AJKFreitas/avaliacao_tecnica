package com.angelo.gerar.numero;

public class GerarNumero {

	public int gerarNumeroC(int numeroA, int numeroB) {
		int length = 0;
		char[] digitosA = String.valueOf(numeroA).toCharArray();
		char[] digitosB = String.valueOf(numeroB).toCharArray();

		if (digitosA.length >= digitosB.length) {
			length = digitosA.length;
		} else {
			length = digitosB.length;
		}

		StringBuilder numeroC = new StringBuilder();
		for (int i = 0; i < length; i++) {
			if (digitosA.length >= i + 1) {
				numeroC.append(digitosA[i]);
			}
			if (digitosB.length >= i + 1) {
				numeroC.append(digitosB[i]);
			}
		}

		int valorNumeroC = Integer.valueOf(numeroC.toString());
		return valorNumeroC <= 1000000 ?valorNumeroC : -1;
	}
}
