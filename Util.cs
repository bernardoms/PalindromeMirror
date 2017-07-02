using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Modal
{
    class Util
    {
        public String invertePalavra(String palavra)
        {
            String novaPalavra = "";
            char[] aux;
            aux = palavra.ToCharArray(0, palavra.Length);
            for (int i = palavra.Length - 1; i >= 0; i--)
            {
                novaPalavra += aux[i].ToString();
            }
            //Console.Write("\n" + novaPalavra);
            return novaPalavra;
        }

        public bool verificaMirror(String palavra)
        {
            //Transforma uma string em um array de caracteres para consultar suas posições
            char[] charArray = palavra.ToUpper().ToCharArray();
            String aux = "";
            String auxInvertido;
            for (int i = 0; i < charArray.Length; i++)
            {
                if (charArray[i] == 'E')
                {

                    charArray[i] = '3';
                }
                else if (charArray[i] == '3')
                {

                    charArray[i] = 'E';
                }
                if (charArray[i] == 'S')
                {

                    charArray[i] = '2';
                }
                else if (charArray[i] == '2')
                {

                    charArray[i] = 'S';
                }
                if (charArray[i] == 'J')
                {

                    charArray[i] = 'L';
                }
                else if (charArray[i] == 'L')
                {

                    charArray[i] = 'J';
                }
                if (charArray[i] == 'Z')
                {

                    charArray[i] = '5';
                }
                else if (charArray[i] == '5')
                {

                    charArray[i] = 'Z';
                }
                aux += charArray[i];
            }
            //Se ler a palavra mirror de de tras para frente for igual a palavra original, então ela é uma String mirror
            auxInvertido = this.invertePalavra(aux);
            if (auxInvertido.ToUpper().Equals(palavra.ToUpper()))
            {
                return true;
            }
            return false;
        }
        public bool verificaPalindrome(String palavra, String palavraInvertida)
        {
            if (palavra.ToUpper().Equals(palavraInvertida.ToUpper()))
            {
                return true;
            }
            return false;
        }
        public void printaMirrorPalindrome(String palavra)
        {
            bool palindrome;
            bool mirror;
            String novaPalavra;
            novaPalavra = this.invertePalavra(palavra);
            palindrome = verificaPalindrome(palavra, novaPalavra);
            mirror = verificaMirror(palavra);
            if (palindrome && !mirror)
            {
                Console.WriteLine(palavra + "-- is a regular palindrome.");
            }
            if (mirror && !palindrome)
            {
                Console.WriteLine(palavra + "-- is a mirrored string.");
            }
            if (palindrome && mirror)
            {
                Console.WriteLine(palavra + " -- is a mirrored palindrome.");
            }
            if (!palindrome && !mirror)
            {
                Console.WriteLine(palavra + " -- is not a palindrome.");
            }
        }
    }

}
