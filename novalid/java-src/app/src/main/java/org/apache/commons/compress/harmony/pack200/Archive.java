package org.apache.commons.compress.harmony.pack200;

import com.google.common.reflect.ClassPath;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.compress.harmony.pack200.Archive;

/* loaded from: classes6.dex */
public class Archive {
    public long currentSegmentSize;
    public JarFile jarFile;
    public final JarInputStream jarInputStream;
    public final PackingOptions options;
    public final OutputStream outputStream;

    public Archive(JarInputStream jarInputStream, OutputStream outputStream, PackingOptions packingOptions) throws SecurityException, IOException {
        this.jarInputStream = jarInputStream;
        packingOptions = packingOptions == null ? new PackingOptions() : packingOptions;
        this.options = packingOptions;
        this.outputStream = new BufferedOutputStream(packingOptions.isGzip() ? new GZIPOutputStream(outputStream) : outputStream);
        PackingUtils.config(packingOptions);
    }

    public Archive(JarFile jarFile, OutputStream outputStream, PackingOptions packingOptions) throws SecurityException, IOException {
        packingOptions = packingOptions == null ? new PackingOptions() : packingOptions;
        this.options = packingOptions;
        this.outputStream = new BufferedOutputStream(packingOptions.isGzip() ? new GZIPOutputStream(outputStream) : outputStream);
        this.jarFile = jarFile;
        this.jarInputStream = null;
        PackingUtils.config(packingOptions);
    }

    public void pack() throws Pack200Exception, IOException {
        if (this.options.getEffort() == 0) {
            doZeroEffortPack();
        } else {
            doNormalPack();
        }
    }

    public final void doZeroEffortPack() throws IOException {
        PackingUtils.log("Start to perform a zero-effort packing");
        JarInputStream jarInputStream = this.jarInputStream;
        if (jarInputStream != null) {
            PackingUtils.copyThroughJar(jarInputStream, this.outputStream);
        } else {
            PackingUtils.copyThroughJar(this.jarFile, this.outputStream);
        }
    }

    public final void doNormalPack() throws Pack200Exception, IOException {
        List<PackingFile> packingFileListFromJar;
        PackingUtils.log("Start to perform a normal packing");
        JarInputStream jarInputStream = this.jarInputStream;
        if (jarInputStream != null) {
            packingFileListFromJar = PackingUtils.getPackingFileListFromJar(jarInputStream, this.options.isKeepFileOrder());
        } else {
            packingFileListFromJar = PackingUtils.getPackingFileListFromJar(this.jarFile, this.options.isKeepFileOrder());
        }
        List<SegmentUnit> listSplitIntoSegments = splitIntoSegments(packingFileListFromJar);
        int size = listSplitIntoSegments.size();
        int byteAmount = 0;
        int packedByteAmount = 0;
        for (int i = 0; i < size; i++) {
            SegmentUnit segmentUnit = listSplitIntoSegments.get(i);
            new Segment().pack(segmentUnit, this.outputStream, this.options);
            byteAmount += segmentUnit.getByteAmount();
            packedByteAmount += segmentUnit.getPackedByteAmount();
        }
        PackingUtils.log("Total: Packed " + byteAmount + " input bytes of " + packingFileListFromJar.size() + " files into " + packedByteAmount + " bytes in " + size + " segments");
        this.outputStream.close();
    }

