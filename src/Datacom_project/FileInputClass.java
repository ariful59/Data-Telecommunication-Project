/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datacom_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputClass {
	private String outputString;
	private FileInputStream freader;
	private boolean EOFocc;
	public int inputPossible;
	FileInputClass(){
		
	}
	public void setFileName(String FileName) throws FileNotFoundException{
		freader = new FileInputStream(FileName);
		EOFocc = false;
	}
	public String takeInput(int numberOfTimes) throws IOException{
		outputString = "";
		inputPossible = 0;
		for(int i=0;i<numberOfTimes && freader.available()>0;i++){
			char ch = (char)freader.read();
			outputString+=ch;
			inputPossible++;
		}
		if(freader.available()<=0)EOFocc=true;
		return outputString;
	}
	
	public boolean isEOF(){
		return EOFocc;
	}
}

