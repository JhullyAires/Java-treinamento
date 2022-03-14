package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {
	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		FileWriter fw = new FileWriter("lorem2.txt");
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));  // mais sucinto ainda  // ou
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));  // ou
//		PrintStream ps = new PrintStream("lorem2.txt"); // também usamos quando imprimimos algo para o console // ou
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		ps.println(); // mais alto nível ainda    // para pular linha
		ps.println();
		ps.println();
		ps.println("Sed pellentesque enim vel dictum tempor. Phasellus vulputate");

//		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
//		bw.write(System.lineSeparator());   // para pular linha
//		bw.newLine(); // mais alto nível    // para pular linha
//		bw.write("Sed pellentesque enim vel dictum tempor. Phasellus vulputate");
		
//		bw.close();
		ps.close();
	}
}
