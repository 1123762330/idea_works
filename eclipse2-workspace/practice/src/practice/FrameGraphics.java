package practice;
import java.awt.*;
import javax.swing.*;
public class FrameGraphics{
	public static void main(String[] args){
		new  PaintFrame();
		
	}
}

class PaintFrame extends JFrame{
	public PaintFrame(){
		super("graphics");
		Container cp=this.getContentPane();
		JPanel panel=(JPanel)cp;   //
		panel.setOpaque(false);   //将内容面板设置为透明色
		cp.setBackground(Color.PINK);
		JTextField jt=new JTextField();
		JButton jb=new JButton("4567");
		jt.setBackground(Color.YELLOW);
		cp.add(jt,BorderLayout.SOUTH);
		cp.add(jb,BorderLayout.NORTH);
		setSize(400,400);
		setVisible(true);
		
	}
	public void paint(Graphics g){
		super.paint(g);   //在重写此方法时应该调用 super.paint(g) 方法
	    Color c=g.getColor();
		g.setColor(Color.red);
		g.fillOval(50,50,30,30);
		g.setColor(Color.blue);
		g.drawOval(100,100,20,20);
		g.setColor(c);
	}
}