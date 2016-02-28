package kcb;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class KcbData implements TableModel {
	private String [] title = {
		"周一","周二","周三","周四","周五","周六","周日"	
	};
	private String[][] data = new String [8][7];
	public KcbData (){ // 构造函数，初始化数据
		for( int i =0; i<data.length ; i++ )
			for( int j=0; j<data[i].length ; j++ ){
				data[i][j]="";
			}
	}
	@Override
	public void addTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		
		return String.class;
	}

	@Override
	public int getColumnCount() { // 列
		return 7;
	}

	@Override
	public String getColumnName(int arg0) {
		return title[arg0];
	}

	@Override
	public int getRowCount() { // 行
		return 8;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		return data[arg0][arg1];
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setValueAt(Object arg0, int arg1, int arg2) {
		data[arg1][arg2] = (String) arg0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
