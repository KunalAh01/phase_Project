package com.camerarental.service1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.camerarental.bean.camera;

public class cameraService1 {


	    static Scanner sc = new Scanner(System.in);
	    private List<camera> listOfCamera = new ArrayList<>();
	    private float walletBalance = 0;

	    public cameraService1() {
	    	listOfCamera();
	    }

	    private void listOfCamera() {
	    	listOfCamera.add(new camera(1, "Samsung", "S01", 1000, "Available"));
	    	listOfCamera.add(new camera(2, "Samsung", "S02", 850, "Available"));
	    	listOfCamera.add(new camera(3, "Samsung", "S03", 1500, "Available"));
	    	listOfCamera.add(new camera(4, "Sony", "SO01", 1750, "Available"));
	    	listOfCamera.add(new camera(5, "Sony", "SO02", 1500, "Available"));
	    	listOfCamera.add(new camera(6, "Sony", "SO03", 1200, "Available"));
	    	listOfCamera.add(new camera(7, "Sony", "SO04", 1200, "Available"));
	    	listOfCamera.add(new camera(8, "canon", "C01", 1100, "Available"));
	    	listOfCamera.add(new camera(9, "canon", "C02", 1000, "Available"));
	    }

	    public void addCamera() {
//	        System.out.println("Enter the brand of the camera:");
//	        String brand = sc.next();
//	        System.out.println("Enter the model of the camera:");
//	        String model = sc.next();
//	        System.out.println("Enter the per-day rental amount:");
//	        float perDayPrice = sc.nextFloat();
//
//	        camera newCamera = new camera(cameraList.size() + 1, brand, model, perDayPrice, "Available");
//	        cameraList.add(newCamera);
//	        System.out.println("Camera added successfully!");
	    	System.out.println("============");
	    	
	    	
	    	System.out.println("Enter the camera brand");
			String brand=sc.next();
			System.out.println("Enter the camera model");
			String model=sc.next();
			System.out.println("Enter the per day price");
			float perDayPrice=sc.nextFloat();
			camera  cc= new camera();
			cc.setBrand(brand);
			cc.setModel(model);
			cc.setPerDayPrice(perDayPrice);
			cc.setStatus("Available");
			cc.setid(1);
			listOfCamera.add(cc);
			System.out.println("Details added successfully");
	    	
	    }

	    public void removeCamera() {
	        System.out.println("Enter the index of the camera to remove:");
	        int cameraIndex = sc.nextInt();

	        if (cameraIndex >= 0 && cameraIndex < listOfCamera.size()) {
	        	listOfCamera.remove(cameraIndex - 1);
	            System.out.println("Camera removed successfully!");
	        } else {
	            System.out.println("Invalid camera index.");
	        }
	    }

	    public void viewAllCamera() {
	        if (listOfCamera.isEmpty()) {
	            System.out.println("No Data Present at This Moment.");
	        } else {
	            System.out.println("FOLLOWING IS THE LIST OF AVAILABLE CAMERA(S)-");
	            System.out.println("================================================================================");
	            System.out.printf("%-12s%-16s%-18s%-15s%s%n", "CAMERA ID", "BRAND", "MODEL NUMBER", "PRICE (PER DAY)", "STATUS");
	            System.out.println("================================================================================");
	            displayCameraList();
	            System.out.println("================================================================================");
	        }
	    }

	    public void rentCamera() {
	        System.out.println("Enter the index of the camera you want to rent:");
	        int cameraIndex = sc.nextInt();

	        if (cameraIndex >= 1 && cameraIndex <= listOfCamera.size()) {
	        	camera selectedCamera = listOfCamera.get(cameraIndex - 1);

	            if (walletBalance >= selectedCamera.getPerDayPrice()) {
	                walletBalance -= selectedCamera.getPerDayPrice();
	                selectedCamera.setStatus("Not Available");
	                System.out.println("Camera rented successfully! Amount deducted from wallet.");
	            } else {
	                System.out.println("Insufficient balance in your wallet. Please deposit money.");
	            }
	        } else {
	            System.out.println("Invalid camera index.");
	        }
	    }

	    public void myWallet() {
	        System.out.println("Wallet Balance: INR " + walletBalance);

	        System.out.println("1: Deposit money (Only INR) ");
	        System.out.println("2: Go back to the previous menu");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("Enter the amount to deposit:");
	                float depositAmount = sc.nextFloat();
	                walletBalance += depositAmount;
	                System.out.println("Amount deposited successfully! New balance: INR" + walletBalance);
	                break;
	            case 2:
	                break;
	            default:
	                System.out.println("Invalid choice.");
	        }
	    }

	    public void displayCameraList() {
	        for (camera camera : listOfCamera) {
	            System.out.printf("%-12d%-16s%-18s%-15.2f%s%n", camera.getId(), camera.getBrand(),
	                    camera.getModel(), camera.getPerDayPrice(), camera.getStatus());
	        }
	    }
	    }



