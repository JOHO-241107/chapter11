package kadai2;

public class Hero extends Character {
    public  void attack(Matango m){
        int damege = 10;

        System.out.println(this.name + "の攻撃！");
        m.hp -= damege;
        System.out.println("敵に" + damege + "のダメージを与えた");
    }
}