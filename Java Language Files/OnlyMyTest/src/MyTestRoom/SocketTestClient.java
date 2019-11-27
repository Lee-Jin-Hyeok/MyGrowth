package MyTestRoom;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SocketTestClient {
	public static void main(String[] args) throws IOException {
		Socket socket = null;
		InputStream in = null;
		String content = null;
		
		try {
			socket = new Socket("10.156.147.116", 8888);
			
			in = socket.getInputStream();
			
			byte[] buffer = new byte[100];
			in.read(buffer);
			content = new String(buffer);
			
			System.out.println(content);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(socket != null)
				socket.close();
		}
	}
}
