package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.AppGlideModule;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
abstract class GeneratedAppGlideModule extends AppGlideModule {
    @Nullable
    public RequestManagerRetriever.RequestManagerFactory getRequestManagerFactory() {
        return null;
    }

    @NonNull
    public Set<Class<?>> getExcludedModuleClasses() {
        return new HashSet();
    }
}
