package androidx.compose.material3;

import androidx.compose.material3.MenuPosition;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpOffset;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.p003ui.unit.IntRectKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.window.PopupPositionProvider;
import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MenuPosition.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00128\b\u0002\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0002\u0010\u0010J2\u0010%\u001a\u00020&2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0016J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J9\u00102\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\tHÆ\u0003Jk\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u000728\b\u0002\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\tHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0007HÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000RA\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, m7105d2 = {"Landroidx/compose/material3/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "contentOffset", "Landroidx/compose/ui/unit/DpOffset;", "density", "Landroidx/compose/ui/unit/Density;", "verticalMargin", "", "onPositionCalculated", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", "name", "anchorBounds", "menuBounds", "", "(JLandroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "bottomToAnchorTop", "Landroidx/compose/material3/MenuPosition$Vertical;", "bottomToWindowBottom", "centerToAnchorTop", "getContentOffset-RKDOV3M", "()J", "J", "getDensity", "()Landroidx/compose/ui/unit/Density;", "endToAnchorEnd", "Landroidx/compose/material3/MenuPosition$Horizontal;", "leftToWindowLeft", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "rightToWindowRight", "startToAnchorStart", "topToAnchorBottom", "topToWindowTop", "getVerticalMargin", "()I", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "component1", "component1-RKDOV3M", "component2", "component3", "component4", "copy", "copy-uVxBXkw", "(JLandroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function2;)Landroidx/compose/material3/DropdownMenuPositionProvider;", "equals", "", "other", "", "hashCode", "toString", "", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMenuPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,412:1\n1#2:413\n151#3,3:414\n33#3,4:417\n154#3,2:421\n38#3:423\n156#3:424\n116#3,2:425\n33#3,6:427\n118#3:433\n151#3,3:434\n33#3,4:437\n154#3,2:441\n38#3:443\n156#3:444\n116#3,2:445\n33#3,6:447\n118#3:453\n*S KotlinDebug\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/DropdownMenuPositionProvider\n*L\n371#1:414,3\n371#1:417,4\n371#1:421,2\n371#1:423\n371#1:424\n379#1:425,2\n379#1:427,6\n379#1:433\n392#1:434,3\n392#1:437,4\n392#1:441,2\n392#1:443\n392#1:444\n399#1:445,2\n399#1:447,6\n399#1:453\n*E\n"})
/* loaded from: classes4.dex */
public final /* data */ class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;

    @NotNull
    private final MenuPosition.Vertical bottomToAnchorTop;

    @NotNull
    private final MenuPosition.Vertical bottomToWindowBottom;

    @NotNull
    private final MenuPosition.Vertical centerToAnchorTop;
    private final long contentOffset;

    @NotNull
    private final Density density;

    @NotNull
    private final MenuPosition.Horizontal endToAnchorEnd;

    @NotNull
    private final MenuPosition.Horizontal leftToWindowLeft;

    @NotNull
    private final Function2<IntRect, IntRect, Unit> onPositionCalculated;

    @NotNull
    private final MenuPosition.Horizontal rightToWindowRight;

    @NotNull
    private final MenuPosition.Horizontal startToAnchorStart;

    @NotNull
    private final MenuPosition.Vertical topToAnchorBottom;

    @NotNull
    private final MenuPosition.Vertical topToWindowTop;
    private final int verticalMargin;

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, int i, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, i, function2);
    }

    /* renamed from: copy-uVxBXkw$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m9434copyuVxBXkw$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j, Density density, int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = dropdownMenuPositionProvider.contentOffset;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        Density density2 = density;
        if ((i2 & 4) != 0) {
            i = dropdownMenuPositionProvider.verticalMargin;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            function2 = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m9436copyuVxBXkw(j2, density2, i3, function2);
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name and from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    @NotNull
    public final Function2<IntRect, IntRect, Unit> component4() {
        return this.onPositionCalculated;
    }

    @NotNull
    /* renamed from: copy-uVxBXkw, reason: not valid java name */
    public final DropdownMenuPositionProvider m9436copyuVxBXkw(long contentOffset, @NotNull Density density, int verticalMargin, @NotNull Function2<? super IntRect, ? super IntRect, Unit> onPositionCalculated) {
        return new DropdownMenuPositionProvider(contentOffset, density, verticalMargin, onPositionCalculated, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return DpOffset.m13726equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    public int hashCode() {
        return (((((DpOffset.m13731hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + Integer.hashCode(this.verticalMargin)) * 31) + this.onPositionCalculated.hashCode();
    }

    @NotNull
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m13734toStringimpl(this.contentOffset)) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j, Density density, int i, Function2<? super IntRect, ? super IntRect, Unit> function2) {
        this.contentOffset = j;
        this.density = density;
        this.verticalMargin = i;
        this.onPositionCalculated = function2;
        int iMo7868roundToPx0680j_4 = density.mo7868roundToPx0680j_4(DpOffset.m13727getXD9Ej5fM(j));
        MenuPosition menuPosition = MenuPosition.INSTANCE;
        this.startToAnchorStart = menuPosition.startToAnchorStart(iMo7868roundToPx0680j_4);
        this.endToAnchorEnd = menuPosition.endToAnchorEnd(iMo7868roundToPx0680j_4);
        this.leftToWindowLeft = menuPosition.leftToWindowLeft(0);
        this.rightToWindowRight = menuPosition.rightToWindowRight(0);
        int iMo7868roundToPx0680j_42 = density.mo7868roundToPx0680j_4(DpOffset.m13729getYD9Ej5fM(j));
        this.topToAnchorBottom = menuPosition.topToAnchorBottom(iMo7868roundToPx0680j_42);
        this.bottomToAnchorTop = menuPosition.bottomToAnchorTop(iMo7868roundToPx0680j_42);
        this.centerToAnchorTop = menuPosition.centerToAnchorTop(iMo7868roundToPx0680j_42);
        this.topToWindowTop = menuPosition.topToWindowTop(i);
        this.bottomToWindowBottom = menuPosition.bottomToWindowBottom(i);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m9437getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, int i, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, (i2 & 4) != 0 ? density.mo7868roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i, (i2 & 8) != 0 ? new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.DropdownMenuPositionProvider.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                invoke2(intRect, intRect2);
                return Unit.INSTANCE;
            }
        } : function2, null);
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    @NotNull
    public final Function2<IntRect, IntRect, Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    @Override // androidx.compose.p003ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo8548calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
        MenuPosition.Horizontal horizontal;
        Object obj;
        Object obj2;
        MenuPosition.Vertical vertical;
        int i = 0;
        MenuPosition.Horizontal horizontal2 = this.startToAnchorStart;
        MenuPosition.Horizontal horizontal3 = this.endToAnchorEnd;
        if (IntOffset.m13794getXimpl(anchorBounds.m13817getCenternOccac()) < IntSize.m13836getWidthimpl(windowSize) / 2) {
            horizontal = this.leftToWindowLeft;
        } else {
            horizontal = this.rightToWindowRight;
        }
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new MenuPosition.Horizontal[]{horizontal2, horizontal3, horizontal});
        ArrayList arrayList = new ArrayList(listListOf.size());
        int size = listListOf.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(((MenuPosition.Horizontal) listListOf.get(i2)).mo9122position95KtPRI(anchorBounds, windowSize, IntSize.m13836getWidthimpl(popupContentSize), layoutDirection)));
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (true) {
            obj = null;
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i3);
            int iIntValue = ((Number) obj2).intValue();
            if (iIntValue >= 0 && iIntValue + IntSize.m13836getWidthimpl(popupContentSize) <= IntSize.m13836getWidthimpl(windowSize)) {
                break;
            }
            i3++;
        }
        Integer num = (Integer) obj2;
        int iIntValue2 = num != null ? num.intValue() : ((Number) CollectionsKt___CollectionsKt.last((List) arrayList)).intValue();
        MenuPosition.Vertical vertical2 = this.topToAnchorBottom;
        MenuPosition.Vertical vertical3 = this.bottomToAnchorTop;
        MenuPosition.Vertical vertical4 = this.centerToAnchorTop;
        if (IntOffset.m13795getYimpl(anchorBounds.m13817getCenternOccac()) < IntSize.m13835getHeightimpl(windowSize) / 2) {
            vertical = this.topToWindowTop;
        } else {
            vertical = this.bottomToWindowBottom;
        }
        List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new MenuPosition.Vertical[]{vertical2, vertical3, vertical4, vertical});
        ArrayList arrayList2 = new ArrayList(listListOf2.size());
        int size3 = listListOf2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            arrayList2.add(Integer.valueOf(((MenuPosition.Vertical) listListOf2.get(i4)).mo9123positionJVtK1S4(anchorBounds, windowSize, IntSize.m13835getHeightimpl(popupContentSize))));
        }
        int size4 = arrayList2.size();
        while (true) {
            if (i >= size4) {
                break;
            }
            Object obj3 = arrayList2.get(i);
            int iIntValue3 = ((Number) obj3).intValue();
            if (iIntValue3 >= this.verticalMargin && iIntValue3 + IntSize.m13835getHeightimpl(popupContentSize) <= IntSize.m13835getHeightimpl(windowSize) - this.verticalMargin) {
                obj = obj3;
                break;
            }
            i++;
        }
        Integer num2 = (Integer) obj;
        long jIntOffset = IntOffsetKt.IntOffset(iIntValue2, num2 != null ? num2.intValue() : ((Number) CollectionsKt___CollectionsKt.last((List) arrayList2)).intValue());
        this.onPositionCalculated.invoke(anchorBounds, IntRectKt.m13826IntRectVbeCjmY(jIntOffset, popupContentSize));
        return jIntOffset;
    }
}
