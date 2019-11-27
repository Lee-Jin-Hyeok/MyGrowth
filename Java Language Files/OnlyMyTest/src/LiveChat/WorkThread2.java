package LiveChat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class WorkThread2 extends Thread {
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
				 
				 if(message == null) {
					 System.out.println("������ ��Ű��� ä���� �Ⱦ��ؼ� Ż���߽��ϴ�.");
					 break;
				 } else {
					 System.out.println("���� : " + message);
				 }
			 }
			 
			 br.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
}
