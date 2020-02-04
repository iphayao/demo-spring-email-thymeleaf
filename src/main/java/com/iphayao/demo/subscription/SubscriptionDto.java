package com.iphayao.demo.subscription;

import lombok.Value;

import java.util.List;

@Value
public class SubscriptionDto {
    private String name;
    private String email;
    private List<String> hobbies;
}
