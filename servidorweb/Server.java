package servidorweb;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Servidor iniciado na porta 8080");
        
        Socket client = server.accept();        
        
        PrintStream saida = new PrintStream(client.getOutputStream());

        saida.println("Hello");

        System.out.println("Hello client!");

        saida.println("Server: Server fechado");
        System.out.println("Server fechado");
        server.close();
    }
}
