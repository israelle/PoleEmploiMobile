package com.example.dadan.poleemploimobile;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by dadan on 17/05/2018.
 */

public class Client  {
    private Socket s = null;
    private String address = "172.20.10.13";
    private int port = 8181;


   public void connection() {

            System.out.println("begin connection ! ");
           new Thread(new ClientThread()).start();

   }

    public void getSocket () {
        System.out.println(s.isConnected());
    }

    class ClientThread implements Runnable {
        @Override
        public void run() {
            try {
                InetAddress serverAddr = InetAddress.getByName(address);
                s = new Socket(serverAddr, port);
                System.out.print(s.isConnected() + " connection established !");
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String data = "";
                while (!br.ready()) {
                    br.readLine();
                    data  =  br.readLine();
                    Log.v("hello" , data);
                }

            } catch (UnknownHostException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }



}
