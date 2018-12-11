package window;

import java.awt.*;

import javax.swing.*;

public class SortWindow extends JFrame{
	JComboBox sortType;
	JPanel pan0 = new JPanel();
	JPanel pan1 = new JPanel();
	JPanel putTitle = new JPanel();
	JPanel putComboBox = new JPanel();
	JPanel putButtonGroup = new JPanel();
	JPanel putButton = new JPanel();
	
	ButtonGroup bg = new ButtonGroup();
	JRadioButton up = new JRadioButton("升序");
	JRadioButton down = new JRadioButton("降序");
	
	JButton toSort = new JButton("排序");
	JButton cancel = new JButton("取消");
	
	JLabel title = new JLabel("          请选择排序的方式          ");
	public SortWindow() {
		setTitle("排序");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(6,1));
		
		setPutTitle();
		setPutComboBox();
		setPutButtonGroup();
		setPutButton();
		setPanel();
		pack();
	}
	
//	设置标题
	public void setPutTitle() {
		title.setFont(new Font("宋体",Font.BOLD,20));
		putTitle.add(title);
	}
	
//	设置下拉栏
	public void setPutComboBox() {
		String[] type = {"按学号排序","按姓名排序","按性别排序","按年龄排序","按专业排序","按班级排序"};
		sortType = new JComboBox<String>(type);
		putComboBox.add(sortType);
	}
	
//	设置单选按钮
	public void setPutButtonGroup() {
		bg.add(up);
		bg.add(down);
		putButtonGroup.add(up);
		putButtonGroup.add(down);
	}
	
//	设置按钮
	public void setPutButton() {
		putButton.add(toSort);
		putButton.add(cancel);
	}
	
//	设置到布局
	public void setPanel() {
		add(pan0);
		add(putTitle);
		add(putComboBox);
		add(putButtonGroup);
		add(putButton);
		add(pan1);
	}
}
