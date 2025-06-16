package kadai2;

public class Wizard extends Character {
    public  void attack(Matango m){
        int damege = 7;

        System.out.println(this.name + "の攻撃！");
        System.out.println("魔法使いは火の玉を放った！");
        m.hp -= damege;
        System.out.println("敵に" + damege + "のダメージを与えた");
    }
}