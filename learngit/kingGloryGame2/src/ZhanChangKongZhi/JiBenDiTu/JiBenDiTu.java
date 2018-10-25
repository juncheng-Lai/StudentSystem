package ZhanChangKongZhi.JiBenDiTu;

public class JiBenDiTu {
	private String field[][] = new String [20][40];
	public JiBenDiTu(){
		int x,y;
		for (x=0;x<20;x++)
			for(y=0;y<40;y++)
				if((x>2&&x<8&&((y>6&&y<15)||(y>23&&y<32)))||(x>11&&x<17&&((y>6&&y<15)||(y>23&&y<32))))
					field[x][y] = "🌳";
				else
					field[x][y] = "⬜";
	}
	public String[][] getField() {
		return field;
	}
	
}
