package dagger.internal;

import dagger.Lazy;

/* loaded from: classes8.dex */
public final class ProviderOfLazy<T> implements Provider<Lazy<T>> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public final Provider<T> provider;

    public ProviderOfLazy(Provider<T> provider) {
        this.provider = provider;
    }

    @Override // javax.inject.Provider
    public Lazy<T> get() {
        return DoubleCheck.lazy(this.provider);
    }

    public static <T> Provider<Lazy<T>> create(Provider<T> provider) {
        return new ProviderOfLazy((Provider) Preconditions.checkNotNull(provider));
    }

    @Deprecated
    public static <T> Provider<Lazy<T>> create(javax.inject.Provider<T> provider) {
        return create(Providers.asDaggerProvider(provider));
    }
}
