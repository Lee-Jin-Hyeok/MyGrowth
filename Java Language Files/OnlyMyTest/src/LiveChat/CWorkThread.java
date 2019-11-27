package LiveChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CWorkThread extends Thread {
	private Socket socket = null;
	private BufferedReader br = null;
	private PrintWriter writer = null;
	String message = null;
	
	@Override
	public void run() {
		super.run();
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			writer = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				message = br.readLine();
				
				if(message.equals("exit"))
					break;
				
				writer.println(message);
				writer.flush();
			}
			
			writer.close();
			br.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
}
