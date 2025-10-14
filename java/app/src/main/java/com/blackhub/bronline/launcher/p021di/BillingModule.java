package com.blackhub.bronline.launcher.p021di;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper;
import com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BiilingModule.kt */
@StabilityInferred(parameters = 1)
@Module
/* loaded from: classes3.dex */
public final class BillingModule {
    public static final int $stable = 0;

    @Provides
    @Singleton
    @NotNull
    public final BillingClientWrapper provideBillingClientWrapper(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new BillingClientWrapper(application);
    }

    @Provides
    @Singleton
    @NotNull
    public final RustoreBillingClientWrapper provideRustoreBillingClientWrapper(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new RustoreBillingClientWrapper(application);
    }
}

