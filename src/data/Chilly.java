package data;

// 칠리 아이템의 구현체
public class Chilly extends AbstractItem {

    public static Chilly getInstance() {
        return new Chilly();
    }

    @Override
    public String getName() {
        return CHILLY;
    }
}
