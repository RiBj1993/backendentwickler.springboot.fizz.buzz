package backendentwickler.springboot.fizz.buzz.backendentwickler.springboot.fizz.buzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import backendentwickler.springboot.fizz.buzz.backendentwickler.springboot.fizz.buzz.restservice.Greeting;

@Service
public class GreetingService {

	@Autowired
	private static RestTemplate restTemplate = new RestTemplate();

	public static Greeting getGreeting(String id) {
		ResponseEntity resp = restTemplate.getForEntity("http://localhost:8080/greeting?number=" + id, Greeting.class);

		return resp.getStatusCode() == HttpStatus.OK ? (Greeting) resp.getBody() : null;
	}
}