package org.apache.commons.compress.harmony.unpack200;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;

/* loaded from: classes6.dex */
public class FileBands extends BandSet {
    public final String[] cpUTF8;
    public byte[][] fileBits;
    public int[] fileModtime;
    public String[] fileName;
    public int[] fileOptions;
    public long[] fileSize;

    /* renamed from: in */
    public InputStream f9876in;

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void unpack() {
    }

    public FileBands(Segment segment) {
        super(segment);
        this.cpUTF8 = segment.getCpBands().getCpUTF8();
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void read(InputStream inputStream) throws Pack200Exception, IOException {
        int numberOfFiles = this.header.getNumberOfFiles();
        SegmentOptions options = this.header.getOptions();
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        this.fileName = parseReferences("file_name", inputStream, bHSDCodec, numberOfFiles, this.cpUTF8);
        this.fileSize = parseFlags("file_size", inputStream, numberOfFiles, bHSDCodec, options.hasFileSizeHi());
        if (options.hasFileModtime()) {
            this.fileModtime = decodeBandInt("file_modtime", inputStream, Codec.DELTA5, numberOfFiles);
        } else {
            this.fileModtime = new int[numberOfFiles];
        }
        if (options.hasFileOptions()) {
            this.fileOptions = decodeBandInt("file_options", inputStream, bHSDCodec, numberOfFiles);
        } else {
            this.fileOptions = new int[numberOfFiles];
        }
        this.f9876in = inputStream;
    }

    public void processFileBits() throws Pack200Exception, IOException {
        int numberOfFiles = this.header.getNumberOfFiles();
        this.fileBits = new byte[numberOfFiles][];
        for (int i = 0; i < numberOfFiles; i++) {
            int i2 = (int) this.fileSize[i];
            byte[] bArr = new byte[i2];
            this.fileBits[i] = bArr;
            int i3 = this.f9876in.read(bArr);
            if (i2 != 0 && i3 < i2) {
                throw new Pack200Exception("Expected to read " + i2 + " bytes but read " + i3);
            }
        }
    }

    public byte[][] getFileBits() {
        return this.fileBits;
    }

    public int[] getFileModtime() {
        return this.fileModtime;
    }

    public String[] getFileName() {
        return this.fileName;
    }

    public int[] getFileOptions() {
        return this.fileOptions;
    }

    public long[] getFileSize() {
        return this.fileSize;
    }
}
