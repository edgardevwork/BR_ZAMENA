package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: ScaleFactor.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\f*\u00020\fH\u0002\u001a%\u0010\u001b\u001a\u00020\u0002*\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010 \u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0019\u001a\u001f\u0010 \u001a\u00020\u0016*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0016H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0019\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m7105d2 = {"isSpecified", "", "Landroidx/compose/ui/layout/ScaleFactor;", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified-FK8aYYs", "(J)Z", "isUnspecified", "isUnspecified-FK8aYYs$annotations", "isUnspecified-FK8aYYs", "ScaleFactor", "scaleX", "", "scaleY", "(FF)J", "lerp", TtmlNode.START, "stop", "fraction", "lerp--bDIf60", "(JJF)J", TtmlNode.TAG_DIV, "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "div-UQTWf7w", "(JJ)J", "roundToTenths", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-oyDd2qo", "(JLkotlin/jvm/functions/Function0;)J", ScriptTagPayloadReader.KEY_TIMES, "times-UQTWf7w", "size", "times-m-w2e94", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,198:1\n130#1:202\n25#2,3:199\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n144#1:202\n31#1:199,3\n*E\n"})
/* loaded from: classes4.dex */
public final class ScaleFactorKt {
    @Stable
    /* renamed from: isSpecified-FK8aYYs$annotations */
    public static /* synthetic */ void m12690isSpecifiedFK8aYYs$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-FK8aYYs$annotations */
    public static /* synthetic */ void m12692isUnspecifiedFK8aYYs$annotations(long j) {
    }

    public static final float roundToTenths(float f) {
        float f2 = 10;
        float f3 = f * f2;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        return i / f2;
    }

    /* renamed from: isSpecified-FK8aYYs */
    public static final boolean m12689isSpecifiedFK8aYYs(long j) {
        return j != ScaleFactor.INSTANCE.m12687getUnspecified_hLwfpc();
    }

    /* renamed from: isUnspecified-FK8aYYs */
    public static final boolean m12691isUnspecifiedFK8aYYs(long j) {
        return j == ScaleFactor.INSTANCE.m12687getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: times-UQTWf7w */
    public static final long m12695timesUQTWf7w(long j, long j2) {
        return SizeKt.Size(Size.m11168getWidthimpl(j) * ScaleFactor.m12680getScaleXimpl(j2), Size.m11165getHeightimpl(j) * ScaleFactor.m12681getScaleYimpl(j2));
    }

    @Stable
    /* renamed from: times-m-w2e94 */
    public static final long m12696timesmw2e94(long j, long j2) {
        return m12695timesUQTWf7w(j2, j);
    }

    @Stable
    /* renamed from: div-UQTWf7w */
    public static final long m12688divUQTWf7w(long j, long j2) {
        return SizeKt.Size(Size.m11168getWidthimpl(j) / ScaleFactor.m12680getScaleXimpl(j2), Size.m11165getHeightimpl(j) / ScaleFactor.m12681getScaleYimpl(j2));
    }

    @Stable
    /* renamed from: lerp--bDIf60 */
    public static final long m12693lerpbDIf60(long j, long j2, float f) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m12680getScaleXimpl(j), ScaleFactor.m12680getScaleXimpl(j2), f), MathHelpersKt.lerp(ScaleFactor.m12681getScaleYimpl(j), ScaleFactor.m12681getScaleYimpl(j2), f));
    }

    @Stable
    public static final long ScaleFactor(float f, float f2) {
        return ScaleFactor.m12674constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: takeOrElse-oyDd2qo */
    public static final long m12694takeOrElseoyDd2qo(long j, @NotNull Function0<ScaleFactor> function0) {
        return j != ScaleFactor.INSTANCE.m12687getUnspecified_hLwfpc() ? j : function0.invoke().getPackedValue();
    }
}
