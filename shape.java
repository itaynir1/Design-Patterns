package ShapesProject1;

public abstract class shape implements Prototype{

	public abstract void drow();

	@Override
	public Prototype clone(shape p) {
		p.drow();
		p.drow();
		return null;
	}
	
	
	
}


