package factoryEasy;

public class ServletFactory {

	private ServletFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static Servlet createServlet(String servletName) {
		if("login".equals(servletName)){
			return new Login();
		}else if("loginOut".equals(servletName)){
			return new LoginOut();
		}else{
			return null;
		}
	}
}
