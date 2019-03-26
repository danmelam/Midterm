package pkgShape;

public class Rectangle extends Shape {
	private int iLength;
	private int iWidth;

	public Rectangle (int iLength, int iWidth) throws Exception {
		super();
		if (iLength < 0 || iWidth < 0) {
			throw new IllegalArguementException("Length and Width can't be negative");
		}
		else {
			this.iLength = iLength;
			this.iWidth = iWidth;
		}
	}
	public int getIWidth() {
		return iWidth;
	}

	public void setIWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getILength() {
		return iLength;
	}

	public void setILength(int iLength) {
		this.iLength = iLength;
	}
	@Override
	public double area() {
		return iLength * iWidth;
	}

	@Override
	public double perimeter() {
		return iLength + iWidth;
	}

	public int compareTo(Object obj) {
		Rectangle rec = (Rectangle)obj;
		return (int) (this.area() - rec.area());
	}
}