package com.sdkit.paylib.paylibnative.p033ui.widgets.card;

import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.b */
/* loaded from: classes6.dex */
public final class C8385b {

    /* renamed from: a */
    public final AbstractC8128b f3723a;

    public C8385b(AbstractC8128b actionStyle) {
        Intrinsics.checkNotNullParameter(actionStyle, "actionStyle");
        this.f3723a = actionStyle;
    }

    /* renamed from: a */
    public final AbstractC8128b m3513a() {
        return this.f3723a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8385b) && Intrinsics.areEqual(this.f3723a, ((C8385b) obj).f3723a);
    }

    public int hashCode() {
        return this.f3723a.hashCode();
    }

    public String toString() {
        return "CardPayState(actionStyle=" + this.f3723a + ')';
    }
}
