package org.apache.ivy.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import java.util.zip.GZIPInputStream;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.util.url.TimeoutConstrainedURLHandler;
import org.apache.ivy.util.url.URLHandler;
import org.apache.ivy.util.url.URLHandlerRegistry;

/* loaded from: classes8.dex */
public final class FileUtil {
    public static final int BUFFER_SIZE = 65536;
    public static final byte[] EMPTY_BUFFER = new byte[0];

    public static boolean symlink(File file, File file2, boolean z) throws IOException {
        if (file.isFile()) {
            if (!prepareCopy(file, file2, z)) {
                return false;
            }
        } else {
            if (Files.isSymbolicLink(file2.toPath()) && z) {
                Message.verbose("Un-linking existing symbolic link " + file2 + " during symlink creation, since overwrite=true");
                Files.delete(file2.toPath());
            }
            if (file2.getParentFile() != null) {
                file2.getParentFile().mkdirs();
            }
        }
        Files.createSymbolicLink(file2.toPath(), file.getAbsoluteFile().toPath(), new FileAttribute[0]);
        return true;
    }

    public static boolean copy(File file, File file2, CopyProgressListener copyProgressListener) throws IOException {
        return copy(file, file2, copyProgressListener, false);
    }

    public static boolean prepareCopy(File file, File file2, boolean z) throws IOException {
        if (file.isDirectory()) {
            if (file2.exists()) {
                if (!file2.isDirectory()) {
                    throw new IOException("impossible to copy: destination is not a directory: " + file2);
                }
            } else {
                file2.mkdirs();
            }
            return true;
        }
        if (file2.exists()) {
            if (!file2.isFile()) {
                throw new IOException("impossible to copy: destination is not a file: " + file2);
            }
            if (z) {
                if (Files.isSymbolicLink(file2.toPath()) || !file2.canWrite()) {
                    file2.delete();
                }
            } else {
                Message.verbose(file2 + " already exists, nothing done");
                return false;
            }
        }
        if (file2.getParentFile() != null) {
            file2.getParentFile().mkdirs();
        }
        return true;
    }

    public static boolean copy(File file, File file2, CopyProgressListener copyProgressListener, boolean z) throws IOException {
        if (!prepareCopy(file, file2, z)) {
            return false;
        }
        if (file.isDirectory()) {
            return deepCopy(file, file2, copyProgressListener, z);
        }
        try {
            if (Files.isSameFile(file.toPath(), file2.toPath())) {
                Message.verbose("Skipping copy of file " + file + " to " + file2 + " since they are the same file");
                return z;
            }
        } catch (NoSuchFileException unused) {
        } catch (IOException e) {
            Message.verbose("Could not determine if " + file + " and dest " + file2 + " are the same file", e);
        }
        copy(new FileInputStream(file), file2, copyProgressListener);
        long length = file.length();
        long length2 = file2.length();
        if (length != length2) {
            file2.delete();
            throw new IOException("size of source file " + file.toString() + "(" + length + ") differs from size of dest file " + file2.toString() + "(" + length2 + ") - please retry");
        }
        file2.setLastModified(file.lastModified());
        return true;
    }

