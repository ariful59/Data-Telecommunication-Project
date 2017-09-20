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

public class ReceiverMain{
	ReceiverMain(String file) throws IOException{
		FileInputClass fin = new FileInputClass();
		FileOutputClass fout = new FileOutputClass();
		//fin.setFileName("Files/Temp_File/temp.txt");
		fout.setFileName(file);
		Receiver_head rcvr = new Receiver_head();
		int count = 0;
		String str="";
		ReceiveSocket receiving = new ReceiveSocket();
		receiving.Start();
		while(!receiving.isEOF()){
			str = "";
			//str = fin.takeInput(2390);
			while(!receiving.isEOF()){
				str = receiving.getString();
				if(str.length()>0)break;
			}
			count = str.length();
			//System.out.println("receiver Received: " +count);
			if(count >0){
				count = 0;
				str = rcvr.getReceiver(str);
				System.out.println(str);
				fout.writeFile(str);
			}
		}
		if(count !=0){
			str = rcvr.getReceiver(str);
			fout.writeFile(str);
			count = 0;
		}
		System.out.println("receiver finished");
		fout.closeFile();
		receiving.Close();
	}
}

