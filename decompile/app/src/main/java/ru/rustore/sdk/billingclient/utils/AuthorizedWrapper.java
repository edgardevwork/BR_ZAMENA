package ru.rustore.sdk.billingclient.utils;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.billingclient.impl.data.repository.C11487o;
import ru.rustore.sdk.billingclient.impl.domain.interactor.C11503c;
import ru.rustore.sdk.billingclient.impl.domain.model.C11510g;
import ru.rustore.sdk.billingclient.impl.domain.model.C11513j;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11526m;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11529p;
import ru.rustore.sdk.billingclient.impl.p067di.C11497a;
import ru.rustore.sdk.core.util.RuStoreUtils;

@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H\u0086@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m7105d2 = {"Lru/rustore/sdk/billingclient/utils/AuthorizedWrapper;", "", SegmentConstantPool.INITSTRING, "()V", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "doOnSuccess", "runAuthorized", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/rustore/sdk/billingclient/impl/domain/usecase/m;", "getGetWebPayTokenUseCase", "()Lru/rustore/sdk/billingclient/impl/domain/usecase/m;", "getWebPayTokenUseCase", "Lru/rustore/sdk/billingclient/impl/domain/usecase/p;", "getUpdateRustoreAuthorizationInfoUseCase", "()Lru/rustore/sdk/billingclient/impl/domain/usecase/p;", "updateRustoreAuthorizationInfoUseCase", "Lru/rustore/sdk/billingclient/impl/domain/interactor/c;", "getUpdateWebAuthorizationInfoInteractor", "()Lru/rustore/sdk/billingclient/impl/domain/interactor/c;", "updateWebAuthorizationInfoInteractor", "Lru/rustore/sdk/billingclient/impl/data/repository/o;", "getRuStoreUserIdRepository", "()Lru/rustore/sdk/billingclient/impl/data/repository/o;", "ruStoreUserIdRepository", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "applicationContext", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0})
/* loaded from: classes7.dex */
public final class AuthorizedWrapper {
    public static final AuthorizedWrapper INSTANCE = new AuthorizedWrapper();

    @Metadata(m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.utils.AuthorizedWrapper", m7120f = "AuthorizedWrapper.kt", m7121i = {0, 0, 0, 1, 3}, m7122l = {30, 34, 38, 42, 43, 47}, m7123m = "runAuthorized", m7124n = {"this", "doOnSuccess", "webPayToken", "doOnSuccess", "doOnSuccess"}, m7125s = {"L$0", "L$1", "L$2", "L$0", "L$0"})
    /* renamed from: ru.rustore.sdk.billingclient.utils.AuthorizedWrapper$runAuthorized$1 */
    /* loaded from: classes5.dex */
    public static final class C115651<T> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C115651(Continuation<? super C115651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthorizedWrapper.this.runAuthorized(null, this);
        }
    }

    public final Context getApplicationContext() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        WeakReference<Context> weakReference = C11497a.C11965b.m7463a().f10371i;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final C11526m getGetWebPayTokenUseCase() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        return (C11526m) C11497a.C11965b.m7463a().f10346R.getValue();
    }

    public final C11487o getRuStoreUserIdRepository() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        return (C11487o) C11497a.C11965b.m7463a().f10342N.getValue();
    }

    public final C11529p getUpdateRustoreAuthorizationInfoUseCase() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        return (C11529p) C11497a.C11965b.m7463a().f10396v.getValue();
    }

    public final C11503c getUpdateWebAuthorizationInfoInteractor() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        return (C11503c) C11497a.C11965b.m7463a().f10348T.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4 A[PHI: r11
  0x00e4: PHI (r11v21 java.lang.Object) = (r11v20 java.lang.Object), (r11v1 java.lang.Object) binds: [B:42:0x00e1, B:15:0x0040] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107 A[PHI: r11
  0x0107: PHI (r11v24 java.lang.Object) = (r11v23 java.lang.Object), (r11v1 java.lang.Object) binds: [B:50:0x0104, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object runAuthorized(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        C115651 c115651;
        C11513j c11513jM7471a;
        AuthorizedWrapper authorizedWrapper;
        Object objM7457a;
        Function1<? super Continuation<? super T>, ? extends Object> function12;
        C11513j c11513j;
        Object objM15699constructorimpl;
        if (continuation instanceof C115651) {
            c115651 = (C115651) continuation;
            int i = c115651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c115651.label = i - Integer.MIN_VALUE;
            } else {
                c115651 = new C115651(continuation);
            }
        }
        Object objInvoke = c115651.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c115651.label) {
            case 0:
                ResultKt.throwOnFailure(objInvoke);
                c11513jM7471a = getGetWebPayTokenUseCase().m7471a();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    C11487o ruStoreUserIdRepository = getRuStoreUserIdRepository();
                    c115651.L$0 = this;
                    c115651.L$1 = function1;
                    c115651.L$2 = c11513jM7471a;
                    c115651.label = 1;
                    objM7457a = ruStoreUserIdRepository.m7457a(c115651);
                } catch (Throwable th) {
                    th = th;
                    authorizedWrapper = this;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                    if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
                    }
                    C11510g c11510g = (C11510g) objM15699constructorimpl;
                    if (!RuStoreUtils.INSTANCE.isRuStoreInstalled(authorizedWrapper.getApplicationContext())) {
                    }
                    if (c11513jM7471a == null) {
                    }
                }
                if (objM7457a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                authorizedWrapper = this;
                function12 = function1;
                c11513j = c11513jM7471a;
                objInvoke = objM7457a;
                Object objM15699constructorimpl2 = Result.m15699constructorimpl((C11510g) objInvoke);
                c11513jM7471a = c11513j;
                function1 = function12;
                objM15699constructorimpl = objM15699constructorimpl2;
                if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
                    objM15699constructorimpl = null;
                }
                C11510g c11510g2 = (C11510g) objM15699constructorimpl;
                if (!RuStoreUtils.INSTANCE.isRuStoreInstalled(authorizedWrapper.getApplicationContext()) && c11510g2 != null) {
                    C11529p updateRustoreAuthorizationInfoUseCase = authorizedWrapper.getUpdateRustoreAuthorizationInfoUseCase();
                    String packageName = authorizedWrapper.getApplicationContext().getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "applicationContext.packageName");
                    c115651.L$0 = function1;
                    c115651.L$1 = null;
                    c115651.L$2 = null;
                    c115651.label = 2;
                    if (updateRustoreAuthorizationInfoUseCase.m7472a(true, packageName, c115651) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c115651.L$0 = null;
                    c115651.label = 3;
                    objInvoke = function1.invoke(c115651);
                    return objInvoke != coroutine_suspended ? coroutine_suspended : objInvoke;
                }
                if (c11513jM7471a == null) {
                    c115651.L$0 = null;
                    c115651.L$1 = null;
                    c115651.L$2 = null;
                    c115651.label = 6;
                    objInvoke = function1.invoke(c115651);
                    return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
                }
                C11503c updateWebAuthorizationInfoInteractor = authorizedWrapper.getUpdateWebAuthorizationInfoInteractor();
                c115651.L$0 = function1;
                c115651.L$1 = null;
                c115651.L$2 = null;
                c115651.label = 4;
                if (updateWebAuthorizationInfoInteractor.m7465a(c115651) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c115651.L$0 = null;
                c115651.label = 5;
                objInvoke = function1.invoke(c115651);
                return objInvoke != coroutine_suspended ? coroutine_suspended : objInvoke;
            case 1:
                c11513j = (C11513j) c115651.L$2;
                function12 = (Function1) c115651.L$1;
                authorizedWrapper = (AuthorizedWrapper) c115651.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    Object objM15699constructorimpl22 = Result.m15699constructorimpl((C11510g) objInvoke);
                    c11513jM7471a = c11513j;
                    function1 = function12;
                    objM15699constructorimpl = objM15699constructorimpl22;
                } catch (Throwable th2) {
                    c11513jM7471a = c11513j;
                    function1 = function12;
                    th = th2;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                    if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
                    }
                    C11510g c11510g22 = (C11510g) objM15699constructorimpl;
                    if (!RuStoreUtils.INSTANCE.isRuStoreInstalled(authorizedWrapper.getApplicationContext())) {
                    }
                    if (c11513jM7471a == null) {
                    }
                }
                if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
                }
                C11510g c11510g222 = (C11510g) objM15699constructorimpl;
                if (!RuStoreUtils.INSTANCE.isRuStoreInstalled(authorizedWrapper.getApplicationContext())) {
                }
                if (c11513jM7471a == null) {
                }
                break;
            case 2:
                function1 = (Function1) c115651.L$0;
                ResultKt.throwOnFailure(objInvoke);
                c115651.L$0 = null;
                c115651.label = 3;
                objInvoke = function1.invoke(c115651);
                if (objInvoke != coroutine_suspended) {
                }
                break;
            case 3:
                ResultKt.throwOnFailure(objInvoke);
            case 4:
                function1 = (Function1) c115651.L$0;
                ResultKt.throwOnFailure(objInvoke);
                c115651.L$0 = null;
                c115651.label = 5;
                objInvoke = function1.invoke(c115651);
                if (objInvoke != coroutine_suspended) {
                }
                break;
            case 5:
                ResultKt.throwOnFailure(objInvoke);
            case 6:
                ResultKt.throwOnFailure(objInvoke);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
