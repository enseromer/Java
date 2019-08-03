package Exception;

import java.io.IOException;

public class MethodThatMightThrowCheckedException {

	public static void main(String[] args) { // throws IOException {

		// handle or declare
		try {
			playWithFire();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("caught the fish!!!");
		}

	}

	// handle or declare
	public static void playWithFire() throws IOException {

		System.out.println("Playing with fire");

		// try {
		// throw new IOException();
		// } catch (IOException e) {
		// System.out.println("CAUGHT EXCEPTION");
		// }

	}

}
//System.out.println("Beginning");
//
//// handle or declare  
//try {
//  doSomethingDangerous();
////} catch (InterruptedException|FileNotFoundException e ) {
////  System.out.println("same exact action");
//} catch (Exception e ) {
//  System.out.println("caught");
//} 
//
//System.out.println("Ending");
//
//}
//
//public static void doSomethingDangerous() throws InterruptedException, FileNotFoundException{
//
//System.out.println("some dangerous action with multiple consequences");
//throw new InterruptedException();
//}
