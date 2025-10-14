package androidx.compose.p003ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidRenderEffect.android.kt */
@Immutable
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0015J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, m7105d2 = {"Landroidx/compose/ui/graphics/OffsetEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/graphics/RenderEffect;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "createRenderEffect", "Landroid/graphics/RenderEffect;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class OffsetEffect extends RenderEffect {
    private final long offset;

    @Nullable
    private final RenderEffect renderEffect;

    public /* synthetic */ OffsetEffect(RenderEffect renderEffect, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect, j);
    }

    private OffsetEffect(RenderEffect renderEffect, long j) {
        super(null);
        this.renderEffect = renderEffect;
        this.offset = j;
    }

    @Override // androidx.compose.p003ui.graphics.RenderEffect
    @RequiresApi(31)
    @NotNull
    /* renamed from: createRenderEffect */
    public RenderEffect getAndroidRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m11650createOffsetEffectUv8p0NA(this.renderEffect, this.offset);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) other;
        return Intrinsics.areEqual(this.renderEffect, offsetEffect.renderEffect) && Offset.m11096equalsimpl0(this.offset, offsetEffect.offset);
    }

    public int hashCode() {
        RenderEffect renderEffect = this.renderEffect;
        return ((renderEffect != null ? renderEffect.hashCode() : 0) * 31) + Offset.m11101hashCodeimpl(this.offset);
    }

    @NotNull
    public String toString() {
        return "OffsetEffect(renderEffect=" + this.renderEffect + ", offset=" + ((Object) Offset.m11107toStringimpl(this.offset)) + ')';
    }
}
