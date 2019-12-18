package cn.library;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.util.*;
import java.sql.*;

class RemoveBook    implements  ActionListener
{   
   
	JFrame f;
	Container cp;
	JPanel jpS,jpanelWest;
	JButton  jbt1,jbt2,jbt3;//��ť����ѯ��ȡ�����޸�
	JLabel label,L;				//��ǩ��������ѧ��
	JTextField tf;    //�����ı���
	JTable table;//�����������ݿ��з��ص���Ϣ
    Object columnName[]={"ͼ����","ͼ���","����","����","������","���ʱ��"};
    Object ar[][] =new Object[80][6];
	String sno;
	String count="xx";
	
    RemoveBook()
   { 
	f=new JFrame();
	cp=f.getContentPane(); // ��ʼ����塢��ť����ǩ���ı���
	jpS=new JPanel();       
    jpanelWest=new JPanel();
	
	//------------------------------------------------
	jbt1=new JButton("��ѯ");   
	jbt2=new JButton("ȡ��");
    jbt3=new JButton("ɾ��");
	
	//------------------------------------------------
	label=new JLabel("<html><font color=#CC00FF size='4'>������Ҫɾ����ͼ������</font>",SwingConstants.CENTER);
	label.setForeground(Color.blue);
	L=new JLabel("����ͼ�鹲��"+count+"��");
	//------------------------------------------------
    table=new JTable(ar,columnName);//ar��ű��е����ݣ�columnname��ʾ����
	JScrollPane scrollpane = new JScrollPane(table);


	//------------------------------------------------
	tf=new JTextField(18);
    
	//------------------------------------------------
	
	//------------------------------------------------
	//����,��ӿؼ�
	
	jpS.add(jbt1);
	
	jpS.add(jbt2);
	jpS.add(jbt3);
	
	
	JPanel jpanel=new JPanel();
	jpanel.add(label);
	jpanel.add(tf);
	
	
	JPanel pp4=new JPanel();
    JPanel jpE=new JPanel();
	
	cp.add(jpanel,"North");
	JPanel jp=new JPanel();
	//jp.add(scrollpane);
	JPanel p=new JPanel();//������������
	p.setLayout(new BorderLayout());
	
	p.add(L,"North");
	p.add(scrollpane);
   
	cp.add(pp4,"West");
	cp.add(p,"Center");
    cp.add(jpS,"South");
	 
	cp.add(jpE,"East");
	
	//------------------------------------------------
     Toolkit kit=Toolkit.getDefaultToolkit();
	Dimension screen=kit.getScreenSize();
	int x=screen.width;					/*ȡ����ʾ�����ڵĿ��*/
	int y=screen.height;					/*ȡ����ʾ�����ڵĸ߶�*/
	f.setSize(400,330);
	 int xcenter=(x-350)/2;
	 int ycenter=(y-330)/2;
	 f.setLocation(xcenter,ycenter);/*��ʾ�ڴ�������*/
	 f.setVisible(true);
   //-------------------------------------------------
    jbt1.addActionListener(this);//ע�������
    jbt2.addActionListener(this);
    jbt3.addActionListener(this);
    
    /*f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		}
		);*/
	}
	//------------------------------------------------
	int i=0;
   public void showRecord(String ql)
	{ 
		while(i>=0)
			{	
			ar[i][0]="";
			ar[i][1]="";
			ar[i][2]="";
			ar[i][3]="";
			ar[i][4]="";
			ar[i][5]="";
			i--;
			}
			i=0;


        try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		   }catch(ClassNotFoundException e){System.out.println("������������ʧ��!");}
		try{
			 String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=Book.mdb";//ֱ��ʹ�õ�ǰ��Ŀ¼�µ����ݿ��ļ�
			 Connection con=DriverManager.getConnection(url);
			 Statement sql;		
			 String s="select * from book  where ͼ���� ='"+ql +"'";
              sql=con.createStatement();
			  ResultSet rs=sql.executeQuery(s);
			  
            
			 while(rs.next())
	          {
			    String bname=rs.getString(1);
				String bno=rs.getString(2);
				String price=rs.getString(3);
				String writer=rs.getString(4);
				String publish=rs.getString(5);
				String indate=rs.getString(6);
				ar[i][0]=bname;
				ar[i][1]=bno;
				ar[i][2]=price;
				ar[i][3]=writer;
				ar[i][4]=publish;
				ar[i][5]=indate;
				i++;
			  }
			    count=""+i+"";
				
				L.setText("����ͼ�鹲��"+count+"��");
				
				f.repaint();
			
				 con.close();System.out.println(ar[0][1]);
           }catch(SQLException g)
				{
				 System.out.println("E Code"+g.getErrorCode());
				 System.out.println("E M"+g.getMessage());
			    }
    
	  

	}
	

   public void deleteRecord(int index)
	{ 
          
        try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		   }catch(ClassNotFoundException e){System.out.println("������������ʧ��!");}
		try{
			String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=Book.mdb";//ֱ��ʹ�õ�ǰ��Ŀ¼�µ����ݿ��ļ�
			Connection con=DriverManager.getConnection(url);
			Statement sql;		
			String ql=(String)(ar[index][1]);
			String s="delete * from book  where ͼ��� ='"+ql +"'";
            sql=con.createStatement();
			 int del=sql.executeUpdate(s);
			  if(del==1)
	             {JOptionPane.showMessageDialog(null,"ɾ���ɹ���",
					 "��Ϣ", JOptionPane.YES_NO_OPTION);
				 }
				 con.close();
				f.repaint();
            }catch(SQLException g)
				{
				System.out.println("E Code"+g.getErrorCode());
				System.out.println("E M"+g.getMessage());
			     }
    
	  

	}

  public void actionPerformed(ActionEvent e)
	{  
		String remember="";
		String ql="";
		 String cmd=e.getActionCommand();
		  if(cmd.equals("��ѯ"))
			 
			   {
         		 ql=tf.getText().trim();
				remember=ql;
			    showRecord(ql);
				
			  } 
		   if(cmd.equals("ɾ��"))
		    { 
			   int index=table.getSelectedRow();
			   if( index==-1)
				 JOptionPane.showMessageDialog(null,"��ѡ��Ҫɾ���ı����",
					 "�������", JOptionPane.YES_NO_OPTION);

			   else{
				   deleteRecord(index);
			      //showRecord(remember);
			     }
		     }
		   if(cmd.equals("ȡ��"))
				   f.hide(); 
		         
				
	}
public static void main(String []arg){
		   
		   RemoveBook a=new RemoveBook();
}

}
