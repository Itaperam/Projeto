
package projeto;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author italo
 */
public class Server_Thread implements Runnable{
    
    Socket s;
    
    public Server_Thread(Socket ns){
        this.s = ns;
    }
    
    

    @Override
    public void run() {
        
        try {
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            while(true){
                String fromClient = in.readUTF();                
                out.writeUTF(Protocol.processLine(fromClient));

                System.out.println("From Cliente: " + fromClient);

                if(fromClient.equals("bye")){
                    break;
                }
            }
            in.close();
            out.close();
            s.close();
        }catch (Exception e) {

        }
    }
    
}
