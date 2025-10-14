package ru.rustore.sdk.store.versionprovider;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import ru.p068vk.store.sdk.lib.storeversion.aidl.model.StoreVersionInfo;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.util.ContextExtKt;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* renamed from: ru.rustore.sdk.store.versionprovider.d */
/* loaded from: classes8.dex */
public final class C11815d extends Lambda implements Function1<RuStoreException, Unit> {

    /* renamed from: a */
    public final /* synthetic */ SingleEmitter<StoreVersionInfo> f11052a;

    /* renamed from: b */
    public final /* synthetic */ StoreVersionProvider f11053b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef<ServiceConnectionC11817f> f11054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11815d(SingleEmitter<StoreVersionInfo> singleEmitter, StoreVersionProvider storeVersionProvider, Ref.ObjectRef<ServiceConnectionC11817f> objectRef) {
        super(1);
        this.f11052a = singleEmitter;
        this.f11053b = storeVersionProvider;
        this.f11054c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RuStoreException ruStoreException) {
        RuStoreException exception = ruStoreException;
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f11052a.error(exception);
        ContextExtKt.unbindServiceSafely(this.f11053b.context, this.f11054c.element);
        return Unit.INSTANCE;
    }
}
