package field;

import java.util.ArrayList;

import cell.Cell;

public class Field {
	private static final Location[] adjacent = {
		new Location(-1,-1),new Location(-1,0),new Location(-1,1),
		new Location(0,-1), new Location(0,0), new Location(0,1),
		new Location(1,-1), new Location(1,0), new Location(1,1)
	};
	private int width;
	private int height;
	private Cell[][] field;
	
	public Field(int width, int height) { // 构造函数，指定长宽即可
		this.width = width;
		this.height = height;
		this.field = new Cell[height][width]; // 为啥这个不用加this. ？ 答：没有重名就不用加
	}
	
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	
	public Cell place(int row, int col, Cell o) { // 替换目标，并将原主返回
		Cell ret = field[row][col];
		field[row][col] = o;
		return ret;
	}
	
	public Cell get(int row, int col) { // 取得目标
		return field[row][col];
	}
	
	public Cell[] getNeighbour(int row, int col) { // 存储一个细胞的所有邻居（返回cell数组）
		ArrayList<Cell> list = new ArrayList<Cell>();
		for ( int i=-1; i<2; i++ ) {
			for ( int j=-1; j<2; j++ ) {
				int r = row+i;
				int c = col+j;
				if ( r >-1 && r<height && c>-1 && c<width && !(r== row && c == col) ) {
					list.add(field[r][c]);
				}
			}
		}
		return list.toArray(new Cell[list.size()]);
	}
 
	public Location[] getFreeNeighbour(int row, int col) { // 得到指定位置的相邻空白细胞的坐标 （返回坐标数组）
		ArrayList<Location> list = new ArrayList<Location>();
		for ( Location loc : adjacent ) {
			int r = row+loc.getRow();
			int c = col+loc.getCol();
			if ( r >-1 && r<height && c>-1 && c<width && field[r][c] == null ) {
				list.add(new Location(r,c));
			}
		}
		return list.toArray(new Location[list.size()]);
	}
	
	public boolean placeRandomAdj(int row, int col, Cell cell) { // 根据坐标确定一个位置，将cell放到他的随机空邻居中
		boolean ret = false;
		Location[] freeAdj = getFreeNeighbour(row, col);
		if ( freeAdj.length >0 ) {
			int idx = (int)(Math.random()*freeAdj.length);
			field [freeAdj[idx].getRow()] [freeAdj[idx].getCol()] = cell;
			ret = true;
		}
		return ret;
	}
	
	public Cell remove(int row, int col) { // 移除指定位置的细胞
		Cell ret = field[row][col];
		field[row][col] = null;
		return ret;
	}
	
	public void remove(Cell cell) { // 移除指定细胞
		for ( int row = 0; row < height; row++ ) {
			for ( int col = 0; col < width; col++ ) {
				if ( field[row][col] == cell ) {
					field[row][col] = null;
					break;
				}
			}
		}
	}
	
	public void clear() { // 清空棋盘
		for ( int i=0; i<height; i++ ) {
			for ( int j=0; j<width; j++ ) {
				field[i][j] = null;
			}
		}
	}

	public void move(int row, int col, Location loc) { // 将指定坐标的细胞移到指定位置
		field[loc.getRow()][loc.getCol()] = field[row][col];
		remove(row, col);
	}
}
