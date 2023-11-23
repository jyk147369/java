package day03;

public class FlyPocketmon extends Pocketmon{
    public FlyPocketmon(String name, Integer atk, Integer hp, Integer lv, Integer exp, String type, Integer x, Integer y) {
        super(name, atk, hp, lv, exp, type, x, y);
    }

    Integer z;

    @Override
    void moving(Integer z) {
        super.moving(this.x, this.y);

        this.z = this.z + 10;
    }

    @Override
    void moving(Integer x, Integer y) {
        super.moving(x, y);
    }
}