    public static boolean deepCopy(File file, File file2, CopyProgressListener copyProgressListener, boolean z) throws IOException {
        List listEmptyList = Collections.emptyList();
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                file2.delete();
                file2.mkdirs();
                file2.setLastModified(file.lastModified());
            } else {
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    listEmptyList = new ArrayList(Arrays.asList(fileArrListFiles));
                }
            }
        } else {
            file2.mkdirs();
            file2.setLastModified(file.lastModified());
        }
        File[] fileArrListFiles2 = file.listFiles();
        if (fileArrListFiles2 != null) {
            for (File file3 : fileArrListFiles2) {
                File file4 = new File(file2, file3.getName());
                if (!listEmptyList.isEmpty()) {
                    listEmptyList.remove(file4);
                }
                if (file3.isDirectory()) {
                    deepCopy(file3, file4, copyProgressListener, z);
                } else {
                    copy(file3, file4, copyProgressListener, z);
                }
            }
        }
        Iterator it = listEmptyList.iterator();
        while (it.hasNext()) {
            forceDelete((File) it.next());
        }
        return true;
    }

    public static void copy(URL url, File file, CopyProgressListener copyProgressListener, TimeoutConstraint timeoutConstraint) throws IOException {
        URLHandler uRLHandler = URLHandlerRegistry.getDefault();
        if (uRLHandler instanceof TimeoutConstrainedURLHandler) {
            ((TimeoutConstrainedURLHandler) uRLHandler).download(url, file, copyProgressListener, timeoutConstraint);
        } else {
            uRLHandler.download(url, file, copyProgressListener);
        }
    }

    public static void copy(File file, URL url, CopyProgressListener copyProgressListener, TimeoutConstraint timeoutConstraint) throws IOException {
        URLHandler uRLHandler = URLHandlerRegistry.getDefault();
        if (uRLHandler instanceof TimeoutConstrainedURLHandler) {
            ((TimeoutConstrainedURLHandler) uRLHandler).upload(file, url, copyProgressListener, timeoutConstraint);
        } else {
            uRLHandler.upload(file, url, copyProgressListener);
        }
    }

    public static void copy(InputStream inputStream, File file, CopyProgressListener copyProgressListener) throws IOException {
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        copy(inputStream, new FileOutputStream(file), copyProgressListener);
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, CopyProgressListener copyProgressListener) throws IOException {
        copy(inputStream, outputStream, copyProgressListener, true);
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, CopyProgressListener copyProgressListener, boolean z) throws IOException {
        CopyProgressEvent copyProgressEvent = copyProgressListener != null ? new CopyProgressEvent() : null;
        try {
            byte[] bArr = new byte[65536];
            if (copyProgressListener != null) {
                copyProgressListener.start(copyProgressEvent);
            }
            long j = 0;
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    if (Thread.currentThread().isInterrupted()) {
                        throw new IOException("transfer interrupted");
                    }
                    outputStream.write(bArr, 0, i);
                    j += i;
                    if (copyProgressListener != null) {
                        copyProgressListener.progress(copyProgressEvent.update(bArr, i, j));
                    }
                } else {
                    if (copyProgressListener != null) {
                        copyProgressEvent.update(EMPTY_BUFFER, 0, j);
                    }
                    try {
                        outputStream.flush();
                    } catch (IOException unused) {
                    }
                    if (z) {
                        inputStream.close();
                        outputStream.close();
                    }
                    if (z) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            outputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (copyProgressListener != null) {
                        copyProgressListener.end(copyProgressEvent);
                        return;
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            if (z) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
                try {
                    outputStream.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public static String readEntirely(BufferedReader bufferedReader) throws IOException {
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReader.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(org.apache.commons.lang3.StringUtils.f9903LF);
                line = bufferedReader.readLine();
            }
            String string = sb.toString();
            bufferedReader.close();
            return string;
        } catch (Throwable th) {
            bufferedReader.close();
            throw th;
        }
    }

    public static String readEntirely(File file) throws IOException {
        return readEntirely(new FileInputStream(file));
    }

    public static String readEntirely(InputStream inputStream) throws IOException {
        try {
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[65536];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    sb.append(new String(bArr, 0, i));
                } else {
                    String string = sb.toString();
                    inputStream.close();
                    return string;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public static String concat(String str, String str2) {
        return str + "/" + str2;
    }

    public static boolean forceDelete(File file) {
        File[] fileArrListFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (!forceDelete(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static List<File> getPathFiles(File file, File file2) {
        ArrayList arrayList = new ArrayList();
        while (file2 != null && !file2.getAbsolutePath().equals(file.getAbsolutePath())) {
            arrayList.add(file2);
            file2 = file2.getParentFile();
        }
        if (file != null) {
            arrayList.add(file);
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public static Collection<File> listAll(File file, Collection<String> collection) {
        return listAll(file, new ArrayList(), collection);
    }

    public static Collection<File> listAll(File file, Collection<File> collection, Collection<String> collection2) {
        if (collection2.contains(file.getName())) {
            return collection;
        }
        if (file.exists()) {
            collection.add(file);
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                listAll(file2, collection, collection2);
            }
        }
        return collection;
    }

    public static File resolveFile(File file, String str) {
        File file2 = new File(str);
        if (!file2.isAbsolute()) {
            file2 = new File(file, str);
        }
        return normalize(file2.getPath());
    }

    public static File normalize(String str) {
        Stack stack = new Stack();
        DissectedPath dissectedPathDissect = dissect(str);
        stack.push(dissectedPathDissect.root);
        StringTokenizer stringTokenizer = new StringTokenizer(dissectedPathDissect.remainingPath, File.separator);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (!".".equals(strNextToken)) {
                if ("..".equals(strNextToken)) {
                    if (stack.size() < 2) {
                        return new File(str);
                    }
                    stack.pop();
                } else {
                    stack.push(strNextToken);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            if (i > 1) {
                sb.append(File.separatorChar);
            }
            sb.append((String) stack.elementAt(i));
        }
        return new File(sb.toString());
    }

    public static DissectedPath dissect(String str) {
        char c = File.separatorChar;
        String strTrim = str.replace('/', c).replace('\\', c).trim();
        File[] fileArrListRoots = File.listRoots();
        if (fileArrListRoots != null) {
            for (File file : fileArrListRoots) {
                if (strTrim.startsWith(file.getPath())) {
                    String path = file.getPath();
                    String strSubstring = strTrim.substring(path.length());
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < strSubstring.length(); i++) {
                        char cCharAt = strSubstring.charAt(i);
                        if (i == 0) {
                            sb.append(cCharAt);
                        } else {
                            char cCharAt2 = strSubstring.charAt(i - 1);
                            if (cCharAt != c || cCharAt2 != c) {
                                sb.append(cCharAt);
                            }
                        }
                    }
                    return new DissectedPath(path, sb.toString());
                }
            }
        }
        if (strTrim.length() > 1 && strTrim.charAt(1) == c) {
            int iIndexOf = strTrim.indexOf(c, strTrim.indexOf(c, 2) + 1);
            String strSubstring2 = iIndexOf > 2 ? strTrim.substring(0, iIndexOf + 1) : strTrim;
            return new DissectedPath(strSubstring2, strTrim.substring(strSubstring2.length()));
        }
        return new DissectedPath(File.separator, strTrim);
    }

    public static boolean isLeadingPath(File file, File file2) {
        String absolutePath = normalize(file.getAbsolutePath()).getAbsolutePath();
        String absolutePath2 = normalize(file2.getAbsolutePath()).getAbsolutePath();
        if (absolutePath.equals(absolutePath2)) {
            return true;
        }
        String str = File.separator;
        if (!absolutePath.endsWith(str)) {
            absolutePath = absolutePath + str;
        }
        String str2 = str + ".." + str;
        if (absolutePath.contains(str2) || absolutePath2.contains(str2)) {
            return false;
        }
        if ((absolutePath2 + str).contains(str2)) {
            return false;
        }
        return absolutePath2.startsWith(absolutePath);
    }

    public static boolean isLeadingPath(File file, File file2, boolean z) throws IOException {
        if (!z) {
            return isLeadingPath(file, file2);
        }
        File canonicalFile = file.getCanonicalFile();
        File canonicalFile2 = file2.getCanonicalFile();
        while (!canonicalFile.equals(canonicalFile2)) {
            canonicalFile2 = canonicalFile2.getParentFile();
            if (canonicalFile2 == null) {
                return false;
            }
        }
        return true;
    }

    public static long getFileLength(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            long fileLength = 0;
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (File file2 : fileArrListFiles) {
                fileLength += getFileLength(file2);
            }
            return fileLength;
        }
        return file.length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.zip.GZIPInputStream] */
    public static InputStream unwrapPack200(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.mark(4);
        byte[] bArr = new byte[4];
        bufferedInputStream.read(bArr, 0, 4);
        bufferedInputStream.reset();
        if (bArr[0] == 31 && bArr[1] == -117 && bArr[2] == 8) {
            bufferedInputStream = new GZIPInputStream(bufferedInputStream);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        JarOutputStream jarOutputStream = new JarOutputStream(byteArrayOutputStream);
        Pack200.newUnpacker().unpack(new UncloseInputStream(bufferedInputStream), jarOutputStream);
        jarOutputStream.close();
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    public static final class UncloseInputStream extends InputStream {
        public InputStream wrapped;

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public UncloseInputStream(InputStream inputStream) {
            this.wrapped = inputStream;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            return this.wrapped.read();
        }

        public int hashCode() {
            return this.wrapped.hashCode();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            return this.wrapped.read(bArr);
        }

        public boolean equals(Object obj) {
            return this.wrapped.equals(obj);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            return this.wrapped.read(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            return this.wrapped.skip(j);
        }

        public String toString() {
            return this.wrapped.toString();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.wrapped.available();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.wrapped.mark(i);
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            this.wrapped.reset();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.wrapped.markSupported();
        }
    }

    public static final class DissectedPath {
        public final String remainingPath;
        public final String root;

        public /* synthetic */ DissectedPath(String str, String str2, C112701 c112701) {
            this(str, str2);
        }

        public DissectedPath(String str, String str2) {
            this.root = str;
            this.remainingPath = str2;
        }

        public String toString() {
            return "Dissected Path [root=" + this.root + ", remainingPath=" + this.remainingPath + "]";
        }
    }
}
