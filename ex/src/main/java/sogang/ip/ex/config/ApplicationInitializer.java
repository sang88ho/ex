package sogang.ip.ex.config;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		super.onStartup(servletContext);
		
//		// Load application context
//		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
//		rootContext.register(ApplicationContext.class);
//		rootContext.setDisplayName("Happy Wedding");
//		
//		// Add context loader listener 
//		servletContext.addListener(new ContextLoaderListener(rootContext));
//		
//		// Declare dispatcher servlet
//		ServletRegistration.Dynamic dispatcher = 
//				servletContext.addServlet("dispatcher", new DispatcherServlet(rootContext));
//		dispatcher.setLoadOnStartup(1);
//		dispatcher.addMapping("/");
		
//		// Register Spring security filter
//		FilterRegistration.Dynamic springSecurityFilterChain = 
//				servletContext.addFilter("springSecurityFilterChain", DelegatingFilterProxy.class);
//		springSecurityFilterChain.addMappingForUrlPatterns(null, false, "/*");
//		
//		// Register Spring Social filter so that we can disconnect from providers
//		FilterRegistration.Dynamic hiddenHttpMethodFilter = 
//				servletContext.addFilter("hiddenHttpMethodFilter", HiddenHttpMethodFilter.class);
//		hiddenHttpMethodFilter.addMappingForUrlPatterns(null, false, "/*");
//
//		// Regisiter Encoding filter
//		FilterRegistration.Dynamic encodingFilter =
//				servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
//		encodingFilter.setInitParameter("encoding", "UTF-8");
//		encodingFilter.addMappingForUrlPatterns(null, false, "/*");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { MainConfig.class, DataConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { MainConfig.class, ViewResolverConfig.class };
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
	
	@Override
	protected Filter[] getServletFilters() {
//		DelegatingFilterProxy delegatingFilterProxy = new DelegatingFilterProxy("springSecurityFilterChain");
		
		// Register Spring Social filter so that we can disconnect from providers
		HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();

		// Regisiter Encoding filter
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);

//		return new Filter[] { delegatingFilterProxy, hiddenHttpMethodFilter, characterEncodingFilter };
		return new Filter[] { hiddenHttpMethodFilter, characterEncodingFilter };
	}
}
