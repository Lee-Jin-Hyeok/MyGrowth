package MyTestRoom;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTest {
	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = null;
		Socket socket = null;
		OutputStream out = null;
		try {
			serversocket = new ServerSocket(8888);
			socket = serversocket.accept();	// 클라이언트의 요청 대기
			out = socket.getOutputStream();
			
			String data = "Welcome to My Server";
			out.write(data.getBytes());
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(serversocket != null)
				serversocket.close();
			if(socket != null)
				socket.close();
		}
	}
}