package Role;
import java.lang.*;
import DiTuFuZhuo.*;
import Skill.*;
abstract public class Role {
	//血量、魔法值、经验
	private int HP,MP;
	//英雄名字
	private String name;
	//英雄外貌
	private JueSe shape;
	//英雄技能
	private ZSkill zSkill;
	private BSkill bSkill;
	//普通攻击
	public abstract void normalAttack();
	//英雄技能使用方法
	public void skill() {
		zSkill.useSkill();
	}
	public String shape() {
		return shape.getShape();
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getMP() {
		return MP;
	}
	public void setMP(int mP) {
		MP = mP;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setiSkill(ZSkill zSkill) {
		this.zSkill = zSkill;
	}
	public void setShape(JueSe shape) {
		this.shape = shape;
	}
}