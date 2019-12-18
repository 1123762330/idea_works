package demo.FileDownload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.首先创建字节输入流,并指定数据源
        FileInputStream fis = new FileInputStream("day11\\src\\demo\\FileDownload\\1.txt");
        //2.创建客户端
        Socket socket = new Socket("127.0.0.1",2233);
        //3.创建字节输出流,并读取写入数据
        OutputStream fos = socket.getOutputStream();
        int len=0;
        byte[] bytes = new byte[1024];
        while ((len=fis.read(bytes))!=-1) {
            fos.write(bytes, 0, len);
        }
        //告知服务器,文件读取完毕
        socket.shutdownOutput();

        //读取服务器返回的数据
        InputStream is = socket.getInputStream();
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        //关流
        fis.close();//关闭读取文件流
        socket.close();//关闭客户端

    }
}
