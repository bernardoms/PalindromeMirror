package br.bernardo.modal;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//Pega o diretorio raiz da onde se está executando o codigo
		File projectDir = new File(System.getProperty("user.dir") + "/src/br/bernardo/modal/in.txt");
		FileReader inputStream = new FileReader(projectDir);
		ArrayList<String> palavras = new ArrayList<>();
		 Scanner inFile = new Scanner(inputStream);
		 Utils utils = new Utils();
		 while(inFile.hasNext())
		 {
			 palavras.add(inFile.nextLine());
		 }
		 for(int i = 0;i<palavras.size(); i++)
		 {
			 utils.printaMirrorPalindrome((palavras.get(i)));
		 }
		 inFile.close();
	}

}
