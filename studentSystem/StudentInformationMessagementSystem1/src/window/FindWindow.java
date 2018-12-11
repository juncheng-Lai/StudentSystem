package window;

import java.awt.*;
import javax.swing.*;

public class FindWindow extends JFrame{
	JComboBox findType;
	JPanel pan0 = new JPanel();
	JPanel pan1 = new JPanel();
	JPanel putComboBox = new JPanel();
	JPanel putTextField = new JPanel();
	JPanel putButton = new JPanel();
	
	JLabel lab0 = new JLabel("                  ");
	JLabel lab1 = new JLabel("       ");
	JLabel choseType = new JLabel("查找类型:");
	JLabel inputItem = new JLabel("       查找内容:");
	JTextField findItem = new JTextField(12);
	
	JButton toFind = new JButton("查找");
	JButton cancel = new JButton("取消");
	
	public FindWindow() {
		setTitle("查找");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(5,1));
		
		setPutComboBox();
		setPutTextField();
		setPutButton();
		setPanel(con);
		
		pack();
	}
	
//	设置下拉栏
	public void setPutComboBox() {
		String[] type = {"学号","姓名","性别","年龄","专业","班级"};
		findType = new JComboBox<String>(type);
		putComboBox.add(choseType);
		putComboBox.add(findType);
		putComboBox.add(lab0);
	}
	
//	设置文本框区域
	public void setPutTextField() {
		putTextField.add(inputItem);
		putTextField.add(findItem);
		putTextField.add(lab1);
	}
	
//	设置按钮区域
	public void setPutButton() {
		putButton.add(toFind);
		putButton.add(cancel);
	}
	
//	设置到布局
	public void setPanel(Container con) {
		con.add(pan0);
		con.add(putComboBox);
		con.add(putTextField);
		con.add(putButton);
		con.add(pan1);
	}
}
