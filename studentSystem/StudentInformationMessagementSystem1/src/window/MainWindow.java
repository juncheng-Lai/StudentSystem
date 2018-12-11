package window;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.TableColumn;

public class MainWindow extends JFrame{
	JMenuBar menuBar = new JMenuBar();
	JMenu Document = new JMenu("文件");//包括保存、关闭
	JMenu Edit = new JMenu("编辑");//包括插入、删除
	JMenu Data = new JMenu("数据");//包括查找、排序
	
	JMenuItem toSave = new JMenuItem("保存");
	JMenuItem toClose = new JMenuItem("关闭");
	JMenuItem toInsert = new JMenuItem("新建");
	JMenuItem toDelete = new JMenuItem("删除");
	JMenuItem toFind = new JMenuItem("查找");
	JMenuItem toSort = new JMenuItem("排序");
	
	JTable table;
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	JScrollPane center ;
	JPanel putPhoto = new JPanel();
	JPanel putName = new JPanel();
	JPanel putId = new JPanel();
	JPanel putButton = new JPanel();
	
	JLabel f1 =new JLabel("1");
	JLabel student_name = new JLabel("姓名： ");
	JLabel student_id = new JLabel("学号： ");
	
	JButton detail = new JButton("详细信息");
	
	public MainWindow() {
		setTitle("学生信息管理系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container con = getContentPane();
		con.setLayout(new GridBagLayout());
		addMenuBar();
		setTable();
		setThisLayout(con);
		
		pack();
	}
	
//	设置菜单栏
	public void addMenuBar() {
		setJMenuBar(menuBar);
		addDocumentItem();
		addEditItem();
		addDataItem();
		menuBar.add(Document);
		menuBar.add(Edit);
		menuBar.add(Data);
	}
	public void addDocumentItem() {
		Document.add(toSave);
		Document.add(toClose);
	}
	public void addEditItem() {
		Edit.add(toInsert);
		Edit.add(toDelete);
	}
	public void addDataItem() {
		Data.add(toFind);
		Data.add(toSort);
	}
	
//	设置表格
	public void setTable() {
		Object[]  columnNames = {"学号","姓名","性别","年龄","专业","班级"};
		Object[][] rowData = {
				{"学号","姓名1","性别","年龄","专业","班级"},
				{"学号","姓名2","性别","年龄","专业","班级"},
				{"学号","姓名3","性别","年龄","专业","班级"}
		};
		table = new JTable(rowData,columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500,50));
		table.setFillsViewportHeight(true);
		center = new JScrollPane(table);
	}	
	
//	设置到布局
	public void setThisLayout(Container con) {
		gbc.fill =  GridBagConstraints.BOTH;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 10;
		gbc.gridwidth = 15;
		con.add(center,gbc);
		
		f1.setText(1+" 123");
		putPhoto.add(f1);
		setPanel(15,0,4,6,con,putPhoto);
		
		putName.add(student_name);
		setPanel(15,6,4,1,con,putName);
		
		putId.add(student_id);
		setPanel(15,7,4,1,con,putId);
		
		putButton.add(detail);
		setPanel(15,8,4,2,con,putButton);
		
	}
	public void setPanel(int x,int y,int width,int height,Container con,JPanel pan) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridheight = height;
		gbc.gridwidth = width;
		con.add(pan,gbc);
	}
	

}
