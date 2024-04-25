package com.example.workflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateTicketStatus {
    @JsonProperty("status")
    public String status;

}
