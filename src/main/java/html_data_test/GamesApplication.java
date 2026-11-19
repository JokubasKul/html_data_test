package html_data_test;


import html_data_test.database_operations.DatabaseMigration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GamesApplication implements CommandLineRunner {

    private final DatabaseMigration databaseMigration;

    public GamesApplication(DatabaseMigration databaseMigration) {
        this.databaseMigration = databaseMigration;
    }

    public static void main(String[] args) {
        SpringApplication.run(GamesApplication.class, args);
    }

    @Override
    public void run(String... args) {
        databaseMigration.migrate();
    }

}