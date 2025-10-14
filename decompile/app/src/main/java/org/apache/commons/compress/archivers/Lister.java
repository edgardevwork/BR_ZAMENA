package org.apache.commons.compress.archivers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Enumeration;
import java.util.function.Consumer;
import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarFile;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;

/* loaded from: classes5.dex */
public final class Lister {
    public static final ArchiveStreamFactory FACTORY = ArchiveStreamFactory.DEFAULT;

    public static void main(String[] strArr) throws ArchiveException, IOException {
        if (strArr.length == 0) {
            usage();
            return;
        }
        System.out.println("Analysing " + strArr[0]);
        File file = new File(strArr[0]);
        if (!file.isFile()) {
            System.err.println(file + " doesn't exist or is a directory");
        }
        String strDetectFormat = strArr.length > 1 ? strArr[1] : detectFormat(file);
        if (ArchiveStreamFactory.SEVEN_Z.equalsIgnoreCase(strDetectFormat)) {
            list7z(file);
            return;
        }
        if ("zipfile".equals(strDetectFormat)) {
            listZipUsingZipFile(file);
        } else if ("tarfile".equals(strDetectFormat)) {
            listZipUsingTarFile(file);
        } else {
            listStream(file, strArr);
        }
    }

    public static void listStream(File file, String[] strArr) throws ArchiveException, IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(file.toPath(), new OpenOption[0]));
        try {
            ArchiveInputStream archiveInputStreamCreateArchiveInputStream = createArchiveInputStream(strArr, bufferedInputStream);
            try {
                System.out.println("Created " + archiveInputStreamCreateArchiveInputStream.toString());
                while (true) {
                    ArchiveEntry nextEntry = archiveInputStreamCreateArchiveInputStream.getNextEntry();
                    if (nextEntry != null) {
                        System.out.println(nextEntry.getName());
                    } else {
                        archiveInputStreamCreateArchiveInputStream.close();
                        bufferedInputStream.close();
                        return;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static ArchiveInputStream createArchiveInputStream(String[] strArr, InputStream inputStream) throws ArchiveException {
        if (strArr.length > 1) {
            return FACTORY.createArchiveInputStream(strArr[1], inputStream);
        }
        return FACTORY.createArchiveInputStream(inputStream);
    }

    public static String detectFormat(File file) throws ArchiveException, IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(file.toPath(), new OpenOption[0]));
        try {
            String strDetect = ArchiveStreamFactory.detect(bufferedInputStream);
            bufferedInputStream.close();
            return strDetect;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void list7z(File file) throws IOException {
        String name;
        SevenZFile sevenZFile = new SevenZFile(file);
        try {
            System.out.println("Created " + sevenZFile);
            while (true) {
                SevenZArchiveEntry nextEntry = sevenZFile.getNextEntry();
                if (nextEntry != null) {
                    if (nextEntry.getName() == null) {
                        name = sevenZFile.getDefaultName() + " (entry name was null)";
                    } else {
                        name = nextEntry.getName();
                    }
                    System.out.println(name);
                } else {
                    sevenZFile.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    sevenZFile.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void listZipUsingZipFile(File file) throws IOException {
        ZipFile zipFile = new ZipFile(file);
        try {
            System.out.println("Created " + zipFile);
            Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
            while (entries.hasMoreElements()) {
                System.out.println(entries.nextElement().getName());
            }
            zipFile.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    zipFile.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void listZipUsingTarFile(File file) throws IOException {
        TarFile tarFile = new TarFile(file);
        try {
            System.out.println("Created " + tarFile);
            tarFile.getEntries().forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.Lister$$ExternalSyntheticLambda1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Lister.lambda$listZipUsingTarFile$0((TarArchiveEntry) obj);
                }
            });
            tarFile.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    tarFile.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static /* synthetic */ void lambda$listZipUsingTarFile$0(TarArchiveEntry tarArchiveEntry) {
        System.out.println(tarArchiveEntry.getName());
    }

    public static void usage() {
        PrintStream printStream = System.out;
        printStream.println("Parameters: archive-name [archive-type]\n");
        printStream.println("The magic archive-type 'zipfile' prefers ZipFile over ZipArchiveInputStream");
        printStream.println("The magic archive-type 'tarfile' prefers TarFile over TarArchiveInputStream");
    }
}
