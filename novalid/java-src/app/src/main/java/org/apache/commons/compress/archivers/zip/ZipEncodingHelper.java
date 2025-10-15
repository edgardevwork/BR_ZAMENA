package org.apache.commons.compress.archivers.zip;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.function.Predicate;

/* loaded from: classes5.dex */
public abstract class ZipEncodingHelper {
    public static final String UTF8 = "UTF8";
    public static final ZipEncoding UTF8_ZIP_ENCODING = getZipEncoding("UTF8");

    public static ZipEncoding getZipEncoding(String str) {
        Charset charsetDefaultCharset = Charset.defaultCharset();
        if (str != null) {
            try {
                charsetDefaultCharset = Charset.forName(str);
            } catch (UnsupportedCharsetException unused) {
            }
        }
        return new NioZipEncoding(charsetDefaultCharset, isUTF8(charsetDefaultCharset.name()));
    }

    public static boolean isUTF8(final String str) {
        if (str == null) {
            str = Charset.defaultCharset().name();
        }
        Charset charset = StandardCharsets.UTF_8;
        if (charset.name().equalsIgnoreCase(str)) {
            return true;
        }
        return charset.aliases().stream().anyMatch(new Predicate() { // from class: org.apache.commons.compress.archivers.zip.ZipEncodingHelper$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ZipEncodingHelper.lambda$isUTF8$0(str, (String) obj);
            }
        });
    }

    public static /* synthetic */ boolean lambda$isUTF8$0(String str, String str2) {
        return str2.equalsIgnoreCase(str);
    }

    public static ByteBuffer growBufferBy(ByteBuffer byteBuffer, int i) {
        byteBuffer.limit(byteBuffer.position());
        byteBuffer.rewind();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity() + i);
        byteBufferAllocate.put(byteBuffer);
        return byteBufferAllocate;
    }
}
