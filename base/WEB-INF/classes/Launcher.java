import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

public class Launcher {

	public static void main(String[] args) throws LifecycleException {
		// TODO Auto-generated method stub
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		String webappDirLocation = "base";
		Context appContext = tomcat.addWebapp("/app", new File(webappDirLocation).getAbsolutePath());
		Tomcat.addServlet(appContext, "servlet-addservlet-name", new ServletAddServlet());
		appContext.addServletMappingDecoded("/servlet-addservlet", "servlet-addservlet-name");
		tomcat.start();
		tomcat.getServer().await();
	}

}
