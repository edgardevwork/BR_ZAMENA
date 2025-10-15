package org.apache.commons.compress.compressors;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream;
import org.apache.commons.compress.compressors.brotli.BrotliUtils;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream;
import org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream;
import org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream;
import org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream;
import org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream;
import org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream;
import org.apache.commons.compress.compressors.lzma.LZMAUtils;
import org.apache.commons.compress.compressors.p057xz.XZCompressorInputStream;
import org.apache.commons.compress.compressors.p057xz.XZCompressorOutputStream;
import org.apache.commons.compress.compressors.p057xz.XZUtils;
import org.apache.commons.compress.compressors.p058z.ZCompressorInputStream;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream;
import org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream;
import org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream;
import org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream;
import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;
import org.apache.commons.compress.compressors.zstandard.ZstdUtils;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.utils.Sets;

/* loaded from: classes6.dex */
public class CompressorStreamFactory implements CompressorStreamProvider {
    public static final String BROTLI = "br";
    public static final String BZIP2 = "bzip2";
    public static final String DEFLATE = "deflate";
    public static final String DEFLATE64 = "deflate64";
    public static final String GZIP = "gz";
    public static final String LZ4_BLOCK = "lz4-block";
    public static final String LZ4_FRAMED = "lz4-framed";
    public static final String LZMA = "lzma";
    public static final String PACK200 = "pack200";
    public static final String SNAPPY_FRAMED = "snappy-framed";
    public static final String SNAPPY_RAW = "snappy-raw";

    /* renamed from: XZ */
    public static final String f9844XZ = "xz";

    /* renamed from: Z */
    public static final String f9845Z = "z";
    public static final String ZSTANDARD = "zstd";
    public SortedMap<String, CompressorStreamProvider> compressorInputStreamProviders;
    public SortedMap<String, CompressorStreamProvider> compressorOutputStreamProviders;
    public volatile boolean decompressConcatenated;
    public final Boolean decompressUntilEOF;
    public final int memoryLimitInKb;
    public static final CompressorStreamFactory SINGLETON = new CompressorStreamFactory();
    public static final String YOU_NEED_BROTLI_DEC = youNeed("Google Brotli Dec", "https://github.com/google/brotli/");
    public static final String YOU_NEED_XZ_JAVA = youNeed("XZ for Java", "https://tukaani.org/xz/java.html");
    public static final String YOU_NEED_ZSTD_JNI = youNeed("Zstd JNI", "https://github.com/luben/zstd-jni");

    public static String youNeed(String str, String str2) {
        return " In addition to Apache Commons Compress you need the " + str + " library - see " + str2;
    }

