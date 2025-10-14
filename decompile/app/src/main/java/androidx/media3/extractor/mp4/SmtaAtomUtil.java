package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.C2732C;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;

@UnstableApi
/* loaded from: classes.dex */
public final class SmtaAtomUtil {
    public static final int CAMCORDER_FRC_SUPERSLOW_MOTION = 9;
    public static final int CAMCORDER_FRC_SUPERSLOW_MOTION_HEVC = 22;
    public static final int CAMCORDER_NORMAL = 0;
    public static final int CAMCORDER_QFRC_SUPERSLOW_MOTION = 23;
    public static final int CAMCORDER_SINGLE_SUPERSLOW_MOTION = 7;
    public static final int CAMCORDER_SLOW_MOTION_V2 = 12;
    public static final int CAMCORDER_SLOW_MOTION_V2_120 = 13;
    public static final int CAMCORDER_SLOW_MOTION_V2_HEVC = 21;
    public static final int NO_VALUE = -1;

    @Nullable
    public static Metadata parseSmta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (i2 < 16) {
                    return null;
                }
                parsableByteArray.skipBytes(4);
                int i3 = -1;
                int i4 = 0;
                for (int i5 = 0; i5 < 2; i5++) {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    int unsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (unsignedByte == 0) {
                        i3 = unsignedByte2;
                    } else if (unsignedByte == 1) {
                        i4 = unsignedByte2;
                    }
                }
                int captureFrameRate = getCaptureFrameRate(i3, parsableByteArray, i);
                if (captureFrameRate == -2147483647) {
                    return null;
                }
                return new Metadata(new SmtaMetadataEntry(captureFrameRate, i4));
            }
            parsableByteArray.setPosition(position + i2);
        }
        return null;
    }

    public static int getCaptureFrameRate(int i, ParsableByteArray parsableByteArray, int i2) {
        if (i == 12) {
            return 240;
        }
        if (i == 13) {
            return 120;
        }
        if (i == 21 && parsableByteArray.bytesLeft() >= 8 && parsableByteArray.getPosition() + 8 <= i2) {
            int i3 = parsableByteArray.readInt();
            int i4 = parsableByteArray.readInt();
            if (i3 >= 12 && i4 == 1936877170) {
                return parsableByteArray.readUnsignedFixedPoint1616();
            }
        }
        return C2732C.RATE_UNSET_INT;
    }
}
