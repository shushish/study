package factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����ʱ�������ھ��幤���Ͳ�Ʒ
		 * ����������mysql������mysql���ݿ����ӻ���oracle������oracle���ӣ�
		 * ���ǳ���Գ����Ҫ�ܵģ�����ֻ��ʹ�ó����driver��connection���԰ɣ�����
		 * ���������ڳ��󹤳��ͳ����Ʒ��ɹ�����
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
