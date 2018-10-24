package ZhanChangKongZhi.HuiHeKongZhi;

public class ZhanChanPanDing {
	private int position1[][] = new int [4][2];
	private int position2[][] = new int [4][2];
	public ZhanChanPanDing() {
		
	}
	public void moveRole(int team,int who,int x,int y) {
		if(team==1) {
			position1[who][0]=x;
			position1[who][1]=y;
		}
		else {
			position2[who][0]=x;
			position2[who][1]=y;
		}
	}
	public int[][] getPosition1() {
		return position1;
	}
	public int[][] getPosition2() {
		return position2;
	}
}

