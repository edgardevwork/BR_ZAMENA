package org.apache.ivy.osgi.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* loaded from: classes6.dex */
public class ZipUtil {
    public static void zip(File file, OutputStream outputStream) throws IOException {
        if (file.isFile() || file.isDirectory()) {
            ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
            zipOutputStream.setLevel(9);
            zipFiles(file, file, zipOutputStream);
            zipOutputStream.finish();
            zipOutputStream.close();
        }
    }

    public static void zipFiles(File file, File file2, ZipOutputStream zipOutputStream) throws IOException {
        if (file2.isDirectory()) {
            for (File file3 : file2.listFiles()) {
                zipFiles(file, file3, zipOutputStream);
            }
            return;
        }
        String strSubstring = file2.getPath().substring(file.getPath().length() + 1);
        byte[] bArr = new byte[(int) file2.length()];
        FileInputStream fileInputStream = new FileInputStream(file2);
        fileInputStream.read(bArr);
        fileInputStream.close();
        zipOutputStream.putNextEntry(new ZipEntry(strSubstring));
        zipOutputStream.write(bArr, 0, (int) file2.length());
        zipOutputStream.closeEntry();
    }
}
