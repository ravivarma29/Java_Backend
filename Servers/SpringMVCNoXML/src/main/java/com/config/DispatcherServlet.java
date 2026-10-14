package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configs = {Config.class};
		return configs;
	}

	@Override
	protected String[] getServletMappings() {
		String [] mappings = {"/flm/*" };
		return null;
	}

}
