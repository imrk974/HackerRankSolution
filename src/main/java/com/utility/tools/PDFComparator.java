package com.utility.tools;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFComparator {

	private static String readFromPDF(String fileName) {
		
		File pdfFile = new File("files//"+ fileName);
		String text = null;
		try {
			PDDocument doc = PDDocument.load(pdfFile);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			text = pdfStripper.getText(doc);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
		
	}
	
	public static void main(String[] args) {
		if(readFromPDF("RAKESH.pdf").equals(readFromPDF("NewsPaper.pdf"))) {
			System.out.println("Files are identical");
		} else {
			System.out.println("Files are not identical");
		}
	}

}
