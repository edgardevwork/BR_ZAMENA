package com.sdkit.paylib.paylibnative.p033ui.utils.viewmodels;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.viewmodels.b */
/* loaded from: classes6.dex */
public final class C8378b implements ViewModelProvider.Factory {

    /* renamed from: a */
    public final Provider f3689a;

    public C8378b(Provider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f3689a = provider;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        ViewModel viewModel = (ViewModel) this.f3689a.get();
        ViewModel viewModel2 = viewModel == null ? null : viewModel;
        if (viewModel2 != null) {
            return viewModel2;
        }
        throw new IllegalStateException(("Фабрика [" + Reflection.getOrCreateKotlinClass(C8378b.class).getQualifiedName() + "] умеет создавать только вью-модели [" + Reflection.getOrCreateKotlinClass(viewModel.getClass()).getSimpleName() + "] и не умеет производить [" + modelClass.getSimpleName() + "].").toString());
    }
}
