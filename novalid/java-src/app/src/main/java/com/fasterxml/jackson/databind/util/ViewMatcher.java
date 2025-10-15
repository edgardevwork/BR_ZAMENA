package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class ViewMatcher implements Serializable {
    public static final ViewMatcher EMPTY = new ViewMatcher();
    public static final long serialVersionUID = 1;

    public boolean isVisibleForView(Class<?> cls) {
        return false;
    }

    public static ViewMatcher construct(Class<?>[] clsArr) {
        if (clsArr == null) {
            return EMPTY;
        }
        int length = clsArr.length;
        if (length == 0) {
            return EMPTY;
        }
        if (length == 1) {
            return new Single(clsArr[0]);
        }
        return new Multi(clsArr);
    }

    /* loaded from: classes6.dex */
    public static final class Single extends ViewMatcher {
        public static final long serialVersionUID = 1;
        public final Class<?> _view;

        public Single(Class<?> cls) {
            this._view = cls;
        }

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public boolean isVisibleForView(Class<?> cls) {
            Class<?> cls2 = this._view;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Multi extends ViewMatcher implements Serializable {
        public static final long serialVersionUID = 1;
        public final Class<?>[] _views;

        public Multi(Class<?>[] clsArr) {
            this._views = clsArr;
        }

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public boolean isVisibleForView(Class<?> cls) {
            int length = this._views.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls2 = this._views[i];
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }
}
