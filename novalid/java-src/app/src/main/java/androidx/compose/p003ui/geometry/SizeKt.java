package androidx.compose.p003ui.geometry;

import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Size.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0013\u001a*\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\u001f\u001a\u00020\u0002*\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010\u001f\u001a\u00020\u0002*\u00020\u00112\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b\"\u0010$\u001a\u001f\u0010\u001f\u001a\u00020\u0002*\u00020%2\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b\"\u0010&\u001a\u0016\u0010'\u001a\u00020(*\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\b*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b\"\u001f\u0010\f\u001a\u00020\b*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, m7105d2 = {TtmlNode.CENTER, "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Size;", "getCenter-uvyYCjk$annotations", "(J)V", "getCenter-uvyYCjk", "(J)J", "isSpecified", "", "isSpecified-uvyYCjk$annotations", "isSpecified-uvyYCjk", "(J)Z", "isUnspecified", "isUnspecified-uvyYCjk$annotations", "isUnspecified-uvyYCjk", "Size", "width", "", "height", "(FF)J", "lerp", TtmlNode.START, "stop", "fraction", "lerp-VgWVRYQ", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-TmRCtEA", "(JLkotlin/jvm/functions/Function0;)J", ScriptTagPayloadReader.KEY_TIMES, "", "size", "times-d16Qtg0", "(DJ)J", "(FJ)J", "", "(IJ)J", "toRect", "Landroidx/compose/ui/geometry/Rect;", "toRect-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "ui-geometry_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,226:1\n152#1:230\n25#2,3:227\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n166#1:230\n33#1:227,3\n*E\n"})
/* loaded from: classes2.dex */
public final class SizeKt {
    @Stable
    /* renamed from: getCenter-uvyYCjk$annotations */
    public static /* synthetic */ void m11179getCenteruvyYCjk$annotations(long j) {
    }

    @Stable
    /* renamed from: isSpecified-uvyYCjk$annotations */
    public static /* synthetic */ void m11181isSpecifieduvyYCjk$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-uvyYCjk$annotations */
    public static /* synthetic */ void m11183isUnspecifieduvyYCjk$annotations(long j) {
    }

    /* renamed from: isSpecified-uvyYCjk */
    public static final boolean m11180isSpecifieduvyYCjk(long j) {
        return j != Size.INSTANCE.m11176getUnspecifiedNHjbRc();
    }

    /* renamed from: isUnspecified-uvyYCjk */
    public static final boolean m11182isUnspecifieduvyYCjk(long j) {
        return j == Size.INSTANCE.m11176getUnspecifiedNHjbRc();
    }

    @Stable
    /* renamed from: lerp-VgWVRYQ */
    public static final long m11184lerpVgWVRYQ(long j, long j2, float f) {
        return Size(MathHelpersKt.lerp(Size.m11168getWidthimpl(j), Size.m11168getWidthimpl(j2), f), MathHelpersKt.lerp(Size.m11165getHeightimpl(j), Size.m11165getHeightimpl(j2), f));
    }

    @Stable
    /* renamed from: times-d16Qtg0 */
    public static final long m11188timesd16Qtg0(int i, long j) {
        return Size.m11171times7Ah8Wj8(j, i);
    }

    @Stable
    /* renamed from: times-d16Qtg0 */
    public static final long m11186timesd16Qtg0(double d, long j) {
        return Size.m11171times7Ah8Wj8(j, (float) d);
    }

    @Stable
    @NotNull
    /* renamed from: toRect-uvyYCjk */
    public static final Rect m11189toRectuvyYCjk(long j) {
        return RectKt.m11139Recttz77jQw(Offset.INSTANCE.m11115getZeroF1C5BW0(), j);
    }

    @Stable
    /* renamed from: times-d16Qtg0 */
    public static final long m11187timesd16Qtg0(float f, long j) {
        return Size.m11171times7Ah8Wj8(j, f);
    }

    /* renamed from: getCenter-uvyYCjk */
    public static final long m11178getCenteruvyYCjk(long j) {
        return OffsetKt.Offset(Size.m11168getWidthimpl(j) / 2.0f, Size.m11165getHeightimpl(j) / 2.0f);
    }

    @Stable
    public static final long Size(float f, float f2) {
        return Size.m11159constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: takeOrElse-TmRCtEA */
    public static final long m11185takeOrElseTmRCtEA(long j, @NotNull Function0<Size> function0) {
        return j != Size.INSTANCE.m11176getUnspecifiedNHjbRc() ? j : function0.invoke().getPackedValue();
    }
}
