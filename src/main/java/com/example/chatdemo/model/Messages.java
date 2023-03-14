package com.example.chatdemo.model;

import lombok.Data;
import com.example.chatdemo.enumerator.MessageOptions;

@Data
public class Messages {

    private MessageOptions messageOptions;
    private String content;
    private String sender;

}
