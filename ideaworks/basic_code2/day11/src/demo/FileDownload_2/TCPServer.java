package demo.FileDownload_2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器已经启动");
        //创建一个服务器,并指定和客户端一致的端口号
        ServerSocket server = new ServerSocket(2236);
        //优化:一,让服务器一直处于运行
        //     二,运用多线程技术
        //     三,文件名字可以变化了
        while (true) {
            //调用accept方法,监听客户端对象
            Socket socket = server.accept();
            //运用多线程技术
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //获取客户端发送过来的数据,写入到指定的路径下
                        InputStream fis = socket.getInputStream();
                        //判断文件夹是否存在,不存在就创建
                        File file = new File("day11\\src\\demo\\FileDownload_2\\upload");
                        file.mkdirs();
                        //优化三,文件命名规则
                        String fileName = System.currentTimeMillis() +new Random().nextInt(9999)+ ".txt";
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
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
        }
    }
}
