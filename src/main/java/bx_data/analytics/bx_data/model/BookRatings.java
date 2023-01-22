package bx_data.analytics.bx_data.model;

import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Filters;

import static com.mongodb.client.model.Aggregates.*;
import java.util.Arrays;

import org.bson.Document;

public class BookRatings {

	// Replace the uri string with your MongoDB deployment's connection string.
	String uri = "mongodb://localhost:27017";
	
	public BookRatings() {
		
	}
	
	public String getAvgBookRating(String isbn) throws Exception {
			
		MongoClient mongoClient = MongoClients.create(uri);
		MongoDatabase database = mongoClient.getDatabase("bx-data");
		MongoCollection<Document> bookCollection = database.getCollection("book_ratings");
			
		// find a specific document
		//Document doc = bookCollection.find(eq("book_author", author)).first();
		
		Document doc = bookCollection.aggregate(Arrays.asList(
				match(Filters.eq("isbn", isbn)),
				group("$isbn", Accumulators.avg("book_rating", "$book_rating"))
				)
			).first();
				
		System.out.println(doc.toJson());
			
		return doc.toJson();
		
	}
}