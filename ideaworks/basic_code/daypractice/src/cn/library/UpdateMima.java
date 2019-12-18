package cn.library;
import java.net.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

class UpdateMima extends JFrame implements ActionListener
{   
   
	JFrame f;
	Container cp;
	JPanel jp1,jp2,jp3,jp4,jp,jpanelWest;
	JButton  jbt1,jbt2;//��ť��ȷ����ȡ��
	JLabel label;				//��ǩ���޸�����
	JTextField name;
    JPasswordField tf1,tf2,tf3;    //�����ı���
	JLabel label1,label2,label3,label4;
	String sno;
	UpdateMima(){}
    UpdateMima(String username)
   { 
	sno=username;
	f=new JFrame();
	cp=f.getContentPane(); // ��ʼ��
	jp1=new JPanel();       
	jp2=new JPanel();
	jp3=new JPanel();
	jp4=new JPanel();
	jpanelWest=new JPanel();
	jp=new JPanel();
	//------------------------------------------------
	jbt1=new JButton("ȷ��");   
	jbt2=new JButton("ȡ��");
	
	
	//------------------------------------------------
	label=new JLabel("<html><font color=#CC00FF size='4'>�޸�����</font>",SwingConstants.CENTER);
	label.setForeground(Color.blue);
	label.setFont(new Font("BOLD",Font.BOLD,15));
	name=new JTextField(20);
    //name.setEditable(false);
	
    
	//------------------------------------------------
	tf1=new JPasswordField(20);
	tf2=new JPasswordField(20);
	tf3=new JPasswordField(20);
	
	//------------------------------------------------
	//����,��ӿؼ�

	jp1.add(jbt1);
	jp1.add(jbt2);
	
	jp1.add(new JLabel("����"+"xx"+"��ӭ��½ѧ����Ϣϵͳ"));
	
	JPanel jpanel=new JPanel();
	jpanel.add(label);
	
	JPanel pp4=new JPanel();
    JPanel jpane4=new JPanel();
	
	cp.add(jpanel,"North");
	JPanel pp2=new JPanel(new GridLayout(6,1));
	JPanel pp3=new JPanel();
	pp4.setLayout(new GridLayout(6,1));
	pp4.add(new JLabel("�û���: ",SwingConstants.RIGHT));
	pp2.add(name);
	pp4.add(new JLabel("ԭ����: ",SwingConstants.RIGHT));
	
	pp2.add(tf1);
	pp4.add(new JLabel(" ������: ",SwingConstants.RIGHT));
	pp2.add(tf2); 
	pp4.add(new JLabel("ȷ������: ",SwingConstants.RIGHT));
	pp2.add(tf3);
	pp2.add(new JLabel());
    JPanel jpbutton=new JPanel();
	jpbutton.add(jbt1);
	jpbutton.add(jbt2);
	pp2.add(jpbutton);
   
	
	//pp3.add(jbt1);

	//pp3.add(jbt2);
   
	cp.add(pp4,"West");
	cp.add(pp2,"Center");
    //cp.add(pp3,"South");
	 
	cp.add(jpane4,"East");
	
	//------------------------------------------------
      Toolkit kit=Toolkit.getDefaultToolkit();
	 Dimension screen=kit.getScreenSize();
	 int x=screen.width;					/*ȡ����ʾ�����ڵĿ��*/
	 int y=screen.height;
	 f.setSize(350,330);					/*ȡ����ʾ�����ڵĸ߶�*/
	 int xcenter=(x-350)/2;
	 int ycenter=(y-330)/2;
	 f.setLocation(xcenter,ycenter);/*��ʾ�ڴ�������*/
	 //f.setTitle("�޸�����");
	 f.setVisible(true);
   
   //-------------------------------------------------
    jbt1.addActionListener(this);//ע�������
    jbt2.addActionListener(this);
   
    /*f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		}
		);*/
	}
	public void updateM()
	{

        try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		   }catch(ClassNotFoundException e){System.out.println("������������ʧ��!");}
		try{
			String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=Book.mdb";//ֱ��ʹ�õ�ǰ��Ŀ¼�µ����ݿ��ļ�
			Connection con=DriverManager.getConnection(url);
			Statement sql=con.createStatement();
			String uname=name.getText().trim();
			String queryMima="select * from user where �û���='"+uname+"'";
			ResultSet rs=sql.executeQuery(queryMima);
            if(rs.next())
			{
				
		        String newMima=tf2.getText().trim();
                String s="update user set ����='"+newMima+"' where �û��� ='"+uname +"'";
                sql=con.createStatement();
			    int updateMima=sql.executeUpdate(s);
			    if(updateMima==1)
	             {
				  JOptionPane.showMessageDialog(f,"�����޸ĳɹ���");
				  
				 }
				 con.close();
				 f.repaint();
            }else{
				JOptionPane.showMessageDialog(null,"���û�������","���棡", 
					          JOptionPane.YES_NO_OPTION);
				
			    }
               name.setText("");
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
		  } catch(SQLException g)
				{
				System.out.println("E Code"+g.getErrorCode());
				System.out.println("E M"+g.getMessage());
			     }

	}

	//------------------------------------------------
	public void actionPerformed(ActionEvent e)
	{
		String cmd=e.getActionCommand();
		    if(cmd.equals("ȷ��"))
			 {
				 if(name.getText().equals("")||tf1.getText().equals("")||tf2.getText().equals("")||tf3.getText().equals(""))
		          {
                   JOptionPane.showMessageDialog(null,"����д�û���������Ϣ","��ʾ", 
					          JOptionPane.YES_NO_OPTION);
		           return;
		          }
				
                  if(tf2.getText().trim().equals(tf3.getText().trim()))
                      updateM();
		         
			  } 
			else if(cmd.equals("ȡ��"))
				   f.hide();
	}

   public static void main(String[]args)
	 {
	  new UpdateMima("");
	 }
}
