package spring.raven.annotation;

import org.springframework.context.annotation.Conditional;
import spring.raven.OnProductionCondition;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Conditional({OnProductionCondition.class})
public @interface ConditionOnProduction {
}
