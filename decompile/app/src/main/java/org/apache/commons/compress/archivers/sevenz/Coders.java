package org.apache.commons.compress.archivers.sevenz;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream;
import org.apache.commons.compress.utils.FlushShieldFilterOutputStream;
import org.tukaani.xz.ARMOptions;
import org.tukaani.xz.ARMThumbOptions;
import org.tukaani.xz.FilterOptions;
import org.tukaani.xz.FinishableWrapperOutputStream;
import org.tukaani.xz.IA64Options;
import org.tukaani.xz.PowerPCOptions;
import org.tukaani.xz.SPARCOptions;
import org.tukaani.xz.X86Options;

/* loaded from: classes5.dex */
public class Coders {
    public static final Map<SevenZMethod, CoderBase> CODER_MAP = new HashMap<SevenZMethod, CoderBase>() { // from class: org.apache.commons.compress.archivers.sevenz.Coders.1
        public static final long serialVersionUID = 1664829131806520867L;

        public C110221() {
            put(SevenZMethod.COPY, new CopyDecoder());
            put(SevenZMethod.LZMA, new LZMADecoder());
            put(SevenZMethod.LZMA2, new LZMA2Decoder());
            put(SevenZMethod.DEFLATE, new DeflateDecoder());
            put(SevenZMethod.DEFLATE64, new Deflate64Decoder());
            put(SevenZMethod.BZIP2, new BZIP2Decoder());
            put(SevenZMethod.AES256SHA256, new AES256SHA256Decoder());
            put(SevenZMethod.BCJ_X86_FILTER, new BCJDecoder(new X86Options()));
            put(SevenZMethod.BCJ_PPC_FILTER, new BCJDecoder(new PowerPCOptions()));
            put(SevenZMethod.BCJ_IA64_FILTER, new BCJDecoder(new IA64Options()));
            put(SevenZMethod.BCJ_ARM_FILTER, new BCJDecoder(new ARMOptions()));
            put(SevenZMethod.BCJ_ARM_THUMB_FILTER, new BCJDecoder(new ARMThumbOptions()));
            put(SevenZMethod.BCJ_SPARC_FILTER, new BCJDecoder(new SPARCOptions()));
            put(SevenZMethod.DELTA_FILTER, new DeltaDecoder());
        }
    };

    /* renamed from: org.apache.commons.compress.archivers.sevenz.Coders$1 */
    public static class C110221 extends HashMap<SevenZMethod, CoderBase> {
        public static final long serialVersionUID = 1664829131806520867L;

        public C110221() {
            put(SevenZMethod.COPY, new CopyDecoder());
            put(SevenZMethod.LZMA, new LZMADecoder());
            put(SevenZMethod.LZMA2, new LZMA2Decoder());
            put(SevenZMethod.DEFLATE, new DeflateDecoder());
            put(SevenZMethod.DEFLATE64, new Deflate64Decoder());
            put(SevenZMethod.BZIP2, new BZIP2Decoder());
            put(SevenZMethod.AES256SHA256, new AES256SHA256Decoder());
            put(SevenZMethod.BCJ_X86_FILTER, new BCJDecoder(new X86Options()));
            put(SevenZMethod.BCJ_PPC_FILTER, new BCJDecoder(new PowerPCOptions()));
            put(SevenZMethod.BCJ_IA64_FILTER, new BCJDecoder(new IA64Options()));
            put(SevenZMethod.BCJ_ARM_FILTER, new BCJDecoder(new ARMOptions()));
            put(SevenZMethod.BCJ_ARM_THUMB_FILTER, new BCJDecoder(new ARMThumbOptions()));
            put(SevenZMethod.BCJ_SPARC_FILTER, new BCJDecoder(new SPARCOptions()));
            put(SevenZMethod.DELTA_FILTER, new DeltaDecoder());
        }
    }

    public static CoderBase findByMethod(SevenZMethod sevenZMethod) {
        return CODER_MAP.get(sevenZMethod);
    }

    public static InputStream addDecoder(String str, InputStream inputStream, long j, Coder coder, byte[] bArr, int i) throws IOException {
        CoderBase coderBaseFindByMethod = findByMethod(SevenZMethod.byId(coder.decompressionMethodId));
        if (coderBaseFindByMethod == null) {
            throw new IOException("Unsupported compression method " + Arrays.toString(coder.decompressionMethodId) + " used in " + str);
        }
        return coderBaseFindByMethod.decode(str, inputStream, j, coder, bArr, i);
    }

