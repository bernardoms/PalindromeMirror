package br.bernardo.modal;

public class Utils {
	/* M�todo que vai chamar os outros e em seguida vai printar a classifica��o de cada palavra
	 */
	public void printaMirrorPalindrome(String palavra)
	{
		boolean palindrome;
	    boolean mirror;
		String novaPalavra;
		novaPalavra = this.invertePalavra(palavra);
		palindrome = verificaPalindrome(palavra, novaPalavra);
		mirror = verificaMirror(palavra);
		if(palindrome && !mirror)
		{
			System.out.println(palavra + "-- is a regular palindrome.");
		}
		if(mirror && !palindrome)
		{
			System.out.println(palavra + "-- is a mirrored string.");
		}
		if(palindrome && mirror)
		{
			System.out.println(palavra + " -- is a mirrored palindrome.");
		}
		if(!palindrome && !mirror)
		{
			System.out.println(palavra + " -- is not a palindrome.");
		}
	}
	/* M�todo que vai verificar se uma palavra � palindrome, ele recebe a palavra "normal" e a palavra
	 * invertida de tras para frente e vai verificar se ambas s�o iguais, caso sim, vai retornar verdadeiro
	 */
	public boolean verificaPalindrome(String palavra,String palavraInvertida)
	{
		if(palavra.toUpperCase().equals(palavraInvertida.toUpperCase()))
		{
			return true;
		}
		return false;
	}
	/* M�todo que vai pegar a palavara e mudar os caracteres para os seus reversos e em seguida verificar
	   Em seguida vai verificar se ela � uma String "mirror"
	 */

	public boolean verificaMirror(String palavra)
	{
		//Transforma uma string em um array de caracteres para consultar suas posi��es
		char[] charArray = palavra.toUpperCase().toCharArray();
		String aux = "";
		String auxInvertido;
		for(int i = 0 ; i < charArray.length; i++)
		{		
			if(charArray[i] == 'E')
			{
				
				charArray[i] = '3';
			}
			else if(charArray[i] == '3')
			{
				
				charArray[i] = 'E';
			}
			if(charArray[i] == 'S')
			{
				
				charArray[i] = '2';
			}
			else if(charArray[i] == '2')
			{
				
				charArray[i] = 'S';
			}
			if(charArray[i] == 'J')
			{
				
				charArray[i] = 'L';
			}
			else if(charArray[i] == 'L')
			{
				
				charArray[i] = 'J';
			}
			if(charArray[i] == 'Z')
			{
				
				charArray[i] = '5';
			}
			else if(charArray[i] == '5')
			{
				
				charArray[i] = 'Z';
			}
			aux += charArray[i];
		}
		//Se ler a palavra mirror de de tras para frente for igual a palavra original, ent�o ela � uma String mirror
		auxInvertido = this.invertePalavra(aux);
		if(auxInvertido.toUpperCase().equals(palavra.toUpperCase()))
		{
			return true;
		}
		return false;
	}
	//M�todo usado para a palavra ficar de tras para frente.
	public String invertePalavra(String palavra)
	{
		String novaPalavra = "";
		for(int i = palavra.length() - 1; i >= 0; i--){
			novaPalavra += palavra.charAt(i);
		}
		return novaPalavra;
	}
}
