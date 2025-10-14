package org.apache.commons.p059io.output;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import org.apache.commons.p059io.FileUtils;
import org.apache.commons.p059io.IOUtils;
import org.apache.ivy.plugins.parser.p064m2.PomReader;

/* loaded from: classes6.dex */
public class FileWriterWithEncoding extends Writer {
    public final Writer out;

    public FileWriterWithEncoding(String str, String str2) throws IOException {
        this(new File(str), str2, false);
    }

    public FileWriterWithEncoding(String str, String str2, boolean z) throws IOException {
        this(new File(str), str2, z);
    }

    public FileWriterWithEncoding(String str, Charset charset) throws IOException {
        this(new File(str), charset, false);
    }

    public FileWriterWithEncoding(String str, Charset charset, boolean z) throws IOException {
        this(new File(str), charset, z);
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder) throws IOException {
        this(new File(str), charsetEncoder, false);
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder, boolean z) throws IOException {
        this(new File(str), charsetEncoder, z);
    }

    public FileWriterWithEncoding(File file, String str) throws IOException {
        this(file, str, false);
    }

    public FileWriterWithEncoding(File file, String str, boolean z) throws IOException {
        this.out = initWriter(file, str, z);
    }

    public FileWriterWithEncoding(File file, Charset charset) throws IOException {
        this(file, charset, false);
    }

    public FileWriterWithEncoding(File file, Charset charset, boolean z) throws IOException {
        this.out = initWriter(file, charset, z);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder) throws IOException {
        this(file, charsetEncoder, false);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder, boolean z) throws IOException {
        this.out = initWriter(file, charsetEncoder, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Writer initWriter(File file, Object obj, boolean z) throws Throwable {
        Objects.requireNonNull(file, PomReader.PomProfileElement.FILE);
        Objects.requireNonNull(obj, "encoding");
        boolean zExists = file.exists();
        try {
            Path path = file.toPath();
            OpenOption[] openOptionArr = new OpenOption[1];
            openOptionArr[0] = z ? StandardOpenOption.APPEND : StandardOpenOption.CREATE;
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, openOptionArr);
            if (obj instanceof Charset) {
                return new OutputStreamWriter(outputStreamNewOutputStream, (Charset) obj);
            }
            if (obj instanceof CharsetEncoder) {
                return new OutputStreamWriter(outputStreamNewOutputStream, (CharsetEncoder) obj);
            }
            return new OutputStreamWriter(outputStreamNewOutputStream, (String) obj);
        } catch (IOException e) {
            e = e;
            try {
                IOUtils.close((Closeable) null);
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            if (zExists) {
                FileUtils.deleteQuietly(file);
                throw e;
            }
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            IOUtils.close((Closeable) null);
            if (zExists) {
            }
        }
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        this.out.write(i);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        this.out.write(cArr);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        this.out.write(cArr, i, i2);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        this.out.write(str);
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        this.out.write(str, i, i2);
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }
}
