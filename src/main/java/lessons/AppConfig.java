import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    // Äëÿ testing
    @Bean
    @Profile("dev")
    public void devDataSource() {
//        return new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.HSQL)
//                .addScript("classpath:schema.sql")
//                .addScript("classpath:test-data.sql")
//                .build();
//        return null;
    }

    // Äëÿ production
    @Bean
    @Profile("production")
    public void productionDataSource() throws Exception {
//        Context ctx = new InitialContext();
//        return (DataSource) ctx.lookup("java:comp/env/jdbc/datasource");
//        return null;
    }
}