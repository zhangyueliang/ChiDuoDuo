package db;

import db.mongodb.MongoDBConnection;
import db.mysql.MySQLConnection;

public class DBConnectionFactory {
	private static final String DEFAULT_DB = "mongodb";

	// Create a DBConnection based on given dbtype.
	public static DBConnection getDBConnection(String db) {
		switch (db) {
		case "mysql":
			return MySQLConnection.getInstance();
		case "mongodb":
			return MongoDBConnection.getInstance();
		// you may try other dbs and add them here.
		default:
			throw new IllegalArgumentException("Invalid db " + db);
		}
	}

	// This is overloading not overriding.
	public static DBConnection getDBConnection() {
		return getDBConnection(DEFAULT_DB);
	}
}
