/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datacom_project;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputClass {
	private FileWriter fwritter;
	FileOutputClass(){
		
	}
	public void setFileName(String filename) throws IOException{
		fwritter = new FileWriter(filename);
	}
	public void writeFile(String writeString) throws IOException{
		fwritter.write(writeString);
	}
	public void closeFile() throws IOException{
		fwritter.flush();
		fwritter.close();
	}
}

