package pkgShape;
import java.util.Comparator;

public class Cuboid extends Rectangle{
	private int iDepth;

	public Cuboid(int iLength, int iWidth, int iDepth) throws Exception{
		super(iLength, iWidth);
		if (iDepth < 0) {
			throw new IllegalArguementException("Depth can't be negative");
		}
		else {
			this.iDepth = iDepth;
		}
	}

	public int getIDepth() {
		return iDepth;
	}

	public void setIDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	public double volume() {
		return getIWidth() * getILength() * getIDepth();
	}

	@Override
	public double area() {
		return 2 * getILength() * getIWidth() + 2 * getILength() * getIDepth() + 2 * getIWidth() * getIDepth();
	}

	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Perimeter method is invalid");
	}
	@Override
	public int compareTo(Object obj) {
		Cuboid cub = (Cuboid)obj;
		return (int) (this.area() - cub.area());
	}
}

class SortByArea implements Comparator<Cuboid>{
	SortByArea(){
		super();
	}
	@Override
	public int compare(Cuboid cub1, Cuboid cub2) {
		return (int)(cub1.area() - cub2.area());
	}
}

class SortByVolume implements Comparator<Cuboid>{
	SortByVolume(){
		super();
	}
	@Override
	public int compare(Cuboid cub1, Cuboid cub2) {
		return (int)(cub1.volume() - cub2.volume());
	}
}