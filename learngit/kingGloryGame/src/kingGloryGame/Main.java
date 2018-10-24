package kingGloryGame;
import java.util.Scanner;

import Role.*;
import Skill.ZhuDong.*;
import ZhanChangKongZhi.HuiHeKongZhi.*;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		/*;
		hero.setiSkill(new HuoQiu());
		hero.skill();*/
		Role hero1 = new Alien("player1");
		Role hero2 = new Alien("player2");
		Role hero3 = new Alien("player3");
		Role hero4 = new Alien("player4");
		Role hero5 = new Robot("player5");
		Role hero6 = new Robot("player6");
		Role hero7 = new Robot("player7");
		Role hero8 = new Robot("player8");
		RenWuChuShiHua sta = new RenWuChuShiHua();
		sta.SetRole(hero1, 1);
		sta.SetRole(hero2, 1);
		sta.SetRole(hero3, 1);
		sta.SetRole(hero4, 1);
		sta.SetRole(hero5, 2);
		sta.SetRole(hero6, 2);
		sta.SetRole(hero7, 2);
		sta.SetRole(hero8, 2);
		ZhanChangZhanShi HHKZ = new ZhanChangZhanShi();
		HHKZ.Show(sta);
		
	}
}
