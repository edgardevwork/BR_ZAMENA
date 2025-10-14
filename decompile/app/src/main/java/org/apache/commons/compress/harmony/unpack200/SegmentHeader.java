package org.apache.commons.compress.harmony.unpack200;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;

/* loaded from: classes7.dex */
public class SegmentHeader {
    public static final int[] magic = {202, 254, 208, 13};
    public int archiveMajor;
    public int archiveMinor;
    public long archiveModtime;
    public long archiveSize;
    public int archiveSizeOffset;
    public int attributeDefinitionCount;
    public InputStream bandHeadersInputStream;
    public int bandHeadersSize;
    public int classCount;
    public int cpClassCount;
    public int cpDescriptorCount;
    public int cpDoubleCount;
    public int cpFieldCount;
    public int cpFloatCount;
    public int cpIMethodCount;
    public int cpIntCount;
    public int cpLongCount;
    public int cpMethodCount;
    public int cpSignatureCount;
    public int cpStringCount;
    public int cpUTF8Count;
    public int defaultClassMajorVersion;
    public int defaultClassMinorVersion;
    public int innerClassCount;
    public int numberOfFiles;
    public SegmentOptions options;
    public final Segment segment;
    public int segmentsRemaining;

    public void unpack() {
    }

    public SegmentHeader(Segment segment) {
        this.segment = segment;
    }

    public int getArchiveSizeOffset() {
        return this.archiveSizeOffset;
    }

    public void read(InputStream inputStream) throws Pack200Exception, Error, IOException {
        int[] iArrDecodeScalar = decodeScalar("archive_magic_word", inputStream, Codec.BYTE1, magic.length);
        int i = 0;
        while (true) {
            int[] iArr = magic;
            if (i < iArr.length) {
                if (iArrDecodeScalar[i] != iArr[i]) {
                    throw new Error("Bad header");
                }
                i++;
            } else {
                BHSDCodec bHSDCodec = Codec.UNSIGNED5;
                setArchiveMinorVersion(decodeScalar("archive_minver", inputStream, bHSDCodec));
                setArchiveMajorVersion(decodeScalar("archive_majver", inputStream, bHSDCodec));
                this.options = new SegmentOptions(decodeScalar("archive_options", inputStream, bHSDCodec));
                parseArchiveFileCounts(inputStream);
                parseArchiveSpecialCounts(inputStream);
                parseCpCounts(inputStream);
                parseClassCounts(inputStream);
                if (getBandHeadersSize() > 0) {
                    byte[] bArr = new byte[getBandHeadersSize()];
                    readFully(inputStream, bArr);
                    setBandHeadersData(bArr);
                }
                this.archiveSizeOffset -= inputStream.available();
                return;
            }
        }
    }

    public final void setArchiveMinorVersion(int i) throws Pack200Exception {
        if (i != 7) {
            throw new Pack200Exception("Invalid segment minor version");
        }
        this.archiveMinor = i;
    }

    public final void setArchiveMajorVersion(int i) throws Pack200Exception {
        if (i != 150) {
            throw new Pack200Exception("Invalid segment major version: " + i);
        }
        this.archiveMajor = i;
    }

    public long getArchiveModtime() {
        return this.archiveModtime;
    }

    public int getAttributeDefinitionCount() {
        return this.attributeDefinitionCount;
    }

    public int getClassCount() {
        return this.classCount;
    }

    public int getCpClassCount() {
        return this.cpClassCount;
    }

    public int getCpDescriptorCount() {
        return this.cpDescriptorCount;
    }

    public int getCpDoubleCount() {
        return this.cpDoubleCount;
    }

    public int getCpFieldCount() {
        return this.cpFieldCount;
    }

    public int getCpFloatCount() {
        return this.cpFloatCount;
    }

    public int getCpIMethodCount() {
        return this.cpIMethodCount;
    }

    public int getCpIntCount() {
        return this.cpIntCount;
    }

    public int getCpLongCount() {
        return this.cpLongCount;
    }

    public int getCpMethodCount() {
        return this.cpMethodCount;
    }

    public int getCpSignatureCount() {
        return this.cpSignatureCount;
    }

    public int getCpStringCount() {
        return this.cpStringCount;
    }

    public int getCpUTF8Count() {
        return this.cpUTF8Count;
    }

    public int getDefaultClassMajorVersion() {
        return this.defaultClassMajorVersion;
    }

    public int getDefaultClassMinorVersion() {
        return this.defaultClassMinorVersion;
    }

    public int getInnerClassCount() {
        return this.innerClassCount;
    }

    public long getArchiveSize() {
        return this.archiveSize;
    }

    public InputStream getBandHeadersInputStream() {
        if (this.bandHeadersInputStream == null) {
            this.bandHeadersInputStream = new ByteArrayInputStream(new byte[0]);
        }
        return this.bandHeadersInputStream;
    }

