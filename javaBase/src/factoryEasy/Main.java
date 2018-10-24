package factoryEasy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String servletName="loginOut";
		Servlet servlet=ServletFactory.createServlet(servletName);
		if(servlet!=null){
			servlet.doSomthing();
		}
		
	}

}
