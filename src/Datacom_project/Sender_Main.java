/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datacom_project;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Sender_Main{
	Sender_Main(String file) throws IOException{
		FileInputClass inp = new FileInputClass();
		FileOutputClass otp = new FileOutputClass();
		BinaryConverter cnv = new BinaryConverter();	
		inp.setFileName(file);
		//otp.setFileName("Files/Temp_File/temp.txt");
		Save_input.SAVE_INPUT_NUMBER = 0;
		SendSocket sending = new SendSocket();
		
		Sender_head sndr = new Sender_head();
		while(!inp.isEOF()){
			String str = inp.takeInput(150);
			for(int i=str.length();i<150;i++)str+=" ";
			str = cnv.toBinary(str);
			str = sndr.getSender(str);
			//System.out.println("sender length : " + str.length());
			Save_input.SAVE_INPUT_NUMBER = Math.max(Save_input.SAVE_INPUT_NUMBER, str.length());
			//otp.writeFile(str);
                       //System.out.println(str);
			sending.Send(str);
		}
		sending.Send("*");
                //System.out.println("xea");
		sending.Close();
		//System.out.println("CLOSED Sender");
		//System.out.println(Save_input.SAVE_INPUT_NUMBER)
	}
}

