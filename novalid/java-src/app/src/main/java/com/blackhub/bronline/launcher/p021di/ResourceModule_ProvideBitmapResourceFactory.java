package com.blackhub.bronline.launcher.p021di;

import android.content.Context;
import com.blackhub.bronline.game.core.resources.BitmapResource;
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
public final class ResourceModule_ProvideBitmapResourceFactory implements Factory<BitmapResource> {
    public final Provider<Context> contextProvider;
    public final ResourceModule module;

    public ResourceModule_ProvideBitmapResourceFactory(ResourceModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public BitmapResource get() {
        return provideBitmapResource(this.module, this.contextProvider.get());
    }

    public static ResourceModule_ProvideBitmapResourceFactory create(ResourceModule module, Provider<Context> contextProvider) {
        return new ResourceModule_ProvideBitmapResourceFactory(module, contextProvider);
    }

    public static BitmapResource provideBitmapResource(ResourceModule instance, Context context) {
        return (BitmapResource) Preconditions.checkNotNullFromProvides(instance.provideBitmapResource(context));
    }
}
