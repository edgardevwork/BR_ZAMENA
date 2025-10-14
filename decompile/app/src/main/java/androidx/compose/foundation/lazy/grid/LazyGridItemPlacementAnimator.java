package androidx.compose.foundation.lazy.grid;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGridItemPlacementAnimator.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0004J\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\tH\u0002JL\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020\u001bJ\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006-"}, m7105d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "", "()V", "firstVisibleIndex", "", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyToItemInfoMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/lazy/grid/ItemInfo;", "movingAwayKeys", "Landroidx/collection/MutableScatterSet;", "movingAwayToEndBound", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "movingAwayToStartBound", "movingInFromEndBound", "movingInFromStartBound", "hasAnimations", "", "getHasAnimations", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;)Z", "getAnimation", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "key", "placeableIndex", "initializeAnimation", "", "item", "mainAxisOffset", "itemInfo", "onMeasured", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "isVertical", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "reset", "startAnimationsIfNeeded", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,368:1\n101#2,2:369\n33#2,6:371\n103#2:377\n33#2,4:403\n38#2:411\n33#2,6:414\n33#2,6:422\n33#2,6:459\n33#2,6:467\n405#3,3:378\n363#3,6:381\n373#3,3:388\n376#3,2:392\n409#3,2:394\n379#3,6:396\n411#3:402\n1810#4:387\n1672#4:391\n1810#4:439\n1672#4:443\n1#5:407\n13579#6:408\n13580#6:410\n12744#6,2:447\n13579#6:473\n13580#6:476\n13579#6:477\n13580#6:479\n86#7:409\n79#7:474\n86#7:475\n79#7:478\n1011#8,2:412\n1002#8,2:420\n1011#8,2:457\n1002#8,2:465\n267#9,4:428\n237#9,7:432\n248#9,3:440\n251#9,2:444\n272#9:446\n273#9:449\n254#9,6:450\n274#9:456\n*S KotlinDebug\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n68#1:369,2\n68#1:371,6\n68#1:377\n91#1:403,4\n91#1:411\n138#1:414,6\n155#1:422,6\n206#1:459,6\n232#1:467,6\n89#1:378,3\n89#1:381,6\n89#1:388,3\n89#1:392,2\n89#1:394,2\n89#1:396,6\n89#1:402\n89#1:387\n89#1:391\n169#1:439\n169#1:443\n117#1:408\n117#1:410\n189#1:447,2\n286#1:473\n286#1:476\n297#1:477\n297#1:479\n121#1:409\n289#1:474\n290#1:475\n304#1:478\n137#1:412,2\n154#1:420,2\n205#1:457,2\n231#1:465,2\n169#1:428,4\n169#1:432,7\n169#1:440,3\n169#1:444,2\n169#1:446\n169#1:449\n169#1:450,6\n169#1:456\n*E\n"})
/* loaded from: classes3.dex */
public final class LazyGridItemPlacementAnimator {
    public static final int $stable = 8;
    private int firstVisibleIndex;

    @NotNull
    private final MutableScatterMap<Object, ItemInfo> keyToItemInfoMap = ScatterMapKt.mutableScatterMapOf();

    @NotNull
    private LazyLayoutKeyIndexMap keyIndexMap = LazyLayoutKeyIndexMap.INSTANCE;

    @NotNull
    private final MutableScatterSet<Object> movingAwayKeys = ScatterSetKt.mutableScatterSetOf();

    @NotNull
    private final List<LazyGridMeasuredItem> movingInFromStartBound = new ArrayList();

    @NotNull
    private final List<LazyGridMeasuredItem> movingInFromEndBound = new ArrayList();

    @NotNull
    private final List<LazyGridMeasuredItem> movingAwayToStartBound = new ArrayList();

