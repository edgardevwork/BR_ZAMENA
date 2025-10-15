package com.sdkit.paylib.paylibnative.p033ui.core.purchase.models;

import com.sdkit.paylib.paylibnative.p033ui.core.common.AbstractC8141f;
import com.sdkit.paylib.paylibnative.p033ui.core.common.C8137b;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.actions.InterfaceC8147a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.models.b */
/* loaded from: classes5.dex */
public final class C8164b extends AbstractC8141f implements InterfaceC8163a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8164b(InterfaceC8147a action, C8137b gmarktRequestWrapper) {
        super(action, gmarktRequestWrapper);
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(gmarktRequestWrapper, "gmarktRequestWrapper");
    }
}
