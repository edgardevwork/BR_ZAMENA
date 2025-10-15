package org.jfrog.build.api.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.compressors.CompressorStreamFactory;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.p059io.FilenameUtils;
import org.apache.commons.p059io.IOUtils;
import org.jfrog.gradle.plugin.artifactory.Constant;

/* loaded from: classes7.dex */
public abstract class ZipUtils {
    public static final Set<String> SUPPORTED_EXTENSIONS = CommonUtils.newHashSet(ArchiveStreamFactory.ZIP, ArchiveStreamFactory.TAR, "tar.gz", CompressorStreamFactory.GZIP, "tgz");

    public static void extract(File file, File file2) throws IOException {
        if (file == null || file2 == null) {
            throw new IllegalArgumentException("Supplied destinations cannot be null.");
        }
        if (!file.isFile()) {
            throw new IllegalArgumentException("Supplied source archive must be an existing file.");
        }
        extractFiles(file, file2.getCanonicalFile());
    }

    public static void extractFiles(File file, File file2) throws IOException {
        ArchiveInputStream archiveInputStreamCreateArchiveInputStream = null;
        try {
            try {
                archiveInputStreamCreateArchiveInputStream = createArchiveInputStream(file);
                extractFiles(archiveInputStreamCreateArchiveInputStream, file2);
            } catch (IOException e) {
                throw new RuntimeException("Error while extracting " + file.getPath(), e);
            }
        } finally {
            IOUtils.closeQuietly((InputStream) archiveInputStreamCreateArchiveInputStream);
        }
    }

    public static void extractFiles(ArchiveInputStream archiveInputStream, File file) throws Throwable {
        while (true) {
            ArchiveEntry nextEntry = archiveInputStream.getNextEntry();
            if (nextEntry == null) {
                return;
            }
            String strValidateEntryName = validateEntryName(nextEntry.getName());
            if (StringUtils.isNotBlank(strValidateEntryName)) {
                extractFile(file, archiveInputStream, strValidateEntryName, nextEntry.getLastModifiedDate(), nextEntry.isDirectory());
            }
        }
    }

    public static ArchiveInputStream createArchiveInputStream(File file) throws IOException {
        String extension = PathUtils.getExtension(file.getName());
        verifySupportedExtension(extension);
        ArchiveInputStream archiveInputStreamReturnArchiveInputStream = returnArchiveInputStream(new FileInputStream(file), extension);
        if (archiveInputStreamReturnArchiveInputStream != null) {
            return archiveInputStreamReturnArchiveInputStream;
        }
        throw new IllegalArgumentException("Unsupported archive extension: '" + extension + "'");
    }

    public static ArchiveInputStream returnArchiveInputStream(InputStream inputStream, String str) throws IOException {
        if (isZipFamilyArchive(str)) {
            return new ZipArchiveInputStream(inputStream);
        }
        if (isTarArchive(str)) {
            return new TarArchiveInputStream(inputStream);
        }
        if (isTgzFamilyArchive(str) || isGzCompress(str)) {
            return new TarArchiveInputStream(new GzipCompressorInputStream(inputStream));
        }
        return new ZipArchiveInputStream(inputStream);
    }

    public static boolean isGzCompress(String str) {
        return str.equals(CompressorStreamFactory.GZIP);
    }

    public static boolean isTarArchive(String str) {
        return str.endsWith(ArchiveStreamFactory.TAR);
    }

    public static boolean isTgzFamilyArchive(String str) {
        return str.endsWith("tar.gz") || str.endsWith("tgz");
    }

    public static boolean isZipFamilyArchive(String str) {
        return str.endsWith(ArchiveStreamFactory.ZIP) || str.endsWith("jar") || str.toLowerCase().endsWith("nupkg") || str.endsWith(Constant.WAR);
    }

    public static void verifySupportedExtension(String str) {
        if (SUPPORTED_EXTENSIONS.contains(StringUtils.trim(str))) {
            return;
        }
        throw new IllegalArgumentException("Unsupported archive extension: '" + str + "'");
    }

