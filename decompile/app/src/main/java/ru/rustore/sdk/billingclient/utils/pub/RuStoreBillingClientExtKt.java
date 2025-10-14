package ru.rustore.sdk.billingclient.utils.pub;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import ru.rustore.sdk.billingclient.RuStoreBillingClient;
import ru.rustore.sdk.billingclient.impl.analytics.C11405a;
import ru.rustore.sdk.billingclient.impl.analytics.C11411g;
import ru.rustore.sdk.billingclient.impl.analytics.C11413i;
import ru.rustore.sdk.billingclient.impl.domain.interactor.C11501a;
import ru.rustore.sdk.billingclient.impl.domain.interactor.C11502b;
import ru.rustore.sdk.billingclient.impl.p067di.C11497a;
import ru.rustore.sdk.billingclient.model.purchase.PurchaseAvailabilityResult;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.core.tasks.TaskHelper;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;

@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, m7105d2 = {"checkPurchasesAvailability", "Lru/rustore/sdk/core/tasks/Task;", "Lru/rustore/sdk/billingclient/model/purchase/PurchaseAvailabilityResult;", "Lru/rustore/sdk/billingclient/RuStoreBillingClient$Companion;", "sdk-public-billingclient_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class RuStoreBillingClientExtKt {

    @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "Lru/rustore/sdk/billingclient/model/purchase/PurchaseAvailabilityResult;"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.utils.pub.RuStoreBillingClientExtKt$checkPurchasesAvailability$1", m7120f = "RuStoreBillingClientExt.kt", m7121i = {0}, m7122l = {29}, m7123m = "invokeSuspend", m7124n = {"billingAnalytics"}, m7125s = {"L$0"})
    /* renamed from: ru.rustore.sdk.billingclient.utils.pub.RuStoreBillingClientExtKt$checkPurchasesAvailability$1 */
    /* loaded from: classes8.dex */
    public static final class C115671 extends SuspendLambda implements Function1<Continuation<? super PurchaseAvailabilityResult>, Object> {
        public Object L$0;
        public int label;

        public C115671(Continuation<? super C115671> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C115671(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C11405a c11405a;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Lazy<C11497a> lazy = C11497a.f10328u0;
                C11405a c11405a2 = (C11405a) C11497a.C11965b.m7463a().f10397w.getValue();
                C11502b c11502b = (C11502b) C11497a.C11965b.m7463a().f10350V.getValue();
                this.L$0 = c11405a2;
                this.label = 1;
                Object objWithContext = BuildersKt.withContext(c11502b.f10477d.mo7479a(), new C11501a(c11502b, null), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c11405a = c11405a2;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c11405a = (C11405a) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            PurchaseAvailabilityResult purchaseAvailabilityResult = (PurchaseAvailabilityResult) obj;
            if (purchaseAvailabilityResult instanceof PurchaseAvailabilityResult.Unavailable) {
                RuStoreException error = ((PurchaseAvailabilityResult.Unavailable) purchaseAvailabilityResult).getCause();
                c11405a.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                Map mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
                mapCreateMapBuilder.putAll((Map) c11405a.f10166g.getValue());
                mapCreateMapBuilder.put("error_name", error.getClass().getSimpleName());
                SingleSubscribeKt.subscribe$default(c11405a.f10160a.m7454a(new C11413i("payCheckPurchasesAvailability", MapsKt__MapsJVMKt.build(mapCreateMapBuilder)), c11405a.m7440a()), null, C11411g.f10175a, 1, null);
            }
            return purchaseAvailabilityResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super PurchaseAvailabilityResult> continuation) {
            return ((C115671) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Deprecated(message = "Данный метод работает только для флоу с авторизированным пользователем в RuStore")
    public static final Task<PurchaseAvailabilityResult> checkPurchasesAvailability(RuStoreBillingClient.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TaskHelper.wrap$default(TaskHelper.INSTANCE, null, new C115671(null), 1, null);
    }
}
