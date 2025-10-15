package com.blackhub.bronline.game.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class UILayout {
    public UIContainer mParent = null;

    /* renamed from: getView */
    public abstract View getMViewRoot();

    public abstract View onCreateView(LayoutInflater inflater, ViewGroup container);

    public abstract void onLayoutClose();

    public abstract void onLayoutShown();

    public void setParent(UIContainer parent) {
        this.mParent = parent;
    }

    public Context getContext() {
        return this.mParent.getContext();
    }
}
