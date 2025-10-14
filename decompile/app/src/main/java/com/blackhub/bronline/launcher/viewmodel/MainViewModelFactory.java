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
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0001\u0010\b*\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelProvider", "Ljavax/inject/Provider;", "(Ljavax/inject/Provider;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
