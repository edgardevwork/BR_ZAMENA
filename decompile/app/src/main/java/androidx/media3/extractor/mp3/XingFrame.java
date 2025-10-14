package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.MpegAudioUtil;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* loaded from: classes.dex */
public final class XingFrame {
    public static final String TAG = "XingHeader";
    public final long dataSize;
    public final int encoderDelay;
    public final int encoderPadding;
    public final long frameCount;
    public final MpegAudioUtil.Header header;

    @Nullable
    public final long[] tableOfContents;

    public XingFrame(MpegAudioUtil.Header header, long j, long j2, @Nullable long[] jArr, int i, int i2) {
        this.header = header;
        this.frameCount = j;
        this.dataSize = j2;
        this.tableOfContents = jArr;
        this.encoderDelay = i;
        this.encoderPadding = i2;
    }

    public static XingFrame parse(MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        long[] jArr;
        int i;
        int i2;
        int i3 = header.samplesPerFrame;
        int i4 = parsableByteArray.readInt();
        int unsignedIntToInt = (i4 & 1) != 0 ? parsableByteArray.readUnsignedIntToInt() : -1;
        long unsignedInt = (i4 & 2) != 0 ? parsableByteArray.readUnsignedInt() : -1L;
        if ((i4 & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i5 = 0; i5 < 100; i5++) {
                jArr2[i5] = parsableByteArray.readUnsignedByte();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((i4 & 8) != 0) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.bytesLeft() >= 24) {
            parsableByteArray.skipBytes(21);
            int unsignedInt24 = parsableByteArray.readUnsignedInt24();
            i2 = unsignedInt24 & UnixStat.PERM_MASK;
            i = (16773120 & unsignedInt24) >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new XingFrame(header, unsignedIntToInt, unsignedInt, jArr, i, i2);
    }
}
