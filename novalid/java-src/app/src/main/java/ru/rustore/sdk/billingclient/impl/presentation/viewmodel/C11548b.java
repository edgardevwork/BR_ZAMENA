package ru.rustore.sdk.billingclient.impl.presentation.viewmodel;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.coreui.DialogState;

@Deprecated(message = "RUSTORE-39764 Удалить вместе с resolveForBilling")
/* renamed from: ru.rustore.sdk.billingclient.impl.presentation.viewmodel.b */
/* loaded from: classes7.dex */
public final class C11548b implements DialogState {

    /* renamed from: a */
    public final EnumC11547a f10594a;

    /* renamed from: b */
    public final Integer f10595b;

    /* renamed from: c */
    public final Integer f10596c;

    /* renamed from: d */
    public final int f10597d;

    /* renamed from: e */
    public final int f10598e;

    public C11548b(EnumC11547a error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f10594a = error;
        this.f10595b = error.f10592c;
        this.f10596c = error.f10593d;
        this.f10597d = error.f10591b;
        this.f10598e = error.f10590a;
    }

    @Override // ru.rustore.sdk.coreui.DialogState
    public final Integer getCancelButtonTextRes() {
        return this.f10595b;
    }

    @Override // ru.rustore.sdk.coreui.DialogState
    public final Integer getConfirmButtonTextRes() {
        return this.f10596c;
    }

    @Override // ru.rustore.sdk.coreui.DialogState
    public final int getMessageRes() {
        return this.f10597d;
    }

    @Override // ru.rustore.sdk.coreui.DialogState
    public final int getTitleRes() {
        return this.f10598e;
    }
}
