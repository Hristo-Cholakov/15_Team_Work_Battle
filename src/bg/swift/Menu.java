package bg.swift;

import java.sql.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of People: ");
        int peopleCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < peopleCount; i++) {

        }
        System.out.println("Please enter the number of trolls: ");
        int trollCount = Integer.parseInt(scanner.nextLine());

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/battle", "root", "1234567");
            Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery("select * from battle.people;")) {
            while (rs.next()) {
                rs.getString(1);
                rs.getString(2);
            }
        }
}
