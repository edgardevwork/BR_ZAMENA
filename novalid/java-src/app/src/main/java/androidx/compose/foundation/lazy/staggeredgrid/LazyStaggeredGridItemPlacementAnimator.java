package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyStaggeredGridItemPlacementAnimator.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0004J\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\tH\u0002JL\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020\u001bJ\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006,"}, m7105d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "", "()V", "firstVisibleIndex", "", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyToItemInfoMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;", "movingAwayKeys", "Landroidx/collection/MutableScatterSet;", "movingAwayToEndBound", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "movingAwayToStartBound", "movingInFromEndBound", "movingInFromStartBound", "hasAnimations", "", "getHasAnimations", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;)Z", "getAnimation", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "key", "placeableIndex", "initializeAnimation", "", "item", "mainAxisOffset", "itemInfo", "onMeasured", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "isVertical", "laneCount", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "reset", "startAnimationsIfNeeded", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,329:1\n101#2,2:330\n33#2,6:332\n103#2:338\n33#2,4:364\n38#2:372\n33#2,6:375\n33#2,6:383\n33#2,6:420\n33#2,6:428\n405#3,3:339\n363#3,6:342\n373#3,3:349\n376#3,2:353\n409#3,2:355\n379#3,6:357\n411#3:363\n1810#4:348\n1672#4:352\n1810#4:400\n1672#4:404\n1#5:368\n13579#6:369\n13580#6:371\n12744#6,2:408\n13579#6:434\n13580#6:437\n13579#6:438\n13580#6:440\n86#7:370\n79#7:435\n86#7:436\n79#7:439\n1011#8,2:373\n1002#8,2:381\n1011#8,2:418\n1002#8,2:426\n267#9,4:389\n237#9,7:393\n248#9,3:401\n251#9,2:405\n272#9:407\n273#9:410\n254#9,6:411\n274#9:417\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n*L\n68#1:330,2\n68#1:332,6\n68#1:338\n91#1:364,4\n91#1:372\n138#1:375,6\n148#1:383,6\n188#1:420,6\n201#1:428,6\n89#1:339,3\n89#1:342,6\n89#1:349,3\n89#1:353,2\n89#1:355,2\n89#1:357,6\n89#1:363\n89#1:348\n89#1:352\n157#1:400\n157#1:404\n117#1:369\n117#1:371\n173#1:408,2\n243#1:434\n243#1:437\n254#1:438\n254#1:440\n121#1:370\n246#1:435\n247#1:436\n261#1:439\n137#1:373,2\n147#1:381,2\n187#1:418,2\n200#1:426,2\n157#1:389,4\n157#1:393,7\n157#1:401,3\n157#1:405,2\n157#1:407\n157#1:410\n157#1:411,6\n157#1:417\n*E\n"})
/* loaded from: classes2.dex */
public final class LazyStaggeredGridItemPlacementAnimator {
    public static final int $stable = 8;
    private int firstVisibleIndex;

    @NotNull
    private final MutableScatterMap<Object, ItemInfo> keyToItemInfoMap = ScatterMapKt.mutableScatterMapOf();

    @NotNull
    private LazyLayoutKeyIndexMap keyIndexMap = LazyLayoutKeyIndexMap.INSTANCE;

    @NotNull
    private final MutableScatterSet<Object> movingAwayKeys = ScatterSetKt.mutableScatterSetOf();

    @NotNull
    private final List<LazyStaggeredGridMeasuredItem> movingInFromStartBound = new ArrayList();

    @NotNull
    private final List<LazyStaggeredGridMeasuredItem> movingInFromEndBound = new ArrayList();

    @NotNull
    private final List<LazyStaggeredGridMeasuredItem> movingAwayToStartBound = new ArrayList();

