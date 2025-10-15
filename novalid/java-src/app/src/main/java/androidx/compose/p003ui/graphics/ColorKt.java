package androidx.compose.p003ui.graphics;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.collection.ScatterMapKt;
import androidx.compose.p003ui.graphics.colorspace.ColorModel;
import androidx.compose.p003ui.graphics.colorspace.ColorSpace;
import androidx.compose.p003ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p003ui.graphics.colorspace.DoubleFunction;
import androidx.compose.p003ui.graphics.colorspace.Rgb;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.p054ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* compiled from: Color.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0017\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a5\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00142\b\b\u0001\u0010\r\u001a\u00020\u00142\b\b\u0001\u0010\u000e\u001a\u00020\u00142\b\b\u0003\u0010\u000f\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0016\u001a\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0082\b\u001a,\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0002\u001a\u001e\u0010'\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u0016\u0010+\u001a\u00020,*\u00020\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0016\u0010/\u001a\u00020\f*\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a%\u00102\u001a\u00020\u0002*\u00020\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0086\bø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u0016\u00107\u001a\u00020\u0014*\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, m7105d2 = {"isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "color", "", "(I)J", "(IIII)J", "", "(J)J", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "lerp", TtmlNode.START, "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "saturate", "v", "compositeOver", "background", "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,673:1\n587#1:674\n587#1:675\n587#1:676\n646#1:677\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n567#1:674\n568#1:675\n569#1:676\n658#1:677\n*E\n"})
/* loaded from: classes2.dex */
public final class ColorKt {
    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return ((f * f3) + ((f2 * f4) * (1.0f - f3))) / f5;
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations */
    public static /* synthetic */ void m11388isSpecified8_81llA$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations */
    public static /* synthetic */ void m11390isUnspecified8_81llA$annotations(long j) {
    }

