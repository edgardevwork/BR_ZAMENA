package org.apache.commons.compress.archivers;

import java.io.ByteArrayInputStream;
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
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.p056ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.p056ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.utils.Sets;

/* loaded from: classes8.dex */
public class ArchiveStreamFactory implements ArchiveStreamProvider {
    public static final String APK = "apk";
    public static final String APKM = "apkm";
    public static final String APKS = "apks";

    /* renamed from: AR */
    public static final String f9828AR = "ar";
    public static final String ARJ = "arj";
    public static final String CPIO = "cpio";
    public static final ArchiveStreamFactory DEFAULT = new ArchiveStreamFactory();
    public static final String DUMP = "dump";
    public static final int DUMP_SIGNATURE_SIZE = 32;
    public static final String JAR = "jar";
    public static final String SEVEN_Z = "7z";
    public static final int SIGNATURE_SIZE = 12;
    public static final String TAR = "tar";
    public static final int TAR_HEADER_SIZE = 512;
    public static final String XAPK = "xapk";
    public static final String ZIP = "zip";
    public SortedMap<String, ArchiveStreamProvider> archiveInputStreamProviders;
    public SortedMap<String, ArchiveStreamProvider> archiveOutputStreamProviders;
    public final String encoding;
    public volatile String entryEncoding;

    public static /* synthetic */ void lambda$putAll$0(TreeMap treeMap, ArchiveStreamProvider archiveStreamProvider, String str) {
    }

