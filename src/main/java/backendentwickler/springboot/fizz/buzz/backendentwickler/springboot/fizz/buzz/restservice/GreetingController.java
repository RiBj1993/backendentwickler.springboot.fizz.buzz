package backendentwickler.springboot.fizz.buzz.backendentwickler.springboot.fizz.buzz.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "the result of the argorithme is , %s!";
	private static final String templatecatch = "please enter a number > 0";

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "number", defaultValue = "4") String name) {
		String savevar = "";
		try {
			for (int i = 1; i <= Integer.parseInt(name); i++) {

				if (i % 15 == 0) {
					savevar = "FizzBuzz";
				} else if (i % 3 == 0) {
					savevar = "Fizz";
				} else if (i % 5 == 0) {
					savevar = "Buzz";
				} else {
					savevar = "" + i;
				}
			}

			return new Greeting(counter.incrementAndGet(), String.format(template, savevar));
		}
		
	   catch (NumberFormatException e) {
			return new Greeting(counter.incrementAndGet(), String.format(templatecatch));
		  }
		catch (Error e) {
			return new Greeting(counter.incrementAndGet(), String.format(templatecatch));

		}

	}
}