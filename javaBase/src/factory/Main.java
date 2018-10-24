package factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 调用时不依赖于具体工厂和产品
		 * （即到底是mysql驱动，mysql数据库连接还是oracle驱动，oracle连接，
		 * 我们程序猿不需要管的，我们只管使用抽象的driver和connection，对吧？），
		 * 而是依赖于抽象工厂和抽象产品完成工作。
		 * */
		Creator cre1=new CreateFirLight();
		Light light1=cre1.createLight();
		light1.turnOn();
		light1.turnOff();
		
		Creator cre2=new CreateSecLight();
		Light light2=cre2.createLight();
		light2.turnOn();
		light2.turnOff();		
	}

}
