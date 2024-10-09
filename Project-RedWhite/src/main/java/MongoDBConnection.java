import static com.mongodb.client.model.Filters.eq;

import com.mongodb.ConnectionString;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class MongoDBConnection {
    public static void main(String[] args) {
        // Создаем клиент MongoDB
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            // Получаем базу данных (если она не существует, она будет создана)
            MongoDatabase database = mongoClient.getDatabase("mydatabase");

            // Получаем коллекцию (если она не существует, она будет создана)
            MongoCollection<Document> collection = database.getCollection("mycollection");
        }
    }
}

/*
public class MongoDBConnection {
    String uri = "mongodb://localhost:27017";
    String dbName = "myDatabase";
    MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");

    ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017");
    MongoClient mongoClient = MongoClients.create(connectionString);
}
*/
