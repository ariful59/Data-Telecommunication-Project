/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datacom_project;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SendSocket {
	private Socket socket;
	private DataOutputStream dOut;
	SendSocket() throws UnknownHostException, IOException{
		socket = new Socket("192.168.43.84",1234);
		dOut = new DataOutputStream(socket.getOutputStream());
	}
	public void Send(String str) throws IOException{
		if(str.equals("*"))dOut.writeInt(-1);
		else {
			dOut.writeInt(str.length());
			dOut.writeBytes(str);
		}
	}
	public void Close() throws IOException{
		dOut.flush();
		socket.close();
		dOut.close();
	}
}
