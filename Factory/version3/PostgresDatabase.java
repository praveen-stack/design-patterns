package Factory.version3;

public class PostgresDatabase implements Database {

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new PostgresDatabaseFactory();
    }
}
