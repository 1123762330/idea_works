package cn.library;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.util.*;
import java.sql.*;

class BookBrower    implements  ActionListener
{   
   
	JFrame f;
	Container cp;
	JPanel jpS,jpanelWest;
	JButton  jbt1,jbt2;//??????????????????
	JLabel label,L;				//???
	    //?????????
	JTable table;//??????????????з???????
    Object columnName[]={"?????","????","????","????","??????","??????"};
    Object ar[][] =new Object[80][6];
	String sno;
	String count="xx";
	
    BookBrower()
   { 
	f=new JFrame();
	cp=f.getContentPane(); // ???????塢???????????????
	jpS=new JPanel();       
    jpanelWest=new JPanel();
	
	//------------------------------------------------
	jbt1=new JButton("???");   
	jbt2=new JButton("????");
  
	
	//------------------------------------------------
	label=new JLabel("<html><font color=#CC00FF size='4'>??????</font>",SwingConstants.CENTER);
	label.setForeground(Color.blue);
	L=new JLabel("?????????????"+count+"??");
	//------------------------------------------------
    table=new JTable(ar,columnName);//ar?????е??????columnname???????
	JScrollPane scrollpane = new JScrollPane(table);


	//------------------------------------------------
	//????,?????
	
	jpS.add(jbt1);
	
	jpS.add(jbt2);
	
	
	
	JPanel jpanel=new JPanel();
	jpanel.add(label);
	
	
	
	JPanel pp4=new JPanel();
    JPanel jpE=new JPanel();
	
	cp.add(jpanel,"North");
	JPanel jp=new JPanel();
	//jp.add(scrollpane);
	JPanel p=new JPanel();//????????????
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
	int x=screen.width;					/*???????????????*/
	int y=screen.height;					/*???????????????*/
	 f.setSize(400,330);
	 int xcenter=(x-350)/2;
	 int ycenter=(y-330)/2;
     f.setLocation(xcenter,ycenter);/*????????????*/
	  f.setVisible(true);
   //-------------------------------------------------
    jbt1.addActionListener(this);//????????
    jbt2.addActionListener(this);
    
   /* f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		}
		);*/
	}
	//------------------------------------------------
	int i=0;
   public void showRecord()
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
		   }catch(ClassNotFoundException e){System.out.println("???????????????!");}
		try{
			 String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=Book.mdb";//???????????????????????
			 Connection con=DriverManager.getConnection(url);
					
			 String s="select * from book ";
             Statement sql=con.createStatement();
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
				L.setText("?????????????"+count+"??");
				f.repaint();
			
				 con.close();
           }catch(SQLException g)
				{
				 System.out.println("E Code"+g.getErrorCode());
				 System.out.println("E M"+g.getMessage());
			    }
    
	 }
	
 public void actionPerformed(ActionEvent e)
	{  
		
		
		 String cmd=e.getActionCommand();
		  if(cmd.equals("???"))
			 
			   {
         		 f.hide();
				
			  } 
		   
		   if(cmd.equals("????"))
				   f.hide(); 
		         
				
	}
public static void main(String []arg){
		   
		   BookBrower a=new BookBrower();
		   a.showRecord();
}

}
