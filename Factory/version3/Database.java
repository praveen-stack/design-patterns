package Factory.version3;

public interface Database {

    // This voilates SRP as database has too many responsibilities.

    DatabaseFactory createDatabaseFactory();

    // create connection

    // create security
}