    public static void extractFile(File file, InputStream inputStream, String str, Date date, boolean z) throws Throwable {
        File file2 = new File(file, str);
        try {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            if (z) {
                file2.mkdirs();
            } else {
                byte[] bArr = new byte[1024];
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    while (true) {
                        try {
                            int i = inputStream.read(bArr);
                            if (i < 0) {
                                break;
                            } else {
                                fileOutputStream2.write(bArr, 0, i);
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            IOUtils.closeQuietly((OutputStream) fileOutputStream);
                            throw th;
                        }
                    }
                    IOUtils.closeQuietly((OutputStream) fileOutputStream2);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            file2.setLastModified(date.getTime());
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Can't extract file. ", e);
        }
    }

    public static String validateEntryName(String str) {
        return removeDotSegments(PathUtils.trimLeadingSlashes(FilenameUtils.separatorsToUnix(str)));
    }

    public static String removeDotSegments(String str) {
        if (str == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (str.length() > 0) {
            if (str.startsWith("../")) {
                str = PathUtils.trimLeadingSlashes(str.substring(3));
            } else if (str.startsWith("./")) {
                str = PathUtils.trimLeadingSlashes(str.substring(2));
            } else if (str.startsWith("/./")) {
                str = "/" + PathUtils.trimLeadingSlashes(str.substring(3));
            } else {
                if (!"/.".equals(str)) {
                    int i = 1;
                    if (str.startsWith("/../")) {
                        str = "/" + PathUtils.trimLeadingSlashes(str.substring(4));
                        if (!linkedList.isEmpty()) {
                            linkedList.remove(linkedList.size() - 1);
                        }
                    } else if ("/..".equals(str)) {
                        if (!linkedList.isEmpty()) {
                            linkedList.remove(linkedList.size() - 1);
                        }
                    } else if ("..".equals(str) || ".".equals(str)) {
                        str = "";
                    } else {
                        if (str.startsWith("/")) {
                            str = "/" + PathUtils.trimLeadingSlashes(str.substring(1));
                        } else {
                            i = 0;
                        }
                        int iIndexOf = str.indexOf(47, i);
                        if (-1 == iIndexOf) {
                            iIndexOf = str.length();
                        }
                        linkedList.add(str.substring(0, iIndexOf));
                        str = str.substring(iIndexOf);
                    }
                }
                str = "/";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            stringBuffer.append((String) it.next());
        }
        return stringBuffer.toString();
    }

    public static class PathUtils {
        public static String getExtension(String str) {
            int iLastIndexOf;
            if (str != null && (iLastIndexOf = str.lastIndexOf(46)) >= 0) {
                return str.substring(iLastIndexOf + 1);
            }
            return null;
        }

        public static String trimLeadingSlashes(CharSequence charSequence) {
            CharSequence charSequenceTrimLeadingSlashChars = trimLeadingSlashChars(charSequence);
            if (charSequenceTrimLeadingSlashChars != null) {
                return charSequenceTrimLeadingSlashChars.toString();
            }
            return null;
        }

        public static CharSequence trimLeadingSlashChars(CharSequence charSequence) {
            if (charSequence == null) {
                return null;
            }
            return (charSequence.length() <= 0 || charSequence.charAt(0) != '/') ? charSequence : trimLeadingSlashChars(charSequence.subSequence(1, charSequence.length()));
        }

        public static String trimTrailingSlashes(CharSequence charSequence) {
            CharSequence charSequenceTrimTrailingSlashesChars = trimTrailingSlashesChars(charSequence);
            if (charSequenceTrimTrailingSlashesChars != null) {
                return charSequenceTrimTrailingSlashesChars.toString();
            }
            return null;
        }

        public static CharSequence trimTrailingSlashesChars(CharSequence charSequence) {
            if (charSequence == null) {
                return null;
            }
            return (charSequence.length() <= 0 || charSequence.charAt(charSequence.length() + (-1)) != '/') ? charSequence : trimTrailingSlashes(charSequence.subSequence(0, charSequence.length() - 1));
        }
    }
}
