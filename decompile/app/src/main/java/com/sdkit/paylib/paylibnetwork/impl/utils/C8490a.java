package com.sdkit.paylib.paylibnetwork.impl.utils;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.utils.a */
/* loaded from: classes6.dex */
public final class C8490a implements Callback {

    /* renamed from: a */
    public final /* synthetic */ CancellableContinuation f4207a;

    public C8490a(CancellableContinuation cancellableContinuation) {
        this.f4207a = cancellableContinuation;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        if (call.getCanceled()) {
            return;
        }
        CancellableContinuation cancellableContinuation = this.f4207a;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(e)));
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        CancellableContinuation cancellableContinuation = this.f4207a;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m15699constructorimpl(response));
    }
}
