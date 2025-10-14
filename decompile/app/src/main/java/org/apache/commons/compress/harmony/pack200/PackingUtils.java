package org.apache.commons.compress.harmony.pack200;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.apache.commons.compress.harmony.pack200.Archive;

/* loaded from: classes7.dex */
public class PackingUtils {
    public static PackingLogger packingLogger = new PackingLogger("org.harmony.apache.pack200", null);

    static {
        LogManager.getLogManager().addLogger(packingLogger);
    }

    public static class PackingLogger extends Logger {
        public boolean verbose;

        public PackingLogger(String str, String str2) {
            super(str, str2);
            this.verbose = false;
        }

        @Override // java.util.logging.Logger
        public void log(LogRecord logRecord) {
            if (this.verbose) {
                super.log(logRecord);
            }
        }

        public void setVerbose(boolean z) {
            this.verbose = z;
        }
    }

    public static void config(PackingOptions packingOptions) throws SecurityException, IOException {
        String logFile = packingOptions.getLogFile();
        if (logFile != null) {
            FileHandler fileHandler = new FileHandler(logFile, false);
            fileHandler.setFormatter(new SimpleFormatter());
            packingLogger.addHandler(fileHandler);
            packingLogger.setUseParentHandlers(false);
        }
        packingLogger.setVerbose(packingOptions.isVerbose());
    }

    public static void log(String str) {
        packingLogger.log(Level.INFO, str);
    }

    public static void copyThroughJar(JarInputStream jarInputStream, OutputStream outputStream) throws IOException {
        JarOutputStream jarOutputStream = new JarOutputStream(outputStream, jarInputStream.getManifest());
        try {
            jarOutputStream.setComment("PACK200");
            log("Packed META-INF/MANIFEST.MF");
            byte[] bArr = new byte[16384];
            while (true) {
                JarEntry nextJarEntry = jarInputStream.getNextJarEntry();
                if (nextJarEntry != null) {
                    jarOutputStream.putNextEntry(nextJarEntry);
                    while (true) {
                        int i = jarInputStream.read(bArr);
                        if (i != -1) {
                            jarOutputStream.write(bArr, 0, i);
                        }
                    }
                    log("Packed " + nextJarEntry.getName());
                } else {
                    jarInputStream.close();
                    jarOutputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    jarOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void copyThroughJar(JarFile jarFile, OutputStream outputStream) throws IOException {
        JarOutputStream jarOutputStream = new JarOutputStream(outputStream);
        try {
            jarOutputStream.setComment("PACK200");
            byte[] bArr = new byte[16384];
            Enumeration<JarEntry> enumerationEntries = jarFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                jarOutputStream.putNextEntry(jarEntryNextElement);
                InputStream inputStream = jarFile.getInputStream(jarEntryNextElement);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            jarOutputStream.write(bArr, 0, i);
                        }
                    } finally {
                    }
                }
                jarOutputStream.closeEntry();
                log("Packed " + jarEntryNextElement.getName());
                inputStream.close();
            }
            jarFile.close();
            jarOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    jarOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static List<Archive.PackingFile> getPackingFileListFromJar(JarInputStream jarInputStream, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        Manifest manifest = jarInputStream.getManifest();
        if (manifest != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            manifest.write(byteArrayOutputStream);
            arrayList.add(new Archive.PackingFile("META-INF/MANIFEST.MF", byteArrayOutputStream.toByteArray(), 0L));
        }
        while (true) {
            JarEntry nextJarEntry = jarInputStream.getNextJarEntry();
            if (nextJarEntry == null) {
                break;
            }
            arrayList.add(new Archive.PackingFile(readJarEntry(nextJarEntry, new BufferedInputStream(jarInputStream)), nextJarEntry));
        }
        if (!z) {
            reorderPackingFiles(arrayList);
        }
        return arrayList;
    }

    public static List<Archive.PackingFile> getPackingFileListFromJar(JarFile jarFile, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        Enumeration<JarEntry> enumerationEntries = jarFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            JarEntry jarEntryNextElement = enumerationEntries.nextElement();
            InputStream inputStream = jarFile.getInputStream(jarEntryNextElement);
            try {
                arrayList.add(new Archive.PackingFile(readJarEntry(jarEntryNextElement, new BufferedInputStream(inputStream)), jarEntryNextElement));
                if (inputStream != null) {
                    inputStream.close();
                }
            } finally {
            }
        }
        if (!z) {
            reorderPackingFiles(arrayList);
        }
        return arrayList;
    }

    public static byte[] readJarEntry(JarEntry jarEntry, InputStream inputStream) throws IOException {
        long size = jarEntry.getSize();
        if (size > ParserMinimalBase.MAX_INT_L) {
            throw new IllegalArgumentException("Large Class!");
        }
        if (size < 0) {
            size = 0;
        }
        byte[] bArr = new byte[(int) size];
        if (inputStream.read(bArr) == size) {
            return bArr;
        }
        throw new IllegalArgumentException("Error reading from stream");
    }

    public static void reorderPackingFiles(List<Archive.PackingFile> list) {
        Iterator<Archive.PackingFile> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isDirectory()) {
                it.remove();
            }
        }
        list.sort(new Comparator() { // from class: org.apache.commons.compress.harmony.pack200.PackingUtils$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return PackingUtils.lambda$reorderPackingFiles$0((Archive.PackingFile) obj, (Archive.PackingFile) obj2);
            }
        });
    }

    public static /* synthetic */ int lambda$reorderPackingFiles$0(Archive.PackingFile packingFile, Archive.PackingFile packingFile2) {
        String name = packingFile.getName();
        String name2 = packingFile2.getName();
        if (name.equals(name2)) {
            return 0;
        }
        if ("META-INF/MANIFEST.MF".equals(name)) {
            return -1;
        }
        if ("META-INF/MANIFEST.MF".equals(name2)) {
            return 1;
        }
        return name.compareTo(name2);
    }
}
