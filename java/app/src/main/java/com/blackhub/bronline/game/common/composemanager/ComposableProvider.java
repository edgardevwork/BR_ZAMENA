package com.blackhub.bronline.game.common.composemanager;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: ComposableProvider.kt */
/* loaded from: classes.dex */
public interface ComposableProvider {
    @Composable
    void ProvideComposableContent(@Nullable Composer composer, int i);
}

