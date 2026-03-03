package com.ecobazaar.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Main Spring Boot Application for EcoBazaarX Backend
 * 
 * Features:
 * - RESTful API endpoints
 * - Firebase/Firestore integration
 * - JWT authentication
 * - Caching support
 * - Async processing
 * - Health monitoring
 * 
 * @author EcoBazaarX Team
 * @version 1.0.0
 */
@SpringBootApplication
@EnableAsync
public class EcoBazaarXApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcoBazaarXApplication.class, args);
        String port = System.getenv("PORT");
        if (port == null) port = "10000";
        System.out.println(" EcoBazaarX Backend Started Successfully!");
        System.out.println(" akash port: " + port);

    }
}



