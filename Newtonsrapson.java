class GFG {
	
	static final double EPSILON = 0.001;
	static double func(double x)
	{
		return x * x * x - x * x + 2;
	}
	static double derivFunc(double x)
	{
		return 3 * x * x - 2 * x;
	}
	static void newtonRaphson(double x)
	{
		double h = func(x) / derivFunc(x);
		while (Math.abs(h) >= EPSILON)
		{
			h = func(x) / derivFunc(x);
	
			// x(i+1) = x(i) - f(x) / f'(x)
			x = x - h;
		}
	
		System.out.print("The value of the"
				+ " root is : "
				+ Math.round(x * 100.0) / 100.0);
	}
	public static void main (String[] args, int i)
	{
		
		// Initial values assumed
		double x0 = -20;
		newtonRaphson(x0);
	}
}
