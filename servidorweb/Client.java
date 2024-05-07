package servidorweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class Client {

    public static void main(String[] args) {
        try {

            Socket server = new Socket("localhost", 8080);
            
            InputStream inputStream = server.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String response = reader.readLine(); 

            System.out.println("Servidor: " + response);

            server.close();

        } catch (IOException e) {

            e.printStackTrace();
        
        }
    }
}
