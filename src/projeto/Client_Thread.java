package projeto;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JFrame;
import view.TelaDeCompra;

/**
 *
 * @author italo
 */
public class Client_Thread {

    public static void main(String[] args) throws IOException {

        try {
            // A tela de compras 
            TelaDeCompra tela = new TelaDeCompra();

            JFrame frame = new JFrame("Tela de Compra");

            frame.setContentPane(tela);
            frame.setBounds(0, 0, 1024, 700);
            frame.setResizable(false);
            frame.setVisible(true);

            //Socket do cliente
            Socket s = new Socket("127.0.0.1", 4444);
            //Canais de entrada e sáida
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

            String fromUser;

            while (true) {
                //Captura o que é digitado e joga no canal de saída
                fromUser = stdIn.readLine();
                out.writeUTF(fromUser);

                System.out.println(in.readUTF());
                if (fromUser.equals("bye")) {
                    break;
                }
            }
            in.close();
            out.close();
            s.close();

        } catch (Exception e) {
        }

    }

}
