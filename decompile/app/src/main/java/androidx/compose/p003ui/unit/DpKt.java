package androidx.compose.p003ui.unit;

import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dp.kt */
@Metadata(m7104d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\"\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a\"\u0010:\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b;\u00109\u001a*\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a*\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a*\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010C\u001a#\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a#\u0010J\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bK\u0010I\u001a\u001f\u0010L\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bN\u0010I\u001a\u001f\u0010O\u001a\u00020\b*\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u0010I\u001a'\u0010R\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bS\u0010A\u001a%\u0010T\u001a\u00020\b*\u00020\b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0VH\u0086\bø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a%\u0010T\u001a\u00020\u0001*\u00020\u00012\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00010VH\u0086\bø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a%\u0010T\u001a\u00020\u0002*\u00020\u00022\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00020VH\u0086\bø\u0001\u0000¢\u0006\u0004\b[\u0010Z\u001a\u001f\u0010\\\u001a\u00020\b*\u00020\t2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0000¢\u0006\u0004\b^\u0010_\u001a\u001f\u0010\\\u001a\u00020\b*\u00020\u000e2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0000¢\u0006\u0004\b^\u0010I\u001a\u001f\u0010\\\u001a\u00020\u0002*\u00020\u000e2\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a\u001f\u0010\\\u001a\u00020\b*\u00020\u00112\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0000¢\u0006\u0004\b^\u0010b\u001a\u001f\u0010\\\u001a\u00020\u0002*\u00020\u00112\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b`\u0010c\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\b*\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001f\u0010\u0007\u001a\u00020\b*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010\"\u001f\u0010\u0007\u001a\u00020\b*\u00020\u00118Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0012\u001a\u0004\b\f\u0010\u0013\"\u001f\u0010\u0014\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001f\u0010\u001a\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u001e\"\u001f\u0010\u001f\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u001e\"\u001f\u0010\u001f\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010$\"\u001f\u0010\u001f\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010$\"\u001f\u0010'\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u001e\"\u001f\u0010'\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010$\"\u001f\u0010'\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010$\"\u001f\u0010.\u001a\u00020\u0002*\u00020\u00158Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u0017\u001a\u0004\b0\u00101\"\u001f\u00102\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0017\u001a\u0004\b4\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006d"}, m7105d2 = {TtmlNode.CENTER, "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpSize;", "getCenter-EaSLcWc$annotations", "(J)V", "getCenter-EaSLcWc", "(J)J", CalendarKeys.DAYS_GAME_KEY, "Landroidx/compose/ui/unit/Dp;", "", "getDp$annotations", "(D)V", "getDp", "(D)F", "", "(F)V", "(F)F", "", "(I)V", "(I)F", "height", "Landroidx/compose/ui/unit/DpRect;", "getHeight$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "(Landroidx/compose/ui/unit/DpRect;)F", "isFinite", "", "isFinite-0680j_4$annotations", "isFinite-0680j_4", "(F)Z", "isSpecified", "isSpecified-0680j_4$annotations", "isSpecified-0680j_4", "isSpecified-jo-Fl9I$annotations", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-EaSLcWc$annotations", "isSpecified-EaSLcWc", "isUnspecified", "isUnspecified-0680j_4$annotations", "isUnspecified-0680j_4", "isUnspecified-jo-Fl9I$annotations", "isUnspecified-jo-Fl9I", "isUnspecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "size", "getSize$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "width", "getWidth$annotations", "getWidth", "DpOffset", "x", "y", "DpOffset-YgX7TsA", "(FF)J", "DpSize", "DpSize-YgX7TsA", "lerp", TtmlNode.START, "stop", "fraction", "lerp-Md-fbLM", "(FFF)F", "lerp-xhh869w", "(JJF)J", "lerp-IDex15A", "max", "a", "b", "max-YgX7TsA", "(FF)F", "min", "min-YgX7TsA", "coerceAtLeast", "minimumValue", "coerceAtLeast-YgX7TsA", "coerceAtMost", "maximumValue", "coerceAtMost-YgX7TsA", "coerceIn", "coerceIn-2z7ARbQ", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-D5KLDUw", "(FLkotlin/jvm/functions/Function0;)F", "takeOrElse-gVKV90s", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse-itqla9I", ScriptTagPayloadReader.KEY_TIMES, "other", "times-3ABfNKs", "(DF)F", "times-6HolHcs", "(FJ)J", "(IF)F", "(IJ)J", "ui-unit_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n130#1:558\n337#1:562\n473#1:566\n544#1:570\n550#1:572\n25#2,3:559\n25#2,3:563\n71#3:567\n58#3:568\n58#3:569\n58#3:571\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n144#1:558\n351#1:562\n487#1:566\n556#1:570\n556#1:572\n254#1:559,3\n372#1:563,3\n495#1:567\n544#1:568\n550#1:569\n556#1:571\n*E\n"})
/* loaded from: classes3.dex */
public final class DpKt {
    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations */
    public static /* synthetic */ void m13693getCenterEaSLcWc$annotations(long j) {
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d) {
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f) {
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i) {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4 */
    public static final boolean m13694isFinite0680j_4(float f) {
        return !(f == Float.POSITIVE_INFINITY);
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations */
    public static /* synthetic */ void m13695isFinite0680j_4$annotations(float f) {
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations */
    public static /* synthetic */ void m13697isSpecified0680j_4$annotations(float f) {
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations */
    public static /* synthetic */ void m13699isSpecifiedEaSLcWc$annotations(long j) {
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations */
    public static /* synthetic */ void m13701isSpecifiedjoFl9I$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations */
    public static /* synthetic */ void m13703isUnspecified0680j_4$annotations(float f) {
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations */
    public static /* synthetic */ void m13705isUnspecifiedEaSLcWc$annotations(long j) {
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations */
    public static /* synthetic */ void m13707isUnspecifiedjoFl9I$annotations(long j) {
    }

    /* renamed from: isSpecified-0680j_4 */
    public static final boolean m13696isSpecified0680j_4(float f) {
        return !Float.isNaN(f);
    }

    /* renamed from: isUnspecified-0680j_4 */
    public static final boolean m13702isUnspecified0680j_4(float f) {
        return Float.isNaN(f);
    }

    public static final float getDp(int i) {
        return C2046Dp.m13666constructorimpl(i);
    }

    public static final float getDp(double d) {
        return C2046Dp.m13666constructorimpl((float) d);
    }

    public static final float getDp(float f) {
        return C2046Dp.m13666constructorimpl(f);
    }

    @Stable
    /* renamed from: times-3ABfNKs */
    public static final float m13717times3ABfNKs(float f, float f2) {
        return C2046Dp.m13666constructorimpl(f * f2);
    }

    @Stable
    /* renamed from: times-3ABfNKs */
    public static final float m13716times3ABfNKs(double d, float f) {
        return C2046Dp.m13666constructorimpl(((float) d) * f);
    }

    @Stable
    /* renamed from: times-3ABfNKs */
    public static final float m13718times3ABfNKs(int i, float f) {
        return C2046Dp.m13666constructorimpl(i * f);
    }

    @Stable
    /* renamed from: min-YgX7TsA */
    public static final float m13712minYgX7TsA(float f, float f2) {
        return C2046Dp.m13666constructorimpl(Math.min(f, f2));
    }

    @Stable
    /* renamed from: max-YgX7TsA */
    public static final float m13711maxYgX7TsA(float f, float f2) {
        return C2046Dp.m13666constructorimpl(Math.max(f, f2));
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ */
    public static final float m13691coerceIn2z7ARbQ(float f, float f2, float f3) {
        return C2046Dp.m13666constructorimpl(RangesKt___RangesKt.coerceIn(f, f2, f3));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA */
    public static final float m13689coerceAtLeastYgX7TsA(float f, float f2) {
        return C2046Dp.m13666constructorimpl(RangesKt___RangesKt.coerceAtLeast(f, f2));
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA */
    public static final float m13690coerceAtMostYgX7TsA(float f, float f2) {
        return C2046Dp.m13666constructorimpl(RangesKt___RangesKt.coerceAtMost(f, f2));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM */
    public static final float m13709lerpMdfbLM(float f, float f2, float f3) {
        return C2046Dp.m13666constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }

    /* renamed from: isSpecified-jo-Fl9I */
    public static final boolean m13700isSpecifiedjoFl9I(long j) {
        return j != DpOffset.INSTANCE.m13736getUnspecifiedRKDOV3M();
    }

    /* renamed from: isUnspecified-jo-Fl9I */
    public static final boolean m13706isUnspecifiedjoFl9I(long j) {
        return j == DpOffset.INSTANCE.m13736getUnspecifiedRKDOV3M();
    }

    @Stable
    /* renamed from: lerp-xhh869w */
    public static final long m13710lerpxhh869w(long j, long j2, float f) {
        return m13687DpOffsetYgX7TsA(m13709lerpMdfbLM(DpOffset.m13727getXD9Ej5fM(j), DpOffset.m13727getXD9Ej5fM(j2), f), m13709lerpMdfbLM(DpOffset.m13729getYD9Ej5fM(j), DpOffset.m13729getYD9Ej5fM(j2), f));
    }

    /* renamed from: isSpecified-EaSLcWc */
    public static final boolean m13698isSpecifiedEaSLcWc(long j) {
        return j != DpSize.INSTANCE.m13773getUnspecifiedMYxV2XQ();
    }

    /* renamed from: isUnspecified-EaSLcWc */
    public static final boolean m13704isUnspecifiedEaSLcWc(long j) {
        return j == DpSize.INSTANCE.m13773getUnspecifiedMYxV2XQ();
    }

    /* renamed from: getCenter-EaSLcWc */
    public static final long m13692getCenterEaSLcWc(long j) {
        return m13687DpOffsetYgX7TsA(C2046Dp.m13666constructorimpl(DpSize.m13764getWidthD9Ej5fM(j) / 2.0f), C2046Dp.m13666constructorimpl(DpSize.m13762getHeightD9Ej5fM(j) / 2.0f));
    }

    @Stable
    /* renamed from: times-6HolHcs */
    public static final long m13720times6HolHcs(int i, long j) {
        return DpSize.m13770timesGh9hcWk(j, i);
    }

    @Stable
    /* renamed from: times-6HolHcs */
    public static final long m13719times6HolHcs(float f, long j) {
        return DpSize.m13769timesGh9hcWk(j, f);
    }

    @Stable
    /* renamed from: lerp-IDex15A */
    public static final long m13708lerpIDex15A(long j, long j2, float f) {
        return m13688DpSizeYgX7TsA(m13709lerpMdfbLM(DpSize.m13764getWidthD9Ej5fM(j), DpSize.m13764getWidthD9Ej5fM(j2), f), m13709lerpMdfbLM(DpSize.m13762getHeightD9Ej5fM(j), DpSize.m13762getHeightD9Ej5fM(j2), f));
    }

    public static final float getWidth(@NotNull DpRect dpRect) {
        return C2046Dp.m13666constructorimpl(dpRect.m13750getRightD9Ej5fM() - dpRect.m13749getLeftD9Ej5fM());
    }

    public static final float getHeight(@NotNull DpRect dpRect) {
        return C2046Dp.m13666constructorimpl(dpRect.m13748getBottomD9Ej5fM() - dpRect.m13751getTopD9Ej5fM());
    }

    /* renamed from: takeOrElse-D5KLDUw */
    public static final float m13713takeOrElseD5KLDUw(float f, @NotNull Function0<C2046Dp> function0) {
        return Float.isNaN(f) ^ true ? f : function0.invoke().m13680unboximpl();
    }

    @Stable
    /* renamed from: DpOffset-YgX7TsA */
    public static final long m13687DpOffsetYgX7TsA(float f, float f2) {
        return DpOffset.m13722constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: takeOrElse-gVKV90s */
    public static final long m13714takeOrElsegVKV90s(long j, @NotNull Function0<DpOffset> function0) {
        return j != DpOffset.INSTANCE.m13736getUnspecifiedRKDOV3M() ? j : function0.invoke().getPackedValue();
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA */
    public static final long m13688DpSizeYgX7TsA(float f, float f2) {
        return DpSize.m13755constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: takeOrElse-itqla9I */
    public static final long m13715takeOrElseitqla9I(long j, @NotNull Function0<DpSize> function0) {
        return j != DpSize.INSTANCE.m13773getUnspecifiedMYxV2XQ() ? j : function0.invoke().getPackedValue();
    }

    public static final long getSize(@NotNull DpRect dpRect) {
        return m13688DpSizeYgX7TsA(C2046Dp.m13666constructorimpl(dpRect.m13750getRightD9Ej5fM() - dpRect.m13749getLeftD9Ej5fM()), C2046Dp.m13666constructorimpl(dpRect.m13748getBottomD9Ej5fM() - dpRect.m13751getTopD9Ej5fM()));
    }
}
