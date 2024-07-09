package fish.payara.hello;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 * Configures RESTful Web Services for the application.
 */
@ApplicationPath("api")
@ApplicationScoped
public class RestConfiguration extends Application {
    
}
