package window;

import javax.swing.*;
import java.awt.*;
public class DetailedWindow extends JFrame{
	
	JPanel putName = new JPanel();
	JPanel putStudentId =  new JPanel();
	JPanel putSex =  new JPanel();
	JPanel putAge =  new JPanel();
	JPanel putBirthday =  new JPanel();
	JPanel putNationality =  new JPanel();
	JPanel putMajor =  new JPanel();
	JPanel putClassId =  new JPanel();
	JPanel putIdCardNum =  new JPanel();
	JPanel putType =  new JPanel();
	JPanel putButton1 = new JPanel();
	JPanel putButton2 = new JPanel();
	
	JLabel name = new JLabel("  姓    名 ");
	JLabel studentId= new JLabel("  学    号 ");
	JLabel sex = new JLabel("  性    别 ");
	JLabel age = new JLabel("  年    龄 ");
	JLabel birthday = new JLabel("  出生日期 ");
	JLabel nationality = new JLabel("  民    族 ");
	JLabel major = new JLabel("  专    业 ");
	JLabel classId = new JLabel("  班    级 ");
	JLabel IdCardNum= new JLabel("  身份证号 ");
	JLabel type = new JLabel("  学生类别 ");
	
	JTextField tfName = new JTextField(15);
	JTextField tfStudentId = new JTextField(15);
	JTextField tfSex = new JTextField(15);
	JTextField tfAge = new JTextField(15);
	JTextField tfBirthday = new JTextField(15);
	JTextField tfNationality = new JTextField(15);
	JTextField tfMajor = new JTextField(15);
	JTextField tfClassId = new JTextField(15);
	JTextField tfIdCardNum = new JTextField(15);
	JTextField tfType = new JTextField(15);
	
	
	JButton modify_save = new JButton("修改");//点击时转为“保存”
	JButton sure_cancel = new JButton("确定");//“修改”按钮点击时转为“取消”
	
	public DetailedWindow() {
		setTitle("学生详细信息");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(6,2));
		setPanel(con);
		setComponent();
		setPutButton();
		pack();
	}
	
//	设置到布局
	public void setPanel(Container con) {
		con.add(putName);
		con.add(putStudentId);
		con.add(putSex);
		con.add(putAge);
		con.add(putBirthday);
		con.add(putNationality);
		con.add(putMajor);
		con.add(putClassId);
		con.add(putIdCardNum);
		con.add(putType);
		con.add(putButton1);
		con.add(putButton2);
	}
	
//	设置标签、文本框
	public void setComponent() {
		putName.add(name);					putName.add(tfName);
		putStudentId.add(studentId);		putStudentId.add(tfStudentId);
		putSex.add(sex);					putSex.add(tfSex);
		putAge.add(age);					putAge.add(tfAge);
		putBirthday.add(birthday);			putBirthday.add(tfBirthday);
		putNationality.add(nationality);	putNationality.add(tfNationality);
		putMajor.add(major);				putMajor.add(tfMajor);
		putClassId.add(classId);			putClassId.add(tfClassId);
		putIdCardNum.add(IdCardNum);		putIdCardNum.add(tfIdCardNum);
		putType.add(type);					putType.add(tfType);
	}
//	设置按钮
	public void setPutButton() {
		putButton1.add(sure_cancel);
		putButton2.add(modify_save);
	}
}
