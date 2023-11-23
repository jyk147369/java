package day03;

public abstract class Pocketmon {
    String name;
    Integer atk;
    String type;
    Integer hp;
    Integer lv;
    Integer exp;
    Integer x;
    Integer y;


    public Pocketmon(String name, Integer atk, Integer hp, Integer lv, Integer exp, String type, Integer x, Integer y) {
        this.name = name;
        this.atk = atk;
        this.hp = hp;
        this.lv = lv;
        this.exp = exp;
        this.type = type;
        this.x = x;
        this.y = y;
    }


    Integer attacked(Integer atk) {
        this.hp = this.hp - atk;
        if(hp<=0) {
            this.die();
            System.out.println("사망했습니다.");
        }
        return hp;
    }

    Integer attacked(Integer atk, Integer num) {
        this.hp = this.hp - atk * num;
        if(hp<=0) {
            this.die();
            System.out.println(this.name + "가 사망했습니다. " + this.name + "가 재생성 됩니다.");
        }
        return hp;
    }

    void attackTo(Pocketmon target){
        Integer critical = (int)(Math.random()*100)+1;
        if(critical>=90){
            target.attacked(this.atk, 3);
            System.out.println("공격력 3배 크리티컬!!!");
        } else if (critical>=80) {
            target.attacked(this.atk, 2);
            System.out.println("공격력 2배 크리티컬!");
        } else target.attacked(this.atk);

        System.out.println(this.name + "가 " + target.name + "을 공격했습니다.");
        System.out.println("현재 " + target.name + "의 체력 : " + target.hp);
    }

    void die() {
        this.hp = 100;
    }

    void moving(Integer x, Integer y) {
        this.x = x + 10;
        this.y = y + 10;

        System.out.println(this.name + "가 x 좌표 :" + this.x + ", y좌표 : " + this.y + "로 이동합니다.");
    }

    Integer levelUp(){
        this.lv = this.lv + 1;
        this.atk = this.atk * 110 / 100;
        this.hp = this.hp * 120 / 100;

        System.out.println("레벨업!");

        return lv;
    }

    Integer expUp(Pocketmon mop) {

        if(mop.hp <= 0){
            exp =  exp + 10;
            System.out.println("경험치가 10 올랐습니다.");
        }

        if (exp>=100){
            this.levelUp();
            exp = exp % 100;
            System.out.println("현재 경험치는 " + exp + "입니다.");
        }

        return exp;
    }

    abstract void moving(Integer z);
}
