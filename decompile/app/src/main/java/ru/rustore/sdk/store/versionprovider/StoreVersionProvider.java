package ru.rustore.sdk.store.versionprovider;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.p068vk.store.sdk.lib.storeversion.aidl.model.StoreVersionInfo;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;
import ru.rustore.sdk.core.util.CollectionExtKt;
import ru.rustore.sdk.core.util.ContextExtKt;
import ru.rustore.sdk.core.util.RuStoreUtils;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleEmitter;
import ru.rustore.sdk.reactive.single.SingleMapErrorKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0011"}, m7105d2 = {"Lru/rustore/sdk/store/versionprovider/StoreVersionProvider;", "", "Landroid/content/Context;", "context", SegmentConstantPool.INITSTRING, "(Landroid/content/Context;)V", "", "Lru/rustore/sdk/core/exception/RuStoreException;", "toRuStoreException", "(Ljava/lang/Throwable;)Lru/rustore/sdk/core/exception/RuStoreException;", "Lru/rustore/sdk/reactive/single/Single;", "Lru/vk/store/sdk/lib/storeversion/aidl/model/StoreVersionInfo;", "getStoreVersionInfo", "()Lru/rustore/sdk/reactive/single/Single;", "Landroid/content/Context;", "Companion", "a", "sdk-public-store-versionprovider_release"}, m7106k = 1, m7107mv = {1, 7, 0})
/* loaded from: classes5.dex */
public final class StoreVersionProvider {

    @Deprecated
    public static final String ACTION = "ru.vk.store.provider.StoreVersionProvider";
    public final Context context;

    /* renamed from: ru.rustore.sdk.store.versionprovider.StoreVersionProvider$b */
    /* loaded from: classes8.dex */
    public static final class C11810b extends Lambda implements Function1<SingleEmitter<StoreVersionInfo>, Unit> {
        public C11810b() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [T, ru.rustore.sdk.store.versionprovider.f] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SingleEmitter<StoreVersionInfo> singleEmitter) {
            Object objM15699constructorimpl;
            Throwable thM15702exceptionOrNullimpl;
            SingleEmitter<StoreVersionInfo> emitter = singleEmitter;
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            Intent intent = new Intent(StoreVersionProvider.ACTION);
            if (RuStoreUtils.INSTANCE.isRuStoreInstalled(StoreVersionProvider.this.context)) {
                List<ResolveInfo> listQueryIntentServices = StoreVersionProvider.this.context.getPackageManager().queryIntentServices(intent, 0);
                Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "context.packageManager.q…IntentServices(intent, 0)");
                ComponentName componentNameFindRuStoreServiceComponentName = CollectionExtKt.findRuStoreServiceComponentName(listQueryIntentServices);
                if (componentNameFindRuStoreServiceComponentName != null) {
                    intent.setComponent(componentNameFindRuStoreServiceComponentName);
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = new ServiceConnectionC11817f(new C11813b(), new C11814c(emitter, StoreVersionProvider.this, objectRef), new C11815d(emitter, StoreVersionProvider.this, objectRef));
                    StoreVersionProvider storeVersionProvider = StoreVersionProvider.this;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        objM15699constructorimpl = Result.m15699constructorimpl(Boolean.valueOf(storeVersionProvider.context.bindService(intent, (ServiceConnection) objectRef.element, 1)));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                    }
                    StoreVersionProvider storeVersionProvider2 = StoreVersionProvider.this;
                    thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
                    if (thM15702exceptionOrNullimpl != null) {
                        ContextExtKt.unbindServiceSafely(storeVersionProvider2.context, (ServiceConnection) objectRef.element);
                    }
                    return Unit.INSTANCE;
                }
                thM15702exceptionOrNullimpl = new RuStoreOutdatedException();
            } else {
                thM15702exceptionOrNullimpl = new RuStoreNotInstalledException();
            }
            emitter.error(thM15702exceptionOrNullimpl);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ru.rustore.sdk.store.versionprovider.StoreVersionProvider$c */
    /* loaded from: classes8.dex */
    public static final class C11811c extends Lambda implements Function1<Throwable, Throwable> {
        public C11811c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Throwable invoke(Throwable th) {
            Throwable error = th;
            Intrinsics.checkNotNullParameter(error, "error");
            return StoreVersionProvider.this.toRuStoreException(error);
        }
    }

    public StoreVersionProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Single<StoreVersionInfo> getStoreVersionInfo() {
        return SingleSubscribeOnKt.subscribeOn(SingleMapErrorKt.mapError(Single.INSTANCE.create(new C11810b()), new C11811c()), Dispatchers.INSTANCE.getIo());
    }

    public final RuStoreException toRuStoreException(Throwable th) {
        if (th instanceof RuStoreException) {
            return (RuStoreException) th;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        return new RuStoreException(message, th);
    }
}
