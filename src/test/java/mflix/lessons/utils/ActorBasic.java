package mflix.lessons.utils;

import java.util.Date;
import java.util.List;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class ActorBasic {
	@BsonProperty("_id")
	private ObjectId id;
	
	@BsonProperty("name")
	private String name;
	
	@BsonProperty("date_of_birth")
	private Date dateOfBirth;
	
	private List awards;
	
	@BsonProperty("num_movies")
	private int numMovies;

	public ActorBasic() { // constructor
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List getAwards() {
		return awards;
	}

	public void setAwards(List awards) {
		this.awards = awards;
	}

	public int getNumMovies() {
		return numMovies;
	}

	public void setNumMovies(int numMovies) {
		this.numMovies = numMovies;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public ActorBasic withNewId() {
		setId(new ObjectId());
		return this;
	}
}
