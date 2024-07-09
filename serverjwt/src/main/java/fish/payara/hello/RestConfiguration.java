package fish.payara.hello;

import jakarta.annotation.security.DeclareRoles;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.auth.LoginConfig;

/**
 * Configures RESTful Web Services for the application.
 */
//@ApplicationPath("resources")
@ApplicationPath("/api")
@ApplicationScoped

@LoginConfig(authMethod = "MP-JWT")
@DeclareRoles({"protected"})
public class RestConfiguration extends Application {
    
}
