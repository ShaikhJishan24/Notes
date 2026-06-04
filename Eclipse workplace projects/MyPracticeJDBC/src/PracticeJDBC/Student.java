package PracticeJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Student {

	public static void addstud() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the roll no :");
		int rollno = sc.nextInt();

		System.out.println("Enter the name:");
		String name = sc.next();

		System.out.println("Enter the Age: ");
		int age = sc.nextInt();

		try (Connection con = Mycon.getCon()) {
			String sql = "insert into myStudent values(?, ?, ?)";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, rollno);
			pstm.setString(2, name);
			pstm.setInt(3, age);

			int k = pstm.executeUpdate();
			if (k > 0) {
				System.out.println("Student Added Successfully..........");
			} else {
				System.out.println("Something went wrong...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void showstud() {


		try (Connection con = Mycon.getCon()) {
			
			String sql = "select * from myStudent";
			Statement pstm = con.createStatement();
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
