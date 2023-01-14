package GPTsave.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.config.conditional.ConditionalOnEnabledGlobalFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@EnableSpringCloudGateway
@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r.path("/upload/**")
						.uri("http://13.68.238.234:3020"))
				.route(r -> r.path("/db/**")
						.uri("https://gptsavedb.azurewebsites.net"))
				.route(r -> r.path("/auth/**")
						.uri("https://gptsaveauth.azurewebsites.net"))
				.build();
	}
}
