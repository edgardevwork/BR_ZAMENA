package ru.rustore.sdk.reactive.observable;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.core.ErrorStubKt;

/* compiled from: ObservableSubscribe.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aP\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u0005¨\u0006\u000b"}, m7105d2 = {"subscribe", "Lru/rustore/sdk/reactive/core/Disposable;", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/reactive/observable/Observable;", "onError", "Lkotlin/Function1;", "", "", "onComplete", "Lkotlin/Function0;", "onNext", "sdk-public-reactive_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class ObservableSubscribeKt {

    /* compiled from: ObservableSubscribe.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* renamed from: ru.rustore.sdk.reactive.observable.ObservableSubscribeKt$subscribe$1 */
    /* loaded from: classes6.dex */
    public static final class C116541 extends Lambda implements Function0<Unit> {
        public static final C116541 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Disposable subscribe$default(Observable observable, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = ErrorStubKt.getErrorStub();
        }
        if ((i & 2) != 0) {
            function0 = C116541.INSTANCE;
        }
        return subscribe(observable, function1, function0, function12);
    }

    @NotNull
    public static final <T> Disposable subscribe(@NotNull Observable<T> observable, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete, @NotNull Function1<? super T, Unit> onNext) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        ObservableSubscribeObserver observableSubscribeObserver = new ObservableSubscribeObserver(onError, onComplete, onNext);
        observable.subscribe(observableSubscribeObserver);
        return observableSubscribeObserver;
    }
}
