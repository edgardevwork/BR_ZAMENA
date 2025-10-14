package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyStaggeredGridItemPlacementAnimator.kt */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR0\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u001c"}, m7105d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;", "", "lane", "", TtmlNode.TAG_SPAN, "crossAxisOffset", "(III)V", "<set-?>", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "animations", "getAnimations", "()[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "getCrossAxisOffset", "()I", "setCrossAxisOffset", "(I)V", "getLane", "setLane", "getSpan", "setSpan", "updateAnimation", "", "positionedItem", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ItemInfo {

    @NotNull
    public LazyLayoutAnimation[] animations = LazyStaggeredGridItemPlacementAnimatorKt.EmptyArray;
    public int crossAxisOffset;
    public int lane;
    public int span;

    public ItemInfo(int i, int i2, int i3) {
        this.lane = i;
        this.span = i2;
        this.crossAxisOffset = i3;
    }

    public final int getLane() {
        return this.lane;
    }

    public final void setLane(int i) {
        this.lane = i;
    }

    public final int getSpan() {
        return this.span;
    }

    public final void setSpan(int i) {
        this.span = i;
    }

    public final int getCrossAxisOffset() {
        return this.crossAxisOffset;
    }

    public final void setCrossAxisOffset(int i) {
        this.crossAxisOffset = i;
    }

    @NotNull
    public final LazyLayoutAnimation[] getAnimations() {
        return this.animations;
    }

    public final void updateAnimation(@NotNull LazyStaggeredGridMeasuredItem positionedItem, @NotNull CoroutineScope coroutineScope) {
        int length = this.animations.length;
        for (int placeablesCount = positionedItem.getPlaceablesCount(); placeablesCount < length; placeablesCount++) {
            LazyLayoutAnimation lazyLayoutAnimation = this.animations[placeablesCount];
            if (lazyLayoutAnimation != null) {
                lazyLayoutAnimation.stopAnimations();
            }
        }
        if (this.animations.length != positionedItem.getPlaceablesCount()) {
            Object[] objArrCopyOf = Arrays.copyOf(this.animations, positionedItem.getPlaceablesCount());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.animations = (LazyLayoutAnimation[]) objArrCopyOf;
        }
        int placeablesCount2 = positionedItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount2; i++) {
            LazyLayoutAnimationSpecsNode specs = LazyStaggeredGridItemPlacementAnimatorKt.getSpecs(positionedItem.getParentData(i));
            if (specs == null) {
                LazyLayoutAnimation lazyLayoutAnimation2 = this.animations[i];
                if (lazyLayoutAnimation2 != null) {
                    lazyLayoutAnimation2.stopAnimations();
                }
                this.animations[i] = null;
            } else {
                LazyLayoutAnimation lazyLayoutAnimation3 = this.animations[i];
                if (lazyLayoutAnimation3 == null) {
                    lazyLayoutAnimation3 = new LazyLayoutAnimation(coroutineScope);
                    this.animations[i] = lazyLayoutAnimation3;
                }
                lazyLayoutAnimation3.setAppearanceSpec(specs.getAppearanceSpec());
                lazyLayoutAnimation3.setPlacementSpec(specs.getPlacementSpec());
            }
        }
    }
}
