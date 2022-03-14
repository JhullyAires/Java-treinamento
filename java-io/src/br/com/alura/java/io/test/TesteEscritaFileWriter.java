package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {
	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));  // mais sucinto ainda

		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		bw.write(System.lineSeparator());   // para pular linha
		bw.newLine(); // mais alto nível    // para pular linha
		bw.write("Sed pellentesque enim vel dictum tempor. Phasellus vulputate");
		
		bw.close();
	}
}
