package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchBar;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class SearchBarAnimationHelper {
    public static final long COLLAPSE_DURATION_MS = 250;
    public static final long COLLAPSE_FADE_IN_CHILDREN_DURATION_MS = 100;
    public static final long EXPAND_DURATION_MS = 300;
    public static final long EXPAND_FADE_OUT_CHILDREN_DURATION_MS = 75;
    public static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_DURATION_MS = 250;
    public static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_IN_START_DELAY_MS = 500;
    public static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_OUT_START_DELAY_MS = 750;
    public static final long ON_LOAD_ANIM_SECONDARY_DURATION_MS = 250;
    public static final long ON_LOAD_ANIM_SECONDARY_START_DELAY_MS = 250;
    public boolean collapsing;

    @Nullable
    public Animator defaultCenterViewAnimator;
    public boolean expanding;

    @Nullable
    public Animator secondaryViewAnimator;
    public final Set<SearchBar.OnLoadAnimationCallback> onLoadAnimationCallbacks = new LinkedHashSet();
    public final Set<AnimatorListenerAdapter> expandAnimationListeners = new LinkedHashSet();
    public final Set<AnimatorListenerAdapter> collapseAnimationListeners = new LinkedHashSet();
    public boolean onLoadAnimationFadeInEnabled = true;
    public Animator runningExpandOrCollapseAnimator = null;

    public interface OnLoadAnimationInvocation {
        void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void startOnLoadAnimation(SearchBar searchBar) {
        dispatchOnLoadAnimation(new OnLoadAnimationInvocation() { // from class: com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda1
            @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
            public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                onLoadAnimationCallback.onAnimationStart();
            }
        });
        TextView textView = searchBar.getTextView();
        View centerView = searchBar.getCenterView();
        View secondaryActionMenuItemView = ToolbarUtils.getSecondaryActionMenuItemView(searchBar);
        final Animator secondaryViewAnimator = getSecondaryViewAnimator(textView, secondaryActionMenuItemView);
        secondaryViewAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.1
            public C69541() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchBarAnimationHelper.this.dispatchOnLoadAnimation(new OnLoadAnimationInvocation() { // from class: com.google.android.material.search.SearchBarAnimationHelper$1$$ExternalSyntheticLambda0
                    @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
                    public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                        onLoadAnimationCallback.onAnimationEnd();
                    }
                });
            }
        });
        this.secondaryViewAnimator = secondaryViewAnimator;
        textView.setAlpha(0.0f);
        if (secondaryActionMenuItemView != null) {
            secondaryActionMenuItemView.setAlpha(0.0f);
        }
        if (centerView instanceof AnimatableView) {
            ((AnimatableView) centerView).startAnimation(new AnimatableView.Listener() { // from class: com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda2
                @Override // com.google.android.material.animation.AnimatableView.Listener
                public final void onAnimationEnd() {
                    secondaryViewAnimator.start();
                }
            });
            return;
        }
        if (centerView != 0) {
            centerView.setAlpha(0.0f);
            centerView.setVisibility(0);
            Animator defaultCenterViewAnimator = getDefaultCenterViewAnimator(centerView);
            this.defaultCenterViewAnimator = defaultCenterViewAnimator;
            defaultCenterViewAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.2
                public final /* synthetic */ View val$centerView;
                public final /* synthetic */ Animator val$secondaryViewAnimator;

                public C69552(View centerView2, final Animator secondaryViewAnimator2) {
                    view = centerView2;
                    animator = secondaryViewAnimator2;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    view.setVisibility(8);
                    animator.start();
                }
            });
            defaultCenterViewAnimator.start();
            return;
        }
        secondaryViewAnimator2.start();
    }

    /* renamed from: com.google.android.material.search.SearchBarAnimationHelper$1 */
    public class C69541 extends AnimatorListenerAdapter {
        public C69541() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SearchBarAnimationHelper.this.dispatchOnLoadAnimation(new OnLoadAnimationInvocation() { // from class: com.google.android.material.search.SearchBarAnimationHelper$1$$ExternalSyntheticLambda0
                @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
                public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                    onLoadAnimationCallback.onAnimationEnd();
                }
            });
        }
    }

    /* renamed from: com.google.android.material.search.SearchBarAnimationHelper$2 */
    public class C69552 extends AnimatorListenerAdapter {
        public final /* synthetic */ View val$centerView;
        public final /* synthetic */ Animator val$secondaryViewAnimator;

        public C69552(View centerView2, final Animator secondaryViewAnimator2) {
            view = centerView2;
            animator = secondaryViewAnimator2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            view.setVisibility(8);
            animator.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void stopOnLoadAnimation(SearchBar searchBar) {
        Animator animator = this.secondaryViewAnimator;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.defaultCenterViewAnimator;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof AnimatableView) {
            ((AnimatableView) centerView).stopAnimation();
        }
        if (centerView != 0) {
            centerView.setAlpha(0.0f);
        }
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.onLoadAnimationFadeInEnabled;
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.onLoadAnimationFadeInEnabled = z;
    }

    public void addOnLoadAnimationCallback(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        this.onLoadAnimationCallbacks.add(onLoadAnimationCallback);
    }

    public boolean removeOnLoadAnimationCallback(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.onLoadAnimationCallbacks.remove(onLoadAnimationCallback);
    }

    public final void dispatchOnLoadAnimation(OnLoadAnimationInvocation onLoadAnimationInvocation) {
        Iterator<SearchBar.OnLoadAnimationCallback> it = this.onLoadAnimationCallbacks.iterator();
        while (it.hasNext()) {
            onLoadAnimationInvocation.invoke(it.next());
        }
    }

    public final Animator getDefaultCenterViewAnimator(@Nullable View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.onLoadAnimationFadeInEnabled ? 250L : 0L);
        valueAnimatorOfFloat.setStartDelay(this.onLoadAnimationFadeInEnabled ? 500L : 0L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(250L);
        valueAnimatorOfFloat2.setStartDelay(750L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        return animatorSet;
    }

    public final Animator getSecondaryViewAnimator(TextView textView, @Nullable View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(250L);
        animatorSet.play(getTextViewAnimator(textView));
        if (view != null) {
            animatorSet.play(getSecondaryActionMenuItemAnimator(view));
        }
        return animatorSet;
    }

    public final Animator getTextViewAnimator(TextView textView) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(textView));
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(250L);
        return valueAnimatorOfFloat;
    }

    public final Animator getSecondaryActionMenuItemAnimator(@Nullable View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(250L);
        return valueAnimatorOfFloat;
    }

    public void startExpandAnimation(final SearchBar searchBar, final View view, @Nullable final AppBarLayout appBarLayout, final boolean z) {
        Animator animator;
        if (isCollapsing() && (animator = this.runningExpandOrCollapseAnimator) != null) {
            animator.cancel();
        }
        this.expanding = true;
        view.setVisibility(4);
        view.post(new Runnable() { // from class: com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$startExpandAnimation$0(searchBar, view, appBarLayout, z);
            }
        });
    }

    public final /* synthetic */ void lambda$startExpandAnimation$0(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(getFadeOutChildrenAnimator(searchBar, view), getExpandAnimator(searchBar, view, appBarLayout));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.3
            public C69563() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchBarAnimationHelper.this.runningExpandOrCollapseAnimator = null;
            }
        });
        Iterator<AnimatorListenerAdapter> it = this.expandAnimationListeners.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.runningExpandOrCollapseAnimator = animatorSet;
    }

    /* renamed from: com.google.android.material.search.SearchBarAnimationHelper$3 */
    public class C69563 extends AnimatorListenerAdapter {
        public C69563() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SearchBarAnimationHelper.this.runningExpandOrCollapseAnimator = null;
        }
    }

    public final Animator getExpandAnimator(SearchBar searchBar, View view, @Nullable AppBarLayout appBarLayout) {
        return getExpandCollapseAnimationHelper(searchBar, view, appBarLayout).setDuration(300L).addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.4
            public final /* synthetic */ SearchBar val$searchBar;

            public C69574(SearchBar searchBar2) {
                searchBar = searchBar2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                searchBar.setVisibility(4);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchBarAnimationHelper.this.expanding = false;
            }
        }).getExpandAnimator();
    }

    /* renamed from: com.google.android.material.search.SearchBarAnimationHelper$4 */
    public class C69574 extends AnimatorListenerAdapter {
        public final /* synthetic */ SearchBar val$searchBar;

        public C69574(SearchBar searchBar2) {
            searchBar = searchBar2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            searchBar.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SearchBarAnimationHelper.this.expanding = false;
        }
    }

    public boolean isExpanding() {
        return this.expanding;
    }

    public void addExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.expandAnimationListeners.add(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.expandAnimationListeners.remove(animatorListenerAdapter);
    }

    public void startCollapseAnimation(SearchBar searchBar, View view, @Nullable AppBarLayout appBarLayout, boolean z) {
        Animator animator;
        if (isExpanding() && (animator = this.runningExpandOrCollapseAnimator) != null) {
            animator.cancel();
        }
        this.collapsing = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(getCollapseAnimator(searchBar, view, appBarLayout), getFadeInChildrenAnimator(searchBar));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.5
            public C69585() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                SearchBarAnimationHelper.this.runningExpandOrCollapseAnimator = null;
            }
        });
        Iterator<AnimatorListenerAdapter> it = this.collapseAnimationListeners.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.runningExpandOrCollapseAnimator = animatorSet;
    }

    /* renamed from: com.google.android.material.search.SearchBarAnimationHelper$5 */
    public class C69585 extends AnimatorListenerAdapter {
        public C69585() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator2) {
            SearchBarAnimationHelper.this.runningExpandOrCollapseAnimator = null;
        }
    }

    public final Animator getCollapseAnimator(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return getExpandCollapseAnimationHelper(searchBar, view, appBarLayout).setDuration(250L).addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.6
            public final /* synthetic */ SearchBar val$searchBar;

            public C69596(SearchBar searchBar2) {
                searchBar = searchBar2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                searchBar.stopOnLoadAnimation();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                searchBar.setVisibility(0);
                SearchBarAnimationHelper.this.collapsing = false;
            }
        }).getCollapseAnimator();
    }

    /* renamed from: com.google.android.material.search.SearchBarAnimationHelper$6 */
    public class C69596 extends AnimatorListenerAdapter {
        public final /* synthetic */ SearchBar val$searchBar;

        public C69596(SearchBar searchBar2) {
            searchBar = searchBar2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            searchBar.stopOnLoadAnimation();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            searchBar.setVisibility(0);
            SearchBarAnimationHelper.this.collapsing = false;
        }
    }

    public boolean isCollapsing() {
        return this.collapsing;
    }

    public void addCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.collapseAnimationListeners.add(animatorListenerAdapter);
    }

    public boolean removeCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.collapseAnimationListeners.remove(animatorListenerAdapter);
    }

    public final ExpandCollapseAnimationHelper getExpandCollapseAnimationHelper(SearchBar searchBar, View view, @Nullable AppBarLayout appBarLayout) {
        return new ExpandCollapseAnimationHelper(searchBar, view).setAdditionalUpdateListener(getExpandedViewBackgroundUpdateListener(searchBar, view)).setCollapsedViewOffsetY(appBarLayout != null ? appBarLayout.getTop() : 0).addEndAnchoredViews(getEndAnchoredViews(view));
    }

    public final ValueAnimator.AnimatorUpdateListener getExpandedViewBackgroundUpdateListener(SearchBar searchBar, final View view) {
        final MaterialShapeDrawable materialShapeDrawableCreateWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(view.getContext());
        materialShapeDrawableCreateWithElevationOverlay.setCornerSize(searchBar.getCornerSize());
        materialShapeDrawableCreateWithElevationOverlay.setElevation(ViewCompat.getElevation(searchBar));
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchBarAnimationHelper.lambda$getExpandedViewBackgroundUpdateListener$1(materialShapeDrawableCreateWithElevationOverlay, view, valueAnimator);
            }
        };
    }

    public static /* synthetic */ void lambda$getExpandedViewBackgroundUpdateListener$1(MaterialShapeDrawable materialShapeDrawable, View view, ValueAnimator valueAnimator) {
        materialShapeDrawable.setInterpolation(1.0f - valueAnimator.getAnimatedFraction());
        ViewCompat.setBackground(view, materialShapeDrawable);
        view.setAlpha(1.0f);
    }

    public final Animator getFadeOutChildrenAnimator(SearchBar searchBar, final View view) {
        List<View> fadeChildren = getFadeChildren(searchBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(fadeChildren));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(0.0f);
            }
        });
        valueAnimatorOfFloat.setDuration(75L);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return valueAnimatorOfFloat;
    }

    public final Animator getFadeInChildrenAnimator(SearchBar searchBar) {
        List<View> fadeChildren = getFadeChildren(searchBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(fadeChildren));
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return valueAnimatorOfFloat;
    }

    public final List<View> getFadeChildren(SearchBar searchBar) {
        List<View> children = ViewUtils.getChildren(searchBar);
        if (searchBar.getCenterView() != null) {
            children.remove(searchBar.getCenterView());
        }
        return children;
    }

    public final List<View> getEndAnchoredViews(View view) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view);
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((!zIsLayoutRtl && (childAt instanceof ActionMenuView)) || (zIsLayoutRtl && !(childAt instanceof ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }
}
