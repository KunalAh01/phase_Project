//package com.camerarental.service;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Scanner;
//
//import com.camerarental.bean.camera;
//
//public class cameraService {
//	Scanner sc=new Scanner(System.in);
//	
//	List<camera> listOfCamera=new ArrayList<camera>();
////	camera  cc= new camera();
////	Scanner sc=new Scanner(System.in);
//	public  void addCamera() {
//		System.out.println("Enter the camera brand");
//		String brand=sc.next();
//		System.out.println("Enter the camera model");
//		String model=sc.next();
//		System.out.println("Enter the per day price");
//		float perDayPrice=sc.nextFloat();
//		camera  cc= new camera();
//		cc.setBrand(brand);
//		cc.setModel(model);
//		cc.setPerDayPrice(perDayPrice);
//		cc.setStatus("Available");
//		cc.setid(1);
//		listOfCamera.add(cc);
//		System.out.println("Details added successfully");
//		
//		
//		
//	}
//	public void removeCamera() {
//		Iterator<camera> it=listOfCamera.iterator();
//		while(it.hasNext()) {
//			System.out.println("enter the model you want to remove");
//			String removeCam;
//			removeCam=sc.next();
//			
//			String cc=it.next().getModel();
//			if(cc.contains(removeCam)) {
//				listOfCamera.remove(removeCam);
//				System.out.println("removed");
//				System.out.println("Available camera are:");
//				viewAllCamera();
//				break;
//			}else {
//				System.out.println("Incorrect model ");
//			}
//			
//			
//		}
//		
//	}
//	
//	public void viewAllCamera() {
//		Iterator<camera> it=listOfCamera.iterator();
//		while(it.hasNext()) {
//		camera cc=it.next();
//			System.out.println(cc.getModel());
//		}
//		
//		
//		
//	}
//	
//	public void wallet() {
//		float amount=0;
//		String choice="";
//		System.out.println("Your current wallet balance is - INR"+ amount);
//		System.out.println("Do you want to deposit more amount in you wallet: y/n");
//		choice=sc.next();
//		if(choice.equalsIgnoreCase("y")) {
//			System.out.println("Enter the amount");
//			int inr=sc.nextInt();
//			amount+=inr;
//			System.out.println("Your current wallet balance is - INR"+ amount);
//		}
//		else if(choice.equalsIgnoreCase("n")){
//				System.out.println("Thanks");
//	}
//		else {
//			System.out.println("please enter correct key");
//		}
//}
//	
//	public void rent() {
//		
//		Iterator<camera> it=listOfCamera.iterator();
//		while(it.hasNext()) {
//			System.out.println("enter the model you want to remove");
//			String rentCam;
//			rentCam=sc.next();
//			String cc=it.next().getModel();
//			if(cc.contains(rentCam)) {
//				
//				System.out.println("removed");
//				System.out.println("Available camera are:");
//				viewAllCamera();
//				break;
//			}else {
//				System.out.println("Incorrect model ");
//			}
//			
//			
//		}
//		
//	}
//}
