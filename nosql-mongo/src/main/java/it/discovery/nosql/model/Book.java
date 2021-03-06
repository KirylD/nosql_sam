package it.discovery.nosql.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Book in a library
 */
@Getter
@Setter
@Document(collection = "books")
public class Book extends BaseEntity {
	private List<Translation> names;

	private Complexity complexity;

	private PersonInfo person;

	private String publisherId;

	/**
	 * Publishing year
	 */
	private int year;

	/**
	 * Total number of pages
	 */
	private int pages;

	private List<Review> reviews;

	public void addReview(Review review) {
		if (reviews == null) {
			reviews = new ArrayList<>();
		}
		reviews.add(review);
	}

	public void addTranslation(String name, String locale) {
		if (names == null) {
			names = new ArrayList<>();
		}
		names.add(new Translation(name, locale));
	}
}
