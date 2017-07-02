using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Modal
{
    class Program
    {
        static void Main(string[] args)
        {
            string path = Environment.CurrentDirectory + @"\in.txt";
            Console.WriteLine("EXERICIO DA MODAL ---------- PALINDROME E MIRROR");
            Util util = new Util();
            var lines = System.IO.File.ReadAllLines(path);
            ArrayList palavras = new ArrayList();
            // Display the file contents by using a foreach loop.
            foreach (string line in lines)
            {
                palavras.Add(line);
                // Use a tab to indent each line of the file.    
            }
            for(int i = 0; i<palavras.Count;i++)
            {
                //Console.WriteLine("\t" + palavras[i]);
                util.printaMirrorPalindrome(palavras[i].ToString());
            }
            Console.WriteLine("\nPressione qualquer tecla para Sair.");
            System.Console.ReadKey();
        }
    }
}
