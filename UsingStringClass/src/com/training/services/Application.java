package com.training.services;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringService service=new StringService();
		//int key=1;
		//int key=2;
		int key=14;
		
		switch(key) {
		case 1:
			service.stringEquals("ram", "ram");
			break;
		case 2:
			service.stringObjectEquals();
			
		case 3:
			service.usingTrim(" ramesh ");
			break;
		
		case 4:
			service.lengthOfString(" ramesh ");
			break;
			
		case 5:
			service.usingSubString("welcome");
			break;
			
		case 6:
			service.usingCharAtAndIndexOf("ram@abc.com");
			break;
		case 7:
			service.usingReplace("ram@abc.com","welcome to chennai");
			break;
		case 8:
			service.usingConcat("hi", "dear");
			break;
			
		case 9:
			service.usingCompareTo("hi", "welcome");
			break;
			
		case 10:
			service.usingStringFormat("ram", 50.78896);
			break;
			
		case 11:
			service.usingStringFormat(99);
			break;
			
		case 12:
			service.usingStringFormat(20, 20);
			break;
			
		case 13:
			service.usingStringFormat("ramesh","ramesh");
			break;
			
		case 14:
			service.usingStringFormat(-421L);
			break;
		default:
			break;
		}
	}

}
