package spring.raven;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("raven")
public class RavenProperties {

    private List<String> where;

    public List<String> getWhere() {
        return where;
    }

    public void setWhere(List<String> where) {
        this.where = where;
    }

}
