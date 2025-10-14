package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyListHeaders.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¨\u0006\f"}, m7105d2 = {"findOrComposeLazyListHeader", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "composedVisibleItems", "", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "headerIndexes", "", "", "beforeContentPadding", "layoutWidth", "layoutHeight", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyListHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n1#2:96\n69#3,6:97\n*S KotlinDebug\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n*L\n57#1:97,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListHeadersKt {
    @Nullable
    public static final LazyListMeasuredItem findOrComposeLazyListHeader(@NotNull List<LazyListMeasuredItem> list, @NotNull LazyListMeasuredItemProvider lazyListMeasuredItemProvider, @NotNull List<Integer> list2, int i, int i2, int i3) {
        int index = ((LazyListMeasuredItem) CollectionsKt___CollectionsKt.first((List) list)).getIndex();
        int size = list2.size();
        int iIntValue = -1;
        int iIntValue2 = -1;
        int i4 = 0;
        while (i4 < size && list2.get(i4).intValue() <= index) {
            iIntValue = list2.get(i4).intValue();
            i4++;
            iIntValue2 = ((i4 < 0 || i4 > CollectionsKt__CollectionsKt.getLastIndex(list2)) ? -1 : list2.get(i4)).intValue();
        }
        int size2 = list.size();
        int offset = Integer.MIN_VALUE;
        int offset2 = Integer.MIN_VALUE;
        int i5 = -1;
        for (int i6 = 0; i6 < size2; i6++) {
            LazyListMeasuredItem lazyListMeasuredItem = list.get(i6);
            if (lazyListMeasuredItem.getIndex() == iIntValue) {
                offset = lazyListMeasuredItem.getOffset();
                i5 = i6;
            } else if (lazyListMeasuredItem.getIndex() == iIntValue2) {
                offset2 = lazyListMeasuredItem.getOffset();
            }
        }
        if (iIntValue == -1) {
            return null;
        }
        LazyListMeasuredItem andMeasure = lazyListMeasuredItemProvider.getAndMeasure(iIntValue);
        andMeasure.setNonScrollableItem(true);
        int iMax = offset != Integer.MIN_VALUE ? Math.max(-i, offset) : -i;
        if (offset2 != Integer.MIN_VALUE) {
            iMax = Math.min(iMax, offset2 - andMeasure.getSize());
        }
        andMeasure.position(iMax, i2, i3);
        if (i5 != -1) {
            list.set(i5, andMeasure);
        } else {
            list.add(0, andMeasure);
        }
        return andMeasure;
    }
}
