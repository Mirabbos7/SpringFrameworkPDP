package uz.pdp.springframework;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({Config.class})
@ImportResource //used for importing another type of configuration like XML, Groovy etc
public class MainConfig {

}
