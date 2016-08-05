package org.example;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Configurable
@Import(AspectConfig.class)
@ComponentScan("org.example.service")
public class AppConfig {
	
}
