import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;

import javax.imageio.ImageIO;

public class Main
{
	public static void main( String[] args ) throws IOException
	{
		String host = "127.0.0.1";
        int port = 9090;
   
        Socket sock = new Socket(host, 9090);  
        OutputStream os = sock.getOutputStream();
        
        File myFile = new File("D:\\University Project\\Computer Network\\Server Project\\send.png");
        BufferedImage image = ImageIO.read(myFile);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "png" , baos);
        
         
        os.write(baos.toByteArray());
         
        os.flush();
         
        sock.close();   
	}
}