    public static SortedMap<String, CompressorStreamProvider> findAvailableCompressorInputStreamProviders() {
        return (SortedMap) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda3
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return CompressorStreamFactory.lambda$findAvailableCompressorInputStreamProviders$1();
            }
        });
    }

    public static /* synthetic */ SortedMap lambda$findAvailableCompressorInputStreamProviders$1() {
        final TreeMap treeMap = new TreeMap();
        CompressorStreamFactory compressorStreamFactory = SINGLETON;
        putAll(compressorStreamFactory.getInputStreamCompressorNames(), compressorStreamFactory, treeMap);
        archiveStreamProviderIterable().forEach(new Consumer() { // from class: org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CompressorStreamFactory.lambda$null$0(treeMap, (CompressorStreamProvider) obj);
            }
        });
        return treeMap;
    }

    public static /* synthetic */ void lambda$null$0(TreeMap treeMap, CompressorStreamProvider compressorStreamProvider) {
        putAll(compressorStreamProvider.getInputStreamCompressorNames(), compressorStreamProvider, treeMap);
    }

    public static SortedMap<String, CompressorStreamProvider> findAvailableCompressorOutputStreamProviders() {
        return (SortedMap) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda2
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return CompressorStreamFactory.lambda$findAvailableCompressorOutputStreamProviders$3();
            }
        });
    }

    public static /* synthetic */ SortedMap lambda$findAvailableCompressorOutputStreamProviders$3() {
        final TreeMap treeMap = new TreeMap();
        CompressorStreamFactory compressorStreamFactory = SINGLETON;
        putAll(compressorStreamFactory.getOutputStreamCompressorNames(), compressorStreamFactory, treeMap);
        archiveStreamProviderIterable().forEach(new Consumer() { // from class: org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CompressorStreamFactory.lambda$null$2(treeMap, (CompressorStreamProvider) obj);
            }
        });
        return treeMap;
    }

    public static /* synthetic */ void lambda$null$2(TreeMap treeMap, CompressorStreamProvider compressorStreamProvider) {
        putAll(compressorStreamProvider.getOutputStreamCompressorNames(), compressorStreamProvider, treeMap);
    }

    public static String getBrotli() {
        return "br";
    }

    public static String getBzip2() {
        return BZIP2;
    }

    public static String getDeflate() {
        return DEFLATE;
    }

    public static String getDeflate64() {
        return DEFLATE64;
    }

    public static String getGzip() {
        return GZIP;
    }

    public static String getLzma() {
        return LZMA;
    }

    public static String getPack200() {
        return "pack200";
    }

    public static CompressorStreamFactory getSingleton() {
        return SINGLETON;
    }

    public static String getSnappyFramed() {
        return SNAPPY_FRAMED;
    }

    public static String getSnappyRaw() {
        return SNAPPY_RAW;
    }

    public static String getXz() {
        return f9844XZ;
    }

    public static String getZ() {
        return "z";
    }

    public static String getLZ4Framed() {
        return LZ4_FRAMED;
    }

    public static String getLZ4Block() {
        return LZ4_BLOCK;
    }

    public static String getZstandard() {
        return ZSTANDARD;
    }

    public static /* synthetic */ void lambda$putAll$4(TreeMap treeMap, CompressorStreamProvider compressorStreamProvider, String str) {
    }

    public static void putAll(Set<String> set, final CompressorStreamProvider compressorStreamProvider, final TreeMap<String, CompressorStreamProvider> treeMap) {
        set.forEach(new Consumer() { // from class: org.apache.commons.compress.compressors.CompressorStreamFactory$$ExternalSyntheticLambda4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CompressorStreamFactory.lambda$putAll$4(treeMap, compressorStreamProvider, (String) obj);
            }
        });
    }

    public static Iterable<CompressorStreamProvider> archiveStreamProviderIterable() {
        return ServiceLoader.load(CompressorStreamProvider.class, ClassLoader.getSystemClassLoader());
    }

    public static String toKey(String str) {
        return str.toUpperCase(Locale.ROOT);
    }

    public CompressorStreamFactory() {
        this.decompressUntilEOF = null;
        this.memoryLimitInKb = -1;
    }

    public CompressorStreamFactory(boolean z, int i) {
        this.decompressUntilEOF = Boolean.valueOf(z);
        this.decompressConcatenated = z;
        this.memoryLimitInKb = i;
    }

    public CompressorStreamFactory(boolean z) {
        this(z, -1);
    }

    public static String detect(InputStream inputStream) throws CompressorException, IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("Stream must not be null.");
        }
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Mark is not supported.");
        }
        byte[] bArr = new byte[12];
        inputStream.mark(12);
        try {
            int fully = IOUtils.readFully(inputStream, bArr);
            inputStream.reset();
            if (BZip2CompressorInputStream.matches(bArr, fully)) {
                return BZIP2;
            }
            if (GzipCompressorInputStream.matches(bArr, fully)) {
                return GZIP;
            }
            if (Pack200CompressorInputStream.matches(bArr, fully)) {
                return "pack200";
            }
            if (FramedSnappyCompressorInputStream.matches(bArr, fully)) {
                return SNAPPY_FRAMED;
            }
            if (ZCompressorInputStream.matches(bArr, fully)) {
                return "z";
            }
            if (DeflateCompressorInputStream.matches(bArr, fully)) {
                return DEFLATE;
            }
            if (XZUtils.matches(bArr, fully)) {
                return f9844XZ;
            }
            if (LZMAUtils.matches(bArr, fully)) {
                return LZMA;
            }
            if (FramedLZ4CompressorInputStream.matches(bArr, fully)) {
                return LZ4_FRAMED;
            }
            if (ZstdUtils.matches(bArr, fully)) {
                return ZSTANDARD;
            }
            throw new CompressorException("No Compressor found for the stream signature.");
        } catch (IOException e) {
            throw new CompressorException("IOException while reading signature.", e);
        }
    }

    public CompressorInputStream createCompressorInputStream(InputStream inputStream) throws CompressorException {
        return createCompressorInputStream(detect(inputStream), inputStream);
    }

    public CompressorInputStream createCompressorInputStream(String str, InputStream inputStream) throws CompressorException {
        return createCompressorInputStream(str, inputStream, this.decompressConcatenated);
    }

    @Override // org.apache.commons.compress.compressors.CompressorStreamProvider
    public CompressorInputStream createCompressorInputStream(String str, InputStream inputStream, boolean z) throws CompressorException {
        if (str == null || inputStream == null) {
            throw new IllegalArgumentException("Compressor name and stream must not be null.");
        }
        try {
            if (GZIP.equalsIgnoreCase(str)) {
                return new GzipCompressorInputStream(inputStream, z);
            }
            if (BZIP2.equalsIgnoreCase(str)) {
                return new BZip2CompressorInputStream(inputStream, z);
            }
            if ("br".equalsIgnoreCase(str)) {
                if (!BrotliUtils.isBrotliCompressionAvailable()) {
                    throw new CompressorException("Brotli compression is not available." + YOU_NEED_BROTLI_DEC);
                }
                return new BrotliCompressorInputStream(inputStream);
            }
            if (f9844XZ.equalsIgnoreCase(str)) {
                if (!XZUtils.isXZCompressionAvailable()) {
                    throw new CompressorException("XZ compression is not available." + YOU_NEED_XZ_JAVA);
                }
                return new XZCompressorInputStream(inputStream, z, this.memoryLimitInKb);
            }
            if (ZSTANDARD.equalsIgnoreCase(str)) {
                if (!ZstdUtils.isZstdCompressionAvailable()) {
                    throw new CompressorException("Zstandard compression is not available." + YOU_NEED_ZSTD_JNI);
                }
                return new ZstdCompressorInputStream(inputStream);
            }
            if (LZMA.equalsIgnoreCase(str)) {
                if (!LZMAUtils.isLZMACompressionAvailable()) {
                    throw new CompressorException("LZMA compression is not available" + YOU_NEED_XZ_JAVA);
                }
                return new LZMACompressorInputStream(inputStream, this.memoryLimitInKb);
            }
            if ("pack200".equalsIgnoreCase(str)) {
                return new Pack200CompressorInputStream(inputStream);
            }
            if (SNAPPY_RAW.equalsIgnoreCase(str)) {
                return new SnappyCompressorInputStream(inputStream);
            }
            if (SNAPPY_FRAMED.equalsIgnoreCase(str)) {
                return new FramedSnappyCompressorInputStream(inputStream);
            }
            if ("z".equalsIgnoreCase(str)) {
                return new ZCompressorInputStream(inputStream, this.memoryLimitInKb);
            }
            if (DEFLATE.equalsIgnoreCase(str)) {
                return new DeflateCompressorInputStream(inputStream);
            }
            if (DEFLATE64.equalsIgnoreCase(str)) {
                return new Deflate64CompressorInputStream(inputStream);
            }
            if (LZ4_BLOCK.equalsIgnoreCase(str)) {
                return new BlockLZ4CompressorInputStream(inputStream);
            }
            if (LZ4_FRAMED.equalsIgnoreCase(str)) {
                return new FramedLZ4CompressorInputStream(inputStream, z);
            }
            CompressorStreamProvider compressorStreamProvider = getCompressorInputStreamProviders().get(toKey(str));
            if (compressorStreamProvider != null) {
                return compressorStreamProvider.createCompressorInputStream(str, inputStream, z);
            }
            throw new CompressorException("Compressor: " + str + " not found.");
        } catch (IOException e) {
            throw new CompressorException("Could not create CompressorInputStream.", e);
        }
    }

    @Override // org.apache.commons.compress.compressors.CompressorStreamProvider
    public CompressorOutputStream createCompressorOutputStream(String str, OutputStream outputStream) throws CompressorException {
        if (str == null || outputStream == null) {
            throw new IllegalArgumentException("Compressor name and stream must not be null.");
        }
        try {
            if (GZIP.equalsIgnoreCase(str)) {
                return new GzipCompressorOutputStream(outputStream);
            }
            if (BZIP2.equalsIgnoreCase(str)) {
                return new BZip2CompressorOutputStream(outputStream);
            }
            if (f9844XZ.equalsIgnoreCase(str)) {
                return new XZCompressorOutputStream(outputStream);
            }
            if ("pack200".equalsIgnoreCase(str)) {
                return new Pack200CompressorOutputStream(outputStream);
            }
            if (LZMA.equalsIgnoreCase(str)) {
                return new LZMACompressorOutputStream(outputStream);
            }
            if (DEFLATE.equalsIgnoreCase(str)) {
                return new DeflateCompressorOutputStream(outputStream);
            }
            if (SNAPPY_FRAMED.equalsIgnoreCase(str)) {
                return new FramedSnappyCompressorOutputStream(outputStream);
            }
            if (LZ4_BLOCK.equalsIgnoreCase(str)) {
                return new BlockLZ4CompressorOutputStream(outputStream);
            }
            if (LZ4_FRAMED.equalsIgnoreCase(str)) {
                return new FramedLZ4CompressorOutputStream(outputStream);
            }
            if (ZSTANDARD.equalsIgnoreCase(str)) {
                return new ZstdCompressorOutputStream(outputStream);
            }
            CompressorStreamProvider compressorStreamProvider = getCompressorOutputStreamProviders().get(toKey(str));
            if (compressorStreamProvider != null) {
                return compressorStreamProvider.createCompressorOutputStream(str, outputStream);
            }
            throw new CompressorException("Compressor: " + str + " not found.");
        } catch (IOException e) {
            throw new CompressorException("Could not create CompressorOutputStream", e);
        }
    }

    public SortedMap<String, CompressorStreamProvider> getCompressorInputStreamProviders() {
        if (this.compressorInputStreamProviders == null) {
            this.compressorInputStreamProviders = Collections.unmodifiableSortedMap(findAvailableCompressorInputStreamProviders());
        }
        return this.compressorInputStreamProviders;
    }

    public SortedMap<String, CompressorStreamProvider> getCompressorOutputStreamProviders() {
        if (this.compressorOutputStreamProviders == null) {
            this.compressorOutputStreamProviders = Collections.unmodifiableSortedMap(findAvailableCompressorOutputStreamProviders());
        }
        return this.compressorOutputStreamProviders;
    }

    public boolean getDecompressConcatenated() {
        return this.decompressConcatenated;
    }

    public Boolean getDecompressUntilEOF() {
        return this.decompressUntilEOF;
    }

    @Override // org.apache.commons.compress.compressors.CompressorStreamProvider
    public Set<String> getInputStreamCompressorNames() {
        return Sets.newHashSet(GZIP, "br", BZIP2, f9844XZ, LZMA, "pack200", DEFLATE, SNAPPY_RAW, SNAPPY_FRAMED, "z", LZ4_BLOCK, LZ4_FRAMED, ZSTANDARD, DEFLATE64);
    }

    @Override // org.apache.commons.compress.compressors.CompressorStreamProvider
    public Set<String> getOutputStreamCompressorNames() {
        return Sets.newHashSet(GZIP, BZIP2, f9844XZ, LZMA, "pack200", DEFLATE, SNAPPY_FRAMED, LZ4_BLOCK, LZ4_FRAMED, ZSTANDARD);
    }

    @Deprecated
    public void setDecompressConcatenated(boolean z) {
        if (this.decompressUntilEOF != null) {
            throw new IllegalStateException("Cannot override the setting defined by the constructor");
        }
        this.decompressConcatenated = z;
    }
}
