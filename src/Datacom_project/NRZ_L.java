/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datacom_project;


public class NRZ_L {

    String out;

    public NRZ_L(){

        out= "";
    }


    String encode(String str){

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='1')
                out+="+";
            else
                out+="-";
        }

        return out;
    }

    String decode(String str){

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)==43){
                out+="1";
           //     System.out.println("***********************************************");
            }
                
            else{
                out+="0";
           //     System.out.println("----------");
            }
                
        }

        return out;
    }
}
