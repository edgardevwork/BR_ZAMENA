package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.Bundleable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;

@UnstableApi
/* loaded from: classes.dex */
public final class ColorInfo implements Bundleable {
    public final int chromaBitdepth;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public int hashCode;

    @Nullable
    public final byte[] hdrStaticInfo;
    public final int lumaBitdepth;
    public static final ColorInfo SDR_BT709_LIMITED = new Builder().setColorSpace(1).setColorRange(2).setColorTransfer(3).build();
    public static final ColorInfo SRGB_BT709_FULL = new Builder().setColorSpace(1).setColorRange(1).setColorTransfer(2).build();
    public static final String FIELD_COLOR_SPACE = Util.intToStringMaxRadix(0);
    public static final String FIELD_COLOR_RANGE = Util.intToStringMaxRadix(1);
    public static final String FIELD_COLOR_TRANSFER = Util.intToStringMaxRadix(2);
    public static final String FIELD_HDR_STATIC_INFO = Util.intToStringMaxRadix(3);
    public static final String FIELD_LUMA_BITDEPTH = Util.intToStringMaxRadix(4);
    public static final String FIELD_CHROMA_BITDEPTH = Util.intToStringMaxRadix(5);

    @Deprecated
    public static final Bundleable.Creator<ColorInfo> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.ColorInfo$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return ColorInfo.fromBundle(bundle);
        }
    };

    @Pure
    public static int isoColorPrimariesToColorSpace(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int isoTransferCharacteristicsToColorTransfer(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public /* synthetic */ ColorInfo(int i, int i2, int i3, byte[] bArr, int i4, int i5, C27331 c27331) {
        this(i, i2, i3, bArr, i4, i5);
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        public int chromaBitdepth;
        public int colorRange;
        public int colorSpace;
        public int colorTransfer;

        @Nullable
        public byte[] hdrStaticInfo;
        public int lumaBitdepth;

        public /* synthetic */ Builder(ColorInfo colorInfo, C27331 c27331) {
            this(colorInfo);
        }

        public Builder() {
            this.colorSpace = -1;
            this.colorRange = -1;
            this.colorTransfer = -1;
            this.lumaBitdepth = -1;
            this.chromaBitdepth = -1;
        }

        public Builder(ColorInfo colorInfo) {
            this.colorSpace = colorInfo.colorSpace;
            this.colorRange = colorInfo.colorRange;
            this.colorTransfer = colorInfo.colorTransfer;
            this.hdrStaticInfo = colorInfo.hdrStaticInfo;
            this.lumaBitdepth = colorInfo.lumaBitdepth;
            this.chromaBitdepth = colorInfo.chromaBitdepth;
        }

        @CanIgnoreReturnValue
        public Builder setColorSpace(int i) {
            this.colorSpace = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setColorRange(int i) {
            this.colorRange = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setColorTransfer(int i) {
            this.colorTransfer = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHdrStaticInfo(@Nullable byte[] bArr) {
            this.hdrStaticInfo = bArr;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLumaBitdepth(int i) {
            this.lumaBitdepth = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setChromaBitdepth(int i) {
            this.chromaBitdepth = i;
            return this;
        }

        public ColorInfo build() {
            return new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, this.hdrStaticInfo, this.lumaBitdepth, this.chromaBitdepth);
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean isEquivalentToAssumedSdrDefault(@Nullable ColorInfo colorInfo) {
        int i;
        int i2;
        int i3;
        int i4;
        if (colorInfo == null) {
            return true;
        }
        int i5 = colorInfo.colorSpace;
        return (i5 == -1 || i5 == 1 || i5 == 2) && ((i = colorInfo.colorRange) == -1 || i == 2) && (((i2 = colorInfo.colorTransfer) == -1 || i2 == 3) && colorInfo.hdrStaticInfo == null && (((i3 = colorInfo.chromaBitdepth) == -1 || i3 == 8) && ((i4 = colorInfo.lumaBitdepth) == -1 || i4 == 8)));
    }

    public static boolean isTransferHdr(@Nullable ColorInfo colorInfo) {
        int i;
        return colorInfo != null && ((i = colorInfo.colorTransfer) == 7 || i == 6);
    }

    public ColorInfo(int i, int i2, int i3, @Nullable byte[] bArr, int i4, int i5) {
        this.colorSpace = i;
        this.colorRange = i2;
        this.colorTransfer = i3;
        this.hdrStaticInfo = bArr;
        this.lumaBitdepth = i4;
        this.chromaBitdepth = i5;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean isValid() {
        return isBitdepthValid() || isDataSpaceValid();
    }

    public boolean isBitdepthValid() {
        return (this.lumaBitdepth == -1 || this.chromaBitdepth == -1) ? false : true;
    }

    public boolean isDataSpaceValid() {
        return (this.colorSpace == -1 || this.colorRange == -1 || this.colorTransfer == -1) ? false : true;
    }

    public String toLogString() {
        String invariant;
        String str;
        if (isDataSpaceValid()) {
            invariant = Util.formatInvariant("%s/%s/%s", colorSpaceToString(this.colorSpace), colorRangeToString(this.colorRange), colorTransferToString(this.colorTransfer));
        } else {
            invariant = "NA/NA/NA";
        }
        if (isBitdepthValid()) {
            str = this.lumaBitdepth + "/" + this.chromaBitdepth;
        } else {
            str = "NA/NA";
        }
        return invariant + "/" + str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        return this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo) && this.lumaBitdepth == colorInfo.lumaBitdepth && this.chromaBitdepth == colorInfo.chromaBitdepth;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((((((((((527 + this.colorSpace) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31) + Arrays.hashCode(this.hdrStaticInfo)) * 31) + this.lumaBitdepth) * 31) + this.chromaBitdepth;
        }
        return this.hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(colorSpaceToString(this.colorSpace));
        sb.append(", ");
        sb.append(colorRangeToString(this.colorRange));
        sb.append(", ");
        sb.append(colorTransferToString(this.colorTransfer));
        sb.append(", ");
        sb.append(this.hdrStaticInfo != null);
        sb.append(", ");
        sb.append(lumaBitdepthToString(this.lumaBitdepth));
        sb.append(", ");
        sb.append(chromaBitdepthToString(this.chromaBitdepth));
        sb.append(")");
        return sb.toString();
    }

    public static String lumaBitdepthToString(int i) {
        if (i == -1) {
            return "NA";
        }
        return i + "bit Luma";
    }

    public static String chromaBitdepthToString(int i) {
        if (i == -1) {
            return "NA";
        }
        return i + "bit Chroma";
    }

    public static String colorSpaceToString(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i == 1) {
            return "BT709";
        }
        if (i == 2) {
            return "BT601";
        }
        return "Undefined color space";
    }

    public static String colorTransferToString(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i == 6) {
            return "ST2084 PQ";
        }
        if (i == 7) {
            return "HLG";
        }
        return "Undefined color transfer";
    }

    public static String colorRangeToString(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i == 1) {
            return "Full range";
        }
        if (i == 2) {
            return "Limited range";
        }
        return "Undefined color range";
    }

    @Override // androidx.media3.common.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_COLOR_SPACE, this.colorSpace);
        bundle.putInt(FIELD_COLOR_RANGE, this.colorRange);
        bundle.putInt(FIELD_COLOR_TRANSFER, this.colorTransfer);
        bundle.putByteArray(FIELD_HDR_STATIC_INFO, this.hdrStaticInfo);
        bundle.putInt(FIELD_LUMA_BITDEPTH, this.lumaBitdepth);
        bundle.putInt(FIELD_CHROMA_BITDEPTH, this.chromaBitdepth);
        return bundle;
    }

    public static ColorInfo fromBundle(Bundle bundle) {
        return new ColorInfo(bundle.getInt(FIELD_COLOR_SPACE, -1), bundle.getInt(FIELD_COLOR_RANGE, -1), bundle.getInt(FIELD_COLOR_TRANSFER, -1), bundle.getByteArray(FIELD_HDR_STATIC_INFO), bundle.getInt(FIELD_LUMA_BITDEPTH, -1), bundle.getInt(FIELD_CHROMA_BITDEPTH, -1));
    }
}
