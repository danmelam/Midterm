package pkgTestShape;
import static org.junit.Assert.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.Test;
import pkgShape.Cuboid;


public class CuboidTest {
	@Test
	public void Cuboid_Test1() throws Exception{
		new Cuboid(3, 5, 4);
	}
	@Test(expected = IllegalArguementException.class)
	public void Cuboid_Test2() throws Exception{
		new Cuboid(-2, 11, 6);
	}
	@Test(expected = IllegalArguementException.class)
	public void Cuboid_Test3() throws Exception{
		new Cuboid(-5, -1, -7);
	}
	@Test
	public void setter_Test1() throws Exception{
		Cuboid cub = new Cuboid(2, 4, 6);
		cub.setILength(4);
		cub.setIWidth(20);
		cub.setIDepth(15);
		
		assertEquals(cub.getILength(), 4);
		assertEquals(cub.getIWidth(), 20);
		assertEquals(cub.getIDepth(), 15);
	}
	@Test
	public void area_Test1() throws Exception{
		Cuboid cub = new Cuboid(4, 5, 6);
		
		assertEquals(cub.area(), 148, 0.0001);
	}
	@Test (expected = UnsupportedOperationException.class)
	public void perimeterTest1() throws Exception{
		Cuboid cub = new Cuboid (4, 3, 5);
		cub.perimeter();
	}
	@Test
	public void volume_Test1() throws Exception{
		Cuboid cub = new Cuboid (8, 2, 5);
		assertEquals(cub.volume(), 80, 0.001);
	}
	@Test
	public void compareTo_Test1() throws Exception{
		ArrayList<Cuboid> cub = new ArrayList<Cuboid>();
		for (int i = 0; i < 10; i++) {
			int iLength = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			int iWidth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			int iDepth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			
			cub.add(new Cuboid(iLength, iWidth, iDepth));
		}
		Collections.sort((List<Cuboid>) cub);
		for(int i=0; i<9; i++) {
			assertTrue(cub.get(i).area()<= cub.get(i+1).area());
			}
		}
	public void sortbyareaTest1() throws Exception{
	}
	public void sortbyvolumeTest1() throws Exception{
	}
}