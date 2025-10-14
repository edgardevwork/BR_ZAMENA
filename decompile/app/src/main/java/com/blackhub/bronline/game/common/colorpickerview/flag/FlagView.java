package com.blackhub.bronline.game.common.colorpickerview.flag;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.blackhub.bronline.game.common.colorpickerview.ColorEnvelope;
import com.blackhub.bronline.game.common.colorpickerview.FadeUtils;

/* loaded from: classes.dex */
public abstract class FlagView extends RelativeLayout {
    public FlagMode flagMode;
    public boolean flipAble;

    public abstract void onRefresh(ColorEnvelope colorEnvelope);

    public FlagView(Context context, int layout) {
        super(context);
        this.flagMode = FlagMode.ALWAYS;
        this.flipAble = true;
        initializeLayout(layout);
    }

    public void receiveOnTouchEvent(MotionEvent event) throws Resources.NotFoundException {
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            if (getFlagMode() == FlagMode.LAST) {
                gone();
                return;
            } else {
                if (getFlagMode() == FlagMode.FADE) {
                    FadeUtils.fadeIn(this);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (getFlagMode() == FlagMode.LAST) {
                    gone();
                    return;
                }
                return;
            }
        } else if (getFlagMode() == FlagMode.LAST) {
            visible();
        } else if (getFlagMode() == FlagMode.FADE) {
            FadeUtils.fadeOut(this);
        }
        visible();
    }

    public final void initializeLayout(int layout) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(layout, this);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        viewInflate.layout(0, 0, viewInflate.getWidth(), viewInflate.getMeasuredHeight());
    }

    public void visible() {
        setVisibility(0);
    }

    public void gone() {
        setVisibility(8);
    }

    public FlagMode getFlagMode() {
        return this.flagMode;
    }

    public void setFlagMode(FlagMode flagMode) {
        this.flagMode = flagMode;
    }

    public boolean isFlipAble() {
        return this.flipAble;
    }

    public void setFlipAble(boolean flipAble) {
        this.flipAble = flipAble;
    }
}
