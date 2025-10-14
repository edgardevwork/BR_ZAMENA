package androidx.compose.p003ui.geometry;

import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Offset.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001a*\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u0018\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m7105d2 = {"isFinite", "", "Landroidx/compose/ui/geometry/Offset;", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite-k-4lQ0M", "(J)Z", "isSpecified", "isSpecified-k-4lQ0M$annotations", "isSpecified-k-4lQ0M", "isUnspecified", "isUnspecified-k-4lQ0M$annotations", "isUnspecified-k-4lQ0M", "Offset", "x", "", "y", "(FF)J", "lerp", TtmlNode.START, "stop", "fraction", "lerp-Wko1d7g", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-3MmeM6k", "(JLkotlin/jvm/functions/Function0;)J", "ui-geometry_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n25#2,3:267\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n31#1:267,3\n*E\n"})
/* loaded from: classes4.dex */
public final class OffsetKt {
    @Stable
    /* renamed from: isFinite-k-4lQ0M$annotations */
    public static /* synthetic */ void m11117isFinitek4lQ0M$annotations(long j) {
    }

    @Stable
    /* renamed from: isSpecified-k-4lQ0M$annotations */
    public static /* synthetic */ void m11119isSpecifiedk4lQ0M$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-k-4lQ0M$annotations */
    public static /* synthetic */ void m11121isUnspecifiedk4lQ0M$annotations(long j) {
    }

    @Stable
    /* renamed from: lerp-Wko1d7g */
    public static final long m11122lerpWko1d7g(long j, long j2, float f) {
        return Offset(MathHelpersKt.lerp(Offset.m11099getXimpl(j), Offset.m11099getXimpl(j2), f), MathHelpersKt.lerp(Offset.m11100getYimpl(j), Offset.m11100getYimpl(j2), f));
    }

    /* renamed from: isFinite-k-4lQ0M */
    public static final boolean m11116isFinitek4lQ0M(long j) {
        float fM11099getXimpl = Offset.m11099getXimpl(j);
        if (!Float.isInfinite(fM11099getXimpl) && !Float.isNaN(fM11099getXimpl)) {
            float fM11100getYimpl = Offset.m11100getYimpl(j);
            if (!Float.isInfinite(fM11100getYimpl) && !Float.isNaN(fM11100getYimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isSpecified-k-4lQ0M */
    public static final boolean m11118isSpecifiedk4lQ0M(long j) {
        return j != Offset.INSTANCE.m11114getUnspecifiedF1C5BW0();
    }

    /* renamed from: isUnspecified-k-4lQ0M */
    public static final boolean m11120isUnspecifiedk4lQ0M(long j) {
        return j == Offset.INSTANCE.m11114getUnspecifiedF1C5BW0();
    }

    /* renamed from: takeOrElse-3MmeM6k */
    public static final long m11123takeOrElse3MmeM6k(long j, @NotNull Function0<Offset> function0) {
        return m11118isSpecifiedk4lQ0M(j) ? j : function0.invoke().getPackedValue();
    }

    @Stable
    public static final long Offset(float f, float f2) {
        return Offset.m11091constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
