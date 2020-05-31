package com.unaj.lescano.flujo.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class FlujoIO {
	
	public static void main(String[] args) throws TransformerException {

		// Ejercicio - 1

		System.out.println("Hola mundo escrbe algo");
		String teclado = new Scanner(System.in).nextLine();
		System.out.println(teclado);
		
		//Ejercicio - 2
		
		System.err.println(teclado);
		
		//Ejercicio - 3 y 4
		FileWriter  flwriter =null;
		try {
			File doc = new File("C:\\ArchivoTemporal");
			if(!doc.exists())
				doc.mkdir();
			
			File txt = new  File("C:\\ArchivoTemporal\\java-web.txt");
			
			if(!txt.exists())
				txt.createNewFile();
			
		 flwriter = new FileWriter("C:\\EjemploTemporal\\java.txt");
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			bfwriter.write(teclado);
			bfwriter.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		//Ejercicio -5
		
		Hilo myHilo = new Hilo(teclado, teclado);
		myHilo.run();
		
		
		//Ejercicio - 6
		
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("header");
			doc.appendChild(rootElement);
			
			Element line = doc.createElement("line");
			rootElement.appendChild(line);
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("C:\\archivo.xml"));
			
			transformer.transform(source, result);

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
