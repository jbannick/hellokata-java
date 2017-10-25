import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class HelloDataInputAndOutputStreams {
	public static void main(String...args) throws IOException {
		System.out.println("Hello DataInputAndoutputStreams!");
		
		String FILENAME = "datastream.bin";
		byte[] bytes = {Byte.MIN_VALUE, Byte.MAX_VALUE};
		DataOutputStream dos = 
			new DataOutputStream(
				new FileOutputStream(FILENAME));
		
		dos.writeByte(Byte.MAX_VALUE);
		dos.writeShort(Short.MAX_VALUE);
		dos.writeInt(Integer.MAX_VALUE);
		dos.writeLong(Long.MAX_VALUE);
		dos.writeFloat(Float.MAX_VALUE);
		dos.writeDouble(Double.MAX_VALUE);
		dos.writeBoolean(true);
		dos.write(bytes, 0, bytes.length);
		dos.write(Byte.MAX_VALUE);
		
		dos.writeBytes("abc");
		dos.writeChar('a');
		dos.writeChars("abc");
		
		dos.close();
		
		DataInputStream dis =
			new DataInputStream(
				new FileInputStream(FILENAME));
		
		byte    by01 = dis.readByte();
		short   sh01 = dis.readShort();
		int     in01 = dis.readInt();
		long    lo01 = dis.readLong();
		float   fl01 = dis.readFloat();
		double  db01 = dis.readDouble();
		boolean bo01 = dis.readBoolean();
		int     by02 = dis.read();
		
		byte[]  bytes01 = new byte[2];
		int count = dis.read(bytes01, 0, bytes.length);
		
//		byte[] bytes02= new byte[2];
////		int count02 = dis.read(bytes02);
//		char ch01 = dis.readChar();
//		char[] chars03 = new char[2];
////		int count03 = dis.read(chars03);
		
		// TODO: METHODS THAT TRAVERSE THE STREAM
		// TODO: WHAT ABOUT UNSIGNED VALUES?

		dis.close();
		
		System.out.printf("byte    by01 = dis.readByte();    %s\n", by01 );
		System.out.printf("short   sh01 = dis.readShort();   %s\n", sh01 );
		System.out.printf("int     in01 = dis.readInt();     %s\n", in01 );
		System.out.printf("long    lo01 = dis.readLong();    %s\n", lo01 );
		System.out.printf("float   fl01 = dis.readFloat();   %s\n", fl01 );
		System.out.printf("double  db01 = dis.readDouble();  %s\n", db01 );
		System.out.printf("boolean bo01 = dis.readBoolean(); %s\n", bo01 );
		System.out.printf("int     by02 = dis.read();        %s\n", by02 );

		System.out.printf("int count = dis.read(bytes01, 0, bytes.length); %s %s\n", 
			count, Arrays.toString(bytes01));
	}
}
