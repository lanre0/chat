package com.example.chatdemo.model;

import lombok.Data;
import com.example.chatdemo.enumerator.MessageOptions;

@Data
public class Messages {

    private MessageOptions type;
    private String content;
    private String sender;

}
