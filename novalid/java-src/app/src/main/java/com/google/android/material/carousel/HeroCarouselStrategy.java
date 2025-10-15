package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    public int keylineCount = 0;
    public static final int[] SMALL_COUNTS = {1};
    public static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int[] iArrDoubleCounts;
        int i;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f;
        float fMax = Math.max(getSmallItemSizeMax() + f, smallItemSizeMin);
        float f2 = containerHeight;
        float fMin = Math.min(measuredWidth + f, f2);
        float fClamp = MathUtils.clamp((measuredWidth / 3.0f) + f, smallItemSizeMin + f, fMax + f);
        float f3 = (fMin + fClamp) / 2.0f;
        int[] iArr = f2 < 2.0f * smallItemSizeMin ? new int[]{0} : SMALL_COUNTS;
        int iMax = (int) Math.max(1.0d, Math.floor((f2 - (CarouselStrategyHelper.maxValue(r4) * fMax)) / fMin));
        int iCeil = (((int) Math.ceil(f2 / fMin)) - iMax) + 1;
        int[] iArr2 = new int[iCeil];
        for (int i2 = 0; i2 < iCeil; i2++) {
            iArr2[i2] = iMax + i2;
        }
        int i3 = carousel.getCarouselAlignment() == 1 ? 1 : 0;
        int[] iArrDoubleCounts2 = i3 != 0 ? CarouselStrategy.doubleCounts(iArr) : iArr;
        if (i3 != 0) {
            iArrDoubleCounts = CarouselStrategy.doubleCounts(MEDIUM_COUNTS);
        } else {
            iArrDoubleCounts = MEDIUM_COUNTS;
        }
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f2, fClamp, smallItemSizeMin, fMax, iArrDoubleCounts2, f3, iArrDoubleCounts, fMin, iArr2);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        if (arrangementFindLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f2, fClamp, smallItemSizeMin, fMax, iArr, f3, MEDIUM_COUNTS, fMin, iArr2);
            i = 0;
        } else {
            i = i3;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f, f2, arrangementFindLowestCostArrangement, i);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i) {
        if (carousel.getCarouselAlignment() == 1) {
            if (i < this.keylineCount && carousel.getItemCount() >= this.keylineCount) {
                return true;
            }
            if (i >= this.keylineCount && carousel.getItemCount() < this.keylineCount) {
                return true;
            }
        }
        return false;
    }
}
