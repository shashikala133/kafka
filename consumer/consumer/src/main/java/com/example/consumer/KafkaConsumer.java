//package com.example.consumer;
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class KafkaConsumer {
//
//    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
//    public void listen1(String message){
//        System.out.println("message recieved 1: "+message);
//    }
//
//    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
//    public void listen2(String message){
//        System.out.println("message recieved 2: "+message);
//    }
//
//    @KafkaListener(topics = "my-new-topic", groupId = "my-new-group-rider")
//    public void listen3(RiderLocation location){
//        System.out.println("location recieved 2: "+location.getRiderId() + ":" + location.getLatitude() +":" + location.getLongitude());
//    }
//}
