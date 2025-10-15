package com.blackhub.bronline.game.common.composemanager;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: ComposableProvider.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\r\u0010\u0002\u001a\u00020\u0003H'¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/composemanager/ComposableProvider;", "", "ProvideComposableContent", "", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public interface ComposableProvider {
    @Composable
    void ProvideComposableContent(@Nullable Composer composer, int i);
}
