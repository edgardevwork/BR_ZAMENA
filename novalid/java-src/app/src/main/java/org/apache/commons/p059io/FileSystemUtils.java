package org.apache.commons.p059io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

@Deprecated
/* loaded from: classes8.dex */
public class FileSystemUtils {

    /* renamed from: DF */
    public static final String f9889DF;
    public static final int INIT_PROBLEM = -1;
    public static final FileSystemUtils INSTANCE = new FileSystemUtils();

    /* renamed from: OS */
    public static final int f9890OS;
    public static final int OTHER = 0;
    public static final int POSIX_UNIX = 3;
    public static final int UNIX = 2;
    public static final int WINDOWS = 1;

    static {
        int i;
        String property;
        String str = "df";
        try {
            property = System.getProperty("os.name");
        } catch (Exception unused) {
            i = -1;
        }
        if (property == null) {
            throw new IOException("os.name not found");
        }
        String lowerCase = property.toLowerCase(Locale.ENGLISH);
        if (lowerCase.contains("windows")) {
            i = 1;
        } else if (lowerCase.contains("linux") || lowerCase.contains("mpe/ix") || lowerCase.contains("freebsd") || lowerCase.contains("openbsd") || lowerCase.contains("irix") || lowerCase.contains("digital unix") || lowerCase.contains("unix") || lowerCase.contains("mac os x")) {
            i = 2;
        } else {
            if (lowerCase.contains("sun os") || lowerCase.contains("sunos") || lowerCase.contains("solaris")) {
                str = "/usr/xpg4/bin/df";
            } else if (!lowerCase.contains("hp-ux") && !lowerCase.contains("aix")) {
                i = 0;
            }
            i = 3;
        }
        f9890OS = i;
        f9889DF = str;
    }

    @Deprecated
    public static long freeSpace(String str) throws IOException {
        return INSTANCE.freeSpaceOS(str, f9890OS, false, Duration.ofMillis(-1L));
    }

    @Deprecated
    public static long freeSpaceKb(String str) throws IOException {
        return freeSpaceKb(str, -1L);
    }

    @Deprecated
    public static long freeSpaceKb(String str, long j) throws IOException {
        return INSTANCE.freeSpaceOS(str, f9890OS, true, Duration.ofMillis(j));
    }

    @Deprecated
    public static long freeSpaceKb() throws IOException {
        return freeSpaceKb(-1L);
    }

    @Deprecated
    public static long freeSpaceKb(long j) throws IOException {
        return freeSpaceKb(new File(".").getAbsolutePath(), j);
    }

    public long freeSpaceOS(String str, int i, boolean z, Duration duration) throws Throwable {
        if (str == null) {
            throw new IllegalArgumentException("Path must not be null");
        }
        if (i == 0) {
            throw new IllegalStateException("Unsupported operating system");
        }
        if (i == 1) {
            long jFreeSpaceWindows = freeSpaceWindows(str, duration);
            return z ? jFreeSpaceWindows / 1024 : jFreeSpaceWindows;
        }
        if (i == 2) {
            return freeSpaceUnix(str, z, false, duration);
        }
        if (i == 3) {
            return freeSpaceUnix(str, z, true, duration);
        }
        throw new IllegalStateException("Exception caught when determining operating system");
    }

    public long freeSpaceWindows(String str, Duration duration) throws Throwable {
        String strNormalize = FilenameUtils.normalize(str, false);
        if (strNormalize == null) {
            throw new IllegalArgumentException(str);
        }
        if (!strNormalize.isEmpty() && strNormalize.charAt(0) != '\"') {
            strNormalize = "\"" + strNormalize + "\"";
        }
        List<String> listPerformCommand = performCommand(new String[]{"cmd.exe", "/C", "dir /a /-c " + strNormalize}, Integer.MAX_VALUE, duration);
        for (int size = listPerformCommand.size() + (-1); size >= 0; size--) {
            String str2 = listPerformCommand.get(size);
            if (!str2.isEmpty()) {
                return parseDir(str2, strNormalize);
            }
        }
        throw new IOException("Command line 'dir /-c' did not return any info for path '" + strNormalize + "'");
    }