    private static final float saturate(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            f2 = 1.0f;
            if (f < 1.0f) {
                return f;
            }
        }
        return f2;
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    @Stable
    public static final long Color(float f, float f2, float f3, float f4, @NotNull ColorSpace colorSpace) {
        float minValue = colorSpace.getMinValue(0);
        if (f <= colorSpace.getMaxValue(0) && minValue <= f) {
            float minValue2 = colorSpace.getMinValue(1);
            if (f2 <= colorSpace.getMaxValue(1) && minValue2 <= f2) {
                float minValue3 = colorSpace.getMinValue(2);
                if (f3 <= colorSpace.getMaxValue(2) && minValue3 <= f3 && 0.0f <= f4 && f4 <= 1.0f) {
                    if (colorSpace.getIsSrgb()) {
                        return Color.m11336constructorimpl(ULong.m15872constructorimpl(ULong.m15872constructorimpl(ULong.m15872constructorimpl((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & 4294967295L) << 32));
                    }
                    if (colorSpace.getComponentCount() != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
                    }
                    int id = colorSpace.getId();
                    if (id == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
                    }
                    short sM11448constructorimpl = Float16.m11448constructorimpl(f);
                    return Color.m11336constructorimpl(ULong.m15872constructorimpl(ULong.m15872constructorimpl(ULong.m15872constructorimpl(ULong.m15872constructorimpl(ULong.m15872constructorimpl(ULong.m15872constructorimpl(ULong.m15872constructorimpl(Float16.m11448constructorimpl(f2)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ULong.m15872constructorimpl(ULong.m15872constructorimpl(ULong.m15872constructorimpl(sM11448constructorimpl) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48)) | ULong.m15872constructorimpl(ULong.m15872constructorimpl(ULong.m15872constructorimpl(Float16.m11448constructorimpl(f3)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16)) | ULong.m15872constructorimpl(ULong.m15872constructorimpl(ULong.m15872constructorimpl((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | ULong.m15872constructorimpl(ULong.m15872constructorimpl(id) & 63)));
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + colorSpace).toString());
    }

    @Stable
    public static final long Color(@ColorInt int i) {
        return Color.m11336constructorimpl(ULong.m15872constructorimpl(ULong.m15872constructorimpl(i) << 32));
    }

    @Stable
    public static final long Color(long j) {
        return Color.m11336constructorimpl(ULong.m15872constructorimpl(ULong.m15872constructorimpl(ULong.m15872constructorimpl(j) & 4294967295L) << 32));
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    @Stable
    public static final long Color(@IntRange(from = 0, m10to = ScatterMapKt.Sentinel) int i, @IntRange(from = 0, m10to = ScatterMapKt.Sentinel) int i2, @IntRange(from = 0, m10to = ScatterMapKt.Sentinel) int i3, @IntRange(from = 0, m10to = ScatterMapKt.Sentinel) int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    @Stable
    /* renamed from: lerp-jxsXWHM */
    public static final long m11391lerpjxsXWHM(long j, long j2, @FloatRange(from = 0.0d, m9to = 1.0d) float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM11337convertvNxB06k = Color.m11337convertvNxB06k(j, oklab);
        long jM11337convertvNxB06k2 = Color.m11337convertvNxB06k(j2, oklab);
        float fM11342getAlphaimpl = Color.m11342getAlphaimpl(jM11337convertvNxB06k);
        float fM11346getRedimpl = Color.m11346getRedimpl(jM11337convertvNxB06k);
        float fM11345getGreenimpl = Color.m11345getGreenimpl(jM11337convertvNxB06k);
        float fM11343getBlueimpl = Color.m11343getBlueimpl(jM11337convertvNxB06k);
        float fM11342getAlphaimpl2 = Color.m11342getAlphaimpl(jM11337convertvNxB06k2);
        float fM11346getRedimpl2 = Color.m11346getRedimpl(jM11337convertvNxB06k2);
        float fM11345getGreenimpl2 = Color.m11345getGreenimpl(jM11337convertvNxB06k2);
        float fM11343getBlueimpl2 = Color.m11343getBlueimpl(jM11337convertvNxB06k2);
        return Color.m11337convertvNxB06k(Color(MathHelpersKt.lerp(fM11346getRedimpl, fM11346getRedimpl2, f), MathHelpersKt.lerp(fM11345getGreenimpl, fM11345getGreenimpl2, f), MathHelpersKt.lerp(fM11343getBlueimpl, fM11343getBlueimpl2, f), MathHelpersKt.lerp(fM11342getAlphaimpl, fM11342getAlphaimpl2, f), oklab), Color.m11344getColorSpaceimpl(j2));
    }

    @Stable
    /* renamed from: compositeOver--OWjLjI */
    public static final long m11385compositeOverOWjLjI(long j, long j2) {
        long jM11337convertvNxB06k = Color.m11337convertvNxB06k(j, Color.m11344getColorSpaceimpl(j2));
        float fM11342getAlphaimpl = Color.m11342getAlphaimpl(j2);
        float fM11342getAlphaimpl2 = Color.m11342getAlphaimpl(jM11337convertvNxB06k);
        float f = 1.0f - fM11342getAlphaimpl2;
        float f2 = (fM11342getAlphaimpl * f) + fM11342getAlphaimpl2;
        return Color(f2 == 0.0f ? 0.0f : ((Color.m11346getRedimpl(jM11337convertvNxB06k) * fM11342getAlphaimpl2) + ((Color.m11346getRedimpl(j2) * fM11342getAlphaimpl) * f)) / f2, f2 == 0.0f ? 0.0f : ((Color.m11345getGreenimpl(jM11337convertvNxB06k) * fM11342getAlphaimpl2) + ((Color.m11345getGreenimpl(j2) * fM11342getAlphaimpl) * f)) / f2, f2 != 0.0f ? ((Color.m11343getBlueimpl(jM11337convertvNxB06k) * fM11342getAlphaimpl2) + ((Color.m11343getBlueimpl(j2) * fM11342getAlphaimpl) * f)) / f2 : 0.0f, f2, Color.m11344getColorSpaceimpl(j2));
    }

    @Size(4)
    /* renamed from: getComponents-8_81llA */
    private static final float[] m11386getComponents8_81llA(long j) {
        return new float[]{Color.m11346getRedimpl(j), Color.m11345getGreenimpl(j), Color.m11343getBlueimpl(j), Color.m11342getAlphaimpl(j)};
    }

    @Stable
    /* renamed from: luminance-8_81llA */
    public static final float m11392luminance8_81llA(long j) {
        ColorSpace colorSpaceM11344getColorSpaceimpl = Color.m11344getColorSpaceimpl(j);
        if (!ColorModel.m11746equalsimpl0(colorSpaceM11344getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m11753getRgbxdoWZVw())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m11749toStringimpl(colorSpaceM11344getColorSpaceimpl.getModel()))).toString());
        }
        Intrinsics.checkNotNull(colorSpaceM11344getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc = ((Rgb) colorSpaceM11344getColorSpaceimpl).getEotfFunc();
        return saturate((float) ((eotfFunc.invoke(Color.m11346getRedimpl(j)) * 0.2126d) + (eotfFunc.invoke(Color.m11345getGreenimpl(j)) * 0.7152d) + (eotfFunc.invoke(Color.m11343getBlueimpl(j)) * 0.0722d)));
    }

    @Stable
    @ColorInt
    /* renamed from: toArgb-8_81llA */
    public static final int m11394toArgb8_81llA(long j) {
        return (int) ULong.m15872constructorimpl(Color.m11337convertvNxB06k(j, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    /* renamed from: isSpecified-8_81llA */
    public static final boolean m11387isSpecified8_81llA(long j) {
        return j != Color.INSTANCE.m11376getUnspecified0d7_KjU();
    }

    /* renamed from: isUnspecified-8_81llA */
    public static final boolean m11389isUnspecified8_81llA(long j) {
        return j == Color.INSTANCE.m11376getUnspecified0d7_KjU();
    }

    /* renamed from: takeOrElse-DxMtmZc */
    public static final long m11393takeOrElseDxMtmZc(long j, @NotNull Function0<Color> function0) {
        return j != Color.INSTANCE.m11376getUnspecified0d7_KjU() ? j : function0.invoke().m11350unboximpl();
    }
}
