package ru.rustore.sdk.reactive.subject;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.observable.Observable;

/* compiled from: MutableStateSubject.kt */
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0005\u001a\u00028\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004¨\u0006\u0018"}, m7105d2 = {"Lru/rustore/sdk/reactive/subject/MutableStateSubject;", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/reactive/subject/StateSubject;", "initialValue", "(Ljava/lang/Object;)V", "_value", "Ljava/lang/Object;", "monitor", "", "mutableSubject", "Lru/rustore/sdk/reactive/subject/MutableSubject;", "value", "getValue", "()Ljava/lang/Object;", "setValue", "emit", "", "item", "observe", "Lru/rustore/sdk/reactive/observable/Observable;", "backpressureStrategy", "Lru/rustore/sdk/reactive/backpressure/BackpressureStrategy;", "updateState", "newValue", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class MutableStateSubject<T> implements StateSubject<T> {
    public volatile T _value;

    @NotNull
    public final Object monitor = new Object();

    @NotNull
    public final MutableSubject<T> mutableSubject;

    public MutableStateSubject(T t) {
        MutableSubject<T> mutableSubject = new MutableSubject<>(1, 0, 2, null);
        this.mutableSubject = mutableSubject;
        this._value = t;
        mutableSubject.emit(t);
    }

    @Override // ru.rustore.sdk.reactive.subject.StateSubject
    public T getValue() {
        return this._value;
    }

    public void setValue(T t) {
        updateState(t);
    }

    @Override // ru.rustore.sdk.reactive.subject.Subject
    @NotNull
    public Observable<T> observe(@NotNull BackpressureStrategy backpressureStrategy) {
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        return this.mutableSubject.observe(backpressureStrategy);
    }

    public final void emit(T item) {
        updateState(item);
    }

    public final void updateState(T newValue) {
        synchronized (this.monitor) {
            try {
                if (!Intrinsics.areEqual(newValue, this._value)) {
                    this._value = newValue;
                    this.mutableSubject.emit(newValue);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