    @NotNull
    private final List<LazyGridMeasuredItem> movingAwayToEndBound = new ArrayList();

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyIndexMap = LazyLayoutKeyIndexMap.INSTANCE;
        this.firstVisibleIndex = -1;
    }

    public static /* synthetic */ void initializeAnimation$default(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, LazyGridMeasuredItem lazyGridMeasuredItem, int i, ItemInfo itemInfo, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            ItemInfo itemInfo2 = lazyGridItemPlacementAnimator.keyToItemInfoMap.get(lazyGridMeasuredItem.getKey());
            Intrinsics.checkNotNull(itemInfo2);
            itemInfo = itemInfo2;
        }
        lazyGridItemPlacementAnimator.initializeAnimation(lazyGridMeasuredItem, i, itemInfo);
    }

    private final void initializeAnimation(LazyGridMeasuredItem item, int mainAxisOffset, ItemInfo itemInfo) {
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

    private final void startAnimationsIfNeeded(LazyGridMeasuredItem item) {
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

    private final boolean getHasAnimations(LazyGridMeasuredItem lazyGridMeasuredItem) {
        int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            if (LazyGridItemPlacementAnimatorKt.getSpecs(lazyGridMeasuredItem.getParentData(i)) != null) {
                return true;
            }
        }
        return false;
    }

    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, @NotNull List<LazyGridMeasuredItem> positionedItems, @NotNull LazyGridMeasuredItemProvider itemProvider, @NotNull LazyGridSpanLayoutProvider spanLayoutProvider, boolean isVertical, @NotNull CoroutineScope coroutineScope) {
        long jIntOffset;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap;
        int i;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        long jM13631fixedHeightOenEA2s;
        int mainAxisSize;
        int i2;
        int i3;
        int mainAxisSize2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long[] jArr3;
        Object[] objArr3;
        long[] jArr4;
        Object[] objArr4;
        List<LazyGridMeasuredItem> list = positionedItems;
        int size = positionedItems.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                if (this.keyToItemInfoMap.isEmpty()) {
                    reset();
                    return;
                }
            } else if (getHasAnimations(list.get(i9))) {
                break;
            } else {
                i9++;
            }
        }
        int i10 = this.firstVisibleIndex;
        LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) CollectionsKt___CollectionsKt.firstOrNull((List) positionedItems);
        this.firstVisibleIndex = lazyGridMeasuredItem != null ? lazyGridMeasuredItem.getIndex() : 0;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2 = this.keyIndexMap;
        this.keyIndexMap = itemProvider.getKeyIndexMap();
        int i11 = isVertical ? layoutHeight : layoutWidth;
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
            int i12 = 0;
            while (true) {
                long j = jArr5[i12];
                lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j & 255) < 128) {
                            jArr4 = jArr5;
                            objArr4 = objArr5;
                            this.movingAwayKeys.add(objArr5[(i12 << 3) + i14]);
                        } else {
                            jArr4 = jArr5;
                            objArr4 = objArr5;
                        }
                        j >>= 8;
                        i14++;
                        objArr5 = objArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    objArr3 = objArr5;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    objArr3 = objArr5;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap;
                objArr5 = objArr3;
                jArr5 = jArr3;
            }
        } else {
            lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap2;
        }
        int size2 = positionedItems.size();
        int i15 = 0;
        while (true) {
            i = -1;
            if (i15 >= size2) {
                break;
            }
            LazyGridMeasuredItem lazyGridMeasuredItem2 = list.get(i15);
            this.movingAwayKeys.remove(lazyGridMeasuredItem2.getKey());
            if (getHasAnimations(lazyGridMeasuredItem2)) {
                ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyGridMeasuredItem2.getKey());
                if (itemInfo == null) {
                    ItemInfo itemInfo2 = new ItemInfo(lazyGridMeasuredItem2.getCrossAxisSize(), lazyGridMeasuredItem2.getCrossAxisOffset());
                    itemInfo2.updateAnimation(lazyGridMeasuredItem2, coroutineScope);
                    this.keyToItemInfoMap.set(lazyGridMeasuredItem2.getKey(), itemInfo2);
                    int index = lazyLayoutKeyIndexMap.getIndex(lazyGridMeasuredItem2.getKey());
                    if (index == -1 || lazyGridMeasuredItem2.getIndex() == index) {
                        long offset = lazyGridMeasuredItem2.getOffset();
                        initializeAnimation(lazyGridMeasuredItem2, lazyGridMeasuredItem2.getIsVertical() ? IntOffset.m13795getYimpl(offset) : IntOffset.m13794getXimpl(offset), itemInfo2);
                    } else if (index < i10) {
                        this.movingInFromStartBound.add(lazyGridMeasuredItem2);
                    } else {
                        this.movingInFromEndBound.add(lazyGridMeasuredItem2);
                    }
                    i6 = size2;
                    i7 = i11;
                } else {
                    LazyLayoutAnimation[] animations = itemInfo.getAnimations();
                    int length2 = animations.length;
                    int i16 = 0;
                    while (i16 < length2) {
                        int i17 = size2;
                        LazyLayoutAnimation lazyLayoutAnimation = animations[i16];
                        if (lazyLayoutAnimation != null) {
                            i8 = i11;
                            if (!IntOffset.m13793equalsimpl0(lazyLayoutAnimation.getRawOffset(), LazyLayoutAnimation.INSTANCE.m8277getNotInitializednOccac())) {
                                long rawOffset = lazyLayoutAnimation.getRawOffset();
                                lazyLayoutAnimation.m8276setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(rawOffset) + IntOffset.m13794getXimpl(jIntOffset), IntOffset.m13795getYimpl(rawOffset) + IntOffset.m13795getYimpl(jIntOffset)));
                            }
                        } else {
                            i8 = i11;
                        }
                        i16++;
                        size2 = i17;
                        i11 = i8;
                    }
                    i6 = size2;
                    i7 = i11;
                    itemInfo.setCrossAxisSize(lazyGridMeasuredItem2.getCrossAxisSize());
                    itemInfo.setCrossAxisOffset(lazyGridMeasuredItem2.getCrossAxisOffset());
                    startAnimationsIfNeeded(lazyGridMeasuredItem2);
                }
            } else {
                i6 = size2;
                i7 = i11;
                this.keyToItemInfoMap.remove(lazyGridMeasuredItem2.getKey());
            }
            i15++;
            list = positionedItems;
            size2 = i6;
            i11 = i7;
        }
        int i18 = i11;
        List<LazyGridMeasuredItem> list2 = this.movingInFromStartBound;
        boolean z = true;
        if (list2.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list2, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyGridMeasuredItem) t2).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyGridMeasuredItem) t).getKey())));
                }
            });
        }
        List<LazyGridMeasuredItem> list3 = this.movingInFromStartBound;
        int size3 = list3.size();
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i22 < size3) {
            LazyGridMeasuredItem lazyGridMeasuredItem3 = list3.get(i22);
            int row = isVertical ? lazyGridMeasuredItem3.getRow() : lazyGridMeasuredItem3.getColumn();
            if (row != -1 && row == i19) {
                i5 = i19;
                mainAxisSize2 = Math.max(i20, lazyGridMeasuredItem3.getMainAxisSize());
                i4 = i21;
            } else {
                mainAxisSize2 = lazyGridMeasuredItem3.getMainAxisSize();
                i4 = i21 + i20;
                i5 = row;
            }
            initializeAnimation$default(this, lazyGridMeasuredItem3, (0 - i4) - lazyGridMeasuredItem3.getMainAxisSize(), null, 4, null);
            startAnimationsIfNeeded(lazyGridMeasuredItem3);
            i22++;
            i19 = i5;
            i20 = mainAxisSize2;
            i21 = i4;
        }
        List<LazyGridMeasuredItem> list4 = this.movingInFromEndBound;
        if (list4.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list4, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyGridMeasuredItem) t).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyGridMeasuredItem) t2).getKey())));
                }
            });
        }
        List<LazyGridMeasuredItem> list5 = this.movingInFromEndBound;
        int size4 = list5.size();
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i26 < size4) {
            LazyGridMeasuredItem lazyGridMeasuredItem4 = list5.get(i26);
            int row2 = isVertical ? lazyGridMeasuredItem4.getRow() : lazyGridMeasuredItem4.getColumn();
            if (row2 != -1 && row2 == i23) {
                i3 = i23;
                mainAxisSize = Math.max(i24, lazyGridMeasuredItem4.getMainAxisSize());
                i2 = i25;
            } else {
                mainAxisSize = lazyGridMeasuredItem4.getMainAxisSize();
                i2 = i25 + i24;
                i3 = row2;
            }
            initializeAnimation$default(this, lazyGridMeasuredItem4, i18 + i2, null, 4, null);
            startAnimationsIfNeeded(lazyGridMeasuredItem4);
            i26++;
            i23 = i3;
            i24 = mainAxisSize;
            i25 = i2;
        }
        MutableScatterSet<Object> mutableScatterSet = this.movingAwayKeys;
        Object[] objArr6 = mutableScatterSet.elements;
        long[] jArr6 = mutableScatterSet.metadata;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i27 = 0;
            while (true) {
                long j2 = jArr6[i27];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i28 = 8 - ((~(i27 - length3)) >>> 31);
                    int i29 = 0;
                    while (i29 < i28) {
                        if ((j2 & 255) < 128) {
                            Object obj = objArr6[(i27 << 3) + i29];
                            ItemInfo itemInfo3 = this.keyToItemInfoMap.get(obj);
                            Intrinsics.checkNotNull(itemInfo3);
                            ItemInfo itemInfo4 = itemInfo3;
                            int index2 = this.keyIndexMap.getIndex(obj);
                            if (index2 == i) {
                                this.keyToItemInfoMap.remove(obj);
                                jArr2 = jArr6;
                                objArr2 = objArr6;
                            } else {
                                if (isVertical) {
                                    jM13631fixedHeightOenEA2s = Constraints.INSTANCE.m13632fixedWidthOenEA2s(itemInfo4.getCrossAxisSize());
                                } else {
                                    jM13631fixedHeightOenEA2s = Constraints.INSTANCE.m13631fixedHeightOenEA2s(itemInfo4.getCrossAxisSize());
                                }
                                LazyGridMeasuredItem lazyGridMeasuredItemM8264getAndMeasure3p2s80s$default = LazyGridMeasuredItemProvider.m8264getAndMeasure3p2s80s$default(itemProvider, index2, 0, jM13631fixedHeightOenEA2s, 2, null);
                                lazyGridMeasuredItemM8264getAndMeasure3p2s80s$default.setNonScrollableItem(z);
                                LazyLayoutAnimation[] animations2 = itemInfo4.getAnimations();
                                int length4 = animations2.length;
                                int i30 = 0;
                                while (true) {
                                    if (i30 < length4) {
                                        LazyLayoutAnimation lazyLayoutAnimation2 = animations2[i30];
                                        jArr2 = jArr6;
                                        if (lazyLayoutAnimation2 != null) {
                                            boolean zIsPlacementAnimationInProgress = lazyLayoutAnimation2.isPlacementAnimationInProgress();
                                            objArr2 = objArr6;
                                            if (zIsPlacementAnimationInProgress) {
                                                break;
                                            }
                                        } else {
                                            objArr2 = objArr6;
                                        }
                                        i30++;
                                        objArr6 = objArr2;
                                        jArr6 = jArr2;
                                    } else {
                                        jArr2 = jArr6;
                                        objArr2 = objArr6;
                                        if (index2 == lazyLayoutKeyIndexMap.getIndex(obj)) {
                                            this.keyToItemInfoMap.remove(obj);
                                        }
                                    }
                                }
                                if (index2 < this.firstVisibleIndex) {
                                    this.movingAwayToStartBound.add(lazyGridMeasuredItemM8264getAndMeasure3p2s80s$default);
                                } else {
                                    this.movingAwayToEndBound.add(lazyGridMeasuredItemM8264getAndMeasure3p2s80s$default);
                                }
                            }
                        } else {
                            jArr2 = jArr6;
                            objArr2 = objArr6;
                        }
                        j2 >>= 8;
                        i29++;
                        objArr6 = objArr2;
                        jArr6 = jArr2;
                        z = true;
                        i = -1;
                    }
                    jArr = jArr6;
                    objArr = objArr6;
                    if (i28 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    objArr = objArr6;
                }
                if (i27 == length3) {
                    break;
                }
                i27++;
                objArr6 = objArr;
                jArr6 = jArr;
                z = true;
                i = -1;
            }
        }
        List<LazyGridMeasuredItem> list6 = this.movingAwayToStartBound;
        if (list6.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list6, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyGridMeasuredItem) t2).getKey())), Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyGridMeasuredItem) t).getKey())));
                }
            });
        }
        List<LazyGridMeasuredItem> list7 = this.movingAwayToStartBound;
        int size5 = list7.size();
        int i31 = -1;
        int mainAxisSize3 = 0;
        int i32 = 0;
        for (int i33 = 0; i33 < size5; i33++) {
            LazyGridMeasuredItem lazyGridMeasuredItem5 = list7.get(i33);
            int lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(lazyGridMeasuredItem5.getIndex());
            if (lineIndexOfItem != -1 && lineIndexOfItem == i31) {
                mainAxisSize3 = Math.max(mainAxisSize3, lazyGridMeasuredItem5.getMainAxisSize());
            } else {
                i32 += mainAxisSize3;
                mainAxisSize3 = lazyGridMeasuredItem5.getMainAxisSize();
                i31 = lineIndexOfItem;
            }
            int mainAxisSize4 = (0 - i32) - lazyGridMeasuredItem5.getMainAxisSize();
            ItemInfo itemInfo5 = this.keyToItemInfoMap.get(lazyGridMeasuredItem5.getKey());
            Intrinsics.checkNotNull(itemInfo5);
            lazyGridMeasuredItem5.position(mainAxisSize4, itemInfo5.getCrossAxisOffset(), layoutWidth, layoutHeight, (48 & 16) != 0 ? -1 : 0, (48 & 32) != 0 ? -1 : 0);
            positionedItems.add(lazyGridMeasuredItem5);
            startAnimationsIfNeeded(lazyGridMeasuredItem5);
        }
        List<LazyGridMeasuredItem> list8 = this.movingAwayToEndBound;
        if (list8.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list8, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyGridMeasuredItem) t).getKey())), Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyGridMeasuredItem) t2).getKey())));
                }
            });
        }
        List<LazyGridMeasuredItem> list9 = this.movingAwayToEndBound;
        int size6 = list9.size();
        int i34 = -1;
        int mainAxisSize5 = 0;
        int i35 = 0;
        for (int i36 = 0; i36 < size6; i36++) {
            LazyGridMeasuredItem lazyGridMeasuredItem6 = list9.get(i36);
            int lineIndexOfItem2 = spanLayoutProvider.getLineIndexOfItem(lazyGridMeasuredItem6.getIndex());
            if (lineIndexOfItem2 != -1 && lineIndexOfItem2 == i34) {
                mainAxisSize5 = Math.max(mainAxisSize5, lazyGridMeasuredItem6.getMainAxisSize());
            } else {
                i35 += mainAxisSize5;
                mainAxisSize5 = lazyGridMeasuredItem6.getMainAxisSize();
                i34 = lineIndexOfItem2;
            }
            ItemInfo itemInfo6 = this.keyToItemInfoMap.get(lazyGridMeasuredItem6.getKey());
            Intrinsics.checkNotNull(itemInfo6);
            lazyGridMeasuredItem6.position(i18 + i35, itemInfo6.getCrossAxisOffset(), layoutWidth, layoutHeight, (48 & 16) != 0 ? -1 : 0, (48 & 32) != 0 ? -1 : 0);
            positionedItems.add(lazyGridMeasuredItem6);
            startAnimationsIfNeeded(lazyGridMeasuredItem6);
        }
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.clear();
    }
}
