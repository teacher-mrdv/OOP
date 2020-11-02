package point2D;

public class Line
{
	private String name;
	private Point start;
	private Point end;
	
	public Line(Point start, Point end)
	{
		this.name = "L";
		this.start = start;
		this.end = end;
	}
	
	public Line(String name, Point start, Point end)
	{
		name = name.toUpperCase();
		this.name = name;
		this.start = start;
		this.end = end;
	}

	public Point getStart()
	{
		return start;
	}

	public void setStart(Point start)
	{
		this.start = start;
	}

	public Point getEnd()
	{
		return end;
	}

	public void setEnd(Point end)
	{
		this.end = end;
	}
	
	public double getLength()
	{
		return start.distance(end);
	}
	
	// add getSlope()?

	@Override
	public String toString()
	{
		return	"Line " + name + " [start=" + start +
				", end=" + end + "]";
	}
	
	// quick test, should be in its own LineTest.java, but
	// it's meant to be a quick hack job, so ...
	public static void main(String[] args)
	{
		Point p1 = new Point();
		Point p2 = new Point("R", 5,12);
		Line l = new Line("l1", p1, p2);
		System.out.println(l);
		System.out.printf( "Length = %,.3f\n", l.getLength() );
	}
}
