package com.blackhub.bronline.launcher.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MainViewModelFactory.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MainViewModelFactory<VM extends ViewModel> implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final Provider<VM> viewModelProvider;

    @Inject
    public MainViewModelFactory(@NotNull Provider<VM> viewModelProvider) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.viewModelProvider = viewModelProvider;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        VM vm = this.viewModelProvider.get();
        Intrinsics.checkNotNull(vm, "null cannot be cast to non-null type T of com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory.create");
        return vm;
    }
}

