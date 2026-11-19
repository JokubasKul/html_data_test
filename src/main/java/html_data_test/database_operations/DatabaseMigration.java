package html_data_test.database_operations;

import org.flywaydb.core.Flyway;
import org.springframework.stereotype.Component;

@Component
public class DatabaseMigration {

    public static void migrate() {

        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:sqlite:Games.db", null, null)
                .locations("classpath:migrations")
                .load();

        flyway.migrate();
    }
}
