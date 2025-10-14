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

