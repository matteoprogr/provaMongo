package com.example.demo.Mongo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "MongoDb";
    }

    @Override
    public MongoClient mongoClient() {
        String username = "root";
        String password = "root";
        String database = "MongoDb";
        String host = "localhost"; // o l'indirizzo del server MongoDB

        String connectionString = "mongodb://" + username + ":" + password + "@" + host + "/" + database + "?authSource=admin";
        return MongoClients.create(connectionString);
    }
}
