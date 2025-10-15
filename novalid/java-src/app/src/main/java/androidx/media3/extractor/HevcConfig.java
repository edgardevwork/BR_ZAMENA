package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class HevcConfig {
    public static final int SPS_NAL_UNIT_TYPE = 33;
    public final int bitdepthChroma;
    public final int bitdepthLuma;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        int i;
        int i2;
        try {
            parsableByteArray.skipBytes(21);
            int unsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < unsignedByte2; i5++) {
                parsableByteArray.skipBytes(1);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                for (int i6 = 0; i6 < unsignedShort; i6++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i4 += unsignedShort2 + 4;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i4];
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            float f = 1.0f;
            String strBuildHevcCodecString = null;
            int i14 = 0;
            int i15 = 0;
            while (i14 < unsignedByte2) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                int i16 = i3;
                while (i16 < unsignedShort3) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i17 = unsignedByte2;
                    System.arraycopy(bArr2, i3, bArr, i15, bArr2.length);
                    int length = i15 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 33 && i16 == 0) {
                        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + unsignedShort4);
                        int i18 = h265SpsNalUnit.width;
                        i8 = h265SpsNalUnit.height;
                        i9 = h265SpsNalUnit.bitDepthLumaMinus8 + 8;
                        i10 = h265SpsNalUnit.bitDepthChromaMinus8 + 8;
                        int i19 = h265SpsNalUnit.colorSpace;
                        int i20 = h265SpsNalUnit.colorRange;
                        int i21 = h265SpsNalUnit.colorTransfer;
                        float f2 = h265SpsNalUnit.pixelWidthHeightRatio;
                        i = unsignedByte3;
                        i2 = unsignedShort3;
                        i7 = i18;
                        strBuildHevcCodecString = CodecSpecificDataUtil.buildHevcCodecString(h265SpsNalUnit.generalProfileSpace, h265SpsNalUnit.generalTierFlag, h265SpsNalUnit.generalProfileIdc, h265SpsNalUnit.generalProfileCompatibilityFlags, h265SpsNalUnit.constraintBytes, h265SpsNalUnit.generalLevelIdc);
                        i12 = i20;
                        i11 = i19;
                        f = f2;
                        i13 = i21;
                    } else {
                        i = unsignedByte3;
                        i2 = unsignedShort3;
                    }
                    i15 = length + unsignedShort4;
                    parsableByteArray.skipBytes(unsignedShort4);
                    i16++;
                    unsignedByte2 = i17;
                    unsignedByte3 = i;
                    unsignedShort3 = i2;
                    i3 = 0;
                }
                i14++;
                i3 = 0;
            }
            return new HevcConfig(i4 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), unsignedByte + 1, i7, i8, i9, i10, i11, i12, i13, f, strBuildHevcCodecString);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e);
        }
    }

    public HevcConfig(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, @Nullable String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i;
        this.width = i2;
        this.height = i3;
        this.bitdepthLuma = i4;
        this.bitdepthChroma = i5;
        this.colorSpace = i6;
        this.colorRange = i7;
        this.colorTransfer = i8;
        this.pixelWidthHeightRatio = f;
        this.codecs = str;
    }
}
