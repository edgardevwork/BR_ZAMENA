package com.sdkit.paylib.paylibnative.p033ui.utils.ext;

import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Priority;
import com.bumptech.glide.RequestManager;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8198s;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.ext.g */
/* loaded from: classes5.dex */
public abstract class AbstractC8370g {
    /* renamed from: a */
    public static final Rect m3465a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Rect rect = new Rect();
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.left = i;
        rect.top = iArr[1];
        rect.right = view.getWidth() + i;
        rect.bottom = view.getHeight() + rect.top;
        return rect;
    }

    /* renamed from: b */
    public static final void m3470b(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object systemService = view.getContext().getApplicationContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: c */
    public static final void m3471c(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.requestFocus();
        Object systemService = view.getContext().getApplicationContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(view, 1);
    }

    /* renamed from: a */
    public static final void m3466a(View view, final Function0 listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        view.setOnClickListener(new ViewOnClickListenerC8367d(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.utils.ext.g$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC8370g.m3469a(listener, view2);
            }
        }));
    }

    /* renamed from: a */
    public static final void m3467a(EditText editText, int i) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        TypedValue typedValue = new TypedValue();
        editText.getContext().getTheme().resolveAttribute(i, typedValue, true);
        editText.setBackground(ContextCompat.getDrawable(editText.getContext(), typedValue.resourceId));
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0039  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3468a(C8198s c8198s, RequestManager requestManager, C8302e c8302e, boolean z, boolean z2) {
        String string;
        Intrinsics.checkNotNullParameter(c8198s, "<this>");
        Intrinsics.checkNotNullParameter(requestManager, "requestManager");
        if (z) {
            String strM2907b = c8302e != null ? c8302e.m2907b() : null;
            if (strM2907b != null && !StringsKt__StringsJVMKt.isBlank(strM2907b)) {
                requestManager.load(c8302e != null ? c8302e.m2907b() : null).priority(Priority.HIGH).into(c8198s.f2235c);
            }
        } else {
            TypedValue typedValue = new TypedValue();
            c8198s.getRoot().getContext().getTheme().resolveAttribute(C11403R.attr.paylib_native_invoice_icon, typedValue, true);
            c8198s.f2235c.setImageResource(typedValue.resourceId);
        }
        TextView tvTitle = c8198s.f2239g;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        tvTitle.setVisibility(z2 ^ true ? 0 : 8);
        TextView tvAdditionalTitle = c8198s.f2237e;
        Intrinsics.checkNotNullExpressionValue(tvAdditionalTitle, "tvAdditionalTitle");
        tvAdditionalTitle.setVisibility(z2 ? 0 : 8);
        FrameLayout root = c8198s.f2236d.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "tvAdditionalInfo.root");
        root.setVisibility(z2 ? 0 : 8);
        TextView textView = z2 ? c8198s.f2237e : c8198s.f2239g;
        Intrinsics.checkNotNullExpressionValue(textView, "if (isAdditionalInfo) {\n…e {\n        tvTitle\n    }");
        if (z) {
            string = c8302e != null ? c8302e.m2912g() : null;
        } else {
            TypedValue typedValue2 = new TypedValue();
            c8198s.getRoot().getContext().getTheme().resolveAttribute(C11403R.attr.paylib_native_header_title, typedValue2, true);
            string = c8198s.getRoot().getContext().getString(typedValue2.resourceId);
        }
        textView.setText(string);
        c8198s.f2238f.setText(c8302e != null ? c8302e.m2913h() : null);
    }

    /* renamed from: a */
    public static final void m3469a(Function0 listener, View view) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.invoke();
    }
}
