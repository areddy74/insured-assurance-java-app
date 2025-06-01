package com.insured;

public class InsuredInsurance {
    public String getWelcomeMessage() {
        return "Welcome to Insured Assurance!";
    }

    public static void main(String[] args) {
        System.out.println(new InsuredInsurance().getWelcomeMessage());
    }
}
