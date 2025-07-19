//package com.example.producer.controller;
//
//import com.example.producer.RiderLocation;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class KafkaProducer {
//
////    private final KafkaTemplate<String,String> kafkaTemplate;
////
////    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
////        this.kafkaTemplate = kafkaTemplate;
////    }
//
////    @PostMapping("/send")
////    public String sendMessage(@RequestParam String message){
////     kafkaTemplate.send("my-topic",message);
////     return "message sent "+ message;
////    }
//
//    private final KafkaTemplate<String,RiderLocation> kafkaTemplate;
//
//    public KafkaProducer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    @PostMapping("/send")
//    public String sendMessage(@RequestParam String message){
//        RiderLocation location=new RiderLocation("rider123",24.65,54.76);
//        kafkaTemplate.send("my-new-topic",location);
//        return "message sent "+ location.getRiderId();
//    }
//}
