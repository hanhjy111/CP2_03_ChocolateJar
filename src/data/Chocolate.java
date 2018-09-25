package data;

// 초콜릿 아이템의 구현체
public class Chocolate extends AbstractItem {

    public static Chocolate getInstance() {
        return new Chocolate();
    }

    @Override
    public String getName() {
        return CHOCOLATE;
    }
}
