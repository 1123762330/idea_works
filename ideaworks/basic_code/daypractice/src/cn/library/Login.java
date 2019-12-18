package cn.library;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.util.*;
import java.sql.*;
 
 class Login extends JFrame  implements  ActionListener	
{   Container cp=null;
   JFrame f=null;
   JButton j1,j2;
   JTextField t1;
   JPasswordField t2;
   JLabel jlable1,jlable2;
    Color c;
   JPanel jp1,jp2;
      
	Login(){
		 
		f=new JFrame("С��ͼ�����ϵͳ");
		j1=new JButton("ȷ��");
		j2=new JButton("ȡ��");
		cp=f.getContentPane();
		jlable1=new JLabel(" �����û���");
		jlable2=new JLabel(" �û�����");
		 
		jp1=new JPanel();
		jp2=new JPanel();
		t1=new JTextField(18);
		t2=new JPasswordField(18);
		
        jp1.add(jlable1);
        jp1.add(t1);
        jp1.add(jlable2);
		jp1.add(t2);
        JLabel  JL=new JLabel("<html><font color=#CC00FF size='7'><i>��ӭ��½</i></font>",SwingConstants.CENTER);
	    cp.add(JL,"North");
		jp2.add(j1);
		jp2.add(j2);
	    cp.add(jp1,"Center");
	    cp.add("South",jp2);
		jp1.setBackground(new Color(255,153,255));
	   
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screen=kit.getScreenSize();
		int x=screen.width;					/*ȡ����ʾ�����ڵĿ��*/
		int y=screen.height;					/*ȡ����ʾ�����ڵĸ߶�*/
		//setSize(x,y); /*��ϵͳ����ƽ��������ʾ������*/
 
	 	f.setSize(300,600);			
	    int xcenter=(x-300)/2;
	    int ycenter=(y-300)/2;
	    f.setLocation(xcenter,ycenter);/*��ʾ�ڴ�������*/
	  
	    f.setVisible(true);
   
    //-----------------------------------------------------	 
       j1.addActionListener(this);//ע���¼�������
       j2.addActionListener(this);
       f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		}
		);
	}
    public void confirm()//��֤�û��������Ƿ����
	  {

        try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		   }catch(ClassNotFoundException e){System.out.println("������������ʧ��!");}
		try{
			String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=Book.mdb";//ֱ��ʹ�õ�ǰ��Ŀ¼�µ����ݿ��ļ�
			Connection con=DriverManager.getConnection(url);
			Statement sql=con.createStatement();
			String uname=t1.getText().trim();
			String Mima=t2.getText().trim();
			String queryMima="select * from user where �û���='"+uname+"' and ����='"+Mima+"'";
			ResultSet rs=sql.executeQuery(queryMima);
            if(rs.next())
			{
				new Book(uname);
				f.hide();
		        con.close();
				 
            }else{
				JOptionPane.showMessageDialog(null,"���û�������","��ʾ��", 
					          JOptionPane.YES_NO_OPTION);
				
			    }
              
				t1.setText("");
				t2.setText("");
				
		  } catch(SQLException g)
				{
				System.out.println("E Code"+g.getErrorCode());
				System.out.println("E M"+g.getMessage());
			     }

	   }
    public void actionPerformed(ActionEvent e)
       {
		 String cmd=e.getActionCommand();
		  if(cmd.equals("ȷ��")){
			  confirm();
		  }
		  else if(cmd.equals("ȡ��")){
			  f.dispose();
		  }
	   }

    public static void main(String []arg){
		   
		   Login a=new Login();
     }
}
