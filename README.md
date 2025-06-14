🚀 Spring Boot Practice Project
This project was my introduction to backend development using Java and Spring Boot. I learned how to set up and run a Spring Boot app using:

bash
Copy
Edit
./mvnw spring-boot:run
I understood how @SpringBootApplication bootstraps everything and created a basic web controller using:

java
Copy
Edit
@Controller  
@RequestMapping("/")  
public String index() {  
    return "index";  
}
✅ I served a static index.html from the resources/static folder.

🛠️ Debugging & Port Configuration
When I ran into the common Port 8080 already in use error, I fixed it by:

Killing the process using:

bash
Copy
Edit
lsof -i :8080
kill -9 <PID>
Or changing the port in application.properties:

properties
Copy
Edit
server.port=8081
🔌 Interfaces & Dependency Injection
I created a PaymentService interface:

java
Copy
Edit
public interface PaymentService {
    void processPayment(double amount);
}
Then implemented it in:

StripePaymentService

PayPalPaymentService

I injected these services using constructors, like in OrderService:

java
Copy
Edit
public OrderService(PaymentService paymentService) {
    this.paymentService = paymentService;
}
This helped me understand abstraction, loose coupling, and polymorphism in Spring.

💡 Key Takeaways
Running & debugging Spring Boot projects

Creating REST controllers & serving static files

Using application.properties

Interface-based design for clean service logic

Dependency injection via constructors
