package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ScrollEventAdapter extends RecyclerView.OnScrollListener {
    public static final int NO_POSITION = -1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_IN_PROGRESS_FAKE_DRAG = 4;
    public static final int STATE_IN_PROGRESS_IMMEDIATE_SCROLL = 3;
    public static final int STATE_IN_PROGRESS_MANUAL_DRAG = 1;
    public static final int STATE_IN_PROGRESS_SMOOTH_SCROLL = 2;
    public int mAdapterState;
    public ViewPager2.OnPageChangeCallback mCallback;
    public boolean mDataSetChangeHappened;
    public boolean mDispatchSelected;
    public int mDragStartPosition;
    public boolean mFakeDragging;

    @NonNull
    public final LinearLayoutManager mLayoutManager;

    @NonNull
    public final RecyclerView mRecyclerView;
    public boolean mScrollHappened;
    public int mScrollState;
    public ScrollEventValues mScrollValues;
    public int mTarget;

    @NonNull
    public final ViewPager2 mViewPager;

    public ScrollEventAdapter(@NonNull ViewPager2 viewPager2) {
        this.mViewPager = viewPager2;
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.mScrollValues = new ScrollEventValues();
        resetState();
    }

    public final void resetState() {
        this.mAdapterState = 0;
        this.mScrollState = 0;
        this.mScrollValues.reset();
        this.mDragStartPosition = -1;
        this.mTarget = -1;
        this.mDispatchSelected = false;
        this.mScrollHappened = false;
        this.mFakeDragging = false;
        this.mDataSetChangeHappened = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        if ((this.mAdapterState != 1 || this.mScrollState != 1) && i == 1) {
            startDrag(false);
            return;
        }
        if (isInAnyDraggingState() && i == 2) {
            if (this.mScrollHappened) {
                dispatchStateChanged(2);
                this.mDispatchSelected = true;
                return;
            }
            return;
        }
        if (isInAnyDraggingState() && i == 0) {
            updateScrollEventValues();
            if (!this.mScrollHappened) {
                int i2 = this.mScrollValues.mPosition;
                if (i2 != -1) {
                    dispatchScrolled(i2, 0.0f, 0);
                }
            } else {
                ScrollEventValues scrollEventValues = this.mScrollValues;
                if (scrollEventValues.mOffsetPx == 0) {
                    int i3 = this.mDragStartPosition;
                    int i4 = scrollEventValues.mPosition;
                    if (i3 != i4) {
                        dispatchSelected(i4);
                    }
                }
            }
            dispatchStateChanged(0);
            resetState();
        }
        if (this.mAdapterState == 2 && i == 0 && this.mDataSetChangeHappened) {
            updateScrollEventValues();
            ScrollEventValues scrollEventValues2 = this.mScrollValues;
            if (scrollEventValues2.mOffsetPx == 0) {
                int i5 = this.mTarget;
                int i6 = scrollEventValues2.mPosition;
                if (i5 != i6) {
                    if (i6 == -1) {
                        i6 = 0;
                    }
                    dispatchSelected(i6);
                }
                dispatchStateChanged(0);
                resetState();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        int i3;
        this.mScrollHappened = true;
        updateScrollEventValues();
        if (this.mDispatchSelected) {
            this.mDispatchSelected = false;
            if (i2 > 0) {
                ScrollEventValues scrollEventValues = this.mScrollValues;
                i3 = scrollEventValues.mOffsetPx != 0 ? scrollEventValues.mPosition + 1 : this.mScrollValues.mPosition;
                this.mTarget = i3;
                if (this.mDragStartPosition != i3) {
                    dispatchSelected(i3);
                }
            } else {
                if (i2 == 0) {
                    if ((i < 0) == this.mViewPager.isRtl()) {
                    }
                }
                this.mTarget = i3;
                if (this.mDragStartPosition != i3) {
                }
            }
        } else if (this.mAdapterState == 0) {
            int i4 = this.mScrollValues.mPosition;
            if (i4 == -1) {
                i4 = 0;
            }
            dispatchSelected(i4);
        }
        ScrollEventValues scrollEventValues2 = this.mScrollValues;
        int i5 = scrollEventValues2.mPosition;
        if (i5 == -1) {
            i5 = 0;
        }
        dispatchScrolled(i5, scrollEventValues2.mOffset, scrollEventValues2.mOffsetPx);
        ScrollEventValues scrollEventValues3 = this.mScrollValues;
        int i6 = scrollEventValues3.mPosition;
        int i7 = this.mTarget;
        if ((i6 == i7 || i7 == -1) && scrollEventValues3.mOffsetPx == 0 && this.mScrollState != 1) {
            dispatchStateChanged(0);
            resetState();
        }
    }

    public final void updateScrollEventValues() {
        int top;
        ScrollEventValues scrollEventValues = this.mScrollValues;
        int iFindFirstVisibleItemPosition = this.mLayoutManager.findFirstVisibleItemPosition();
        scrollEventValues.mPosition = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            scrollEventValues.reset();
            return;
        }
        View viewFindViewByPosition = this.mLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            scrollEventValues.reset();
            return;
        }
        int leftDecorationWidth = this.mLayoutManager.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.mLayoutManager.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.mLayoutManager.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.mLayoutManager.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.mLayoutManager.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.mRecyclerView.getPaddingLeft();
            if (this.mViewPager.isRtl()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.mRecyclerView.getPaddingTop();
        }
        int i = -top;
        scrollEventValues.mOffsetPx = i;
        if (i < 0) {
            if (new AnimateLayoutChangeDetector(this.mLayoutManager).mayHaveInterferingAnimations()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(scrollEventValues.mOffsetPx)));
        }
        scrollEventValues.mOffset = height == 0 ? 0.0f : i / height;
    }

    public final void startDrag(boolean z) {
        this.mFakeDragging = z;
        this.mAdapterState = z ? 4 : 1;
        int i = this.mTarget;
        if (i != -1) {
            this.mDragStartPosition = i;
            this.mTarget = -1;
        } else if (this.mDragStartPosition == -1) {
            this.mDragStartPosition = getPosition();
        }
        dispatchStateChanged(1);
    }

    public void notifyDataSetChangeHappened() {
        this.mDataSetChangeHappened = true;
    }

    public void notifyProgrammaticScroll(int i, boolean z) {
        this.mAdapterState = z ? 2 : 3;
        this.mFakeDragging = false;
        boolean z2 = this.mTarget != i;
        this.mTarget = i;
        dispatchStateChanged(2);
        if (z2) {
            dispatchSelected(i);
        }
    }

    public void notifyBeginFakeDrag() {
        this.mAdapterState = 4;
        startDrag(true);
    }

    public void notifyEndFakeDrag() {
        if (!isDragging() || this.mFakeDragging) {
            this.mFakeDragging = false;
            updateScrollEventValues();
            ScrollEventValues scrollEventValues = this.mScrollValues;
            if (scrollEventValues.mOffsetPx == 0) {
                int i = scrollEventValues.mPosition;
                if (i != this.mDragStartPosition) {
                    dispatchSelected(i);
                }
                dispatchStateChanged(0);
                resetState();
                return;
            }
            dispatchStateChanged(2);
        }
    }

    public void setOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mCallback = onPageChangeCallback;
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean isIdle() {
        return this.mScrollState == 0;
    }

    public boolean isDragging() {
        return this.mScrollState == 1;
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    public final boolean isInAnyDraggingState() {
        int i = this.mAdapterState;
        return i == 1 || i == 4;
    }

    public double getRelativeScrollPosition() {
        updateScrollEventValues();
        ScrollEventValues scrollEventValues = this.mScrollValues;
        return scrollEventValues.mPosition + scrollEventValues.mOffset;
    }

    public final void dispatchStateChanged(int i) {
        if ((this.mAdapterState == 3 && this.mScrollState == 0) || this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrollStateChanged(i);
        }
    }

    public final void dispatchSelected(int i) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageSelected(i);
        }
    }

    public final void dispatchScrolled(int i, float f, int i2) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrolled(i, f, i2);
        }
    }

    public final int getPosition() {
        return this.mLayoutManager.findFirstVisibleItemPosition();
    }

    /* loaded from: classes3.dex */
    public static final class ScrollEventValues {
        public float mOffset;
        public int mOffsetPx;
        public int mPosition;

        public void reset() {
            this.mPosition = -1;
            this.mOffset = 0.0f;
            this.mOffsetPx = 0;
        }
    }
}
