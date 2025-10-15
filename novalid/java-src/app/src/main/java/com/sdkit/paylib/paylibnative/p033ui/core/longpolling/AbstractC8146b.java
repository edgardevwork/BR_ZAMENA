package com.sdkit.paylib.paylibnative.p033ui.core.longpolling;

import java.util.List;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.longpolling.b */
/* loaded from: classes8.dex */
public abstract class AbstractC8146b {
    /* renamed from: a */
    public static final C8145a m2053a(String str) {
        String string;
        List listSplit$default;
        if (str == null || (string = StringsKt__StringsKt.trim((CharSequence) str).toString()) == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        if (listSplit$default.size() != 3) {
            listSplit$default = null;
        }
        if (listSplit$default == null) {
            return null;
        }
        try {
            return new C8145a(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) listSplit$default.get(0)).toString()), Long.parseLong(StringsKt__StringsKt.trim((CharSequence) listSplit$default.get(1)).toString()), Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) listSplit$default.get(2)).toString()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
