package com.blackhub.bronline.launcher.p021di;

import android.content.Context;
import com.blackhub.bronline.launcher.database.PurchaseDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.blackhub.bronline.launcher.di.AppContext"})
/* loaded from: classes7.dex */
public final class DatabaseModule_ProvidePurchaseDatabaseFactory implements Factory<PurchaseDatabase> {
    public final Provider<Context> contextProvider;
    public final DatabaseModule module;

    public DatabaseModule_ProvidePurchaseDatabaseFactory(DatabaseModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PurchaseDatabase get() {
        return providePurchaseDatabase(this.module, this.contextProvider.get());
    }

    public static DatabaseModule_ProvidePurchaseDatabaseFactory create(DatabaseModule module, Provider<Context> contextProvider) {
        return new DatabaseModule_ProvidePurchaseDatabaseFactory(module, contextProvider);
    }

    public static PurchaseDatabase providePurchaseDatabase(DatabaseModule instance, Context context) {
        return (PurchaseDatabase) Preconditions.checkNotNullFromProvides(instance.providePurchaseDatabase(context));
    }
}
