/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datacom_project;

public class Save_input {
  public static Integer SAVE_INPUT_NUMBER;
	public static Integer SAVE_MODE; //1 for Sender. 2 for Receiver
	public static Integer SAVE_DATALINK_SCHEME; // 0 for Hamming Distance . 1 for CRC
	public static Integer SAVE_DATALINK_PROTOCOL; //0 for GO BACK N . 1 for Selective Repeat
	public static Integer SAVE_BLOCK_CODING; //0 for 4B/5B
	public static Integer SAVE_PHYSICALLINK; //0 = NRZ-L , 1 = NRZ-I , 2 = RZ , 3 = Manchester , 4 = Differential Manchaster , 5 = MLT-3 , 6 =4B/5B , 7 = 8B/10B  
}
