import java.lang.*;
public class FinalizeOverride {
    // Java code to show the
// overriding of finalize() method

// Defining a class demo since every java class
// is a subclass of predefined Object class
// Therefore demo is a subclass of Object class
public class demo {

	protected void finalize() throws Throwable
	{
		try {

			System.out.println("inside demo's finalize()");
		}
		catch (Throwable e) {

			throw e;
		}
		finally {

			System.out.println("Calling finalize method"
							+ " of the Object class");

			// Calling finalize() of Object class
			super.finalize();
		}
	}

	// Driver code
	public static void main(String[] args) throws Throwable
	{

		// Creating demo's object
		demo d = new demo();

		// Calling finalize of demo
		d.finalize();
	}
}

    
}
