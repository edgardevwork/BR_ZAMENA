package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class CarouselOrientationHelper {
    public final int orientation;

    public abstract void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract int getDecoratedCrossAxisMeasurement(View view);

    public abstract float getMaskMargins(RecyclerView.LayoutParams layoutParams);

    public abstract RectF getMaskRect(float f, float f2, float f3, float f4);

    public abstract int getParentBottom();

    public abstract int getParentEnd();

    public abstract int getParentLeft();

    public abstract int getParentRight();

    public abstract int getParentStart();

    public abstract int getParentTop();

    public abstract void layoutDecoratedWithMargins(View view, int i, int i2);

    public abstract void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract void offsetChild(View view, Rect rect, float f, float f2);

    public /* synthetic */ CarouselOrientationHelper(int i, C68171 c68171) {
        this(i);
    }

    public CarouselOrientationHelper(int i) {
        this.orientation = i;
    }

    public static CarouselOrientationHelper createOrientationHelper(CarouselLayoutManager carouselLayoutManager, int i) {
        if (i == 0) {
            return createHorizontalHelper(carouselLayoutManager);
        }
        if (i == 1) {
            return createVerticalHelper(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: com.google.android.material.carousel.CarouselOrientationHelper$1 */
    /* loaded from: classes6.dex */
    public class C68171 extends CarouselOrientationHelper {
        public final /* synthetic */ CarouselLayoutManager val$carouselLayoutManager;

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public int getParentTop() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C68171(int i, CarouselLayoutManager carouselLayoutManager) {
            super(i);
            carouselLayoutManager = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public int getParentLeft() {
            return carouselLayoutManager.getPaddingLeft();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public int getParentStart() {
            return getParentTop();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public int getParentRight() {
            return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public int getParentEnd() {
            return getParentBottom();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public int getParentBottom() {
            return carouselLayoutManager.getHeight();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public int getDecoratedCrossAxisMeasurement(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return carouselLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void layoutDecoratedWithMargins(View view, int i, int i2) {
            int parentLeft = getParentLeft();
            carouselLayoutManager.layoutDecoratedWithMargins(view, parentLeft, i, parentLeft + getDecoratedCrossAxisMeasurement(view), i2);
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public RectF getMaskRect(float f, float f2, float f3, float f4) {
            return new RectF(0.0f, f3, f2, f - f3);
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
            float f = rectF2.top;
            float f2 = rectF3.top;
            if (f < f2 && rectF2.bottom > f2) {
                float f3 = f2 - f;
                rectF.top += f3;
                rectF3.top += f3;
            }
            float f4 = rectF2.bottom;
            float f5 = rectF3.bottom;
            if (f4 <= f5 || rectF2.top >= f5) {
                return;
            }
            float f6 = f4 - f5;
            rectF.bottom = Math.max(rectF.bottom - f6, rectF.top);
            rectF2.bottom = Math.max(rectF2.bottom - f6, rectF2.top);
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.bottom <= rectF3.top) {
                float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                rectF.bottom = fFloor;
                rectF.top = Math.min(rectF.top, fFloor);
            }
            if (rectF2.top >= rectF3.bottom) {
                float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                rectF.top = fCeil;
                rectF.bottom = Math.max(fCeil, rectF.bottom);
            }
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void offsetChild(View view, Rect rect, float f, float f2) {
            view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
        }
    }

    public static CarouselOrientationHelper createVerticalHelper(CarouselLayoutManager carouselLayoutManager) {
        return new CarouselOrientationHelper(1) { // from class: com.google.android.material.carousel.CarouselOrientationHelper.1
            public final /* synthetic */ CarouselLayoutManager val$carouselLayoutManager;

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentTop() {
                return 0;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C68171(int i, CarouselLayoutManager carouselLayoutManager2) {
                super(i);
                carouselLayoutManager = carouselLayoutManager2;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentLeft() {
                return carouselLayoutManager.getPaddingLeft();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentStart() {
                return getParentTop();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentRight() {
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentEnd() {
                return getParentBottom();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentBottom() {
                return carouselLayoutManager.getHeight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getDecoratedCrossAxisMeasurement(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void layoutDecoratedWithMargins(View view, int i, int i2) {
                int parentLeft = getParentLeft();
                carouselLayoutManager.layoutDecoratedWithMargins(view, parentLeft, i, parentLeft + getDecoratedCrossAxisMeasurement(view), i2);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
                return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public RectF getMaskRect(float f, float f2, float f3, float f4) {
                return new RectF(0.0f, f3, f2, f - f3);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                float f = rectF2.top;
                float f2 = rectF3.top;
                if (f < f2 && rectF2.bottom > f2) {
                    float f3 = f2 - f;
                    rectF.top += f3;
                    rectF3.top += f3;
                }
                float f4 = rectF2.bottom;
                float f5 = rectF3.bottom;
                if (f4 <= f5 || rectF2.top >= f5) {
                    return;
                }
                float f6 = f4 - f5;
                rectF.bottom = Math.max(rectF.bottom - f6, rectF.top);
                rectF2.bottom = Math.max(rectF2.bottom - f6, rectF2.top);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.bottom <= rectF3.top) {
                    float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                    rectF.bottom = fFloor;
                    rectF.top = Math.min(rectF.top, fFloor);
                }
                if (rectF2.top >= rectF3.bottom) {
                    float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                    rectF.top = fCeil;
                    rectF.bottom = Math.max(fCeil, rectF.bottom);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void offsetChild(View view, Rect rect, float f, float f2) {
                view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
            }
        };
    }

    /* renamed from: com.google.android.material.carousel.CarouselOrientationHelper$2 */
    /* loaded from: classes6.dex */
    public class C68182 extends CarouselOrientationHelper {
        public final /* synthetic */ CarouselLayoutManager val$carouselLayoutManager;

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public int getParentLeft() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C68182(int i, CarouselLayoutManager carouselLayoutManager) {
            super(i);
            carouselLayoutManager = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public int getParentStart() {
            return carouselLayoutManager.isLayoutRtl() ? getParentRight() : getParentLeft();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public int getParentRight() {
            return carouselLayoutManager.getWidth();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public int getParentEnd() {
            return carouselLayoutManager.isLayoutRtl() ? getParentLeft() : getParentRight();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public int getParentTop() {
            return carouselLayoutManager.getPaddingTop();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public int getParentBottom() {
            return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public int getDecoratedCrossAxisMeasurement(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return carouselLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void layoutDecoratedWithMargins(View view, int i, int i2) {
            int parentTop = getParentTop();
            carouselLayoutManager.layoutDecoratedWithMargins(view, i, parentTop, i2, parentTop + getDecoratedCrossAxisMeasurement(view));
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public RectF getMaskRect(float f, float f2, float f3, float f4) {
            return new RectF(f4, 0.0f, f2 - f4, f);
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
            float f = rectF2.left;
            float f2 = rectF3.left;
            if (f < f2 && rectF2.right > f2) {
                float f3 = f2 - f;
                rectF.left += f3;
                rectF2.left += f3;
            }
            float f4 = rectF2.right;
            float f5 = rectF3.right;
            if (f4 <= f5 || rectF2.left >= f5) {
                return;
            }
            float f6 = f4 - f5;
            rectF.right = Math.max(rectF.right - f6, rectF.left);
            rectF2.right = Math.max(rectF2.right - f6, rectF2.left);
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.right <= rectF3.left) {
                float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
                rectF.right = fFloor;
                rectF.left = Math.min(rectF.left, fFloor);
            }
            if (rectF2.left >= rectF3.right) {
                float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
                rectF.left = fCeil;
                rectF.right = Math.max(fCeil, rectF.right);
            }
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void offsetChild(View view, Rect rect, float f, float f2) {
            view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
        }
    }

    public static CarouselOrientationHelper createHorizontalHelper(CarouselLayoutManager carouselLayoutManager) {
        return new CarouselOrientationHelper(0) { // from class: com.google.android.material.carousel.CarouselOrientationHelper.2
            public final /* synthetic */ CarouselLayoutManager val$carouselLayoutManager;

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentLeft() {
                return 0;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C68182(int i, CarouselLayoutManager carouselLayoutManager2) {
                super(i);
                carouselLayoutManager = carouselLayoutManager2;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentStart() {
                return carouselLayoutManager.isLayoutRtl() ? getParentRight() : getParentLeft();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentRight() {
                return carouselLayoutManager.getWidth();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentEnd() {
                return carouselLayoutManager.isLayoutRtl() ? getParentLeft() : getParentRight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentTop() {
                return carouselLayoutManager.getPaddingTop();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentBottom() {
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getDecoratedCrossAxisMeasurement(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void layoutDecoratedWithMargins(View view, int i, int i2) {
                int parentTop = getParentTop();
                carouselLayoutManager.layoutDecoratedWithMargins(view, i, parentTop, i2, parentTop + getDecoratedCrossAxisMeasurement(view));
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
                return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public RectF getMaskRect(float f, float f2, float f3, float f4) {
                return new RectF(f4, 0.0f, f2 - f4, f);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                float f = rectF2.left;
                float f2 = rectF3.left;
                if (f < f2 && rectF2.right > f2) {
                    float f3 = f2 - f;
                    rectF.left += f3;
                    rectF2.left += f3;
                }
                float f4 = rectF2.right;
                float f5 = rectF3.right;
                if (f4 <= f5 || rectF2.left >= f5) {
                    return;
                }
                float f6 = f4 - f5;
                rectF.right = Math.max(rectF.right - f6, rectF.left);
                rectF2.right = Math.max(rectF2.right - f6, rectF2.left);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.right <= rectF3.left) {
                    float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
                    rectF.right = fFloor;
                    rectF.left = Math.min(rectF.left, fFloor);
                }
                if (rectF2.left >= rectF3.right) {
                    float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
                    rectF.left = fCeil;
                    rectF.right = Math.max(fCeil, rectF.right);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void offsetChild(View view, Rect rect, float f, float f2) {
                view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
            }
        };
    }
}
