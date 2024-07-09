package fish.payara.secure;

import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.jwt.Claim;
import org.eclipse.microprofile.jwt.ClaimValue;


/**
 *
 */
@Path("/protected")
@RequestScoped
public class ProtectedController {

    @Inject
    @Claim("custom-value")
    private ClaimValue<String> custom;

    @GET
    @RolesAllowed("protected")
    public String getJWTBasedValue() {
        return "Protected Resource; Custom value : " + custom.getValue();
    }
}
