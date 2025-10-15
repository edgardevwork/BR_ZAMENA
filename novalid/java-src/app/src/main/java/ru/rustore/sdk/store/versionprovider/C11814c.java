package ru.rustore.sdk.store.versionprovider;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import ru.p068vk.store.sdk.lib.storeversion.aidl.model.StoreVersionInfo;
import ru.rustore.sdk.core.util.ContextExtKt;
import ru.rustore.sdk.reactive.single.SingleEmitter;

/* renamed from: ru.rustore.sdk.store.versionprovider.c */
/* loaded from: classes8.dex */
public final class C11814c extends Lambda implements Function1<StoreVersionInfo, Unit> {

    /* renamed from: a */
    public final /* synthetic */ SingleEmitter<StoreVersionInfo> f11049a;

    /* renamed from: b */
    public final /* synthetic */ StoreVersionProvider f11050b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef<ServiceConnectionC11817f> f11051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11814c(SingleEmitter<StoreVersionInfo> singleEmitter, StoreVersionProvider storeVersionProvider, Ref.ObjectRef<ServiceConnectionC11817f> objectRef) {
        super(1);
        this.f11049a = singleEmitter;
        this.f11050b = storeVersionProvider;
        this.f11051c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(StoreVersionInfo storeVersionInfo) {
        StoreVersionInfo storeVersionInfo2 = storeVersionInfo;
        Intrinsics.checkNotNullParameter(storeVersionInfo2, "storeVersionInfo");
        this.f11049a.success(storeVersionInfo2);
        ContextExtKt.unbindServiceSafely(this.f11050b.context, this.f11051c.element);
        return Unit.INSTANCE;
    }
}
