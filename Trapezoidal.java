public class Trapezoidal {
static class GFG
{
static float y(float x)
	{
		return 1 / (1 + x * x);
	}
	static float trapezoidal(float a, float b, float n)
	{
		float h = (b - a) / n;
		float s = y(a) + y(b);
		for (int i = 1; i < n; i++)
			s += 2 * y( a + i * h);
	
		return (h / 2) * s;
	}
	public static void main (String[] args)
	{
		float x0 = 0;
		float xn = 1;
		int n = 6;
	
		System.out.println("Value of integral is "+
						Math.round(trapezoidal(x0, xn, n)
						* 10000.0) / 10000.0);
	}
}

}
