/**
 * 
 */
package cp120.assignments.assignment002;

/**
 * @author Jack Lisenko
 *
 */
public class BitMasks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] register = {0b0110100100011001, 0b0010101100011101, 0b0110110100011001, 0b0110111100011101};
		
		int size = register.length;
		int[] originField = new int[size];
		int[] securityField = new int[size];
		int[] dataField = new int[size];
		int[] countField = new int[size];
		int[] startField = new int[size];
		int[] controlField = new int[size];		
		
		int originMask =   0b0000000000000111;
		int securityMask = 0b0000000000011000;
		int dataMask =     0b0000000111100000;
		int countMask =    0b0000011000000000;
		int startMask =    0b0000100000000000;
		int controlMask =  0b1111000000000000;
		
		int value;
				
		for (int i = 0; i < size; i++)
		{
			originField[i] = register[i] & originMask;
			securityField[i] = register[i] & securityMask;
			dataField[i] = register[i] & dataMask;
			countField[i] = register[i] & countMask;
			startField[i] = register[i] & startMask;
			controlField[i] = register[i] & controlMask;
			
			System.out.println("For register: 0b" + Integer.toBinaryString(register[i]));
			
			value = originField[i];
			System.out.println("The origin field value is " + value);
			
			value = securityField[i] >> 3;
			System.out.println("The security field value is " + value);
			
			value = dataField[i] >> 5;
			System.out.println("The data field value is " + value);
			
			value = countField[i] >> 9;
			System.out.println("The count field value is " + value);
			
			value = startField[i] >> 11;
			System.out.println("The start field value is " + value);
			
			value = controlField[i] >> 12;
			System.out.println("The control field value is " + value);
			
			System.out.println("");	
		}
	}
}