    public long parseDir(String str, String str2) throws IOException {
        int i;
        int i2;
        int i3;
        int length = str.length();
        while (true) {
            length--;
            i = 0;
            if (length < 0) {
                i2 = 0;
                break;
            }
            if (Character.isDigit(str.charAt(length))) {
                i2 = length + 1;
                break;
            }
        }
        while (true) {
            if (length < 0) {
                i3 = 0;
                break;
            }
            char cCharAt = str.charAt(length);
            if (!Character.isDigit(cCharAt) && cCharAt != ',' && cCharAt != '.') {
                i3 = length + 1;
                break;
            }
            length--;
        }
        if (length < 0) {
            throw new IOException("Command line 'dir /-c' did not return valid info for path '" + str2 + "'");
        }
        StringBuilder sb = new StringBuilder(str.substring(i3, i2));
        while (i < sb.length()) {
            if (sb.charAt(i) == ',' || sb.charAt(i) == '.') {
                sb.deleteCharAt(i);
                i--;
            }
            i++;
        }
        return parseBytes(sb.toString(), str2);
    }

    public long freeSpaceUnix(String str, boolean z, boolean z2, Duration duration) throws Throwable {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Path must not be empty");
        }
        String str2 = "-";
        if (z) {
            str2 = "-k";
        }
        if (z2) {
            str2 = str2 + "P";
        }
        List<String> listPerformCommand = performCommand(str2.length() > 1 ? new String[]{f9889DF, str2, str} : new String[]{f9889DF, str}, 3, duration);
        if (listPerformCommand.size() < 2) {
            throw new IOException("Command line '" + f9889DF + "' did not return info as expected for path '" + str + "'- response was " + listPerformCommand);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(listPerformCommand.get(1), " ");
        if (stringTokenizer.countTokens() < 4) {
            if (stringTokenizer.countTokens() != 1 || listPerformCommand.size() < 3) {
                throw new IOException("Command line '" + f9889DF + "' did not return data as expected for path '" + str + "'- check path is valid");
            }
            stringTokenizer = new StringTokenizer(listPerformCommand.get(2), " ");
        } else {
            stringTokenizer.nextToken();
        }
        stringTokenizer.nextToken();
        stringTokenizer.nextToken();
        return parseBytes(stringTokenizer.nextToken(), str);
    }

