package demo.BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器,并指定端口
        ServerSocket server = new ServerSocket(8080);
        //创建监听器
        Socket socket = server.accept();
        //使用Socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象,读取客户端发送的请求数据
        InputStream is = socket.getInputStream();
        /*int len=0;
        byte[] bytes = new byte[1024];
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }*/

        //把从客户端发送的请求数据转成缓冲流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        //把客户端发送的请求数据第一行读取出来 GET /web/index.html HTTP/1.1
        String line = br.readLine();
        //只要中间部分,把多余的东西切割掉 /web/index.html
        String[] arr = line.split(" ");
        //把路径前边的/去掉,进行截取 web/index.html
        String htmlpath = arr[1].substring(1);

        //创建FileInputStream对象,指定要读取的文件路径
        FileInputStream fis = new FileInputStream(htmlpath);
        //创建输出流OutputStream对象,写入数据返回到客户端
        OutputStream os = socket.getOutputStream();

        // 写入HTTP协议响应头,固定写法
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        // 必须要写入空行,否则浏览器不解析
        os.write("\r\n".getBytes());

        int len=0;
        byte[] bytes = new byte[1024];
        while ((len=fis.read(bytes))!=-1){//读取指定路径文件数据,并写入返回客户端
            os.write(bytes,0,len);
        }
        //关流
        fis.close();
        socket.close();
    }
}
