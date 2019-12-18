package demo.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        Socket socket = new Socket("127.0.0.4",2237);

        //创建字节输出流向服务器发送数据
        OutputStream os = socket.getOutputStream();
        os.write("你好,服务器".getBytes());

        //创建字节输入流读取服务器返回的数据
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //关流
        socket.close();

    }
}
