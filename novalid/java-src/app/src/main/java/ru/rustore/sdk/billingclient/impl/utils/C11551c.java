package ru.rustore.sdk.billingclient.impl.utils;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.impl.utils.ReactiveExtensionsKt$singleFromSuspend$1$1$1", m7120f = "ReactiveExtensions.kt", m7121i = {}, m7122l = {48}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* renamed from: ru.rustore.sdk.billingclient.impl.utils.c */
/* loaded from: classes8.dex */
public final class C11551c extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {

    /* renamed from: a */
    public int f10599a;

    /* renamed from: b */
    public final /* synthetic */ Function1<Continuation<Object>, Object> f10600b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11551c(Function1<? super Continuation<Object>, ? extends Object> function1, Continuation<? super C11551c> continuation) {
        super(2, continuation);
        this.f10600b = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C11551c(this.f10600b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return new C11551c(this.f10600b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f10599a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function1<Continuation<Object>, Object> function1 = this.f10600b;
            this.f10599a = 1;
            obj = function1.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
