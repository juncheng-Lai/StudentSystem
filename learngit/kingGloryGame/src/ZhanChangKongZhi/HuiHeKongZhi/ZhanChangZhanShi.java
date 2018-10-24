package ZhanChangKongZhi.HuiHeKongZhi;

import ZhanChangKongZhi.JiBenDiTu.JiBenDiTu;

public class ZhanChangZhanShi {
		//战场初始化
		private JiBenDiTu origin = new JiBenDiTu();
		private String field2[][] = new String[20][40];
		private String shapeT1[] = new String [4];
		private String shapeT2[] = new String [4];
		private int position1[][] = new int [4][2];
		private int position2[][] = new int [4][2];
		//战场展示
		public void ZhanChangZhanShi() {
			}
		public void Show(RenWuChuShiHua stickRole) {
			ZhanChanPanDing pos = stickRole.pos;
			int x,y,order1=0,order2=0;
			field2 = origin.getField();
			shapeT1 = stickRole.getShapeT1();
			shapeT2 = stickRole.getShapeT2();
			position1 =pos.getPosition1();
			//System.out.println(position1[1][0]);
			position2 =pos.getPosition2();
			for (x=0;x<20;x++)
				for(y=0;y<40;y++) {
					if(position1[order1][0]==x&&position1[order1][1]==y) {
						field2[x][y] = shapeT1[order1];
						if(order1<3)
							order1++;
						//System.out.println(x+" "+y);
					}
					if(position2[order2][0]==x&&position2[order2][1]==y) {
						field2[x][y] = shapeT2[order2];
						if(order2<3)
							order2++;
						
					}
				}
			for (x=0;x<20;x++)
				for(y=0;y<40;y++) {
					System.out.print(field2[x][y]);
					if(y == 39)
						System.out.println();
				}
		}
}
