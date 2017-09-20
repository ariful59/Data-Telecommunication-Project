/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datacom_project;


public class Manchester{
    String out;
    //Boolean positive;

    public Manchester(){

        out= "";
        //positive=true;
    }


    String encode(String str){

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='1'){
                out+="+-";
            }

            else
                out+="-+";
        }

        return out;
    }

    String decode(String str){

        for(int i=0;i<str.length();i+=2){

            if(str.charAt(i)=='+'){
                out+="1";
            }
            else
                out+="0";
        }

        return out;
    }
}