    public int getNumberOfFiles() {
        return this.numberOfFiles;
    }

    public int getSegmentsRemaining() {
        return this.segmentsRemaining;
    }

    public SegmentOptions getOptions() {
        return this.options;
    }

    public final void parseArchiveFileCounts(InputStream inputStream) throws Pack200Exception, IOException {
        if (this.options.hasArchiveFileCounts()) {
            BHSDCodec bHSDCodec = Codec.UNSIGNED5;
            setArchiveSize((decodeScalar("archive_size_hi", inputStream, bHSDCodec) << 32) | decodeScalar("archive_size_lo", inputStream, bHSDCodec));
            this.archiveSizeOffset = inputStream.available();
            setSegmentsRemaining(decodeScalar("archive_next_count", inputStream, bHSDCodec));
            setArchiveModtime(decodeScalar("archive_modtime", inputStream, bHSDCodec));
            this.numberOfFiles = decodeScalar("file_count", inputStream, bHSDCodec);
        }
    }

    public final void parseArchiveSpecialCounts(InputStream inputStream) throws Pack200Exception, IOException {
        if (getOptions().hasSpecialFormats()) {
            this.bandHeadersSize = decodeScalar("band_headers_size", inputStream, Codec.UNSIGNED5);
            setAttributeDefinitionCount(decodeScalar("attr_definition_count", inputStream, r0));
        }
    }

    public final void parseClassCounts(InputStream inputStream) throws Pack200Exception, IOException {
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        this.innerClassCount = decodeScalar("ic_count", inputStream, bHSDCodec);
        this.defaultClassMinorVersion = decodeScalar("default_class_minver", inputStream, bHSDCodec);
        this.defaultClassMajorVersion = decodeScalar("default_class_majver", inputStream, bHSDCodec);
        this.classCount = decodeScalar("class_count", inputStream, bHSDCodec);
    }

    public final void parseCpCounts(InputStream inputStream) throws Pack200Exception, IOException {
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        this.cpUTF8Count = decodeScalar("cp_Utf8_count", inputStream, bHSDCodec);
        if (getOptions().hasCPNumberCounts()) {
            this.cpIntCount = decodeScalar("cp_Int_count", inputStream, bHSDCodec);
            this.cpFloatCount = decodeScalar("cp_Float_count", inputStream, bHSDCodec);
            this.cpLongCount = decodeScalar("cp_Long_count", inputStream, bHSDCodec);
            this.cpDoubleCount = decodeScalar("cp_Double_count", inputStream, bHSDCodec);
        }
        this.cpStringCount = decodeScalar("cp_String_count", inputStream, bHSDCodec);
        this.cpClassCount = decodeScalar("cp_Class_count", inputStream, bHSDCodec);
        this.cpSignatureCount = decodeScalar("cp_Signature_count", inputStream, bHSDCodec);
        this.cpDescriptorCount = decodeScalar("cp_Descr_count", inputStream, bHSDCodec);
        this.cpFieldCount = decodeScalar("cp_Field_count", inputStream, bHSDCodec);
        this.cpMethodCount = decodeScalar("cp_Method_count", inputStream, bHSDCodec);
        this.cpIMethodCount = decodeScalar("cp_Imethod_count", inputStream, bHSDCodec);
    }

    public final int[] decodeScalar(String str, InputStream inputStream, BHSDCodec bHSDCodec, int i) throws Pack200Exception, IOException {
        this.segment.log(2, "Parsed #" + str + " (" + i + ")");
        return bHSDCodec.decodeInts(i, inputStream);
    }

    public final int decodeScalar(String str, InputStream inputStream, BHSDCodec bHSDCodec) throws Pack200Exception, IOException {
        int iDecode = bHSDCodec.decode(inputStream);
        this.segment.log(2, "Parsed #" + str + " as " + iDecode);
        return iDecode;
    }

    public void setArchiveModtime(long j) {
        this.archiveModtime = j;
    }

    public void setArchiveSize(long j) {
        this.archiveSize = j;
    }

    public final void setAttributeDefinitionCount(long j) {
        this.attributeDefinitionCount = (int) j;
    }

    public final void setBandHeadersData(byte[] bArr) {
        this.bandHeadersInputStream = new ByteArrayInputStream(bArr);
    }

    public void setSegmentsRemaining(long j) {
        this.segmentsRemaining = (int) j;
    }

    public final void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        int i = inputStream.read(bArr);
        if (i == -1) {
            throw new EOFException("Failed to read any data from input stream");
        }
        while (i < bArr.length) {
            int i2 = inputStream.read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException("Failed to read some data from input stream");
            }
            i += i2;
        }
    }

    public int getBandHeadersSize() {
        return this.bandHeadersSize;
    }
}
