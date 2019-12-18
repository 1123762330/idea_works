package test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务已经启动!");
        //创建一个服务器,并指定和客户端一致的端口号
        ServerSocket server = new ServerSocket(2238);
        while (true) {
            //调用accept方法,监听客户端对象
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //获取客户端发送过来的数据,写入到指定的路径下
                        InputStream fis = socket.getInputStream();
                        //判断文件夹是否存在,不存在就创建
                        File file = new File("day11practice\\src\\test3\\upload");
                        file.mkdirs();
                        //优化三,文件命名规则
                        String fileName = System.currentTimeMillis() +new Random().nextInt(9999)+ ".jpg";
                        FileOutputStream fos = new FileOutputStream(file + "\\"+fileName);//创建FileOutputStream,读取数据并写入指定路径下
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes)) != -1) {
                            //将读取到的数据写入到新文件中
                            fos.write(bytes, 0, len);
                        }

                        //创建服务器getOutputStream流,写入返回数据返回到客户端
                        OutputStream os = socket.getOutputStream();
                        os.write("上传成功".getBytes());

                        //关流
                        fos.close();//关闭Write流
                        fis.close();//关闭读取客户端数据流
                        socket.close();//关闭客户端监听

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
