package factory;

public class CreateSecLight implements Creator{

		
	@Override
	public Light createLight() {
		// TODO Auto-generated method stub
		return new SecLight();
	}

}
