package com.otp;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OTPRepository {

    public static void saveOTP(String email, String otp) {

        String query =
                "INSERT INTO otp_records(email, otp) VALUES(?, ?)";

        try (
                Connection con = DatabaseConnection.getConnection();

                PreparedStatement ps =
                        con.prepareStatement(query)
        ) {

            ps.setString(1, email);
            ps.setString(2, otp);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("OTP Saved Successfully");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}