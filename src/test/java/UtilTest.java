import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest {
	@Test
	public void testIstErstesHalbjahr() {
		//Teste von Jan - Jul
		assert(Util.istErstesHalbjahr(1));
		assert(Util.istErstesHalbjahr(2));
		assert(Util.istErstesHalbjahr(3));
		assert(Util.istErstesHalbjahr(4));
		assert(Util.istErstesHalbjahr(5));
		assert(Util.istErstesHalbjahr(6));
		assert(Util.istErstesHalbjahr(7));
		//Teste von Aug - Dez
		assertFalse(Util.istErstesHalbjahr(8));
		assertFalse(Util.istErstesHalbjahr(9));
		assertFalse(Util.istErstesHalbjahr(10));
		assertFalse(Util.istErstesHalbjahr(11));
		assertFalse(Util.istErstesHalbjahr(12));

		//Teste mit Werten außerhalb von 1-12
		try {
			Util.istErstesHalbjahr(0);
			fail("Erwartete Exception wurde nicht geworfen");
		} catch (IllegalArgumentException ignored) {}
		try {
			Util.istErstesHalbjahr(-100);
			fail("Erwartete Exception wurde nicht geworfen");
		} catch (IllegalArgumentException ignored) {}
		try {
			Util.istErstesHalbjahr(13);
			fail("Erwartete Exception wurde nicht geworfen");
		} catch (IllegalArgumentException ignored) {}
		try {
			Util.istErstesHalbjahr(100);
			fail("Erwartete Exception wurde nicht geworfen");
		} catch (IllegalArgumentException ignored) {}
	}
}
