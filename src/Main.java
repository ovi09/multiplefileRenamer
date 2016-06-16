import java.io.File;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final File folder = new File("C:/Users/Coder/Desktop/human360/chest");
		listFilesForFolder(folder);

	}
	static int i=1;
	
	
	public static void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	        	String name="chest"+i+".jpg";
	        	i++;
	        	
	        	File file = new File("C:/Users/Coder/Desktop/human360/chest/"+name);

//	        	// File (or directory) with new name
	        	File file2 = new File("C:/Users/Coder/Desktop/human360/chest/"+fileEntry.getName());
//
//	        	if (file2.exists())
//	        	   throw new java.io.IOException("file exists");
//
//	        	// Rename file (or directory)
	        	boolean success = file2.renameTo(file);

	        	if (!success) {
	        	  System.out.print("File was not successfully renamed");
//	        	}
	            System.out.println(fileEntry.getName());
	        }
	        }}
	    
	}

}