    public static void putAll(Set<String> set, final ArchiveStreamProvider archiveStreamProvider, final TreeMap<String, ArchiveStreamProvider> treeMap) {
        set.forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArchiveStreamFactory.lambda$putAll$0(treeMap, archiveStreamProvider, (String) obj);
            }
        });
    }

    public static Iterable<ArchiveStreamProvider> archiveStreamProviderIterable() {
        return ServiceLoader.load(ArchiveStreamProvider.class, ClassLoader.getSystemClassLoader());
    }

    public static String toKey(String str) {
        return str.toUpperCase(Locale.ROOT);
    }

    public static SortedMap<String, ArchiveStreamProvider> findAvailableArchiveInputStreamProviders() {
        return (SortedMap) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda2
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ArchiveStreamFactory.lambda$findAvailableArchiveInputStreamProviders$2();
            }
        });
    }

    public static /* synthetic */ SortedMap lambda$findAvailableArchiveInputStreamProviders$2() {
        final TreeMap treeMap = new TreeMap();
        ArchiveStreamFactory archiveStreamFactory = DEFAULT;
        putAll(archiveStreamFactory.getInputStreamArchiveNames(), archiveStreamFactory, treeMap);
        archiveStreamProviderIterable().forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArchiveStreamFactory.lambda$null$1(treeMap, (ArchiveStreamProvider) obj);
            }
        });
        return treeMap;
    }

    public static /* synthetic */ void lambda$null$1(TreeMap treeMap, ArchiveStreamProvider archiveStreamProvider) {
        putAll(archiveStreamProvider.getInputStreamArchiveNames(), archiveStreamProvider, treeMap);
    }

    public static SortedMap<String, ArchiveStreamProvider> findAvailableArchiveOutputStreamProviders() {
        return (SortedMap) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda1
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ArchiveStreamFactory.lambda$findAvailableArchiveOutputStreamProviders$4();
            }
        });
    }

    public static /* synthetic */ SortedMap lambda$findAvailableArchiveOutputStreamProviders$4() {
        final TreeMap treeMap = new TreeMap();
        ArchiveStreamFactory archiveStreamFactory = DEFAULT;
        putAll(archiveStreamFactory.getOutputStreamArchiveNames(), archiveStreamFactory, treeMap);
        archiveStreamProviderIterable().forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArchiveStreamFactory.lambda$null$3(treeMap, (ArchiveStreamProvider) obj);
            }
        });
        return treeMap;
    }

    public static /* synthetic */ void lambda$null$3(TreeMap treeMap, ArchiveStreamProvider archiveStreamProvider) {
        putAll(archiveStreamProvider.getOutputStreamArchiveNames(), archiveStreamProvider, treeMap);
    }

    public ArchiveStreamFactory() {
        this(null);
    }

    public ArchiveStreamFactory(String str) {
        this.encoding = str;
        this.entryEncoding = str;
    }

    public String getEntryEncoding() {
        return this.entryEncoding;
    }

    @Deprecated
    public void setEntryEncoding(String str) {
        if (this.encoding != null) {
            throw new IllegalStateException("Cannot overide encoding set by the constructor");
        }
        this.entryEncoding = str;
    }

    public ArchiveInputStream createArchiveInputStream(String str, InputStream inputStream) throws ArchiveException {
        return createArchiveInputStream(str, inputStream, this.entryEncoding);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveStreamProvider
    public ArchiveInputStream createArchiveInputStream(String str, InputStream inputStream, String str2) throws ArchiveException {
        if (str == null) {
            throw new IllegalArgumentException("Archivername must not be null.");
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("InputStream must not be null.");
        }
        if (f9828AR.equalsIgnoreCase(str)) {
            return new ArArchiveInputStream(inputStream);
        }
        if (ARJ.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new ArjArchiveInputStream(inputStream, str2);
            }
            return new ArjArchiveInputStream(inputStream);
        }
        if (ZIP.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new ZipArchiveInputStream(inputStream, str2);
            }
            return new ZipArchiveInputStream(inputStream);
        }
        if (TAR.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new TarArchiveInputStream(inputStream, str2);
            }
            return new TarArchiveInputStream(inputStream);
        }
        if ("jar".equalsIgnoreCase(str) || APK.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new JarArchiveInputStream(inputStream, str2);
            }
            return new JarArchiveInputStream(inputStream);
        }
        if (CPIO.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new CpioArchiveInputStream(inputStream, str2);
            }
            return new CpioArchiveInputStream(inputStream);
        }
        if (DUMP.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new DumpArchiveInputStream(inputStream, str2);
            }
            return new DumpArchiveInputStream(inputStream);
        }
        if (SEVEN_Z.equalsIgnoreCase(str)) {
            throw new StreamingNotSupportedException(SEVEN_Z);
        }
        ArchiveStreamProvider archiveStreamProvider = getArchiveInputStreamProviders().get(toKey(str));
        if (archiveStreamProvider != null) {
            return archiveStreamProvider.createArchiveInputStream(str, inputStream, str2);
        }
        throw new ArchiveException("Archiver: " + str + " not found.");
    }

    public ArchiveOutputStream createArchiveOutputStream(String str, OutputStream outputStream) throws ArchiveException {
        return createArchiveOutputStream(str, outputStream, this.entryEncoding);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveStreamProvider
    public ArchiveOutputStream createArchiveOutputStream(String str, OutputStream outputStream, String str2) throws ArchiveException {
        if (str == null) {
            throw new IllegalArgumentException("Archivername must not be null.");
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("OutputStream must not be null.");
        }
        if (f9828AR.equalsIgnoreCase(str)) {
            return new ArArchiveOutputStream(outputStream);
        }
        if (ZIP.equalsIgnoreCase(str)) {
            ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(outputStream);
            if (str2 != null) {
                zipArchiveOutputStream.setEncoding(str2);
            }
            return zipArchiveOutputStream;
        }
        if (TAR.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new TarArchiveOutputStream(outputStream, str2);
            }
            return new TarArchiveOutputStream(outputStream);
        }
        if ("jar".equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new JarArchiveOutputStream(outputStream, str2);
            }
            return new JarArchiveOutputStream(outputStream);
        }
        if (CPIO.equalsIgnoreCase(str)) {
            if (str2 != null) {
                return new CpioArchiveOutputStream(outputStream, str2);
            }
            return new CpioArchiveOutputStream(outputStream);
        }
        if (SEVEN_Z.equalsIgnoreCase(str)) {
            throw new StreamingNotSupportedException(SEVEN_Z);
        }
        ArchiveStreamProvider archiveStreamProvider = getArchiveOutputStreamProviders().get(toKey(str));
        if (archiveStreamProvider != null) {
            return archiveStreamProvider.createArchiveOutputStream(str, outputStream, str2);
        }
        throw new ArchiveException("Archiver: " + str + " not found.");
    }

    public ArchiveInputStream createArchiveInputStream(InputStream inputStream) throws ArchiveException {
        return createArchiveInputStream(detect(inputStream), inputStream);
    }

    public static String detect(InputStream inputStream) throws Throwable {
        TarArchiveInputStream tarArchiveInputStream;
        Throwable th;
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
            if (ZipArchiveInputStream.matches(bArr, fully)) {
                return ZIP;
            }
            if (JarArchiveInputStream.matches(bArr, fully)) {
                return "jar";
            }
            if (ArArchiveInputStream.matches(bArr, fully)) {
                return f9828AR;
            }
            if (CpioArchiveInputStream.matches(bArr, fully)) {
                return CPIO;
            }
            if (ArjArchiveInputStream.matches(bArr, fully)) {
                return ARJ;
            }
            if (SevenZFile.matches(bArr, fully)) {
                return SEVEN_Z;
            }
            byte[] bArr2 = new byte[32];
            inputStream.mark(32);
            try {
                int fully2 = IOUtils.readFully(inputStream, bArr2);
                inputStream.reset();
                if (DumpArchiveInputStream.matches(bArr2, fully2)) {
                    return DUMP;
                }
                byte[] bArr3 = new byte[512];
                inputStream.mark(512);
                try {
                    int fully3 = IOUtils.readFully(inputStream, bArr3);
                    inputStream.reset();
                    if (TarArchiveInputStream.matches(bArr3, fully3)) {
                        return TAR;
                    }
                    if (fully3 >= 512) {
                        TarArchiveInputStream tarArchiveInputStream2 = null;
                        try {
                            tarArchiveInputStream = new TarArchiveInputStream(new ByteArrayInputStream(bArr3));
                        } catch (Exception unused) {
                        } catch (Throwable th2) {
                            tarArchiveInputStream = null;
                            th = th2;
                        }
                        try {
                            if (tarArchiveInputStream.getNextTarEntry().isCheckSumOK()) {
                                IOUtils.closeQuietly(tarArchiveInputStream);
                                return TAR;
                            }
                            IOUtils.closeQuietly(tarArchiveInputStream);
                        } catch (Exception unused2) {
                            tarArchiveInputStream2 = tarArchiveInputStream;
                            IOUtils.closeQuietly(tarArchiveInputStream2);
                            throw new ArchiveException("No Archiver found for the stream signature");
                        } catch (Throwable th3) {
                            th = th3;
                            IOUtils.closeQuietly(tarArchiveInputStream);
                            throw th;
                        }
                    }
                    throw new ArchiveException("No Archiver found for the stream signature");
                } catch (IOException e) {
                    throw new ArchiveException("IOException while reading tar signature", e);
                }
            } catch (IOException e2) {
                throw new ArchiveException("IOException while reading dump signature", e2);
            }
        } catch (IOException e3) {
            throw new ArchiveException("IOException while reading signature.", e3);
        }
    }

    public SortedMap<String, ArchiveStreamProvider> getArchiveInputStreamProviders() {
        if (this.archiveInputStreamProviders == null) {
            this.archiveInputStreamProviders = Collections.unmodifiableSortedMap(findAvailableArchiveInputStreamProviders());
        }
        return this.archiveInputStreamProviders;
    }

    public SortedMap<String, ArchiveStreamProvider> getArchiveOutputStreamProviders() {
        if (this.archiveOutputStreamProviders == null) {
            this.archiveOutputStreamProviders = Collections.unmodifiableSortedMap(findAvailableArchiveOutputStreamProviders());
        }
        return this.archiveOutputStreamProviders;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveStreamProvider
    public Set<String> getInputStreamArchiveNames() {
        return Sets.newHashSet(f9828AR, ARJ, ZIP, TAR, "jar", CPIO, DUMP, SEVEN_Z);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveStreamProvider
    public Set<String> getOutputStreamArchiveNames() {
        return Sets.newHashSet(f9828AR, ZIP, TAR, "jar", CPIO, SEVEN_Z);
    }
}
