package com.sdkit.paylib.paylibnative.p033ui.rootcontainer;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.d */
/* loaded from: classes8.dex */
public abstract class AbstractC8250d {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if ((r1 instanceof android.app.Activity) != false) goto L9;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Activity m2424b(Context context) {
        if (!(context instanceof Activity)) {
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
        return (Activity) context;
    }

    /* renamed from: c */
    public static final void m2425c(Context context) {
        Window window;
        Activity activityM2424b = m2424b(context);
        View decorView = (activityM2424b == null || (window = activityM2424b.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            Object systemService = activityM2424b.getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
            }
        }
    }
}
