package cn.library;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.util.*;
import java.sql.*;
import javax.swing.text.JTextComponent;

 //extends JFrame
class BookIn   implements  ActionListener
{   
   
	JFrame f3;
	Container cp;
	JPanel jp1,jp2,jp3,jp4,jp,jpanelWest;
	JButton  jbt1,jbt2;//��ť:ȷ����ȡ����
	JLabel label;				//��ǩ
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;    //�����ı���
	JLabel label1,label2,label3,label4;
	String sno;
    BookIn()
   { 
	f3=new JFrame();
	cp=f3.getContentPane(); // ��ʼ����塢��ť����ǩ���ı���
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
	label=new JLabel("<html><font color=#CC00FF size='4'>ͼ�����</font>",SwingConstants.CENTER);
	label.setForeground(Color.blue);
	
    
	
    
	//------------------------------------------------
	tf1=new JTextField(20);
	tf2=new JTextField(20);
	tf3=new JTextField(20);
	tf4=new JTextField(20);
	tf5=new JTextField(20);
    tf6=new JTextField(20);
	//------------------------------------------------
	//����,��ӿؼ�
	
	jp1.add(jbt1);
	jp1.add(jbt2);
	
	
	sno=tf4.getText();
	
	jp1.add(new JLabel("����"+sno+"��ӭ��½ѧ����Ϣϵͳ"));
	
	JPanel jpanel=new JPanel();
	jpanel.add(label);
	
	
	JPanel pp4=new JPanel();
    JPanel jpane4=new JPanel();
	
	cp.add(jpanel,"North");
	JPanel pp2=new JPanel(new GridLayout(6,1));
	JPanel pp3=new JPanel();
	pp4.setLayout(new GridLayout(6,1));
	pp4.add(new JLabel("ͼ����",SwingConstants.CENTER));
	
	pp2.add(tf1);
	pp4.add(new JLabel("ͼ���",SwingConstants.CENTER));
	pp2.add(tf2);
	pp4.add(new JLabel("��  ��",SwingConstants.CENTER));
	pp2.add(tf3);
	pp4.add(new JLabel("��  ��",SwingConstants.CENTER));
	pp2.add(tf4);
	pp4.add(new JLabel("������",SwingConstants.CENTER));
	pp2.add(tf5);
	pp4.add(new JLabel("���ʱ��",SwingConstants.CENTER));
	pp2.add(tf6);
	pp3.add(jbt1);

	pp3.add(jbt2);
  
   
	cp.add(pp4,"West");
	cp.add(pp2,"Center");
    cp.add(pp3,"South");
	 
	cp.add(jpane4,"East");
	
	//------------------------------------------------
     Toolkit kit=Toolkit.getDefaultToolkit();
	Dimension screen=kit.getScreenSize();
	int x=screen.width;					/*ȡ����ʾ�����ڵĿ��*/
	int y=screen.height;					/*ȡ����ʾ�����ڵĸ߶�*/
	f3.setSize(350,330);
	 int xcenter=(x-350)/2;
	 int ycenter=(y-330)/2;
	 f3.setLocation(xcenter,ycenter);/*��ʾ�ڴ�������*/
	 f3.setVisible(true);
   //-------------------------------------------------
    jbt1.addActionListener(this);//ע�������
    jbt2.addActionListener(this);
    
    
    /*f3.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		}
		);*/
	}
	//------------------------------------------------
   public void insertRecord()
	{ 
      if(tf1.getText().equals("")||tf2.getText().equals("")||tf3.getText().equals("")||
		  tf4.getText().equals("")||tf5.getText().equals("")||tf6.getText().equals(""))
		{
		JOptionPane.showMessageDialog(f3,"����дͼ������");
		return;
		}

        try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		   }catch(ClassNotFoundException e){System.out.println("������������ʧ��!");}
		try{
			String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=Book.mdb";//ֱ��ʹ�õ�ǰ��Ŀ¼�µ����ݿ��ļ�
			Connection con=DriverManager.getConnection(url);
			Statement sql;		
			
			String s="insert into book  values('"+tf1.getText()+"','"+tf2.getText()+"','"+
				tf3.getText()+"','"+tf4.getText()+"','"+tf5.getText()+"','"+tf6.getText()+"');";
			
			//��ѯ�����ͼ����Ƿ������ݿ��д���
            String query="select * from book where ͼ���='"+tf2.getText()+"'";
			sql=con.createStatement();      
			ResultSet rs=sql.executeQuery(query);//���ز�ѯ�����
			boolean moreRecords=rs.next();//�жϽ�����Ƿ�������
			  if(moreRecords)
			     {
				 JOptionPane.showMessageDialog(f3,"ͼ����Ѿ���ʹ�ã�����������");
				 con.close();
				 tf2.setText("");
				 return;
			     }
				
				int insert=sql.executeUpdate(s);
			 if(insert==1)
			    {
				JOptionPane.showMessageDialog(null,"ͼ����Ϣ¼��ɹ���");
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				tf6.setText("");
			   }
            }catch(SQLException g)
				{
				System.out.println("E Code"+g.getErrorCode());
				System.out.println("E M"+g.getMessage());
			     }
    
	  

	}
	

   public void actionPerformed(ActionEvent e)
	{  
		 String cmd=e.getActionCommand();
		    if(cmd.equals("ȷ��"))
			   {
			      insertRecord();
				
			    } 
					
			 else if(cmd.equals("ȡ��"))
				   f3.hide();
		         
	}
   public static void main(String []arg){
		   
		   BookIn a=new BookIn();
    }

}
