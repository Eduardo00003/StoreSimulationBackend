🛠️ Spring Boot Practice Project
This project was my introduction to building backend applications using Java and Spring Boot. I learned key concepts for developing web applications, structuring service layers, and using interfaces to organize logic cleanly.

📚 What I Learned
✅ Spring Boot Basics
Set up and ran a Spring Boot project using:

bash
Copy
Edit
./mvnw spring-boot:run
Understood how @SpringBootApplication bootstraps the app.

✅ Web Controller & Routing
Created a HomeController using:

java
Copy
Edit
@Controller
@RequestMapping
public String index() {
    return "index";
}
Served a static index.html page using Spring Boot’s default path.

✅ Port Configuration & Debugging
Fixed a "Port 8080 already in use" error by:

Killing the process using lsof and kill -9

Or changing the port in application.properties:

ini
Copy
Edit
server.port=8081
✅ Interfaces & Implementation
Built a PaymentService interface:

java
Copy
Edit
public interface PaymentService {
    void processPayment(double amount);
}
Implemented it in:

StripePaymentService

PayPalPaymentService

Learned the power of abstraction and loose coupling.

✅ Manual Dependency Injection
Injected the service into another class using a constructor:

java
Copy
Edit
public OrderService(PaymentService paymentService) {
    this.paymentService = paymentService;
}
✅ Polymorphism in Action
Called methods based on the interface type, not the specific class:

java
Copy
Edit
PaymentService service = new StripePaymentService();
service.processPayment(100.0);
✅ Console Logging
Used System.out.println() to debug and understand flow.

🧠 Skills Practiced
Spring Boot app lifecycle

MVC structure (Controller → Service)

Interface-driven design

Constructor-based dependency injection

Debugging and reading logs

Clean, modular backend code

