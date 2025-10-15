package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyStaggeredGridMeasure.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u000e\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u0003J\u0016\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FJ\u001e\u0010G\u001a\u00020?2\u0006\u0010:\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003J\b\u0010I\u001a\u00020JH\u0016J+\u0010K\u001a\u00020-*\u00020-2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030MH\u0082\bø\u0001\u0000¢\u0006\u0004\bN\u0010OR\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001c\"\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u000e\u0010\"\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\u0018R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u000e\u0010'\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001c\"\u0004\b+\u0010\u001fR&\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020-@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u00102\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b3\u0010\u0018R\u001c\u00104\u001a\u000205X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00101\u001a\u0004\b6\u00100R\u0011\u00107\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0018R\u0018\u0010:\u001a\u00020\u0003*\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0019\u0010%\u001a\u00020\u0003*\u00020\b8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, m7105d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", FirebaseAnalytics.Param.INDEX, "", "key", "", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "isVertical", "", "spacing", "lane", TtmlNode.TAG_SPAN, "beforeContentPadding", "afterContentPadding", "contentType", "animator", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;)V", "getContentType", "()Ljava/lang/Object;", "crossAxisOffset", "getCrossAxisOffset", "()I", "crossAxisSize", "getCrossAxisSize", "getIndex", "()Z", "isVisible", "setVisible", "(Z)V", "getKey", "getLane", "mainAxisLayoutSize", "mainAxisOffset", "getMainAxisOffset", "mainAxisSize", "getMainAxisSize", "maxMainAxisOffset", "minMainAxisOffset", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "<set-?>", "Landroidx/compose/ui/unit/IntOffset;", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset-nOcc-ac", "()J", "J", "placeablesCount", "getPlaceablesCount", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "sizeWithSpacings", "getSizeWithSpacings", "getSpan", "mainAxis", "getMainAxis--gyyYBs", "(J)I", "(Landroidx/compose/ui/layout/Placeable;)I", "applyScrollDelta", "", "delta", "getParentData", "place", PomReader.SCOPE, "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "context", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "position", "crossAxis", "toString", "", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1225:1\n1212#1:1247\n1214#1:1249\n1212#1:1250\n1214#1:1253\n1214#1:1254\n317#2,8:1226\n317#2,8:1234\n69#2,4:1243\n74#2:1252\n1#3:1242\n86#4:1248\n86#4:1251\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1172#1:1247\n1188#1:1249\n1189#1:1250\n1202#1:1253\n1206#1:1254\n1119#1:1226,8\n1125#1:1234,8\n1171#1:1243,4\n1171#1:1252\n1178#1:1248\n1192#1:1251\n*E\n"})
/* loaded from: classes2.dex */
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo {
    public static final int $stable = 8;
    private final int afterContentPadding;

    @NotNull
    private final LazyStaggeredGridItemPlacementAnimator animator;
    private final int beforeContentPadding;

    @Nullable
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible = true;

    @NotNull
    private final Object key;
    private final int lane;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;

    @NotNull
    private final List<Placeable> placeables;
    private final long size;
    private final int sizeWithSpacings;
    private final int span;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridMeasuredItem(int i, @NotNull Object obj, @NotNull List<? extends Placeable> list, boolean z, int i2, int i3, int i4, int i5, int i6, @Nullable Object obj2, @NotNull LazyStaggeredGridItemPlacementAnimator lazyStaggeredGridItemPlacementAnimator) {
        Integer numValueOf;
        long jIntSize;
        this.index = i;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z;
        this.lane = i3;
        this.span = i4;
        this.beforeContentPadding = i5;
        this.afterContentPadding = i6;
        this.contentType = obj2;
        this.animator = lazyStaggeredGridItemPlacementAnimator;
        int i7 = 1;
        Integer num = null;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            Placeable placeable = (Placeable) list.get(0);
            numValueOf = Integer.valueOf(z ? placeable.getHeight() : placeable.getWidth());
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex) {
                int i8 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i8);
                    Integer numValueOf2 = Integer.valueOf(this.isVertical ? placeable2.getHeight() : placeable2.getWidth());
                    numValueOf = numValueOf2.compareTo(numValueOf) > 0 ? numValueOf2 : numValueOf;
                    if (i8 == lastIndex) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        this.mainAxisSize = iIntValue;
        this.sizeWithSpacings = RangesKt___RangesKt.coerceAtLeast(iIntValue + i2, 0);
        List<Placeable> list2 = this.placeables;
        if (!list2.isEmpty()) {
            Placeable placeable3 = list2.get(0);
            Integer numValueOf3 = Integer.valueOf(this.isVertical ? placeable3.getWidth() : placeable3.getHeight());
            int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(list2);
            if (1 <= lastIndex2) {
                while (true) {
                    Placeable placeable4 = list2.get(i7);
                    Integer numValueOf4 = Integer.valueOf(this.isVertical ? placeable4.getWidth() : placeable4.getHeight());
                    numValueOf3 = numValueOf4.compareTo(numValueOf3) > 0 ? numValueOf4 : numValueOf3;
                    if (i7 == lastIndex2) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            num = numValueOf3;
        }
        int iIntValue2 = num != null ? num.intValue() : 0;
        this.crossAxisSize = iIntValue2;
        this.mainAxisLayoutSize = -1;
        if (this.isVertical) {
            jIntSize = IntSizeKt.IntSize(iIntValue2, this.mainAxisSize);
        } else {
            jIntSize = IntSizeKt.IntSize(this.mainAxisSize, iIntValue2);
        }
        this.size = jIntSize;
        this.offset = IntOffset.INSTANCE.m13804getZeronOccac();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    @NotNull
    public Object getKey() {
        return this.key;
    }

    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getLane() {
        return this.lane;
    }

    public final int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    @Nullable
    public Object getContentType() {
        return this.contentType;
    }

    /* renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Nullable
    public final Object getParentData(int index) {
        return this.placeables.get(index).getParentData();
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
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

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    public final void position(int mainAxis, int crossAxis, int mainAxisLayoutSize) {
        long jIntOffset;
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
        if (this.isVertical) {
            jIntOffset = IntOffsetKt.IntOffset(crossAxis, mainAxis);
        } else {
            jIntOffset = IntOffsetKt.IntOffset(mainAxis, crossAxis);
        }
        this.offset = jIntOffset;
    }

    public final int getMainAxisOffset() {
        return !this.isVertical ? IntOffset.m13794getXimpl(getOffset()) : IntOffset.m13795getYimpl(getOffset());
    }

    public final int getCrossAxisOffset() {
        return this.isVertical ? IntOffset.m13794getXimpl(getOffset()) : IntOffset.m13795getYimpl(getOffset());
    }

    public final void place(@NotNull Placeable.PlacementScope scope, @NotNull LazyStaggeredGridMeasureContext context) {
        int iM13794getXimpl;
        int iM13795getYimpl;
        if (this.mainAxisLayoutSize == -1) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable = list.get(i);
            int height = this.minMainAxisOffset - (this.isVertical ? placeable.getHeight() : placeable.getWidth());
            int i2 = this.maxMainAxisOffset;
            long offset = getOffset();
            LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                long jM8273getPlacementDeltanOccac = animation.m8273getPlacementDeltanOccac();
                long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(offset) + IntOffset.m13794getXimpl(jM8273getPlacementDeltanOccac), IntOffset.m13795getYimpl(offset) + IntOffset.m13795getYimpl(jM8273getPlacementDeltanOccac));
                if ((m8330getMainAxisgyyYBs(offset) <= height && m8330getMainAxisgyyYBs(jIntOffset) <= height) || (m8330getMainAxisgyyYBs(offset) >= i2 && m8330getMainAxisgyyYBs(jIntOffset) >= i2)) {
                    animation.cancelPlacementAnimation();
                }
                offset = jIntOffset;
            }
            if (context.getReverseLayout()) {
                if (this.isVertical) {
                    iM13794getXimpl = IntOffset.m13794getXimpl(offset);
                } else {
                    iM13794getXimpl = (this.mainAxisLayoutSize - IntOffset.m13794getXimpl(offset)) - (this.isVertical ? placeable.getHeight() : placeable.getWidth());
                }
                if (!this.isVertical) {
                    iM13795getYimpl = IntOffset.m13795getYimpl(offset);
                } else {
                    iM13795getYimpl = (this.mainAxisLayoutSize - IntOffset.m13795getYimpl(offset)) - (this.isVertical ? placeable.getHeight() : placeable.getWidth());
                }
                offset = IntOffsetKt.IntOffset(iM13794getXimpl, iM13795getYimpl);
            }
            long contentOffset = context.getContentOffset();
            Placeable.PlacementScope.m12663placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(offset) + IntOffset.m13794getXimpl(contentOffset), IntOffset.m13795getYimpl(offset) + IntOffset.m13795getYimpl(contentOffset)), 0.0f, null, 6, null);
        }
    }

    public final void applyScrollDelta(int delta) {
        if (this.nonScrollableItem) {
            return;
        }
        long offset = getOffset();
        int iM13794getXimpl = this.isVertical ? IntOffset.m13794getXimpl(offset) : IntOffset.m13794getXimpl(offset) + delta;
        boolean z = this.isVertical;
        int iM13795getYimpl = IntOffset.m13795getYimpl(offset);
        if (z) {
            iM13795getYimpl += delta;
        }
        this.offset = IntOffsetKt.IntOffset(iM13794getXimpl, iM13795getYimpl);
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                long rawOffset = animation.getRawOffset();
                int iM13794getXimpl2 = this.isVertical ? IntOffset.m13794getXimpl(rawOffset) : Integer.valueOf(IntOffset.m13794getXimpl(rawOffset) + delta).intValue();
                boolean z2 = this.isVertical;
                int iM13795getYimpl2 = IntOffset.m13795getYimpl(rawOffset);
                if (z2) {
                    iM13795getYimpl2 += delta;
                }
                animation.m8276setRawOffsetgyyYBs(IntOffsetKt.IntOffset(iM13794getXimpl2, iM13795getYimpl2));
            }
        }
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m8330getMainAxisgyyYBs(long j) {
        return this.isVertical ? IntOffset.m13795getYimpl(j) : IntOffset.m13794getXimpl(j);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m8329copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
        int iM13794getXimpl = this.isVertical ? IntOffset.m13794getXimpl(j) : function1.invoke(Integer.valueOf(IntOffset.m13794getXimpl(j))).intValue();
        boolean z = this.isVertical;
        int iM13795getYimpl = IntOffset.m13795getYimpl(j);
        if (z) {
            iM13795getYimpl = function1.invoke(Integer.valueOf(iM13795getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM13794getXimpl, iM13795getYimpl);
    }

    @NotNull
    public String toString() {
        return super.toString();
    }
}
