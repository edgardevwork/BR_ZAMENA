package com.blackhub.bronline.game.gui.inventory.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CarTrunkOrClosetViewModelFactory.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CarTrunkOrClosetViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 0;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new CarTrunkOrClosetViewModel();
    }
}

