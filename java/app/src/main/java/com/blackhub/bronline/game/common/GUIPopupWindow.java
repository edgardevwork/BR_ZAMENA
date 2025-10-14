package com.blackhub.bronline.game.common;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class GUIPopupWindow extends PopupWindow {
    public GUIPopupWindow(View view, int width, int height, boolean focusable) {
        super(view, width, height, focusable);
    }

    public void setDimming(float value) {
        View view = (View) getContentView().getParent();
        if (getBackground() != null) {
            view = (View) view.getParent();
        }
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService(Context.WINDOW_SERVICE);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
        layoutParams.flags |= WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        layoutParams.dimAmount = value;
        windowManager.updateViewLayout(view, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @Override // android.widget.PopupWindow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showAtLocation(View parent, int gravity, int x, int y) {
        int i = 0;
        View contentView = getContentView();
        ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.height != -2 ? -1 : -2;
        }
        PopupViewContainer popupViewContainer = new PopupViewContainer(contentView.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, i);
        popupViewContainer.setBackground(null);
        if (contentView.getParent() != null) {
            ((ViewGroup) contentView.getParent()).removeView(contentView);
        }
        popupViewContainer.addView(contentView, layoutParams2);
        setContentView(popupViewContainer);
        setBackgroundDrawable(null);
        getContentView().setFocusableInTouchMode(true);
        hideSystemUIver2(getContentView());
        getContentView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.blackhub.bronline.game.common.GUIPopupWindow$$ExternalSyntheticLambda0
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i2) {
                lambda$showAtLocation$0(i2);
            }
        });
        super.showAtLocation(parent, gravity, x, y);
    }

    public final /* synthetic */ void lambda$showAtLocation$0(int i) {
        hideSystemUIver2(getContentView());
    }

    public final void hideSystemUIver2(View view) {
        if (Build.VERSION.SDK_INT > 29) {
            view.setSystemUiVisibility(6150);
        } else {
            view.setSystemUiVisibility(6662);
        }
    }
}
