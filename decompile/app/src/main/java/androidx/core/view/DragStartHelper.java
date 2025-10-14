package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class DragStartHelper {
    public boolean mDragging;
    public int mLastTouchX;
    public int mLastTouchY;
    public final OnDragStartListener mListener;
    public final View.OnLongClickListener mLongClickListener = new View.OnLongClickListener() { // from class: androidx.core.view.DragStartHelper$$ExternalSyntheticLambda0
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return this.f$0.onLongClick(view);
        }
    };
    public final View.OnTouchListener mTouchListener = new View.OnTouchListener() { // from class: androidx.core.view.DragStartHelper$$ExternalSyntheticLambda1
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f$0.onTouch(view, motionEvent);
        }
    };
    public final View mView;

    public interface OnDragStartListener {
        boolean onDragStart(@NonNull View view, @NonNull DragStartHelper dragStartHelper);
    }

    public DragStartHelper(@NonNull View view, @NonNull OnDragStartListener onDragStartListener) {
        this.mView = view;
        this.mListener = onDragStartListener;
    }

    public void attach() {
        this.mView.setOnLongClickListener(this.mLongClickListener);
        this.mView.setOnTouchListener(this.mTouchListener);
    }

    public void detach() {
        this.mView.setOnLongClickListener(null);
        this.mView.setOnTouchListener(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastTouchX = x;
            this.mLastTouchY = y;
        } else if (action == 1) {
            this.mDragging = false;
        } else if (action != 2) {
            if (action == 3) {
            }
        } else if (MotionEventCompat.isFromSource(motionEvent, 8194) && (motionEvent.getButtonState() & 1) != 0 && !this.mDragging && (this.mLastTouchX != x || this.mLastTouchY != y)) {
            this.mLastTouchX = x;
            this.mLastTouchY = y;
            boolean zOnDragStart = this.mListener.onDragStart(view, this);
            this.mDragging = zOnDragStart;
            return zOnDragStart;
        }
        return false;
    }

    public boolean onLongClick(@NonNull View view) {
        if (this.mDragging) {
            return true;
        }
        boolean zOnDragStart = this.mListener.onDragStart(view, this);
        this.mDragging = zOnDragStart;
        return zOnDragStart;
    }

    public void getTouchPosition(@NonNull Point point) {
        point.set(this.mLastTouchX, this.mLastTouchY);
    }
}
