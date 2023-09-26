package accessModifier;

public class AccessModifier2 {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		System.out.println("public int" + am.publicAccess);
		am.publicAccessMethod();
		
		//System.out.println("private int" + am.privateAccess);
		//am.privateAccessMethod();
		
		System.out.println("protected int" + am.protectedAccess );
		am.protectedAccessMethod();
		
		System.out.println("int default" + am.defaultAccess);
		am.defaultAccessMethod();
	}

}
