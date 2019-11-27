package LiveChat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class CWorkThread2 extends Thread {
	private Socket socket = null;
	BufferedReader br = null;
	String message = null;
	
	@Override
	public void run() {
		super.run();
		
		try {
			 br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 
			 while(true) {
				 message = br.readLine();
				 System.out.println("���� : " + message);
			 }
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
}