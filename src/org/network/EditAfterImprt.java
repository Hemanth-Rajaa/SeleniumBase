package org.network;

public class EditAfterImprt {

	private void test() {
		System.out.println("(branch b edit for conflict), Edited on branch a");
		System.out.println("Branch b edit for conflict, Edit branch a 1");
		System.out.println("Edit on branch b");
		
		System.out.println("Adding 2nd line on beranch B");
		System.out.println("Edited on branch a");// editing branch a for conflict.
		System.out.println("Edit branch a 1");// conflict did not happen by branch b
		System.out.println("adding few more lines for conflict");
	}
}
