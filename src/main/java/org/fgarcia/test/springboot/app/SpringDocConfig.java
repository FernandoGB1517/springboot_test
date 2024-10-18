package org.fgarcia.test.springboot.app;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

    @Bean
    public GroupedOpenApi cuentasApi() {
        return GroupedOpenApi.builder()
                .group("cuentas")
                .pathsToMatch("/api/cuentas/**")
                .packagesToScan("org.fgarcia.test.springboot.app.controllers")
                .build();
    }
}

