package dagger.internal;

/* loaded from: classes7.dex */
public final class DelegateFactory<T> implements Factory<T> {
    public Provider<T> delegate;

    @Override // javax.inject.Provider
    public T get() {
        Provider<T> provider = this.delegate;
        if (provider == null) {
            throw new IllegalStateException();
        }
        return provider.get();
    }

    @Deprecated
    public void setDelegatedProvider(Provider<T> provider) {
        setDelegate((Provider) this, (Provider) provider);
    }

    @Deprecated
    public void setDelegatedProvider(javax.inject.Provider<T> provider) {
        setDelegatedProvider((Provider) Providers.asDaggerProvider(provider));
    }

    public static <T> void setDelegate(Provider<T> provider, Provider<T> provider2) {
        setDelegateInternal((DelegateFactory) provider, provider2);
    }

    @Deprecated
    public static <T> void setDelegate(javax.inject.Provider<T> provider, javax.inject.Provider<T> provider2) {
        setDelegateInternal((DelegateFactory) provider, Providers.asDaggerProvider(provider2));
    }

    public static <T> void setDelegateInternal(DelegateFactory<T> delegateFactory, Provider<T> provider) {
        Preconditions.checkNotNull(provider);
        if (delegateFactory.delegate != null) {
            throw new IllegalStateException();
        }
        delegateFactory.delegate = provider;
    }

    public Provider<T> getDelegate() {
        return (Provider) Preconditions.checkNotNull(this.delegate);
    }
}
