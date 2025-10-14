package androidx.compose.material3.carousel;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Keyline.kt */
@Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016JL\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aJ\u001e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006J\b\u0010\u001c\u001a\u00020\u0004H\u0002J\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J \u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m7105d2 = {"Landroidx/compose/material3/carousel/KeylineListScopeImpl;", "Landroidx/compose/material3/carousel/KeylineListScope;", "()V", "firstFocalIndex", "", "focalItemSize", "", "pivotIndex", "pivotOffset", "tmpKeylines", "", "Landroidx/compose/material3/carousel/KeylineListScopeImpl$TmpKeyline;", "add", "", "size", "isAnchor", "", "createKeylinesWithPivot", "", "Landroidx/compose/material3/carousel/Keyline;", "lastFocalIndex", "itemMainAxisSize", "carouselMainAxisSize", "createWithAlignment", "Landroidx/compose/material3/carousel/KeylineList;", "carouselAlignment", "Landroidx/compose/material3/carousel/CarouselAlignment;", "createWithPivot", "findLastFocalIndex", "isCutoffLeft", TypedValues.CycleType.S_WAVE_OFFSET, "isCutoffRight", "TmpKeyline", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nKeyline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keyline.kt\nandroidx/compose/material3/carousel/KeylineListScopeImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,471:1\n1855#2,2:472\n1855#2,2:474\n*S KotlinDebug\n*F\n+ 1 Keyline.kt\nandroidx/compose/material3/carousel/KeylineListScopeImpl\n*L\n392#1:472,2\n418#1:474,2\n*E\n"})
/* loaded from: classes2.dex */
public final class KeylineListScopeImpl implements KeylineListScope {
    public float focalItemSize;
    public float pivotOffset;
    public int firstFocalIndex = -1;
    public int pivotIndex = -1;

    @NotNull
    public final List<TmpKeyline> tmpKeylines = new ArrayList();

    /* compiled from: Keyline.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CarouselAlignment.values().length];
            try {
                iArr[CarouselAlignment.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CarouselAlignment.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CarouselAlignment.End.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean isCutoffLeft(float size, float offset) {
        float f = size / 2;
        return offset - f < 0.0f && offset + f > 0.0f;
    }

    public final boolean isCutoffRight(float size, float offset, float carouselMainAxisSize) {
        float f = size / 2;
        return offset - f < carouselMainAxisSize && offset + f > carouselMainAxisSize;
    }

    /* compiled from: Keyline.kt */
    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m7105d2 = {"Landroidx/compose/material3/carousel/KeylineListScopeImpl$TmpKeyline;", "", "size", "", "isAnchor", "", "(FZ)V", "()Z", "getSize", "()F", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final /* data */ class TmpKeyline {
        public final boolean isAnchor;
        public final float size;

        public static /* synthetic */ TmpKeyline copy$default(TmpKeyline tmpKeyline, float f, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                f = tmpKeyline.size;
            }
            if ((i & 2) != 0) {
                z = tmpKeyline.isAnchor;
            }
            return tmpKeyline.copy(f, z);
        }

        /* renamed from: component1, reason: from getter */
        public final float getSize() {
            return this.size;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAnchor() {
            return this.isAnchor;
        }

        @NotNull
        public final TmpKeyline copy(float size, boolean isAnchor) {
            return new TmpKeyline(size, isAnchor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TmpKeyline)) {
                return false;
            }
            TmpKeyline tmpKeyline = (TmpKeyline) other;
            return Float.compare(this.size, tmpKeyline.size) == 0 && this.isAnchor == tmpKeyline.isAnchor;
        }

        public int hashCode() {
            return (Float.hashCode(this.size) * 31) + Boolean.hashCode(this.isAnchor);
        }

        @NotNull
        public String toString() {
            return "TmpKeyline(size=" + this.size + ", isAnchor=" + this.isAnchor + ')';
        }

        public TmpKeyline(float f, boolean z) {
            this.size = f;
            this.isAnchor = z;
        }

        public final float getSize() {
            return this.size;
        }

        public final boolean isAnchor() {
            return this.isAnchor;
        }
    }

    @Override // androidx.compose.material3.carousel.KeylineListScope
    public void add(float size, boolean isAnchor) {
        this.tmpKeylines.add(new TmpKeyline(size, isAnchor));
        if (size > this.focalItemSize) {
            this.firstFocalIndex = CollectionsKt__CollectionsKt.getLastIndex(this.tmpKeylines);
            this.focalItemSize = size;
        }
    }

    @NotNull
    public final KeylineList createWithPivot(float carouselMainAxisSize, int pivotIndex, float pivotOffset) {
        return new KeylineList(createKeylinesWithPivot(pivotIndex, pivotOffset, this.firstFocalIndex, findLastFocalIndex(), this.focalItemSize, carouselMainAxisSize, this.tmpKeylines));
    }

    @NotNull
    public final KeylineList createWithAlignment(float carouselMainAxisSize, @NotNull CarouselAlignment carouselAlignment) {
        float f;
        float f2;
        int iFindLastFocalIndex = findLastFocalIndex();
        int i = this.firstFocalIndex;
        int i2 = iFindLastFocalIndex - i;
        this.pivotIndex = i;
        int i3 = WhenMappings.$EnumSwitchMapping$0[carouselAlignment.ordinal()];
        if (i3 == 1) {
            f = this.focalItemSize / 2;
        } else {
            if (i3 == 2) {
                float f3 = 2;
                f2 = (carouselMainAxisSize / f3) - ((this.focalItemSize / f3) * i2);
                this.pivotOffset = f2;
                return new KeylineList(createKeylinesWithPivot(this.pivotIndex, f2, this.firstFocalIndex, iFindLastFocalIndex, this.focalItemSize, carouselMainAxisSize, this.tmpKeylines));
            }
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = carouselMainAxisSize - (this.focalItemSize / 2);
        }
        f2 = f;
        this.pivotOffset = f2;
        return new KeylineList(createKeylinesWithPivot(this.pivotIndex, f2, this.firstFocalIndex, iFindLastFocalIndex, this.focalItemSize, carouselMainAxisSize, this.tmpKeylines));
    }

    public final int findLastFocalIndex() {
        int i = this.firstFocalIndex;
        while (i < CollectionsKt__CollectionsKt.getLastIndex(this.tmpKeylines)) {
            int i2 = i + 1;
            if (this.tmpKeylines.get(i2).getSize() != this.focalItemSize) {
                break;
            }
            i = i2;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Keyline> createKeylinesWithPivot(int pivotIndex, float pivotOffset, int firstFocalIndex, int lastFocalIndex, float itemMainAxisSize, float carouselMainAxisSize, List<TmpKeyline> tmpKeylines) {
        float f;
        float size;
        Iterator<Integer> it;
        Iterator<Integer> it2;
        TmpKeyline tmpKeyline = tmpKeylines.get(pivotIndex);
        ArrayList arrayList = new ArrayList();
        if (isCutoffLeft(tmpKeyline.getSize(), pivotOffset)) {
            size = pivotOffset - (tmpKeyline.getSize() / 2);
        } else if (isCutoffRight(tmpKeyline.getSize(), pivotOffset, carouselMainAxisSize)) {
            size = ((tmpKeyline.getSize() / 2) + pivotOffset) - carouselMainAxisSize;
        } else {
            f = 0.0f;
            arrayList.add(new Keyline(tmpKeyline.getSize(), pivotOffset, pivotOffset, firstFocalIndex > pivotIndex && pivotIndex <= lastFocalIndex, tmpKeyline.isAnchor(), true, f));
            float f2 = 2;
            float f3 = itemMainAxisSize / f2;
            float size2 = pivotOffset - f3;
            it = RangesKt___RangesKt.downTo(pivotIndex - 1, 0).iterator();
            float f4 = size2;
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                TmpKeyline tmpKeyline2 = tmpKeylines.get(iNextInt);
                float size3 = size2 - (tmpKeyline2.getSize() / f2);
                arrayList.add(0, new Keyline(tmpKeyline2.getSize(), size3, f4 - f3, firstFocalIndex <= iNextInt && iNextInt <= lastFocalIndex, tmpKeyline2.isAnchor(), false, isCutoffLeft(tmpKeyline2.getSize(), size3) ? size3 - (tmpKeyline2.getSize() / f2) : 0.0f));
                size2 -= tmpKeyline2.getSize();
                f4 -= itemMainAxisSize;
            }
            boolean z = false;
            float size4 = pivotOffset + f3;
            it2 = RangesKt___RangesKt.until(pivotIndex + 1, tmpKeylines.size()).iterator();
            float f5 = size4;
            while (it2.hasNext()) {
                int iNextInt2 = ((IntIterator) it2).nextInt();
                TmpKeyline tmpKeyline3 = tmpKeylines.get(iNextInt2);
                float size5 = (tmpKeyline3.getSize() / f2) + size4;
                boolean z2 = z;
                arrayList.add(new Keyline(tmpKeyline3.getSize(), size5, f5 + f3, (firstFocalIndex > iNextInt2 || iNextInt2 > lastFocalIndex) ? z2 : true, tmpKeyline3.isAnchor(), false, isCutoffRight(tmpKeyline3.getSize(), size5, carouselMainAxisSize) ? ((tmpKeyline3.getSize() / f2) + size5) - carouselMainAxisSize : 0.0f));
                size4 += tmpKeyline3.getSize();
                f5 += itemMainAxisSize;
                z = z2;
            }
            return arrayList;
        }
        f = size;
        arrayList.add(new Keyline(tmpKeyline.getSize(), pivotOffset, pivotOffset, firstFocalIndex > pivotIndex && pivotIndex <= lastFocalIndex, tmpKeyline.isAnchor(), true, f));
        float f22 = 2;
        float f32 = itemMainAxisSize / f22;
        float size22 = pivotOffset - f32;
        it = RangesKt___RangesKt.downTo(pivotIndex - 1, 0).iterator();
        float f42 = size22;
        while (it.hasNext()) {
        }
        boolean z3 = false;
        float size42 = pivotOffset + f32;
        it2 = RangesKt___RangesKt.until(pivotIndex + 1, tmpKeylines.size()).iterator();
        float f52 = size42;
        while (it2.hasNext()) {
        }
        return arrayList;
    }
}
