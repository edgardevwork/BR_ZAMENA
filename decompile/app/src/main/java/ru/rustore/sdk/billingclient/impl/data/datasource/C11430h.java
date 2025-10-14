package ru.rustore.sdk.billingclient.impl.data.datasource;

import com.sdkit.paylib.paylibdomain.api.products.ProductsInteractor;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.Product;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.impl.data.datasource.ProductsDataSource$get$1", m7120f = "ProductsDataSource.kt", m7121i = {}, m7122l = {18}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* renamed from: ru.rustore.sdk.billingclient.impl.data.datasource.h */
/* loaded from: classes8.dex */
public final class C11430h extends SuspendLambda implements Function1<Continuation<? super List<? extends Product>>, Object> {

    /* renamed from: a */
    public int f10217a;

    /* renamed from: b */
    public final /* synthetic */ C11431i f10218b;

    /* renamed from: c */
    public final /* synthetic */ List<String> f10219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11430h(C11431i c11431i, List<String> list, Continuation<? super C11430h> continuation) {
        super(1, continuation);
        this.f10218b = c11431i;
        this.f10219c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new C11430h(this.f10218b, this.f10219c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super List<? extends Product>> continuation) {
        return new C11430h(this.f10218b, this.f10219c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objMo15371getProductsgIAlus;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f10217a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProductsInteractor productsInteractor = this.f10218b.f10220a;
            List<String> list = this.f10219c;
            this.f10217a = 1;
            objMo15371getProductsgIAlus = productsInteractor.mo15371getProductsgIAlus(list, this);
            if (objMo15371getProductsgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo15371getProductsgIAlus = ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(objMo15371getProductsgIAlus);
        return objMo15371getProductsgIAlus;
    }
}
