package test5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建客户端,并给定IP地址和端口
        Socket socket = new Socket("localhost", 8080);
        //向服务器发送数据
        OutputStream os = socket.getOutputStream();
        os.write("hello.服务器,我是客户端".getBytes());
        socket.shutdownOutput();//这里记得告诉服务器,文件读取完毕,shutdownOutput

        //读取服务器返回的数据
        InputStream is = socket.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        //关流
        os.close();
        is.close();
    }
}
