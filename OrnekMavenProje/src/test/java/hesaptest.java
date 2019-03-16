import org.junit.*;
import static org.junit.Assert.*;

public class hesaptest {

	
	@Test
	public void testTopla() {
	
		hesap h = new hesap();
		
		int sonuc = h.topla(345, 453);
		
		Assert.assertEquals(798, sonuc);
	}
	
}
