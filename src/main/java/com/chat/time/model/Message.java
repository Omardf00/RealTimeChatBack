package com.chat.time.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Message {
    private String senderName;
    private String recieverName;
    private String message;
    private Date date;
    private Status status;
}
