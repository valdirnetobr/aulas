programa
{ inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
	real radicando,resultado,quadrado
	
		escreva ("digite o valor")
		leia (radicando)
		quadrado = radicando*radicando
	 resultado = mat.raiz(radicando, 2)
	 escreva("a raiz quadrada é " + resultado + " e o quadrado é " + quadrado)
	 
	 
	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */