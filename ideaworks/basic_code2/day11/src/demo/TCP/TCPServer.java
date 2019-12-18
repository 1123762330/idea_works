package demo.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket server = new ServerSocket(2237);
        //调用监听方法
        Socket socket = server.accept();

        //创建字节输入流读取客服发送的数据
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));

        //创建输出流写入返回客户端的数据
        OutputStream os = socket.getOutputStream();
        os.write("收到,谢谢".getBytes());
        //关流
        socket.close();
        server.close();
    }
}
