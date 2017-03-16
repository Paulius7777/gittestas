
package firstlesson;

/**
 * @author zwaclaw
 *
 */

public class HelloWorld {

	public static void main(String[] args) {
		
		Input ivestis = new Input();
		System.out.println("Iveskite savo varda");
		String name = ivestis.ivestis();
		System.out.println("Hello "+ name);
	        }
	}
