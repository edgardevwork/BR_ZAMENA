package coil.compose;

import android.os.SystemClock;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.ScaleFactorKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CrossfadePainter.kt */
@Stable
@Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0010\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020!H\u0014J\u0012\u0010-\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J%\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0016H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u0016H\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0018J\u001e\u00105\u001a\u000206*\u0002072\b\u00108\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020!H\u0002J\f\u00109\u001a\u000206*\u000207H\u0014R/\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u0019\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, m7105d2 = {"Lcoil/compose/CrossfadePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", TtmlNode.START, "end", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "durationMillis", "", "fadeStart", "", "preferExactIntrinsicSize", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/layout/ContentScale;IZZ)V", "<set-?>", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter$delegate", "Landroidx/compose/runtime/MutableState;", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "invalidateTick", "getInvalidateTick", "()I", "setInvalidateTick", "(I)V", "invalidateTick$delegate", "Landroidx/compose/runtime/MutableIntState;", "isDone", "", "maxAlpha", "getMaxAlpha", "()F", "setMaxAlpha", "(F)V", "maxAlpha$delegate", "Landroidx/compose/runtime/MutableFloatState;", "startTimeMillis", "", "applyAlpha", "alpha", "applyColorFilter", "computeDrawSize", "srcSize", "dstSize", "computeDrawSize-x8L_9b0", "(JJ)J", "computeIntrinsicSize", "computeIntrinsicSize-NH-jbRc", "drawPainter", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "painter", "onDraw", "coil-compose-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCrossfadePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadePainter.kt\ncoil/compose/CrossfadePainter\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,129:1\n75#2:130\n108#2,2:131\n75#3:133\n108#3,2:134\n81#4:136\n107#4,2:137\n152#5:139\n152#5:140\n159#5:141\n159#5:147\n159#5:148\n104#6:142\n66#6,4:143\n*S KotlinDebug\n*F\n+ 1 CrossfadePainter.kt\ncoil/compose/CrossfadePainter\n*L\n37#1:130\n37#1:131,2\n41#1:133\n41#1:134,2\n42#1:136\n42#1:137,2\n88#1:139\n89#1:140\n110#1:141\n124#1:147\n125#1:148\n113#1:142\n113#1:143,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CrossfadePainter extends Painter {

    @NotNull
    public final ContentScale contentScale;
    public final int durationMillis;

    @Nullable
    public final Painter end;
    public final boolean fadeStart;
    public boolean isDone;
    public final boolean preferExactIntrinsicSize;

    @Nullable
    public Painter start;

    /* renamed from: invalidateTick$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableIntState invalidateTick = SnapshotIntStateKt.mutableIntStateOf(0);
    public long startTimeMillis = -1;

    /* renamed from: maxAlpha$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableFloatState maxAlpha = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    /* renamed from: colorFilter$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState colorFilter = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public CrossfadePainter(@Nullable Painter painter, @Nullable Painter painter2, @NotNull ContentScale contentScale, int i, boolean z, boolean z2) {
        this.start = painter;
        this.end = painter2;
        this.contentScale = contentScale;
        this.durationMillis = i;
        this.fadeStart = z;
        this.preferExactIntrinsicSize = z2;
    }

    public final int getInvalidateTick() {
        return this.invalidateTick.getIntValue();
    }

    public final void setInvalidateTick(int i) {
        this.invalidateTick.setIntValue(i);
    }

    public final float getMaxAlpha() {
        return this.maxAlpha.getFloatValue();
    }

    public final void setMaxAlpha(float f) {
        this.maxAlpha.setFloatValue(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ColorFilter getColorFilter() {
        return (ColorFilter) this.colorFilter.getValue();
    }

    private final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter.setValue(colorFilter);
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        return m14269computeIntrinsicSizeNHjbRc();
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        if (this.isDone) {
            drawPainter(drawScope, this.end, getMaxAlpha());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.startTimeMillis == -1) {
            this.startTimeMillis = jUptimeMillis;
        }
        float f = (jUptimeMillis - this.startTimeMillis) / this.durationMillis;
        float fCoerceIn = RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f) * getMaxAlpha();
        float maxAlpha = this.fadeStart ? getMaxAlpha() - fCoerceIn : getMaxAlpha();
        this.isDone = f >= 1.0f;
        drawPainter(drawScope, this.start, maxAlpha);
        drawPainter(drawScope, this.end, fCoerceIn);
        if (this.isDone) {
            this.start = null;
        } else {
            setInvalidateTick(getInvalidateTick() + 1);
        }
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        setMaxAlpha(alpha);
        return true;
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        setColorFilter(colorFilter);
        return true;
    }

    /* renamed from: computeIntrinsicSize-NH-jbRc, reason: not valid java name */
    public final long m14269computeIntrinsicSizeNHjbRc() {
        Painter painter = this.start;
        long intrinsicSize = painter != null ? painter.getIntrinsicSize() : Size.INSTANCE.m11177getZeroNHjbRc();
        Painter painter2 = this.end;
        long intrinsicSize2 = painter2 != null ? painter2.getIntrinsicSize() : Size.INSTANCE.m11177getZeroNHjbRc();
        Size.Companion companion = Size.INSTANCE;
        boolean z = intrinsicSize != companion.m11176getUnspecifiedNHjbRc();
        boolean z2 = intrinsicSize2 != companion.m11176getUnspecifiedNHjbRc();
        if (z && z2) {
            return SizeKt.Size(Math.max(Size.m11168getWidthimpl(intrinsicSize), Size.m11168getWidthimpl(intrinsicSize2)), Math.max(Size.m11165getHeightimpl(intrinsicSize), Size.m11165getHeightimpl(intrinsicSize2)));
        }
        if (this.preferExactIntrinsicSize) {
            if (z) {
                return intrinsicSize;
            }
            if (z2) {
                return intrinsicSize2;
            }
        }
        return companion.m11176getUnspecifiedNHjbRc();
    }

    public final void drawPainter(DrawScope drawScope, Painter painter, float f) {
        if (painter == null || f <= 0.0f) {
            return;
        }
        long jMo11889getSizeNHjbRc = drawScope.mo11889getSizeNHjbRc();
        long jM14268computeDrawSizex8L_9b0 = m14268computeDrawSizex8L_9b0(painter.getIntrinsicSize(), jMo11889getSizeNHjbRc);
        if (jMo11889getSizeNHjbRc == Size.INSTANCE.m11176getUnspecifiedNHjbRc() || Size.m11170isEmptyimpl(jMo11889getSizeNHjbRc)) {
            painter.m11965drawx_KDEd0(drawScope, jM14268computeDrawSizex8L_9b0, f, getColorFilter());
            return;
        }
        float f2 = 2;
        float fM11168getWidthimpl = (Size.m11168getWidthimpl(jMo11889getSizeNHjbRc) - Size.m11168getWidthimpl(jM14268computeDrawSizex8L_9b0)) / f2;
        float fM11165getHeightimpl = (Size.m11165getHeightimpl(jMo11889getSizeNHjbRc) - Size.m11165getHeightimpl(jM14268computeDrawSizex8L_9b0)) / f2;
        drawScope.getDrawContext().getTransform().inset(fM11168getWidthimpl, fM11165getHeightimpl, fM11168getWidthimpl, fM11165getHeightimpl);
        painter.m11965drawx_KDEd0(drawScope, jM14268computeDrawSizex8L_9b0, f, getColorFilter());
        float f3 = -fM11168getWidthimpl;
        float f4 = -fM11165getHeightimpl;
        drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
    }

    /* renamed from: computeDrawSize-x8L_9b0, reason: not valid java name */
    public final long m14268computeDrawSizex8L_9b0(long srcSize, long dstSize) {
        Size.Companion companion = Size.INSTANCE;
        return (srcSize == companion.m11176getUnspecifiedNHjbRc() || Size.m11170isEmptyimpl(srcSize) || dstSize == companion.m11176getUnspecifiedNHjbRc() || Size.m11170isEmptyimpl(dstSize)) ? dstSize : ScaleFactorKt.m12695timesUQTWf7w(srcSize, this.contentScale.mo12601computeScaleFactorH7hwNQA(srcSize, dstSize));
    }
}
