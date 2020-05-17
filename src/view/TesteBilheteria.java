package view;

import java.util.Random;
import java.util.concurrent.Semaphore;

import controller.Compra;

public class TesteBilheteria {
	
	public static void main(String[] args) {
		
		Random numeAleatorio = new Random();
		Semaphore controle = new Semaphore(1);
		
		for (int i = 0; i < 300; i++) {
			
			Thread compra = new Compra(String.valueOf(i), (numeAleatorio.nextInt(4)+1), controle);	
			compra.start();
		}
		
	}

}
