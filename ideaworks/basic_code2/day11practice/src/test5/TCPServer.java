package test5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器已经启动!");
        //创建服务器
        ServerSocket server = new ServerSocket(8080);
        //监听客户端
        Socket socket = server.accept();
        //获取客户端请求数据
        InputStream is = socket.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        //返回客户端数据
        OutputStream os = socket.getOutputStream();
        os.write("收到,谢谢".getBytes());
        //关流
        is.close();
        server.close();
    }
}
