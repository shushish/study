package factory;

public class CreateFirLight implements Creator{
	
	@Override
	public Light createLight() {
		// TODO Auto-generated method stub
		return new FirLight();
	}
}
