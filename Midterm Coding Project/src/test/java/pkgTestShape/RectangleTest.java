package pkgTestShape;
import static org.junit.Assert.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.Test;
import pkgShape.Rectangle;


public class RectangleTest {
	@Test
	public void Rectangle_Test1() throws Exception{
		new Rectangle(3, 5);
	}
	@Test(expected = IllegalArguementException.class)
	public void Rectangle_Test2() throws Exception{
		new Rectangle(-2, 11);
	}
	@Test(expected = IllegalArguementException.class)
	public void Rectangle_Test3() throws Exception{
		new Rectangle(-5, -1);
	}
	@Test
	public void setter_Test1() throws Exception{
		Rectangle rec = new Rectangle(2, 4);
		rec.setILength(4);
		rec.setIWidth(20);
		
		assertEquals(rec.getILength(), 4);
		assertEquals(rec.getIWidth(), 20);
	}
	@Test
	public void area_Test1() throws Exception{
		Rectangle rec = new Rectangle(4, 5);
		
		assertEquals(rec.area(), 20, 0.0001);
	}
	@Test
	public void perimeter_Test1() throws Exception{
		Rectangle rec = new Rectangle(4, 3);
		
		assertEquals(rec.perimeter(), 14, 0.0001);
	}
	@Test
	public void compareTo_Test1() throws Exception{
		ArrayList<Rectangle> rec = new ArrayList<Rectangle>();
		for (int i = 0; i < 10; i++) {
			int iLength = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			int iWidth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			
			rec.add(new Rectangle(iLength, iWidth));
		}
		Collections.sort((List<Rectangle>) rec);
		
		for (int i = 0; i < 9; i++) {
			assertTrue(rec.get(i).area() <= rec.get(i + 1).area());
		}
	}
}