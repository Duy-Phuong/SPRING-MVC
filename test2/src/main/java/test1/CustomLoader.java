package test1;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class CustomLoader implements ResourceLoaderAware{
	private ResourceLoader r;

	
	public Resource getResource(String arg0) {
		// TODO Auto-generated method stub
		return r.getResource(arg0);
	}


	public void setResourceLoader(ResourceLoader arg0) {
		r = arg0;
		
	}
	
	
}
