package org.apache.commons.compress.harmony.unpack200;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.zip.GZIPInputStream;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;

/* loaded from: classes7.dex */
public class Archive {
    public boolean deflateHint;
    public String inputFileName;
    public InputStream inputStream;
    public FileOutputStream logFile;
    public int logLevel = 1;
    public String outputFileName;
    public final JarOutputStream outputStream;
    public boolean overrideDeflateHint;
    public boolean removePackFile;

    public Archive(String str, String str2) throws IOException {
        this.inputFileName = str;
        this.outputFileName = str2;
        this.inputStream = new FileInputStream(str);
        this.outputStream = new JarOutputStream(new BufferedOutputStream(new FileOutputStream(str2)));
    }

    public Archive(InputStream inputStream, JarOutputStream jarOutputStream) {
        this.inputStream = inputStream;
        this.outputStream = jarOutputStream;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:84|3|(2:5|(1:7)(2:8|9))|12|(1:14)(1:15)|16|(1:18)|93|19|(4:22|(2:24|95)(1:96)|25|20)|94|26|(9:28|(2:29|(4:31|(2:34|32)|97|35)(0))|53|82|54|55|(2:91|57)|58|(3:60|(1:62)|(1:102)(2:65|66))(1:67))(2:36|(10:39|(1:41)(1:42)|43|(1:45)|46|(1:48)|49|(3:98|51|101)(1:100)|99|37))|87|53|82|54|55|(0)|58|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:0|2|84|3|(2:5|(1:7)(2:8|9))|12|(1:14)(1:15)|16|(1:18)|93|19|(4:22|(2:24|95)(1:96)|25|20)|94|26|(9:28|(2:29|(4:31|(2:34|32)|97|35)(0))|53|82|54|55|(2:91|57)|58|(3:60|(1:62)|(1:102)(2:65|66))(1:67))(2:36|(10:39|(1:41)(1:42)|43|(1:45)|46|(1:48)|49|(3:98|51|101)(1:100)|99|37))|87|53|82|54|55|(0)|58|(0)(0)|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void unpack() throws Pack200Exception, IOException {
        FileOutputStream fileOutputStream;
        this.outputStream.setComment("PACK200");
        try {
            if (!this.inputStream.markSupported()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.inputStream);
                this.inputStream = bufferedInputStream;
                if (!bufferedInputStream.markSupported()) {
                    throw new IllegalStateException();
                }
            }
            this.inputStream.mark(2);
            if (((this.inputStream.read() & 255) | ((this.inputStream.read() & 255) << 8)) == 35615) {
                this.inputStream.reset();
                this.inputStream = new BufferedInputStream(new GZIPInputStream(this.inputStream));
            } else {
                this.inputStream.reset();
            }
            this.inputStream.mark(4);
            int[] iArr = {202, 254, 208, 13};
            int[] iArr2 = new int[4];
            for (int i = 0; i < 4; i++) {
                iArr2[i] = this.inputStream.read();
            }
            boolean z = false;
            for (int i2 = 0; i2 < 4; i2++) {
                if (iArr2[i2] != iArr[i2]) {
                    z = true;
                }
            }
            this.inputStream.reset();
            if (z) {
                JarInputStream jarInputStream = new JarInputStream(this.inputStream);
                while (true) {
                    JarEntry nextJarEntry = jarInputStream.getNextJarEntry();
                    if (nextJarEntry != null) {
                        this.outputStream.putNextEntry(nextJarEntry);
                        byte[] bArr = new byte[16384];
                        for (int i3 = jarInputStream.read(bArr); i3 != -1; i3 = jarInputStream.read(bArr)) {
                            this.outputStream.write(bArr, 0, i3);
                        }
                        this.outputStream.closeEntry();
                    }
                }
                this.inputStream.close();
                this.outputStream.close();
                fileOutputStream = this.logFile;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception unused) {
                    }
                }
                if (this.removePackFile) {
                    return;
                }
                if (!(this.inputFileName != null ? new File(this.inputFileName).delete() : false)) {
                    throw new Pack200Exception("Failed to delete the input file.");
                }
                return;
            }
            int i4 = 0;
            while (available(this.inputStream)) {
                i4++;
                Segment segment = new Segment();
                segment.setLogLevel(this.logLevel);
                OutputStream outputStream = this.logFile;
                if (outputStream == null) {
                    outputStream = System.out;
                }
                segment.setLogStream(outputStream);
                segment.setPreRead(false);
                if (i4 == 1) {
                    segment.log(2, "Unpacking from " + this.inputFileName + " to " + this.outputFileName);
                }
                segment.log(2, "Reading segment " + i4);
                if (this.overrideDeflateHint) {
                    segment.overrideDeflateHint(this.deflateHint);
                }
                segment.unpack(this.inputStream, this.outputStream);
                this.outputStream.flush();
                InputStream inputStream = this.inputStream;
                if (inputStream instanceof FileInputStream) {
                    this.inputFileName = ((FileInputStream) inputStream).getFD().toString();
                }
            }
            this.inputStream.close();
            this.outputStream.close();
            fileOutputStream = this.logFile;
            if (fileOutputStream != null) {
            }
            if (this.removePackFile) {
            }
        } finally {
        }
    }

    public final boolean available(InputStream inputStream) throws IOException {
        inputStream.mark(1);
        int i = inputStream.read();
        inputStream.reset();
        return i != -1;
    }

    public void setRemovePackFile(boolean z) {
        this.removePackFile = z;
    }

    public void setVerbose(boolean z) {
        if (z) {
            this.logLevel = 2;
        } else if (this.logLevel == 2) {
            this.logLevel = 1;
        }
    }

    public void setQuiet(boolean z) {
        if (z) {
            this.logLevel = 0;
        } else if (this.logLevel == 0) {
            this.logLevel = 0;
        }
    }

    public void setLogFile(String str) throws FileNotFoundException {
        this.logFile = new FileOutputStream(str);
    }

    public void setLogFile(String str, boolean z) throws FileNotFoundException {
        this.logFile = new FileOutputStream(str, z);
    }

    public void setDeflateHint(boolean z) {
        this.overrideDeflateHint = true;
        this.deflateHint = z;
    }
}
