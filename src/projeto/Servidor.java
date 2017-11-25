package projeto;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author italo
 */
public class Servidor {
    
    public static void main(String[] args) throws IOException{
        Executor exec = Executors.newCachedThreadPool();

        ServerSocket s = new ServerSocket(4444);

        while(true){
            Socket ns = s.accept();
            exec.execute(new Server_Thread(ns));
        }
        //s.close();
    }
    
}




