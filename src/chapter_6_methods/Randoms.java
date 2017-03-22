package chapter_6_methods;

import java.util.Random;

public class Randoms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("randInt:"+randInt(2, 15));
		System.out.println("randMath:"+randMath(2, 16));
		
		//print randoms from 0 to 100
		for(int i=0;i<10;i++){
			int x = (int)(Math.random() * 101);
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		//print randoms from 0 to 100
		for(int i=0;i<10;i++){
			 Random randomno = new Random();
			 System.out.println("Next int value: " + randomno.nextInt(101));
		}
	}
	
	public static int randInt(int min, int max) {
		//includes min and max
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	public static int randMath(int min, int max){
		//includes min exclusive max
		int r = (int) (Math.random() * (max - min)) + min;
		return r;
	}

}
