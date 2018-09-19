package chocolatejargame.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import chocolatejargame.ChocolateJar;

class ChocolateJarTest {

	@Test
	void testChocolateJar() { // 생성자 테스트
		ChocolateJar jar = new ChocolateJar();
		assertEquals(13, jar.getChocolate());
		assertEquals(1, jar.getChilli());
	}

	@Test
	void testChocolateJarInt() { // 초콜릿 수를 입력받는 생성자 테스트
		ChocolateJar jar = new ChocolateJar(11);
		assertEquals(11, jar.getChocolate());
		assertEquals(1, jar.getChilli());
	}

	@Test
	void testGetItem() { // 아이템 수 반환 테스트
		ChocolateJar jar = new ChocolateJar();
		assertEquals(14, jar.getItem());
	}

	@Test
	void testGetChocolate() { // 초콜릿 수 반환 테스트
		ChocolateJar jar = new ChocolateJar();
		assertEquals(13, jar.getChocolate());
	}

	@Test
	void testGetChilli() { // 칠리 수 반환 테스트
		ChocolateJar jar = new ChocolateJar();
		assertEquals(1, jar.getChilli());
	}

	@Test
	void testTakeItem() { // 아이템 뽑기 반환 테스트
		ChocolateJar jar = new ChocolateJar();
		assertEquals(14, jar.getItem());
		jar.takeItem(3);
		assertEquals(11, jar.getItem());
		jar.takeItem(2);
		assertEquals(9, jar.getItem());
		jar.takeItem(1);
		assertEquals(8, jar.getItem());
	}

	@Test
	void testStatus() { // 항아리 내부 출력 테스트
		ChocolateJar jar = new ChocolateJar();
		assertEquals("[ ■ □ □ □ □ □ □ □ □ □ □ □ □ □ ]", jar.status());
		jar.takeItem(3);
		assertEquals("[ ■ □ □ □ □ □ □ □ □ □ □ ]", jar.status());
	}

	@Test
	void testIsEmpty() { // 항아리가 비었는지 판단 테스트
		ChocolateJar jar = new ChocolateJar();
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(2);
		assertTrue(jar.isEmpty());
	}

}
