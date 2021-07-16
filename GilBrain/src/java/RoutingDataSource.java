project gilbrain.java;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import project.service.auth.AuthService;

/*public class RoutingDataSource {

}*/
public class RoutingDataSource extends AbstractRoutingDataSource {
	private static final Logger LOG = Logger.getLogger(RoutingDataSource.class);
	@Autowired
	private AuthService authService;

	@Override
	protected Object determineCurrentLookupKey() {
		String jwt = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest()
				.getHeader("Authorization");
		LOG.info("determineCurrentLookupKey!!!!");
		LOG.info(authService.getJwtClaims(jwt).get("platform"));
		return jwt == null ? "local" : authService.getJwtClaims(jwt).get("platform");
	}
}
