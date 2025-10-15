package com.thoughtworks.xstream.core.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class XmlHeaderAwareReader extends Reader {
    public static final String KEY_ENCODING = "encoding";
    public static final String KEY_VERSION = "version";
    public static final int STATE_ATTR_NAME = 3;
    public static final int STATE_ATTR_VALUE = 4;
    public static final int STATE_AWAIT_XML_HEADER = 2;
    public static final int STATE_BOM = 0;
    public static final int STATE_START = 1;
    public static final String XML_TOKEN = "?xml";
    public final InputStreamReader reader;
    public final double version;

    public XmlHeaderAwareReader(InputStream inputStream) throws IOException {
        PushbackInputStream[] pushbackInputStreamArr = {inputStream instanceof PushbackInputStream ? (PushbackInputStream) inputStream : new PushbackInputStream(inputStream, 64)};
        Map header = getHeader(pushbackInputStreamArr);
        this.version = Double.parseDouble((String) header.get("version"));
        this.reader = new InputStreamReader(pushbackInputStreamArr[0], (String) header.get("encoding"));
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map getHeader(PushbackInputStream[] pushbackInputStreamArr) throws IOException {
        HashMap map = new HashMap();
        map.put("encoding", "UTF-8");
        map.put("version", "1.0");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        int i = 0;
        char c = 0;
        char c2 = 0;
        boolean z = false;
        while (i != -1 && (i = pushbackInputStreamArr[0].read()) != -1) {
            byteArrayOutputStream.write(i);
            char c3 = (char) i;
            char c4 = 2;
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        c4 = 4;
                        if (c != 3) {
                            if (c == 4) {
                                if (c2 == 0) {
                                    if (c3 == '\"' || c3 == '\'') {
                                        c2 = c3;
                                    } else {
                                        i = -1;
                                    }
                                } else if (c3 == '\\' && !z) {
                                    z = true;
                                } else if (c3 == c2 && !z) {
                                    map.put(stringBuffer.toString(), stringBuffer2.toString());
                                    stringBuffer.setLength(0);
                                    stringBuffer2.setLength(0);
                                    c2 = 0;
                                    c = 3;
                                } else if (c3 != '\n') {
                                    stringBuffer2.append(c3);
                                    z = false;
                                } else {
                                    z = false;
                                    i = -1;
                                }
                            }
                        } else if (Character.isWhitespace(c3)) {
                            if (stringBuffer.length() > 0) {
                                i = -1;
                            }
                        } else if (c3 == '=') {
                            c = c4;
                        } else {
                            char lowerCase = Character.toLowerCase(c3);
                            if (Character.isLetter(lowerCase)) {
                                stringBuffer.append(lowerCase);
                            } else {
                                i = -1;
                            }
                        }
                    } else {
                        if (!Character.isWhitespace(c3)) {
                            stringBuffer.append(Character.toLowerCase(c3));
                            if (!XML_TOKEN.startsWith(stringBuffer.substring(0))) {
                            }
                        } else if (stringBuffer.toString().equals(XML_TOKEN)) {
                            stringBuffer.setLength(0);
                            c = 3;
                        }
                        i = -1;
                    }
                } else if (!Character.isWhitespace(c3)) {
                    if (c3 == '<') {
                        c = c4;
                    } else {
                        i = -1;
                    }
                }
            } else if ((c3 == 239 && byteArrayOutputStream.size() == 1) || ((c3 == 187 && byteArrayOutputStream.size() == 2) || (c3 == 191 && byteArrayOutputStream.size() == 3))) {
                if (c3 == 191) {
                    byteArrayOutputStream.reset();
                    c = 1;
                }
            } else if (byteArrayOutputStream.size() > 1) {
                i = -1;
            } else {
                c = 1;
                if (!Character.isWhitespace(c3)) {
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return map;
            }
            try {
                pushbackInputStreamArr[0].unread(byteArray[i2]);
                length = i2;
            } catch (IOException unused) {
                pushbackInputStreamArr[0] = new PushbackInputStream(pushbackInputStreamArr[0], length);
            }
        }
    }

    public String getEncoding() {
        return this.reader.getEncoding();
    }

    public double getVersion() {
        return this.version;
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        this.reader.mark(i);
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return this.reader.markSupported();
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        return this.reader.read();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        return this.reader.read(cArr, i, i2);
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
        return this.reader.read(cArr);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        return this.reader.ready();
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        this.reader.reset();
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        return this.reader.skip(j);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.reader.close();
    }

    public boolean equals(Object obj) {
        return this.reader.equals(obj);
    }

    public int hashCode() {
        return this.reader.hashCode();
    }

    public String toString() {
        return this.reader.toString();
    }
}
