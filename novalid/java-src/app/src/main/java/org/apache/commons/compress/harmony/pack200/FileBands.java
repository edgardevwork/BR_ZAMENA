package org.apache.commons.compress.harmony.pack200;

import com.google.common.reflect.ClassPath;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.apache.commons.compress.harmony.pack200.Archive;
import org.apache.commons.compress.utils.ExactMath;

/* loaded from: classes6.dex */
public class FileBands extends BandSet {
    public final CpBands cpBands;
    public final List<Archive.PackingFile> fileList;
    public final CPUTF8[] fileName;
    public final byte[][] file_bits;
    public final int[] file_modtime;
    public int[] file_name;
    public final int[] file_options;
    public final long[] file_size;
    public final PackingOptions options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileBands(CpBands cpBands, SegmentHeader segmentHeader, PackingOptions packingOptions, Archive.SegmentUnit segmentUnit, int i) {
        super(i, segmentHeader);
        CpBands cpBands2 = cpBands;
        PackingOptions packingOptions2 = packingOptions;
        List<Archive.PackingFile> fileList = segmentUnit.getFileList();
        this.fileList = fileList;
        this.options = packingOptions2;
        this.cpBands = cpBands2;
        int size = fileList.size();
        this.fileName = new CPUTF8[size];
        this.file_modtime = new int[size];
        this.file_size = new long[size];
        this.file_options = new int[size];
        this.file_bits = new byte[size][];
        int archive_modtime = segmentHeader.getArchive_modtime();
        HashSet hashSet = new HashSet();
        Iterator<Pack200ClassReader> it = segmentUnit.getClassList().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getClassName());
        }
        CPUTF8 cPUtf8 = cpBands2.getCPUtf8("");
        boolean z = !"keep".equals(packingOptions.getModificationTime());
        int i2 = 0;
        int i3 = Integer.MIN_VALUE;
        int i4 = 0;
        int iAdd = 0;
        while (i4 < size) {
            Archive.PackingFile packingFile = this.fileList.get(i4);
            String name = packingFile.getName();
            if (name.endsWith(ClassPath.CLASS_FILE_NAME_EXTENSION) && !packingOptions2.isPassFile(name)) {
                int[] iArr = this.file_options;
                iArr[i4] = iArr[i4] | 2;
                if (hashSet.contains(name.substring(i2, name.length() - 6))) {
                    this.fileName[i4] = cPUtf8;
                } else {
                    this.fileName[i4] = cpBands2.getCPUtf8(name);
                }
            } else {
                this.fileName[i4] = cpBands2.getCPUtf8(name);
            }
            if (packingOptions.isKeepDeflateHint() && packingFile.isDefalteHint()) {
                int[] iArr2 = this.file_options;
                iArr2[i4] = iArr2[i4] | 1;
            }
            byte[] contents = packingFile.getContents();
            long[] jArr = this.file_size;
            long length = contents.length;
            jArr[i4] = length;
            iAdd = ExactMath.add(iAdd, length);
            int modtime = (int) (((packingFile.getModtime() + TimeZone.getDefault().getRawOffset()) / 1000) - archive_modtime);
            this.file_modtime[i4] = modtime;
            i3 = i3;
            if (z && i3 < modtime) {
                i3 = modtime;
            }
            this.file_bits[i4] = packingFile.getContents();
            i4++;
            cpBands2 = cpBands;
            packingOptions2 = packingOptions;
            i2 = 0;
        }
        if (z) {
            Arrays.fill(this.file_modtime, i3);
        }
    }

    public void finaliseBands() {
        this.file_name = new int[this.fileName.length];
        for (int i = 0; i < this.file_name.length; i++) {
            if (this.fileName[i].equals(this.cpBands.getCPUtf8(""))) {
                String name = this.fileList.get(i).getName();
                if (this.options.isPassFile(name)) {
                    this.fileName[i] = this.cpBands.getCPUtf8(name);
                    int[] iArr = this.file_options;
                    iArr[i] = iArr[i] & (-3);
                }
            }
            this.file_name[i] = this.fileName[i].getIndex();
        }
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(OutputStream outputStream) throws Pack200Exception, IOException {
        PackingUtils.log("Writing file bands...");
        int[] iArr = this.file_name;
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        byte[] bArrEncodeBandInt = encodeBandInt("file_name", iArr, bHSDCodec);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from file_name[" + this.file_name.length + "]");
        byte[] bArrEncodeFlags = encodeFlags("file_size", this.file_size, bHSDCodec, bHSDCodec, this.segmentHeader.have_file_size_hi());
        outputStream.write(bArrEncodeFlags);
        PackingUtils.log("Wrote " + bArrEncodeFlags.length + " bytes from file_size[" + this.file_size.length + "]");
        if (this.segmentHeader.have_file_modtime()) {
            byte[] bArrEncodeBandInt2 = encodeBandInt("file_modtime", this.file_modtime, Codec.DELTA5);
            outputStream.write(bArrEncodeBandInt2);
            PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from file_modtime[" + this.file_modtime.length + "]");
        }
        if (this.segmentHeader.have_file_options()) {
            byte[] bArrEncodeBandInt3 = encodeBandInt("file_options", this.file_options, bHSDCodec);
            outputStream.write(bArrEncodeBandInt3);
            PackingUtils.log("Wrote " + bArrEncodeBandInt3.length + " bytes from file_options[" + this.file_options.length + "]");
        }
        byte[] bArrEncodeBandInt4 = encodeBandInt("file_bits", flatten(this.file_bits), Codec.BYTE1);
        outputStream.write(bArrEncodeBandInt4);
        PackingUtils.log("Wrote " + bArrEncodeBandInt4.length + " bytes from file_bits[" + this.file_bits.length + "]");
    }

    public final int[] flatten(byte[][] bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        int[] iArr = new int[length];
        int i = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            int i2 = 0;
            while (i2 < length2) {
                iArr[i] = bArr3[i2] & 255;
                i2++;
                i++;
            }
        }
        return iArr;
    }
}
