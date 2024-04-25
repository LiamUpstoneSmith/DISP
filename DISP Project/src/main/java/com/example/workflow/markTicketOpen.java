package com.example.workflow;


import org.springframework.stereotype.Component;
import io.camunda.zeebe.spring.clinet.annotation.ZeebeWorker;

@Component
public class markTicketOpen {
    @ZeebeWorker(type="markTicketOpen", autoComplete=true)
    puclic void getTicket(){
        System.out.println("Open Ticket");
    }

}
