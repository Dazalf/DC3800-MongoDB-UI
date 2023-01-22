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
import java.util.regex.Pattern;

import org.bson.Document;

public class BookRatings {

	// Replace the uri string with your MongoDB deployment's connection string.
	String uri = "mongodb://localhost:27017";
	
	public BookRatings() {
		
	}
	
	
	/**
	 * This method provides insights as required by Functional Requirement 2.
	 * @param isbn
	 * @return
	 * @throws Exception
	 */
	public String getAvgBookRating(String isbn) throws Exception {
			
		MongoClient mongoClient = MongoClients.create(uri);
		MongoDatabase database = mongoClient.getDatabase("bx-data");
		MongoCollection<Document> bookCollection = database.getCollection("book_ratings");
		
		Document doc = bookCollection.aggregate(Arrays.asList(
				match(Filters.eq("isbn", isbn)),
				group("$isbn", Accumulators.avg("book_rating", "$book_rating"))
				)
			).first();
		
		if(doc == null) {
			return "No results found";
		}
				
		System.out.println(doc.toJson());
			
		return doc.toJson();
		
	}
	
	/**
	 * This method provides insights as required by Functional Requirement 3, age only..
	 * @param isbn
	 * @param age
	 * @return
	 * @throws Exception
	 */
	public String getAvgBookRatingByAge(String isbn, int age) throws Exception {
		
		MongoClient mongoClient = MongoClients.create(uri);
		MongoDatabase database = mongoClient.getDatabase("bx-data");
		MongoCollection<Document> bookCollection = database.getCollection("book_ratings");
		
		Document doc = bookCollection.aggregate(Arrays.asList(
				match(Filters.eq("isbn", isbn)),
				match(Filters.eq("age", age)),
				group("$isbn", Accumulators.avg("book_rating", "$book_rating"))
				)
			).first();
		
		if(doc == null) {
			return "No results found";
		}
				
		System.out.println(doc.toJson());
			
		return doc.toJson();
		
	}
	
	/**
	 * This method provides insights as required by Functional Requirement 3, location only. 
	 * @param isbn
	 * @param location
	 * @return
	 * @throws Exception
	 */
	public String getAvgBookRatingByLocation(String isbn, String location) throws Exception {
		
		MongoClient mongoClient = MongoClients.create(uri);
		MongoDatabase database = mongoClient.getDatabase("bx-data");
		MongoCollection<Document> bookCollection = database.getCollection("book_ratings");
		
		Document doc = bookCollection.aggregate(Arrays.asList(
				match(Filters.eq("isbn", isbn)),
				match(Filters.regex("location", ".*" + location + ".*")),
				group("$isbn", Accumulators.avg("book_rating", "$book_rating"))
				)
			).first();
		
		if(doc == null) {
			return "No results found";
		}
				
		System.out.println(doc.toJson());
			
		return doc.toJson();
		
	}
	
	/**
	 * This method provides insights as required by Functional Requirement 4.
	 * @param isbn
	 * @return
	 * @throws Exception
	 */
	public String getAvgAuthorRating(String author) throws Exception {
			
		MongoClient mongoClient = MongoClients.create(uri);
		MongoDatabase database = mongoClient.getDatabase("bx-data");
		MongoCollection<Document> bookCollection = database.getCollection("book_ratings");
		
		Document doc = bookCollection.aggregate(Arrays.asList(
				match(Filters.regex("book_author", ".*" + author + ".*")),
				group("$book_author", Accumulators.avg("book_rating", "$book_rating"))
				)
			).first();
		
		if(doc == null) {
			return "No results found";
		}
				
		System.out.println(doc.toJson());
			
		return doc.toJson();
		
	}
	
	/**
	 * This method provides insights as required by Functional Requirement 5, by age only.
	 * @param isbn
	 * @return
	 * @throws Exception
	 */
	public String getAvgAuthorRatingByAge(String author, int age) throws Exception {
			
		MongoClient mongoClient = MongoClients.create(uri);
		MongoDatabase database = mongoClient.getDatabase("bx-data");
		MongoCollection<Document> bookCollection = database.getCollection("book_ratings");
		
		Document doc = bookCollection.aggregate(Arrays.asList(
				match(Filters.regex("book_author", ".*" + author + ".*")),
				match(Filters.eq("age", age)),
				group("$book_author", Accumulators.avg("book_rating", "$book_rating"))
				)
			).first();
		
		if(doc == null) {
			return "No results found";
		}
				
		System.out.println(doc.toJson());
			
		return doc.toJson();
		
	}
	
	/**
	 * This method provides insights as required by Functional Requirement 5, by location only.
	 * @param isbn
	 * @return
	 * @throws Exception
	 */
	public String getAvgAuthorRatingByLocation(String author, String location) throws Exception {
			
		MongoClient mongoClient = MongoClients.create(uri);
		MongoDatabase database = mongoClient.getDatabase("bx-data");
		MongoCollection<Document> bookCollection = database.getCollection("book_ratings");
		
		Document doc = bookCollection.aggregate(Arrays.asList(
				match(Filters.regex("book_author", ".*" + author + ".*")),
				match(Filters.regex("location", ".*" + location + ".*")),
				group("$book_author", Accumulators.avg("book_rating", "$book_rating"))
				)
			).first();
		
		if(doc == null) {
			return "No results found";
		}
				
		System.out.println(doc.toJson());
			
		return doc.toJson();
		
	}
}