    public static OutputStream addEncoder(OutputStream outputStream, SevenZMethod sevenZMethod, Object obj) throws IOException {
        CoderBase coderBaseFindByMethod = findByMethod(sevenZMethod);
        if (coderBaseFindByMethod == null) {
            throw new IOException("Unsupported compression method " + sevenZMethod);
        }
        return coderBaseFindByMethod.encode(outputStream, obj);
    }

    /* loaded from: classes8.dex */
    public static class CopyDecoder extends CoderBase {
        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        public InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr, int i) throws IOException {
            return inputStream;
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        public OutputStream encode(OutputStream outputStream, Object obj) {
            return outputStream;
        }

        public CopyDecoder() {
            super(new Class[0]);
        }
    }

    /* loaded from: classes8.dex */
    public static class BCJDecoder extends CoderBase {
        public final FilterOptions opts;

        public BCJDecoder(FilterOptions filterOptions) {
            super(new Class[0]);
            this.opts = filterOptions;
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        public InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr, int i) throws IOException {
            try {
                return this.opts.getInputStream(inputStream);
            } catch (AssertionError e) {
                throw new IOException("BCJ filter used in " + str + " needs XZ for Java > 1.4 - see https://commons.apache.org/proper/commons-compress/limitations.html#7Z", e);
            }
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        public OutputStream encode(OutputStream outputStream, Object obj) {
            return new FlushShieldFilterOutputStream(this.opts.getOutputStream(new FinishableWrapperOutputStream(outputStream)));
        }
    }

    /* loaded from: classes8.dex */
    public static class DeflateDecoder extends CoderBase {
        public static final byte[] ONE_ZERO_BYTE = new byte[1];

        public DeflateDecoder() {
            super(Number.class);
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        public InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr, int i) throws IOException {
            Inflater inflater = new Inflater(true);
            return new DeflateDecoderInputStream(new InflaterInputStream(new SequenceInputStream(inputStream, new ByteArrayInputStream(ONE_ZERO_BYTE)), inflater), inflater);
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        public OutputStream encode(OutputStream outputStream, Object obj) {
            Deflater deflater = new Deflater(CoderBase.numberOptionOrDefault(obj, 9), true);
            return new DeflateDecoderOutputStream(new DeflaterOutputStream(outputStream, deflater), deflater);
        }

        /* loaded from: classes5.dex */
        public static class DeflateDecoderInputStream extends InputStream {
            public Inflater inflater;
            public final InflaterInputStream inflaterInputStream;

            public DeflateDecoderInputStream(InflaterInputStream inflaterInputStream, Inflater inflater) {
                this.inflaterInputStream = inflaterInputStream;
                this.inflater = inflater;
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                return this.inflaterInputStream.read();
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                return this.inflaterInputStream.read(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr) throws IOException {
                return this.inflaterInputStream.read(bArr);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                try {
                    this.inflaterInputStream.close();
                } finally {
                    this.inflater.end();
                }
            }
        }

        /* loaded from: classes5.dex */
        public static class DeflateDecoderOutputStream extends OutputStream {
            public Deflater deflater;
            public final DeflaterOutputStream deflaterOutputStream;

            public DeflateDecoderOutputStream(DeflaterOutputStream deflaterOutputStream, Deflater deflater) {
                this.deflaterOutputStream = deflaterOutputStream;
                this.deflater = deflater;
            }

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                this.deflaterOutputStream.write(i);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr) throws IOException {
                this.deflaterOutputStream.write(bArr);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                this.deflaterOutputStream.write(bArr, i, i2);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                try {
                    this.deflaterOutputStream.close();
                } finally {
                    this.deflater.end();
                }
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class Deflate64Decoder extends CoderBase {
        public Deflate64Decoder() {
            super(Number.class);
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        public InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr, int i) throws IOException {
            return new Deflate64CompressorInputStream(inputStream);
        }
    }

    /* loaded from: classes8.dex */
    public static class BZIP2Decoder extends CoderBase {
        public BZIP2Decoder() {
            super(Number.class);
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        public InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr, int i) throws IOException {
            return new BZip2CompressorInputStream(inputStream);
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        public OutputStream encode(OutputStream outputStream, Object obj) throws IOException {
            return new BZip2CompressorOutputStream(outputStream, CoderBase.numberOptionOrDefault(obj, 9));
        }
    }
}
