package androidx.compose.p003ui.unit;

import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntSize.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\u0002*\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0006\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m7105d2 = {TtmlNode.CENTER, "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "getCenter-ozmzZPI$annotations", "(J)V", "getCenter-ozmzZPI", "(J)J", "IntSize", "width", "", "height", "(II)J", ScriptTagPayloadReader.KEY_TIMES, "size", "times-O0kMr_c", "(IJ)J", "toIntRect", "Landroidx/compose/ui/unit/IntRect;", "toIntRect-ozmzZPI", "(J)Landroidx/compose/ui/unit/IntRect;", "toSize", "Landroidx/compose/ui/geometry/Size;", "toSize-ozmzZPI", "ui-unit_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,112:1\n48#2:113\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n32#1:113\n*E\n"})
/* loaded from: classes3.dex */
public final class IntSizeKt {
    @Stable
    /* renamed from: getCenter-ozmzZPI$annotations */
    public static /* synthetic */ void m13843getCenterozmzZPI$annotations(long j) {
    }

    @Stable
    public static final long IntSize(int i, int i2) {
        return IntSize.m13831constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    @Stable
    /* renamed from: times-O0kMr_c */
    public static final long m13844timesO0kMr_c(int i, long j) {
        return IntSize.m13838timesYEO4UFw(j, i);
    }

    @Stable
    @NotNull
    /* renamed from: toIntRect-ozmzZPI */
    public static final IntRect m13845toIntRectozmzZPI(long j) {
        return IntRectKt.m13826IntRectVbeCjmY(IntOffset.INSTANCE.m13804getZeronOccac(), j);
    }

    /* renamed from: getCenter-ozmzZPI */
    public static final long m13842getCenterozmzZPI(long j) {
        return IntOffsetKt.IntOffset(IntSize.m13836getWidthimpl(j) / 2, IntSize.m13835getHeightimpl(j) / 2);
    }

    @Stable
    /* renamed from: toSize-ozmzZPI */
    public static final long m13846toSizeozmzZPI(long j) {
        return SizeKt.Size(IntSize.m13836getWidthimpl(j), IntSize.m13835getHeightimpl(j));
    }
}
