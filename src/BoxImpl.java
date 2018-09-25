import data.AbstractItem;
import data.Chilly;
import data.Chocolate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BoxImpl implements Box {

	private static BoxImpl instance;
	private Random random = new Random();

	private List<AbstractItem> items = new ArrayList<>();

	public BoxImpl() {
		// 초콜릿을 추가한다.
		for (int i = 0; i< 13; i++)
			items.add(Chocolate.getInstance());

		// 칠리를 랜덤한 위치에 추가한다.
		int val = random.nextInt(13);
		items.add(val, Chilly.getInstance());
	}

	public static BoxImpl getInstance() {
		if(instance == null) instance = new BoxImpl();
		return instance;
	}

	@Override
	public int getItem() {
		return items.size();
	}

	@Override
	public boolean takeItem(int hand) {
		boolean isChilly = false;
		for (int i=0; i<hand; i++) {
			int rand = random.nextInt(items.size());
			if(items.get(rand) instanceof Chilly) isChilly = true;
			items.remove(rand);
		}
		return isChilly;
	}

	@Override
	public String status() {
		for (AbstractItem item:items) {
			if(item instanceof Chocolate) System.out.print("□");
			else if(item instanceof Chilly) System.out.print("■");
		}
		System.out.println();
		return null;
	}

	@Override
	public boolean isEmpty() {
		return items.isEmpty();
	}
}
