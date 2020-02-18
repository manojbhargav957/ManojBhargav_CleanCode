public class compound {
public static double compound(double pr,double t,double rate)
{
	return pr * Math.pow(1.0+rate/100.0,t) - pr;
}
}