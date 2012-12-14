import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerialzeTest {
	private static byte[] byteout;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(out);
			User user = new User();
			user.setName("user_name");
			
			Custom custom = new Custom();
			custom.setName("custom_name");
			user.setCt(custom);
			
			oos.writeObject(user);
			byteout = out.toByteArray();
			
			// byte array to object
			ByteArrayInputStream bi = new ByteArrayInputStream(byteout);
			ObjectInputStream oi = new ObjectInputStream(bi);
			User fina = (User)oi.readObject();
			
			
			System.out.println(fina.getName());
			System.out.println(fina.getCt().getName());
		} catch (Exception e) {
			// TODO: handle exception1
			e.printStackTrace();
		}
	}
}
