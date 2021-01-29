package backendentwickler.springboot.fizz.buzz.backendentwickler.springboot.fizz.buzz.restservice;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {
	
	@JsonProperty("id")
	private  long id;
	@JsonProperty("content")
	private   String content;

 
	public Greeting() {
		super();
	}

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
