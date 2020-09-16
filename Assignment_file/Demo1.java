import java.io.*;


public class Demo1 {
	public static void main( String[] args) {
		File f = new File("assgn.txt");
		
		
		try(FileOutputStream fos = new FileOutputStream(f)) {
			System.out.println("Enter data");
			byte[] b = new byte [100];
			int k = System.in.read(b);
			fos.write(b, 0, k);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream(f)) {
			byte[] b = new byte[(int)f.length()];
			fis.read(b);
			String ss = new String(b);
			System.out.println(ss);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}