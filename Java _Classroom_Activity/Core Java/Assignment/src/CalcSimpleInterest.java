
public class CalcSimpleInterest implements SimpleInterest{

	@Override
	public double simpleInterest(double r, int t, int p) {
		
		SimpleInterest si=(r1,t2,p1)->(p*r*t)/100;
		double t1=si.simpleInterest(r, t, p);
		System.out.println("Simple Interst is ");
		return t1;
		
	}

}
