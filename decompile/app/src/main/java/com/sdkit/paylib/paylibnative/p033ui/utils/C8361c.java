package com.sdkit.paylib.paylibnative.p033ui.utils;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.c */
/* loaded from: classes5.dex */
public final class C8361c implements TextWatcher {

    /* renamed from: a */
    public final String f3659a;

    /* renamed from: b */
    public final Function1 f3660b;

    /* renamed from: c */
    public boolean f3661c;

    /* renamed from: d */
    public boolean f3662d;

    /* renamed from: e */
    public Integer f3663e;

    /* renamed from: f */
    public String f3664f;

    public C8361c(String mask, Function1 onMaskedTextChanged) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        Intrinsics.checkNotNullParameter(onMaskedTextChanged, "onMaskedTextChanged");
        this.f3659a = mask;
        this.f3660b = onMaskedTextChanged;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
        if (this.f3661c) {
            return;
        }
        this.f3661c = true;
        int i = 0;
        while (i < editable.length() && i < this.f3659a.length()) {
            if (this.f3659a.charAt(i) == '#') {
                if (!Character.isDigit(editable.charAt(i))) {
                    editable.delete(i, i + 1);
                    i--;
                }
            } else if (editable.charAt(i) != this.f3659a.charAt(i)) {
                Integer num = this.f3663e;
                if (num == null || num.intValue() != i) {
                    editable.insert(i, String.valueOf(this.f3659a.charAt(i)));
                } else {
                    this.f3663e = null;
                    while (true) {
                        i--;
                        if (i < 0 || i >= editable.length() || editable.charAt(i) != this.f3659a.charAt(i)) {
                            break;
                        } else {
                            editable.delete(i, i + 1);
                        }
                    }
                    if (editable.length() > i) {
                        editable.delete(i, i + 1);
                    }
                }
            }
            i++;
        }
        if (this.f3662d) {
            while (true) {
                i--;
                if (i < 0 || i >= editable.length() || editable.charAt(i) != this.f3659a.charAt(i)) {
                    break;
                } else {
                    editable.delete(i, i + 1);
                }
            }
        }
        if (editable.length() > this.f3659a.length()) {
            editable.delete(this.f3659a.length(), editable.length());
        }
        this.f3662d = false;
        this.f3661c = false;
        String string = editable.toString();
        if (!Intrinsics.areEqual(string, this.f3664f)) {
            this.f3660b.invoke(string);
        }
        this.f3664f = string;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
        if (this.f3661c) {
            return;
        }
        this.f3662d = i3 < i2;
        Integer numValueOf = Integer.valueOf(i);
        if (!this.f3662d) {
            numValueOf = null;
        }
        this.f3663e = numValueOf;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
    }
}
