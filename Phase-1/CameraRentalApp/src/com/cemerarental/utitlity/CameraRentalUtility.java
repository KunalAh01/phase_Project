	package com.cemerarental.utitlity;

import java.util.Scanner;

import com.camerarental.service1.cameraService;

public class CameraRentalUtility {
	static Scanner sc=new Scanner(System.in);
	public static void login() {
		System.out.println("Enter the email");
		String emailid=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
		if(emailid.equals("camerarent@gmail.com") && password.equals("camera@123")) {
			System.out.println("successfully logged in");
			mainOption();
		}
		else {
			System.out.println("Please check you credentials once again");
		}
		
		
		
	}
	private static void mainOption() {
	
		cameraService cs=new cameraService();
		int choice;
		String con="";
		do {
			System.out.println("1.My Camera");
			System.out.println("2.Rent A Camera");
			System.out.println("3.View	 All Camera");
			System.out.println("4.My Wallet");
			System.out.println("5.Exit");
			System.out.println("Please enter you choice");
			choice =sc.nextInt();
			switch (choice) {
			case 1: subMenuOption();
				break;
			
			case 2: cs.rentCamera();
				break;
			case 3: cs.displayCameraList();
				break;
			
			case 4: cs.myWallet();
				break;
			case 5: System.out.println("Thanks");
			break;
			
			default:
				System.out.println("Wrong choice please try again");
			}
			System.out.println("Do you want to continue again(y/n)");
			con=sc.next();
		} while (con.equalsIgnoreCase("y"));
		
		
	}
	private static void subMenuOption() {
		int choice;
		String con="";
		cameraService cs=new cameraService();
		do {
			System.out.println("1.Add");
			System.out.println("2.Remove");
			System.out.println("3.View My Cameras");
			System.out.println("4.Go To Previous Menu");
			choice =sc.nextInt();
			switch (choice) {
			case 1: cs.addCamera();
				break;
			
			case 2:cs.removeCamera();
				break;
			case 3: cs.viewAllCamera();
				break;
			
			case 4: mainOption();
				break;
			
			
			default:
				System.out.println("Wrong choice please try again");
			}
			System.out.println("Do you want to continue again(y/n)");
			con=sc.next();
		} while (con.equalsIgnoreCase("y"));
		 	
	}


}
