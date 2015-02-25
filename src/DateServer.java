/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sayed Mahmud Raihan
 */

import java.net.*;
import java.io.*;
        
public class DateServer {
   public static void main(String args[]){
   
    try{
    ServerSocket sock = new ServerSocket(6013);
    while(true){
        Socket client = sock.accept();
        PrintWriter pout = new PrintWriter(client.getOutputStream(),true);
        pout.println(new java.util.Date().toString());
        client.close();
    
    }


    }catch(IOException ioe){

            System.err.println(ioe);
    }
   }
}
