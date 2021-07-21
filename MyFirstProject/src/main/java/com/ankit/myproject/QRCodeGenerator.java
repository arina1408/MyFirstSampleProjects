package com.ankit.myproject;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGenerator {

public static void main(String[] args) throws Exception
{
// TODO Auto-generated method stub
String details = "Name: Ankit kumar Chourasia, Mobile +916200511837";
ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
File f = new File("C:\\Users\\Admin\\Documents\\QRCodes\\MyDetails.jpg");
FileOutputStream fos = new FileOutputStream(f);
fos.write(out.toByteArray());
System.out.println("Generated");
fos.flush();
fos.close();
}

}