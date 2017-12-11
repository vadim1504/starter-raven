package spring.raven;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import spring.raven.annotation.ConditionOnProduction;

@Configurable
@EnableConfigurationProperties(RavenProperties.class)
public class RavenConfiguration {

    @Bean
    @ConditionOnProduction
    @ConditionalOnProperty("raven.where")
    public RavenListener ravenListener(RavenProperties properties){
        return new RavenListener(properties);
    }
}
