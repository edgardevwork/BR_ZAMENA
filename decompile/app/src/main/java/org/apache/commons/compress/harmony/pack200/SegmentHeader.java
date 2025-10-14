package org.apache.commons.compress.harmony.pack200;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public class SegmentHeader extends BandSet {
    public static final int archive_majver = 150;
    public static final int archive_minver = 7;
    public static final int[] magic = {202, 254, 208, 13};
    public int archive_modtime;
    public int archive_next_count;
    public int archive_options;
    public int archive_size_hi;
    public int archive_size_lo;
    public int attribute_definition_count;
    public final IntList band_headers;
    public int class_count;
    public int cp_Class_count;
    public int cp_Descr_count;
    public int cp_Double_count;
    public int cp_Field_count;
    public int cp_Float_count;
    public int cp_Imethod_count;
    public int cp_Int_count;
    public int cp_Long_count;
    public int cp_Method_count;
    public int cp_Signature_count;
    public int cp_String_count;
    public int cp_Utf8_count;
    public boolean deflate_hint;
    public int file_count;
    public boolean have_all_code_flags;
    public boolean have_class_flags_hi;
    public boolean have_code_flags_hi;
    public boolean have_field_flags_hi;
    public final boolean have_file_modtime;
    public final boolean have_file_options;
    public boolean have_file_size_hi;
    public boolean have_method_flags_hi;
    public int ic_count;
    public final Counter majverCounter;

    public boolean have_file_modtime() {
        return true;
    }

    public boolean have_file_options() {
        return true;
    }

    public SegmentHeader() {
        super(1, null);
        this.band_headers = new IntList();
        this.have_all_code_flags = true;
        this.have_file_modtime = true;
        this.have_file_options = true;
        this.majverCounter = new Counter();
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(OutputStream outputStream) throws Pack200Exception, IOException {
        int[] iArr = magic;
        BHSDCodec bHSDCodec = Codec.BYTE1;
        outputStream.write(encodeScalar(iArr, bHSDCodec));
        BHSDCodec bHSDCodec2 = Codec.UNSIGNED5;
        outputStream.write(encodeScalar(7, bHSDCodec2));
        outputStream.write(encodeScalar(150, bHSDCodec2));
        calculateArchiveOptions();
        outputStream.write(encodeScalar(this.archive_options, bHSDCodec2));
        writeArchiveFileCounts(outputStream);
        writeArchiveSpecialCounts(outputStream);
        writeCpCounts(outputStream);
        writeClassCounts(outputStream);
        if (this.band_headers.size() > 0) {
            outputStream.write(encodeScalar(this.band_headers.toArray(), bHSDCodec));
        }
    }

    public final void calculateArchiveOptions() {
        if (this.attribute_definition_count > 0 || this.band_headers.size() > 0) {
            this.archive_options |= 1;
        }
        if (this.cp_Int_count > 0 || this.cp_Float_count > 0 || this.cp_Long_count > 0 || this.cp_Double_count > 0) {
            this.archive_options |= 2;
        }
        if (this.have_all_code_flags) {
            this.archive_options |= 4;
        }
        if (this.file_count > 0) {
            this.archive_options |= 16;
        }
        if (this.deflate_hint) {
            this.archive_options |= 32;
        }
        int i = this.archive_options;
        this.archive_options = i | 192;
        if (this.have_file_size_hi) {
            this.archive_options = i | 448;
        }
        if (this.have_class_flags_hi) {
            this.archive_options |= 512;
        }
        if (this.have_field_flags_hi) {
            this.archive_options |= 1024;
        }
        if (this.have_method_flags_hi) {
            this.archive_options |= 2048;
        }
        if (this.have_code_flags_hi) {
            this.archive_options |= 4096;
        }
    }

    public void setCp_Utf8_count(int i) {
        this.cp_Utf8_count = i;
    }

    public void setCp_Int_count(int i) {
        this.cp_Int_count = i;
    }

    public void setCp_Float_count(int i) {
        this.cp_Float_count = i;
    }

    public void setCp_Long_count(int i) {
        this.cp_Long_count = i;
    }

    public void setCp_Double_count(int i) {
        this.cp_Double_count = i;
    }

    public void setCp_String_count(int i) {
        this.cp_String_count = i;
    }

    public void setCp_Class_count(int i) {
        this.cp_Class_count = i;
    }

    public void setCp_Signature_count(int i) {
        this.cp_Signature_count = i;
    }

    public void setCp_Descr_count(int i) {
        this.cp_Descr_count = i;
    }

    public void setCp_Field_count(int i) {
        this.cp_Field_count = i;
    }

    public void setCp_Method_count(int i) {
        this.cp_Method_count = i;
    }

    public void setCp_Imethod_count(int i) {
        this.cp_Imethod_count = i;
    }

    public void setAttribute_definition_count(int i) {
        this.attribute_definition_count = i;
    }

    public void setHave_all_code_flags(boolean z) {
        this.have_all_code_flags = z;
    }

    public int getArchive_modtime() {
        return this.archive_modtime;
    }

    public void setFile_count(int i) {
        this.file_count = i;
    }

    public void setDeflate_hint(boolean z) {
        this.deflate_hint = z;
    }

    public void setHave_class_flags_hi(boolean z) {
        this.have_class_flags_hi = z;
    }

    public void setHave_field_flags_hi(boolean z) {
        this.have_field_flags_hi = z;
    }

    public void setHave_method_flags_hi(boolean z) {
        this.have_method_flags_hi = z;
    }

    public void setHave_code_flags_hi(boolean z) {
        this.have_code_flags_hi = z;
    }

    public boolean have_class_flags_hi() {
        return this.have_class_flags_hi;
    }

    public boolean have_field_flags_hi() {
        return this.have_field_flags_hi;
    }

    public boolean have_method_flags_hi() {
        return this.have_method_flags_hi;
    }

    public boolean have_code_flags_hi() {
        return this.have_code_flags_hi;
    }

    public void setIc_count(int i) {
        this.ic_count = i;
    }

    public void setClass_count(int i) {
        this.class_count = i;
    }

    public final void writeCpCounts(OutputStream outputStream) throws Pack200Exception, IOException {
        int i = this.cp_Utf8_count;
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        outputStream.write(encodeScalar(i, bHSDCodec));
        if ((this.archive_options & 2) != 0) {
            outputStream.write(encodeScalar(this.cp_Int_count, bHSDCodec));
            outputStream.write(encodeScalar(this.cp_Float_count, bHSDCodec));
            outputStream.write(encodeScalar(this.cp_Long_count, bHSDCodec));
            outputStream.write(encodeScalar(this.cp_Double_count, bHSDCodec));
        }
        outputStream.write(encodeScalar(this.cp_String_count, bHSDCodec));
        outputStream.write(encodeScalar(this.cp_Class_count, bHSDCodec));
        outputStream.write(encodeScalar(this.cp_Signature_count, bHSDCodec));
        outputStream.write(encodeScalar(this.cp_Descr_count, bHSDCodec));
        outputStream.write(encodeScalar(this.cp_Field_count, bHSDCodec));
        outputStream.write(encodeScalar(this.cp_Method_count, bHSDCodec));
        outputStream.write(encodeScalar(this.cp_Imethod_count, bHSDCodec));
    }

    public final void writeClassCounts(OutputStream outputStream) throws Pack200Exception, IOException {
        int mostCommon = this.majverCounter.getMostCommon();
        int i = this.ic_count;
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        outputStream.write(encodeScalar(i, bHSDCodec));
        outputStream.write(encodeScalar(0, bHSDCodec));
        outputStream.write(encodeScalar(mostCommon, bHSDCodec));
        outputStream.write(encodeScalar(this.class_count, bHSDCodec));
    }

    public final void writeArchiveSpecialCounts(OutputStream outputStream) throws Pack200Exception, IOException {
        if ((this.archive_options & 1) > 0) {
            int size = this.band_headers.size();
            BHSDCodec bHSDCodec = Codec.UNSIGNED5;
            outputStream.write(encodeScalar(size, bHSDCodec));
            outputStream.write(encodeScalar(this.attribute_definition_count, bHSDCodec));
        }
    }

    public final void writeArchiveFileCounts(OutputStream outputStream) throws Pack200Exception, IOException {
        if ((this.archive_options & 16) > 0) {
            int i = this.archive_size_hi;
            BHSDCodec bHSDCodec = Codec.UNSIGNED5;
            outputStream.write(encodeScalar(i, bHSDCodec));
            outputStream.write(encodeScalar(this.archive_size_lo, bHSDCodec));
            outputStream.write(encodeScalar(this.archive_next_count, bHSDCodec));
            outputStream.write(encodeScalar(this.archive_modtime, bHSDCodec));
            outputStream.write(encodeScalar(this.file_count, bHSDCodec));
        }
    }

    public void addMajorVersion(int i) {
        this.majverCounter.add(i);
    }

    /* loaded from: classes7.dex */
    public class Counter {
        public final int[] counts;
        public int length;
        public final int[] objs;

        public Counter() {
            this.objs = new int[8];
            this.counts = new int[8];
        }

        public /* synthetic */ Counter(SegmentHeader segmentHeader, C110491 c110491) {
            this();
        }

        public void add(int i) {
            int i2;
            int i3 = 0;
            boolean z = false;
            while (true) {
                i2 = this.length;
                if (i3 >= i2) {
                    break;
                }
                if (this.objs[i3] == i) {
                    int[] iArr = this.counts;
                    iArr[i3] = iArr[i3] + 1;
                    z = true;
                }
                i3++;
            }
            if (z) {
                return;
            }
            int[] iArr2 = this.objs;
            iArr2[i2] = i;
            this.counts[i2] = 1;
            int i4 = i2 + 1;
            this.length = i4;
            if (i4 > iArr2.length - 1) {
                System.arraycopy(iArr2, 0, new Object[iArr2.length + 8], 0, i4);
            }
        }

        public int getMostCommon() {
            int i = 0;
            for (int i2 = 0; i2 < this.length; i2++) {
                int[] iArr = this.counts;
                if (iArr[i2] > iArr[i]) {
                    i = i2;
                }
            }
            return this.objs[i];
        }
    }

    public int getDefaultMajorVersion() {
        return this.majverCounter.getMostCommon();
    }

    public boolean have_file_size_hi() {
        return this.have_file_size_hi;
    }

    public boolean have_all_code_flags() {
        return this.have_all_code_flags;
    }

    public void appendBandCodingSpecifier(int i) {
        this.band_headers.add(i);
    }
}
