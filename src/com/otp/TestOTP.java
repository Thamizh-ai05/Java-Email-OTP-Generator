package com.otp;

public class TestOTP {

    public static void main(String[] args) {

        String email = "test@gmail.com";

        String otp =
                OTPGenerator.generateOTP();

        System.out.println("Generated OTP : " + otp);

        OTPRepository.saveOTP(email, otp);
    }
}