    public final List<SegmentUnit> splitIntoSegments(List<PackingFile> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long segmentLimit = this.options.getSegmentLimit();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            PackingFile packingFile = list.get(i);
            if (!addJarEntry(packingFile, arrayList2, arrayList3)) {
                arrayList.add(new SegmentUnit(arrayList2, arrayList3));
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                this.currentSegmentSize = 0L;
                addJarEntry(packingFile, arrayList2, arrayList3);
                this.currentSegmentSize = 0L;
            } else if (segmentLimit == 0 && estimateSize(packingFile) > 0) {
                arrayList.add(new SegmentUnit(arrayList2, arrayList3));
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
            }
        }
        if (arrayList2.size() > 0 || arrayList3.size() > 0) {
            arrayList.add(new SegmentUnit(arrayList2, arrayList3));
        }
        return arrayList;
    }

    public final boolean addJarEntry(PackingFile packingFile, List<Pack200ClassReader> list, List<PackingFile> list2) {
        long segmentLimit = this.options.getSegmentLimit();
        if (segmentLimit != -1 && segmentLimit != 0) {
            long jEstimateSize = estimateSize(packingFile);
            long j = this.currentSegmentSize;
            if (jEstimateSize + j > segmentLimit && j > 0) {
                return false;
            }
            this.currentSegmentSize = j + jEstimateSize;
        }
        String name = packingFile.getName();
        if (name.endsWith(ClassPath.CLASS_FILE_NAME_EXTENSION) && !this.options.isPassFile(name)) {
            Pack200ClassReader pack200ClassReader = new Pack200ClassReader(packingFile.contents);
            pack200ClassReader.setFileName(name);
            list.add(pack200ClassReader);
            packingFile.contents = new byte[0];
        }
        list2.add(packingFile);
        return true;
    }

    public final long estimateSize(PackingFile packingFile) {
        String name = packingFile.getName();
        if (name.startsWith("META-INF") || name.startsWith("/META-INF")) {
            return 0L;
        }
        long length = packingFile.contents.length;
        return name.length() + (length >= 0 ? length : 0L) + 5;
    }

    public static class SegmentUnit {
        public int byteAmount;
        public final List<Pack200ClassReader> classList;
        public final List<PackingFile> fileList;
        public int packedByteAmount;

        public SegmentUnit(List<Pack200ClassReader> list, List<PackingFile> list2) {
            this.classList = list;
            this.fileList = list2;
            this.byteAmount = 0;
            int iSum = list.stream().mapToInt(new ToIntFunction() { // from class: org.apache.commons.compress.harmony.pack200.Archive$SegmentUnit$$ExternalSyntheticLambda0
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return Archive.SegmentUnit.lambda$new$0((Pack200ClassReader) obj);
                }
            }).sum();
            this.byteAmount = iSum;
            this.byteAmount = iSum + list2.stream().mapToInt(new ToIntFunction() { // from class: org.apache.commons.compress.harmony.pack200.Archive$SegmentUnit$$ExternalSyntheticLambda1
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return Archive.SegmentUnit.lambda$new$1((Archive.PackingFile) obj);
                }
            }).sum();
        }

        public static /* synthetic */ int lambda$new$0(Pack200ClassReader pack200ClassReader) {
            return pack200ClassReader.b.length;
        }

        public static /* synthetic */ int lambda$new$1(PackingFile packingFile) {
            return packingFile.contents.length;
        }

        public List<Pack200ClassReader> getClassList() {
            return this.classList;
        }

        public int classListSize() {
            return this.classList.size();
        }

        public int fileListSize() {
            return this.fileList.size();
        }

        public List<PackingFile> getFileList() {
            return this.fileList;
        }

        public int getByteAmount() {
            return this.byteAmount;
        }

        public int getPackedByteAmount() {
            return this.packedByteAmount;
        }

        public void addPackedByteAmount(int i) {
            this.packedByteAmount += i;
        }
    }

    public static class PackingFile {
        public byte[] contents;
        public final boolean deflateHint;
        public final boolean isDirectory;
        public final long modtime;
        public final String name;

        public PackingFile(String str, byte[] bArr, long j) {
            this.name = str;
            this.contents = bArr;
            this.modtime = j;
            this.deflateHint = false;
            this.isDirectory = false;
        }

        public PackingFile(byte[] bArr, JarEntry jarEntry) {
            this.name = jarEntry.getName();
            this.contents = bArr;
            this.modtime = jarEntry.getTime();
            this.deflateHint = jarEntry.getMethod() == 8;
            this.isDirectory = jarEntry.isDirectory();
        }

        public byte[] getContents() {
            return this.contents;
        }

        public String getName() {
            return this.name;
        }

        public long getModtime() {
            return this.modtime;
        }

        public void setContents(byte[] bArr) {
            this.contents = bArr;
        }

        public boolean isDefalteHint() {
            return this.deflateHint;
        }

        public boolean isDirectory() {
            return this.isDirectory;
        }

        public String toString() {
            return this.name;
        }
    }
}
