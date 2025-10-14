package org.apache.ivy.core.pack;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.ivy.util.CopyProgressListener;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.Message;
import org.jfrog.gradle.plugin.artifactory.Constant;

/* loaded from: classes7.dex */
public class ZipPacking extends ArchivePacking {
    public static final String[] NAMES = {ArchiveStreamFactory.ZIP, "jar", Constant.WAR};

    @Override // org.apache.ivy.core.pack.ArchivePacking
    public String[] getNames() {
        return NAMES;
    }

    @Override // org.apache.ivy.core.pack.ArchivePacking
    public String getUnpackedExtension(String str) {
        if (!str.endsWith(ArchiveStreamFactory.ZIP) && !str.endsWith("jar") && !str.endsWith(Constant.WAR)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - 3);
        return strSubstring.endsWith(".") ? strSubstring.substring(0, strSubstring.length() - 1) : strSubstring;
    }

    @Override // org.apache.ivy.core.pack.ArchivePacking
    public void unpack(InputStream inputStream, File file) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    File fileResolveFile = FileUtil.resolveFile(file, name);
                    if (!FileUtil.isLeadingPath(file, fileResolveFile, true)) {
                        Message.verbose("\t\tskipping " + name + " as its target " + fileResolveFile.getCanonicalPath() + " is outside of " + file.getCanonicalPath() + ".");
                    } else {
                        Message.verbose("\t\texpanding " + name + " to " + fileResolveFile);
                        File parentFile = fileResolveFile.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        if (nextEntry.isDirectory()) {
                            fileResolveFile.mkdirs();
                        } else {
                            writeFile(zipInputStream, fileResolveFile);
                        }
                        fileResolveFile.setLastModified(nextEntry.getTime());
                    }
                } else {
                    zipInputStream.close();
                    return;
                }
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public void writeFile(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            FileUtil.copy(inputStream, (OutputStream) fileOutputStream, (CopyProgressListener) null, false);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
