/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import server.*;

/**
 *
 * @author sadab
 */
public class server {
    public static void main(String[] args) {
        
      
                  try {
            ServerSocket server = new ServerSocket(6000);
            
            System.out.println("Waitting for client");
            
            Socket socket = server.accept();
            System.out.println("Connected to client");
            
            
              InputStreamReader isr = new InputStreamReader(socket.getInputStream());
               BufferedReader reader = new BufferedReader(isr);
               
                  OutputStreamWriter o = new  OutputStreamWriter(socket.getOutputStream());
            BufferedWriter writer = new BufferedWriter(o);
            
            
            
                    try {
                                String line = reader.readLine();
                         line = line.toLowerCase();
               
                     while(line != null){
                   
                   
                   if(line.equals("is there any package avaiable?")){
                       writer.write("Yes Available! Please Check in Check Package site." + "\n");
                       writer.flush();
                       line = reader.readLine();
                   }
                   if(line.equals("can i get your contact number?")){
                       writer.write("it is 22453563" + "\n");
                       writer.flush();
                       line = reader.readLine();
                   }
                    if(line.equals("where is the office located?")){
                       writer.write("In Banani." + "\n");
                       writer.flush();
                       line = reader.readLine();
                   }
                    
                     if(line.equals("how to book packages?")){
                       writer.write("you need to go book package site and book it." + "\n");
                       writer.flush();
                       line = reader.readLine();
                   }
                   
                   
               }
                        socket.close();
                    
                  
           
                     
       
               
               
            
        } catch (Exception e) {
        }
                    
                  }catch(Exception e){
                      
                  }
    
    }
}