    public long parseBytes(String str, String str2) throws NumberFormatException, IOException {
        try {
            long j = Long.parseLong(str);
            if (j >= 0) {
                return j;
            }
            throw new IOException("Command line '" + f9889DF + "' did not find free space in response for path '" + str2 + "'- check path is valid");
        } catch (NumberFormatException e) {
            throw new IOException("Command line '" + f9889DF + "' did not return numeric data as expected for path '" + str2 + "'- check path is valid", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<String> performCommand(String[] strArr, int i, Duration duration) throws Throwable {
        Process processOpenProcess;
        OutputStream outputStream;
        InputStream inputStream;
        InputStream errorStream;
        ?? bufferedReader;
        ?? r7;
        Thread threadStart;
        ArrayList arrayList = new ArrayList(20);
        InputStream inputStream2 = null;
        try {
            threadStart = ThreadMonitor.start(duration);
            processOpenProcess = openProcess(strArr);
        } catch (InterruptedException e) {
            e = e;
            inputStream = null;
            outputStream = null;
            errorStream = null;
            bufferedReader = 0;
        } catch (Throwable th) {
            th = th;
            processOpenProcess = null;
            outputStream = null;
        }
        try {
            inputStream = processOpenProcess.getInputStream();
        } catch (InterruptedException e2) {
            e = e2;
            inputStream = null;
            outputStream = null;
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
            errorStream = outputStream;
            r7 = errorStream;
            IOUtils.closeQuietly(inputStream2);
            IOUtils.closeQuietly(outputStream);
            IOUtils.closeQuietly(errorStream);
            IOUtils.closeQuietly((Reader) r7);
            if (processOpenProcess != null) {
            }
            throw th;
        }
        try {
            outputStream = processOpenProcess.getOutputStream();
            try {
                errorStream = processOpenProcess.getErrorStream();
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.defaultCharset()));
                } catch (InterruptedException e3) {
                    e = e3;
                    bufferedReader = 0;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = 0;
                }
            } catch (InterruptedException e4) {
                e = e4;
                errorStream = null;
                bufferedReader = errorStream;
                inputStream2 = processOpenProcess;
                bufferedReader = bufferedReader;
                try {
                    throw new IOException("Command line threw an InterruptedException for command " + Arrays.asList(strArr) + " timeout=" + duration, e);
                } catch (Throwable th4) {
                    th = th4;
                    processOpenProcess = inputStream2;
                    inputStream2 = inputStream;
                    r7 = bufferedReader;
                    IOUtils.closeQuietly(inputStream2);
                    IOUtils.closeQuietly(outputStream);
                    IOUtils.closeQuietly(errorStream);
                    IOUtils.closeQuietly((Reader) r7);
                    if (processOpenProcess != null) {
                        processOpenProcess.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                errorStream = null;
                bufferedReader = errorStream;
                inputStream2 = inputStream;
                r7 = bufferedReader;
                IOUtils.closeQuietly(inputStream2);
                IOUtils.closeQuietly(outputStream);
                IOUtils.closeQuietly(errorStream);
                IOUtils.closeQuietly((Reader) r7);
                if (processOpenProcess != null) {
                }
                throw th;
            }
            try {
                for (String line = bufferedReader.readLine(); line != null && arrayList.size() < i; line = bufferedReader.readLine()) {
                    arrayList.add(line.toLowerCase(Locale.ENGLISH).trim());
                }
                processOpenProcess.waitFor();
                ThreadMonitor.stop(threadStart);
                if (processOpenProcess.exitValue() != 0) {
                    throw new IOException("Command line returned OS error code '" + processOpenProcess.exitValue() + "' for command " + Arrays.asList(strArr));
                }
                if (arrayList.isEmpty()) {
                    throw new IOException("Command line did not return any info for command " + Arrays.asList(strArr));
                }
                bufferedReader.close();
                inputStream.close();
                if (outputStream != null) {
                    try {
                        outputStream.close();
                        outputStream = null;
                    } catch (InterruptedException e5) {
                        e = e5;
                        inputStream = null;
                        bufferedReader = 0;
                        inputStream2 = processOpenProcess;
                        bufferedReader = bufferedReader;
                        throw new IOException("Command line threw an InterruptedException for command " + Arrays.asList(strArr) + " timeout=" + duration, e);
                    } catch (Throwable th6) {
                        th = th6;
                        r7 = 0;
                        IOUtils.closeQuietly(inputStream2);
                        IOUtils.closeQuietly(outputStream);
                        IOUtils.closeQuietly(errorStream);
                        IOUtils.closeQuietly((Reader) r7);
                        if (processOpenProcess != null) {
                        }
                        throw th;
                    }
                }
                if (errorStream != null) {
                    errorStream.close();
                    errorStream = null;
                }
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly(outputStream);
                IOUtils.closeQuietly(errorStream);
                IOUtils.closeQuietly((Reader) null);
                processOpenProcess.destroy();
                return arrayList;
            } catch (InterruptedException e6) {
                e = e6;
            } catch (Throwable th7) {
                th = th7;
                inputStream2 = inputStream;
                r7 = bufferedReader;
                IOUtils.closeQuietly(inputStream2);
                IOUtils.closeQuietly(outputStream);
                IOUtils.closeQuietly(errorStream);
                IOUtils.closeQuietly((Reader) r7);
                if (processOpenProcess != null) {
                }
                throw th;
            }
        } catch (InterruptedException e7) {
            e = e7;
            outputStream = null;
            errorStream = outputStream;
            bufferedReader = errorStream;
            inputStream2 = processOpenProcess;
            bufferedReader = bufferedReader;
            throw new IOException("Command line threw an InterruptedException for command " + Arrays.asList(strArr) + " timeout=" + duration, e);
        } catch (Throwable th8) {
            th = th8;
            outputStream = null;
            errorStream = null;
        }
    }

    public Process openProcess(String[] strArr) throws IOException {
        return Runtime.getRuntime().exec(strArr);
    }
}
