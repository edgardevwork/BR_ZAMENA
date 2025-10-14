package com.blackhub.bronline.launcher.p021di;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Room;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.core.preferences.PreferencesRepositoryImpl;
import com.blackhub.bronline.launcher.database.LauncherDatabase;
import com.blackhub.bronline.launcher.database.PurchaseDatabase;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DatabaseModule.kt */
@StabilityInferred(parameters = 1)
@Module
/* loaded from: classes3.dex */
public final class DatabaseModule {
    public static final int $stable = 0;

    @Provides
    @NotNull
    public final LauncherDatabase provideLauncherDatabase(@AppContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (LauncherDatabase) Room.databaseBuilder(context, LauncherDatabase.class, "myFiles").fallbackToDestructiveMigration().build();
    }

    @Provides
    @NotNull
    public final PurchaseDatabase providePurchaseDatabase(@AppContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (PurchaseDatabase) Room.databaseBuilder(context, PurchaseDatabase.class, "BillingPurchases").fallbackToDestructiveMigration().build();
    }

    @Provides
    @NotNull
    public final PreferencesRepository providePreferencesRepository(@AppContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new PreferencesRepositoryImpl(context);
    }
}

