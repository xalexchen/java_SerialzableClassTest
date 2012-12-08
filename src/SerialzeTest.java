import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class SerialzeTest {
	private static byte[] byteout2;
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
			user.setName("example1");
			Custom a = new Custom();
			a.setName("eeee");
			user.setCt(a);
			
			oos.writeObject(user);
			byteout = out.toByteArray();
			
			  ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			    try {
			        ObjectOutput obout = new ObjectOutputStream(byteArrayOutputStream);
			        obout.writeObject(user);
			        String abbbb=  byteArrayOutputStream.toString("UTF-8");
			        System.out.println(abbbb);
			        byte[] aaae = abbbb.getBytes("UTF-8");
					ByteArrayInputStream bi = new ByteArrayInputStream(aaae);
					ObjectInputStream oi = new ObjectInputStream(bi);

					User fina = (User)oi.readObject();
//					Object fina2 = (Object)oi.readObject();
					System.out.println(fina.getName().toString());
			    } catch (IOException e) {
			    	e.printStackTrace();
			    }
			    
			String ooo = new String(byteout,"US-ASCII");
			System.out.println(ooo);
			byte[] aaa = ooo.getBytes("US-ASCII");
			// bytearray to object
			ByteArrayInputStream bi = new ByteArrayInputStream(byteout);
			ObjectInputStream oi = new ObjectInputStream(bi);

			User fina = (User)oi.readObject();
//			Object fina2 = (Object)oi.readObject();
			System.out.println(fina.getName());
			System.out.println(fina.getCt().getName());
//			System.out.println(fina2);
		} catch (Exception e) {
			// TODO: handle exception1
			e.printStackTrace();
		}
	}

}
