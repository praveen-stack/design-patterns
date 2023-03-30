package Factory.version2;

public interface Database {

    // This voilates SRP as database has too many responsibilities.

    Query creatQuery();

    // create connection

    // create security
}
