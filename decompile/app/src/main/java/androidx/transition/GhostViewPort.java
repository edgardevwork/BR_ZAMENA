package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class GhostViewPort extends ViewGroup implements GhostView {

    @Nullable
    public Matrix mMatrix;
    public final ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
    public int mReferences;
    public ViewGroup mStartParent;
    public View mStartView;
    public final View mView;

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public GhostViewPort(View view) {
        super(view.getContext());
        this.mOnPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.transition.GhostViewPort.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                View view2;
                GhostViewPort.this.postInvalidateOnAnimation();
                GhostViewPort ghostViewPort = GhostViewPort.this;
                ViewGroup viewGroup = ghostViewPort.mStartParent;
                if (viewGroup == null || (view2 = ghostViewPort.mStartView) == null) {
                    return true;
                }
                viewGroup.endViewTransition(view2);
                GhostViewPort.this.mStartParent.postInvalidateOnAnimation();
                GhostViewPort ghostViewPort2 = GhostViewPort.this;
                ghostViewPort2.mStartParent = null;
                ghostViewPort2.mStartView = null;
                return true;
            }
        };
        this.mView = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // android.view.View, androidx.transition.GhostView
    public void setVisibility(int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.setVisibility(i);
        if (getGhostView(this.mView) == this) {
            ViewUtils.setTransitionVisibility(this.mView, i == 0 ? 4 : 0);
        }
    }

    public void setMatrix(@NonNull Matrix matrix) {
        this.mMatrix = matrix;
    }

    @Override // androidx.transition.GhostView
    public void reserveEndViewTransition(ViewGroup viewGroup, View view) {
        this.mStartParent = viewGroup;
        this.mStartView = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onAttachedToWindow();
        setGhostView(this.mView, this);
        this.mView.getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        ViewUtils.setTransitionVisibility(this.mView, 4);
        if (this.mView.getParent() != null) {
            ((View) this.mView.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        this.mView.getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        ViewUtils.setTransitionVisibility(this.mView, 0);
        setGhostView(this.mView, null);
        if (this.mView.getParent() != null) {
            ((View) this.mView.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        CanvasUtils.enableZ(canvas, true);
        canvas.setMatrix(this.mMatrix);
        ViewUtils.setTransitionVisibility(this.mView, 0);
        this.mView.invalidate();
        ViewUtils.setTransitionVisibility(this.mView, 4);
        drawChild(canvas, this.mView, getDrawingTime());
        CanvasUtils.enableZ(canvas, false);
    }

    public static void copySize(View view, View view2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewUtils.setLeftTopRightBottom(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    public static GhostViewPort getGhostView(View view) {
        return (GhostViewPort) view.getTag(C3239R.id.ghost_view);
    }

    public static void setGhostView(@NonNull View view, @Nullable GhostViewPort ghostViewPort) {
        view.setTag(C3239R.id.ghost_view, ghostViewPort);
    }

    public static void calculateMatrix(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        ViewUtils.transformMatrixToGlobal(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        ViewUtils.transformMatrixToLocal(viewGroup, matrix);
    }

    public static GhostViewPort addGhost(View view, ViewGroup viewGroup, Matrix matrix) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i;
        GhostViewHolder ghostViewHolder;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        GhostViewHolder holder = GhostViewHolder.getHolder(viewGroup);
        GhostViewPort ghostView = getGhostView(view);
        if (ghostView == null || (ghostViewHolder = (GhostViewHolder) ghostView.getParent()) == holder) {
            i = 0;
        } else {
            i = ghostView.mReferences;
            ghostViewHolder.removeView(ghostView);
            ghostView = null;
        }
        if (ghostView == null) {
            if (matrix == null) {
                matrix = new Matrix();
                calculateMatrix(view, viewGroup, matrix);
            }
            ghostView = new GhostViewPort(view);
            ghostView.setMatrix(matrix);
            if (holder == null) {
                holder = new GhostViewHolder(viewGroup);
            } else {
                holder.popToOverlayTop();
            }
            copySize(viewGroup, holder);
            copySize(viewGroup, ghostView);
            holder.addGhostView(ghostView);
            ghostView.mReferences = i;
        } else if (matrix != null) {
            ghostView.setMatrix(matrix);
        }
        ghostView.mReferences++;
        return ghostView;
    }

    public static void removeGhost(View view) {
        GhostViewPort ghostView = getGhostView(view);
        if (ghostView != null) {
            int i = ghostView.mReferences - 1;
            ghostView.mReferences = i;
            if (i <= 0) {
                ((GhostViewHolder) ghostView.getParent()).removeView(ghostView);
            }
        }
    }
}
