package com.blackhub.bronline.launcher.p021di;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.resources.BitmapResourceImpl;
import com.blackhub.bronline.game.common.resources.StringResourceImpl;
import com.blackhub.bronline.game.core.resources.BitmapResource;
import com.blackhub.bronline.game.core.resources.StringResource;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ResourceModule.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/di/ResourceModule;", "", "()V", "provideBitmapResource", "Lcom/blackhub/bronline/game/core/resources/BitmapResource;", "context", "Landroid/content/Context;", "provideStringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@Module
/* loaded from: classes3.dex */
public final class ResourceModule {
    public static final int $stable = 0;

    @Provides
    @NotNull
    public final StringResource provideStringResource(@AppContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new StringResourceImpl().setupContext(context);
    }

    @Provides
    @NotNull
    public final BitmapResource provideBitmapResource(@AppContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new BitmapResourceImpl().setupContext(context);
    }
}