    @NotNull
    private final List<LazyStaggeredGridMeasuredItem> movingAwayToEndBound = new ArrayList();

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyIndexMap = LazyLayoutKeyIndexMap.INSTANCE;
        this.firstVisibleIndex = -1;
    }

    public static /* synthetic */ void initializeAnimation$default(LazyStaggeredGridItemPlacementAnimator lazyStaggeredGridItemPlacementAnimator, LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem, int i, ItemInfo itemInfo, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            ItemInfo itemInfo2 = lazyStaggeredGridItemPlacementAnimator.keyToItemInfoMap.get(lazyStaggeredGridMeasuredItem.getKey());
            Intrinsics.checkNotNull(itemInfo2);
            itemInfo = itemInfo2;
        }
        lazyStaggeredGridItemPlacementAnimator.initializeAnimation(lazyStaggeredGridMeasuredItem, i, itemInfo);
    }

    private final void initializeAnimation(LazyStaggeredGridMeasuredItem item, int mainAxisOffset, ItemInfo itemInfo) {
        long jM13790copyiSbpLlY$default;
        long offset = item.getOffset();
        if (item.getIsVertical()) {
            jM13790copyiSbpLlY$default = IntOffset.m13790copyiSbpLlY$default(offset, 0, mainAxisOffset, 1, null);
        } else {
            jM13790copyiSbpLlY$default = IntOffset.m13790copyiSbpLlY$default(offset, mainAxisOffset, 0, 2, null);
        }
        for (LazyLayoutAnimation lazyLayoutAnimation : itemInfo.getAnimations()) {
            if (lazyLayoutAnimation != null) {
                long offset2 = item.getOffset();
                long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(offset2) - IntOffset.m13794getXimpl(offset), IntOffset.m13795getYimpl(offset2) - IntOffset.m13795getYimpl(offset));
                lazyLayoutAnimation.m8276setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jM13790copyiSbpLlY$default) + IntOffset.m13794getXimpl(jIntOffset), IntOffset.m13795getYimpl(jM13790copyiSbpLlY$default) + IntOffset.m13795getYimpl(jIntOffset)));
            }
        }
    }

    private final void startAnimationsIfNeeded(LazyStaggeredGridMeasuredItem item) {
        ItemInfo itemInfo = this.keyToItemInfoMap.get(item.getKey());
        Intrinsics.checkNotNull(itemInfo);
        for (LazyLayoutAnimation lazyLayoutAnimation : itemInfo.getAnimations()) {
            if (lazyLayoutAnimation != null) {
                long offset = item.getOffset();
                long rawOffset = lazyLayoutAnimation.getRawOffset();
                if (!IntOffset.m13793equalsimpl0(rawOffset, LazyLayoutAnimation.INSTANCE.m8277getNotInitializednOccac()) && !IntOffset.m13793equalsimpl0(rawOffset, offset)) {
                    lazyLayoutAnimation.m8271animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(offset) - IntOffset.m13794getXimpl(rawOffset), IntOffset.m13795getYimpl(offset) - IntOffset.m13795getYimpl(rawOffset)));
                }
                lazyLayoutAnimation.m8276setRawOffsetgyyYBs(offset);
            }
        }
    }

    @Nullable
    public final LazyLayoutAnimation getAnimation(@NotNull Object key, int placeableIndex) {
        ItemInfo itemInfo;
        LazyLayoutAnimation[] animations;
        if (this.keyToItemInfoMap.isEmpty() || (itemInfo = this.keyToItemInfoMap.get(key)) == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    private final boolean getHasAnimations(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        int placeablesCount = lazyStaggeredGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            if (LazyStaggeredGridItemPlacementAnimatorKt.getSpecs(lazyStaggeredGridMeasuredItem.getParentData(i)) != null) {
                return true;
            }
        }
        return false;
    }

    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, @NotNull List<LazyStaggeredGridMeasuredItem> positionedItems, @NotNull LazyStaggeredGridMeasureProvider itemProvider, boolean isVertical, int laneCount, @NotNull CoroutineScope coroutineScope) {
        long jIntOffset;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap;
        int i;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2;
        List<LazyStaggeredGridMeasuredItem> list;
        int i2;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        LazyLayoutAnimation[] lazyLayoutAnimationArr;
        int i3;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap3;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap4;
        long[] jArr3;
        Object[] objArr3;
        long[] jArr4;
        Object[] objArr4;
        List<LazyStaggeredGridMeasuredItem> list2 = positionedItems;
        int size = positionedItems.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                if (this.keyToItemInfoMap.isEmpty()) {
                    reset();
                    return;
                }
            } else if (getHasAnimations(list2.get(i4))) {
                break;
            } else {
                i4++;
            }
        }
        int i5 = this.firstVisibleIndex;
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) CollectionsKt___CollectionsKt.firstOrNull((List) positionedItems);
        this.firstVisibleIndex = lazyStaggeredGridMeasuredItem != null ? lazyStaggeredGridMeasuredItem.getIndex() : 0;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap5 = this.keyIndexMap;
        this.keyIndexMap = itemProvider.getKeyIndexMap();
        int i6 = isVertical ? layoutHeight : layoutWidth;
        if (isVertical) {
            jIntOffset = IntOffsetKt.IntOffset(0, consumedScroll);
        } else {
            jIntOffset = IntOffsetKt.IntOffset(consumedScroll, 0);
        }
        MutableScatterMap<Object, ItemInfo> mutableScatterMap = this.keyToItemInfoMap;
        Object[] objArr5 = mutableScatterMap.keys;
        long[] jArr5 = mutableScatterMap.metadata;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j = jArr5[i7];
                lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap5;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j & 255) < 128) {
                            jArr4 = jArr5;
                            objArr4 = objArr5;
                            this.movingAwayKeys.add(objArr5[(i7 << 3) + i9]);
                        } else {
                            jArr4 = jArr5;
                            objArr4 = objArr5;
                        }
                        j >>= 8;
                        i9++;
                        objArr5 = objArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    objArr3 = objArr5;
                    if (i8 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    objArr3 = objArr5;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                lazyLayoutKeyIndexMap5 = lazyLayoutKeyIndexMap;
                objArr5 = objArr3;
                jArr5 = jArr3;
            }
        } else {
            lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap5;
        }
        int size2 = positionedItems.size();
        int i10 = 0;
        while (true) {
            i = -1;
            if (i10 >= size2) {
                break;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = list2.get(i10);
            this.movingAwayKeys.remove(lazyStaggeredGridMeasuredItem2.getKey());
            if (getHasAnimations(lazyStaggeredGridMeasuredItem2)) {
                ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyStaggeredGridMeasuredItem2.getKey());
                if (itemInfo == null) {
                    ItemInfo itemInfo2 = new ItemInfo(lazyStaggeredGridMeasuredItem2.getLane(), lazyStaggeredGridMeasuredItem2.getSpan(), lazyStaggeredGridMeasuredItem2.getCrossAxisOffset());
                    itemInfo2.updateAnimation(lazyStaggeredGridMeasuredItem2, coroutineScope);
                    this.keyToItemInfoMap.set(lazyStaggeredGridMeasuredItem2.getKey(), itemInfo2);
                    int index = lazyLayoutKeyIndexMap.getIndex(lazyStaggeredGridMeasuredItem2.getKey());
                    if (index == -1 || lazyStaggeredGridMeasuredItem2.getIndex() == index) {
                        long offset = lazyStaggeredGridMeasuredItem2.getOffset();
                        initializeAnimation(lazyStaggeredGridMeasuredItem2, lazyStaggeredGridMeasuredItem2.getIsVertical() ? IntOffset.m13795getYimpl(offset) : IntOffset.m13794getXimpl(offset), itemInfo2);
                    } else if (index < i5) {
                        this.movingInFromStartBound.add(lazyStaggeredGridMeasuredItem2);
                    } else {
                        this.movingInFromEndBound.add(lazyStaggeredGridMeasuredItem2);
                    }
                    i3 = size2;
                    lazyLayoutKeyIndexMap3 = lazyLayoutKeyIndexMap;
                } else {
                    LazyLayoutAnimation[] animations = itemInfo.getAnimations();
                    int length2 = animations.length;
                    int i11 = 0;
                    while (i11 < length2) {
                        int i12 = size2;
                        LazyLayoutAnimation lazyLayoutAnimation = animations[i11];
                        LazyLayoutAnimation[] lazyLayoutAnimationArr2 = animations;
                        if (lazyLayoutAnimation != null) {
                            lazyLayoutKeyIndexMap4 = lazyLayoutKeyIndexMap;
                            if (!IntOffset.m13793equalsimpl0(lazyLayoutAnimation.getRawOffset(), LazyLayoutAnimation.INSTANCE.m8277getNotInitializednOccac())) {
                                long rawOffset = lazyLayoutAnimation.getRawOffset();
                                lazyLayoutAnimation.m8276setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(rawOffset) + IntOffset.m13794getXimpl(jIntOffset), IntOffset.m13795getYimpl(rawOffset) + IntOffset.m13795getYimpl(jIntOffset)));
                            }
                        } else {
                            lazyLayoutKeyIndexMap4 = lazyLayoutKeyIndexMap;
                        }
                        i11++;
                        size2 = i12;
                        animations = lazyLayoutAnimationArr2;
                        lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap4;
                    }
                    i3 = size2;
                    lazyLayoutKeyIndexMap3 = lazyLayoutKeyIndexMap;
                    itemInfo.setLane(lazyStaggeredGridMeasuredItem2.getLane());
                    itemInfo.setSpan(lazyStaggeredGridMeasuredItem2.getSpan());
                    itemInfo.setCrossAxisOffset(lazyStaggeredGridMeasuredItem2.getCrossAxisOffset());
                    startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem2);
                }
            } else {
                i3 = size2;
                lazyLayoutKeyIndexMap3 = lazyLayoutKeyIndexMap;
                this.keyToItemInfoMap.remove(lazyStaggeredGridMeasuredItem2.getKey());
            }
            i10++;
            list2 = positionedItems;
            size2 = i3;
            lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap3;
        }
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap6 = lazyLayoutKeyIndexMap;
        int[] iArr = new int[laneCount];
        for (int i13 = 0; i13 < laneCount; i13++) {
            iArr[i13] = 0;
        }
        if (!this.movingInFromStartBound.isEmpty()) {
            List<LazyStaggeredGridMeasuredItem> list3 = this.movingInFromStartBound;
            if (list3.size() > 1) {
                lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap6;
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list3, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyStaggeredGridMeasuredItem) t2).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyStaggeredGridMeasuredItem) t).getKey())));
                    }
                });
            } else {
                lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap6;
            }
            List<LazyStaggeredGridMeasuredItem> list4 = this.movingInFromStartBound;
            int size3 = list4.size();
            for (int i14 = 0; i14 < size3; i14++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = list4.get(i14);
                int lane = lazyStaggeredGridMeasuredItem3.getLane();
                iArr[lane] = iArr[lane] + lazyStaggeredGridMeasuredItem3.getMainAxisSize();
                initializeAnimation$default(this, lazyStaggeredGridMeasuredItem3, 0 - iArr[lazyStaggeredGridMeasuredItem3.getLane()], null, 4, null);
                startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem3);
            }
            ArraysKt___ArraysJvmKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        } else {
            lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap6;
        }
        if (!this.movingInFromEndBound.isEmpty()) {
            List<LazyStaggeredGridMeasuredItem> list5 = this.movingInFromEndBound;
            if (list5.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list5, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyStaggeredGridMeasuredItem) t).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyStaggeredGridMeasuredItem) t2).getKey())));
                    }
                });
            }
            List<LazyStaggeredGridMeasuredItem> list6 = this.movingInFromEndBound;
            int size4 = list6.size();
            for (int i15 = 0; i15 < size4; i15++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem4 = list6.get(i15);
                int i16 = i6 + iArr[lazyStaggeredGridMeasuredItem4.getLane()];
                int lane2 = lazyStaggeredGridMeasuredItem4.getLane();
                iArr[lane2] = iArr[lane2] + lazyStaggeredGridMeasuredItem4.getMainAxisSize();
                initializeAnimation$default(this, lazyStaggeredGridMeasuredItem4, i16, null, 4, null);
                startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem4);
            }
            ArraysKt___ArraysJvmKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        }
        MutableScatterSet<Object> mutableScatterSet = this.movingAwayKeys;
        Object[] objArr6 = mutableScatterSet.elements;
        long[] jArr6 = mutableScatterSet.metadata;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i17 = 0;
            while (true) {
                long j2 = jArr6[i17];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8 - ((~(i17 - length3)) >>> 31);
                    long j3 = j2;
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j3 & 255) < 128) {
                            Object obj = objArr6[(i17 << 3) + i19];
                            ItemInfo itemInfo3 = this.keyToItemInfoMap.get(obj);
                            Intrinsics.checkNotNull(itemInfo3);
                            ItemInfo itemInfo4 = itemInfo3;
                            int index2 = this.keyIndexMap.getIndex(obj);
                            if (index2 == i) {
                                this.keyToItemInfoMap.remove(obj);
                                jArr2 = jArr6;
                                objArr2 = objArr6;
                            } else {
                                jArr2 = jArr6;
                                objArr2 = objArr6;
                                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ = itemProvider.m8328getAndMeasurejy6DScQ(index2, SpanRange.m8333constructorimpl(itemInfo4.getLane(), itemInfo4.getSpan()));
                                lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ.setNonScrollableItem(true);
                                LazyLayoutAnimation[] animations2 = itemInfo4.getAnimations();
                                int length4 = animations2.length;
                                int i20 = 0;
                                while (true) {
                                    if (i20 < length4) {
                                        LazyLayoutAnimation lazyLayoutAnimation2 = animations2[i20];
                                        int i21 = length4;
                                        if (lazyLayoutAnimation2 != null) {
                                            lazyLayoutAnimationArr = animations2;
                                            if (lazyLayoutAnimation2.isPlacementAnimationInProgress()) {
                                                break;
                                            }
                                        } else {
                                            lazyLayoutAnimationArr = animations2;
                                        }
                                        i20++;
                                        animations2 = lazyLayoutAnimationArr;
                                        length4 = i21;
                                    } else if (index2 == lazyLayoutKeyIndexMap2.getIndex(obj)) {
                                        this.keyToItemInfoMap.remove(obj);
                                    }
                                }
                                if (index2 < this.firstVisibleIndex) {
                                    this.movingAwayToStartBound.add(lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ);
                                } else {
                                    this.movingAwayToEndBound.add(lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ);
                                }
                            }
                        } else {
                            jArr2 = jArr6;
                            objArr2 = objArr6;
                        }
                        j3 >>= 8;
                        i19++;
                        jArr6 = jArr2;
                        objArr6 = objArr2;
                        i = -1;
                    }
                    jArr = jArr6;
                    objArr = objArr6;
                    if (i18 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    objArr = objArr6;
                }
                if (i17 == length3) {
                    break;
                }
                i17++;
                jArr6 = jArr;
                objArr6 = objArr;
                i = -1;
            }
        }
        if (!this.movingAwayToStartBound.isEmpty()) {
            List<LazyStaggeredGridMeasuredItem> list7 = this.movingAwayToStartBound;
            if (list7.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list7, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyStaggeredGridMeasuredItem) t2).getKey())), Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyStaggeredGridMeasuredItem) t).getKey())));
                    }
                });
            }
            List<LazyStaggeredGridMeasuredItem> list8 = this.movingAwayToStartBound;
            int size5 = list8.size();
            for (int i22 = 0; i22 < size5; i22++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem5 = list8.get(i22);
                int lane3 = lazyStaggeredGridMeasuredItem5.getLane();
                iArr[lane3] = iArr[lane3] + lazyStaggeredGridMeasuredItem5.getMainAxisSize();
                int i23 = 0 - iArr[lazyStaggeredGridMeasuredItem5.getLane()];
                ItemInfo itemInfo5 = this.keyToItemInfoMap.get(lazyStaggeredGridMeasuredItem5.getKey());
                Intrinsics.checkNotNull(itemInfo5);
                lazyStaggeredGridMeasuredItem5.position(i23, itemInfo5.getCrossAxisOffset(), i6);
                positionedItems.add(lazyStaggeredGridMeasuredItem5);
                startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem5);
            }
            list = positionedItems;
            i2 = 0;
            ArraysKt___ArraysJvmKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        } else {
            list = positionedItems;
            i2 = 0;
        }
        if (!this.movingAwayToEndBound.isEmpty()) {
            List<LazyStaggeredGridMeasuredItem> list9 = this.movingAwayToEndBound;
            if (list9.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list9, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyStaggeredGridMeasuredItem) t).getKey())), Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyStaggeredGridMeasuredItem) t2).getKey())));
                    }
                });
            }
            List<LazyStaggeredGridMeasuredItem> list10 = this.movingAwayToEndBound;
            int size6 = list10.size();
            for (int i24 = i2; i24 < size6; i24++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem6 = list10.get(i24);
                int i25 = iArr[lazyStaggeredGridMeasuredItem6.getLane()] + i6;
                int lane4 = lazyStaggeredGridMeasuredItem6.getLane();
                iArr[lane4] = iArr[lane4] + lazyStaggeredGridMeasuredItem6.getMainAxisSize();
                ItemInfo itemInfo6 = this.keyToItemInfoMap.get(lazyStaggeredGridMeasuredItem6.getKey());
                Intrinsics.checkNotNull(itemInfo6);
                lazyStaggeredGridMeasuredItem6.position(i25, itemInfo6.getCrossAxisOffset(), i6);
                list.add(lazyStaggeredGridMeasuredItem6);
                startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem6);
            }
        }
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.clear();
    }
}
