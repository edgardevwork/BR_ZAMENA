package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.annotations.NonNull;
import org.reactivestreams.Subscription;

/* loaded from: classes6.dex */
public final class SubscriptionDisposable extends ReferenceDisposable<Subscription> {
    public static final long serialVersionUID = -707001650852963139L;

    public SubscriptionDisposable(Subscription value) {
        super(value);
    }

    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    public void onDisposed(@NonNull Subscription value) {
        value.cancel();
    }
}
