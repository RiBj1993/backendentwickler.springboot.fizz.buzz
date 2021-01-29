package backendentwickler.springboot.fizz.buzz.backendentwickler.springboot.fizz.buzz;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import backendentwickler.springboot.fizz.buzz.backendentwickler.springboot.fizz.buzz.restservice.Greeting;
import junit.framework.Assert;

import org.mockito.runners.MockitoJUnitRunner;

 
 
@RunWith(MockitoJUnitRunner.class)
public class GreetingServiceTest {

	

   @Mock
   private RestTemplate restTemplate= new RestTemplate();

   @InjectMocks
   private GreetingService empService = new GreetingService();

   @Test
     void findNoFizzBizz() {
	   Greeting emp = new Greeting(1,"the result of the argorithme is , 1!");
	   Greeting employee = GreetingService.getGreeting("1");
       Assert.assertEquals(emp.getContent(), employee.getContent());
   }
   
   
   @Test
   void findBuzz() {
	   Greeting emp = new Greeting(1, "the result of the argorithme is , Buzz!");
	   Greeting employee = GreetingService.getGreeting("5");
     Assert.assertEquals(emp.getContent(), employee.getContent());
 }
   @Test
   void findFizzBuzz() {
	   Greeting emp = new Greeting(1, "the result of the argorithme is , FizzBuzz!");
	   Greeting employee = GreetingService.getGreeting("15");
     Assert.assertEquals(emp.getContent(), employee.getContent());
 }
   @Test
   void findFizz() {
	   Greeting emp = new Greeting(1, "the result of the argorithme is , Fizz!");
	   Greeting employee = GreetingService.getGreeting("3");
     Assert.assertEquals(emp.getContent(), employee.getContent());
 }
   }