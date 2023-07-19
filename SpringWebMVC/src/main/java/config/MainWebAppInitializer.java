package config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


@Configuration
public class MainWebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(final ServletContext sc) {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

        context.scan("");

        sc.addListener(new ContextLoaderListener(context));

        ServletRegistration.Dynamic dispatcher = sc.addServlet("mvc", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}
