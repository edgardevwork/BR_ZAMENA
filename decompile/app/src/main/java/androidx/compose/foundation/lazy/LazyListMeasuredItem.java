package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyListMeasuredItem.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0083\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\bJ\u001b\u0010,\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0002\u001a\u00020\u0003J\u0016\u0010C\u001a\u00020=2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\bJ\u001e\u0010G\u001a\u00020=2\u0006\u0010+\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u0003J+\u0010J\u001a\u00020\u0014*\u00020\u00142\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030LH\u0082\bø\u0001\u0000¢\u0006\u0004\bM\u0010NR\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010!R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010!\"\u0004\b(\u0010)R\u001e\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u001fR\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u00103\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u00020\u0014X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00105R\u0018\u00106\u001a\u00020\u0003*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0018\u00109\u001a\u00020\u0003*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, m7105d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", FirebaseAnalytics.Param.INDEX, "", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "isVertical", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", "key", "", "contentType", "animator", "Landroidx/compose/foundation/lazy/LazyListItemAnimator;", "(ILjava/util/List;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/LazyListItemAnimator;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContentType", "()Ljava/lang/Object;", "crossAxisSize", "getCrossAxisSize", "()I", "getIndex", "()Z", "getKey", "mainAxisLayoutSize", "maxMainAxisOffset", "minMainAxisOffset", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", "<set-?>", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset", "placeableOffsets", "", "placeablesCount", "getPlaceablesCount", "size", "getSize", "sizeWithSpacings", "getSizeWithSpacings", "J", "mainAxis", "getMainAxis--gyyYBs", "(J)I", "mainAxisSize", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "applyScrollDelta", "", "delta", "updateAnimations", "getOffset-Bjo55l4", "(I)J", "getParentData", "place", PomReader.SCOPE, "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "isLookingAhead", "position", "layoutWidth", "layoutHeight", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyListMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,224:1\n220#1:237\n220#1:240\n33#2,6:225\n69#2,6:231\n1#3:238\n86#4:239\n86#4:241\n*S KotlinDebug\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n*L\n160#1:237\n204#1:240\n93#1:225,6\n119#1:231,6\n188#1:239\n208#1:241\n*E\n"})
/* loaded from: classes3.dex */
public final class LazyListMeasuredItem implements LazyListItemInfo {
    public static final int $stable = 8;
    private final int afterContentPadding;

    @NotNull
    private final LazyListItemAnimator animator;
    private final int beforeContentPadding;

    @Nullable
    private final Object contentType;
    private final int crossAxisSize;

    @Nullable
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;

    @NotNull
    private final Object key;

    @NotNull
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private int offset;

    @NotNull
    private final int[] placeableOffsets;

    @NotNull
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final int sizeWithSpacings;
    private final int spacing;

    @Nullable
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    @ExperimentalFoundationApi
    public /* synthetic */ LazyListMeasuredItem(int i, List list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyListItemAnimator lazyListItemAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, z, horizontal, vertical, layoutDirection, z2, i2, i3, i4, j, obj, obj2, lazyListItemAnimator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyListMeasuredItem(int i, List<? extends Placeable> list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyListItemAnimator lazyListItemAnimator) {
        this.index = i;
        this.placeables = list;
        this.isVertical = z;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z2;
        this.beforeContentPadding = i2;
        this.afterContentPadding = i3;
        this.spacing = i4;
        this.visualOffset = j;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lazyListItemAnimator;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int height = 0;
        int iMax = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = (Placeable) list.get(i5);
            height += this.isVertical ? placeable.getHeight() : placeable.getWidth();
            iMax = Math.max(iMax, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = height;
        this.sizeWithSpacings = RangesKt___RangesKt.coerceAtLeast(getSize() + this.spacing, 0);
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getIndex() {
        return this.index;
    }

    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    @NotNull
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    @Nullable
    public Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    public final void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Nullable
    public final Object getParentData(int index) {
        return this.placeables.get(index).getParentData();
    }

    public final void position(int offset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = offset;
        this.mainAxisLayoutSize = this.isVertical ? layoutHeight : layoutWidth;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable = list.get(i);
            int i2 = i * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true".toString());
                }
                iArr[i2] = horizontal.align(placeable.getWidth(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i2 + 1] = offset;
                width = placeable.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i2] = offset;
                int i3 = i2 + 1;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false".toString());
                }
                iArr2[i3] = vertical.align(placeable.getHeight(), layoutHeight);
                width = placeable.getWidth();
            }
            offset += width;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public final long m8235getOffsetBjo55l4(int index) {
        int[] iArr = this.placeableOffsets;
        int i = index * 2;
        return IntOffsetKt.IntOffset(iArr[i], iArr[i + 1]);
    }

    public final void applyScrollDelta(int delta, boolean updateAnimations) {
        if (this.nonScrollableItem) {
            return;
        }
        this.offset = getOffset() + delta;
        int length = this.placeableOffsets.length;
        for (int i = 0; i < length; i++) {
            boolean z = this.isVertical;
            if ((z && i % 2 == 1) || (!z && i % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i] = iArr[i] + delta;
            }
        }
        if (updateAnimations) {
            int placeablesCount = getPlaceablesCount();
            for (int i2 = 0; i2 < placeablesCount; i2++) {
                LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i2);
                if (animation != null) {
                    long rawOffset = animation.getRawOffset();
                    int iM13794getXimpl = this.isVertical ? IntOffset.m13794getXimpl(rawOffset) : Integer.valueOf(IntOffset.m13794getXimpl(rawOffset) + delta).intValue();
                    boolean z2 = this.isVertical;
                    int iM13795getYimpl = IntOffset.m13795getYimpl(rawOffset);
                    if (z2) {
                        iM13795getYimpl += delta;
                    }
                    animation.m8276setRawOffsetgyyYBs(IntOffsetKt.IntOffset(iM13794getXimpl, iM13795getYimpl));
                }
            }
        }
    }

    public final void place(@NotNull Placeable.PlacementScope scope, boolean isLookingAhead) {
        Function1<GraphicsLayerScope, Unit> defaultLayerBlock;
        int iM13795getYimpl;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            Placeable placeable = this.placeables.get(i);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i2 = this.maxMainAxisOffset;
            long jM8235getOffsetBjo55l4 = m8235getOffsetBjo55l4(i);
            LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                if (isLookingAhead) {
                    animation.m8275setLookaheadOffsetgyyYBs(jM8235getOffsetBjo55l4);
                } else {
                    if (!IntOffset.m13793equalsimpl0(animation.getLookaheadOffset(), LazyLayoutAnimation.INSTANCE.m8277getNotInitializednOccac())) {
                        jM8235getOffsetBjo55l4 = animation.getLookaheadOffset();
                    }
                    long jM8273getPlacementDeltanOccac = animation.m8273getPlacementDeltanOccac();
                    long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jM8235getOffsetBjo55l4) + IntOffset.m13794getXimpl(jM8273getPlacementDeltanOccac), IntOffset.m13795getYimpl(jM8235getOffsetBjo55l4) + IntOffset.m13795getYimpl(jM8273getPlacementDeltanOccac));
                    if ((m8234getMainAxisgyyYBs(jM8235getOffsetBjo55l4) <= mainAxisSize && m8234getMainAxisgyyYBs(jIntOffset) <= mainAxisSize) || (m8234getMainAxisgyyYBs(jM8235getOffsetBjo55l4) >= i2 && m8234getMainAxisgyyYBs(jIntOffset) >= i2)) {
                        animation.cancelPlacementAnimation();
                    }
                    jM8235getOffsetBjo55l4 = jIntOffset;
                }
                defaultLayerBlock = animation.getLayerBlock();
            } else {
                defaultLayerBlock = LazyLayoutAnimationKt.getDefaultLayerBlock();
            }
            Function1<GraphicsLayerScope, Unit> function1 = defaultLayerBlock;
            if (this.reverseLayout) {
                int iM13794getXimpl = this.isVertical ? IntOffset.m13794getXimpl(jM8235getOffsetBjo55l4) : (this.mainAxisLayoutSize - IntOffset.m13794getXimpl(jM8235getOffsetBjo55l4)) - getMainAxisSize(placeable);
                if (this.isVertical) {
                    iM13795getYimpl = (this.mainAxisLayoutSize - IntOffset.m13795getYimpl(jM8235getOffsetBjo55l4)) - getMainAxisSize(placeable);
                } else {
                    iM13795getYimpl = IntOffset.m13795getYimpl(jM8235getOffsetBjo55l4);
                }
                jM8235getOffsetBjo55l4 = IntOffsetKt.IntOffset(iM13794getXimpl, iM13795getYimpl);
            }
            long j = this.visualOffset;
            long jIntOffset2 = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jM8235getOffsetBjo55l4) + IntOffset.m13794getXimpl(j), IntOffset.m13795getYimpl(jM8235getOffsetBjo55l4) + IntOffset.m13795getYimpl(j));
            if (this.isVertical) {
                Placeable.PlacementScope.m12664placeWithLayeraW9wM$default(scope, placeable, jIntOffset2, 0.0f, function1, 2, null);
            } else {
                Placeable.PlacementScope.m12663placeRelativeWithLayeraW9wM$default(scope, placeable, jIntOffset2, 0.0f, function1, 2, null);
            }
        }
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m8234getMainAxisgyyYBs(long j) {
        return this.isVertical ? IntOffset.m13795getYimpl(j) : IntOffset.m13794getXimpl(j);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m8233copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
        int iM13794getXimpl = this.isVertical ? IntOffset.m13794getXimpl(j) : function1.invoke(Integer.valueOf(IntOffset.m13794getXimpl(j))).intValue();
        boolean z = this.isVertical;
        int iM13795getYimpl = IntOffset.m13795getYimpl(j);
        if (z) {
            iM13795getYimpl = function1.invoke(Integer.valueOf(iM13795getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM13794getXimpl, iM13795getYimpl);
    }
}
