package org.apache.commons.compress.archivers.sevenz;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.utils.ByteUtils;

/* loaded from: classes5.dex */
public abstract class CoderBase {
    public final Class<?>[] acceptableOptions;

    public abstract InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr, int i) throws IOException;

    public Object getOptionsFromCoder(Coder coder, InputStream inputStream) throws IOException {
        return null;
    }

    public CoderBase(Class<?>... clsArr) {
        this.acceptableOptions = clsArr;
    }

    public boolean canAcceptOptions(Object obj) {
        for (Class<?> cls : this.acceptableOptions) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public byte[] getOptionsAsProperties(Object obj) throws IOException {
        return ByteUtils.EMPTY_BYTE_ARRAY;
    }

    public OutputStream encode(OutputStream outputStream, Object obj) throws IOException {
        throw new UnsupportedOperationException("Method doesn't support writing");
    }

    public static int numberOptionOrDefault(Object obj, int i) {
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }
}
