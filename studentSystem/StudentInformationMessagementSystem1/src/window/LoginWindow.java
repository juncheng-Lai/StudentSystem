package window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginWindow extends JFrame{
	JPanel pan0 = new JPanel();
	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel putTitle = new JPanel();
	JPanel putName = new JPanel();
	JPanel putPassword = new JPanel();
	JPanel putButton = new JPanel();
	
	JLabel title = new JLabel("                欢迎登陆本系统                ");
	JLabel name = new JLabel("用户名");
	JLabel password = new JLabel("  密  码");
	
	TextField tf_name = new TextField(20);
	JPasswordField jpf_password = new JPasswordField(14);
	
	JButton b_log = new JButton("登陆");
	JButton b_exit = new JButton("退出");
	
	public LoginWindow() {
		setTitle("学生信息管理系统登陆界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200,200);
		setVisible(true);
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(7,1));
		setPutTitle();
		setPutName();
		setPutPassword();
		setPutButton();
		setPanel(con);
		pack();
		
	}
	
//	设置标题
	public void setPutTitle() {
		title.setFont(new Font("宋体",Font.BOLD,20));
		putTitle.add(title);
	}
	
//	设置用户名区域
	public void setPutName() {
		putName.add(name);
		tf_name.setText("请在此处输入用户名");
		putName.add(tf_name);
	}
	
//	设置密码输入区域
	public void setPutPassword() {
		putPassword.add(password);
		jpf_password.setEchoChar('*');
		putPassword.add(jpf_password);
	}
	
//	设置按钮区域
	public void setPutButton() {
		putButton.add(b_log);
		putButton.add(b_exit);
	}
	
//	添加到布局
	public void setPanel(Container con) {
		con.add(pan0);
		con.add(putTitle);
		con.add(pan1);
		con.add(putName);
		con.add(putPassword);
		con.add(putButton);
		con.add(pan2);
	}
	
}
