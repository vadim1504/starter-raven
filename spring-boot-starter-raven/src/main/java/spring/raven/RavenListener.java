package spring.raven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {

    private final RavenProperties ravenProperties;

    @Autowired
    public RavenListener(RavenProperties properties){
        this.ravenProperties = properties;
    }

    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ravenProperties.getWhere().forEach(s-> System.out.println("raven starter ["+s+"]"));
    }
}
