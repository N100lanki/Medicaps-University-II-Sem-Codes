
import java.lang.*;
public class finalizeclass {

	protected void finalize() throws Throwable
	{
		try {

			System.out.println("inside method calling finalize()");
		}
		catch (Throwable th) {

			throw th;
            //System.out.println("Value of obj th Is :"+th);
		}
		finally {

			System.out.println("Calling finalize method of the Object class");

			// Calling finalize() of Object class
			super.finalize();
		}
	}

	// Driver code
	public static void main(String[] args) throws Throwable
	{

		// Creating demo's object
		finalizeclass obj = new finalizeclass();

		// Calling finalize of demo
		obj.finalize();
	}
}
