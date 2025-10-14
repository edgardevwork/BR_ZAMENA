package ru.rustore.sdk.review;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.activitylauncher.ActivityLauncherResult;
import ru.rustore.sdk.activitylauncher.ContextExtensionKt;
import ru.rustore.sdk.activitylauncher.OnReceiveResultCallback;
import ru.rustore.sdk.reactive.single.SingleEmitter;
import ru.rustore.sdk.review.errors.RuStoreReviewStartException;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: ru.rustore.sdk.review.u */
/* loaded from: classes8.dex */
public final class C11802u extends Lambda implements Function1<SingleEmitter<Unit>, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11805x f11036a;

    /* renamed from: b */
    public final /* synthetic */ ReviewInfo f11037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11802u(C11805x c11805x, ReviewInfo reviewInfo) {
        super(1);
        this.f11036a = c11805x;
        this.f11037b = reviewInfo;
    }

    /* renamed from: a */
    public final void m7556a(final SingleEmitter<Unit> emitter) {
        Object objM15699constructorimpl;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        C11805x c11805x = this.f11036a;
        ReviewInfo reviewInfo = this.f11037b;
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = c11805x.f11042a;
            Intent intent = new Intent("ru.vk.store.RequestAppReview");
            intent.putExtra("KEY_APPLICATION_ID", c11805x.f11043b);
            intent.putExtras(reviewInfo.toBundle$sdk_public_review_release());
            ContextExtensionKt.openActivityForResult(context, intent, new OnReceiveResultCallback() { // from class: ru.rustore.sdk.review.u$$ExternalSyntheticLambda0
                @Override // ru.rustore.sdk.activitylauncher.OnReceiveResultCallback
                public final void onReceiveResult(ActivityLauncherResult activityLauncherResult, Bundle bundle) {
                    C11802u.m7555a(emitter, activityLauncherResult, bundle);
                }
            });
            objM15699constructorimpl = Result.m15699constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
        if (thM15702exceptionOrNullimpl != null) {
            emitter.error(thM15702exceptionOrNullimpl);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(SingleEmitter<Unit> singleEmitter) {
        m7556a(singleEmitter);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public static final void m7555a(SingleEmitter emitter, ActivityLauncherResult launcherResult, Bundle bundle) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(launcherResult, "launcherResult");
        if (launcherResult instanceof ActivityLauncherResult.ActivityResultUnknown ? true : Intrinsics.areEqual(launcherResult, ActivityLauncherResult.ActivitySendIntentError.INSTANCE) ? true : Intrinsics.areEqual(launcherResult, ActivityLauncherResult.ActivityUnknownError.INSTANCE) ? true : Intrinsics.areEqual(launcherResult, ActivityLauncherResult.ActivityNotFound.INSTANCE)) {
            emitter.error(new RuStoreReviewStartException());
            return;
        }
        if (Intrinsics.areEqual(launcherResult, ActivityLauncherResult.ActivityResultCanceled.INSTANCE) ? true : Intrinsics.areEqual(launcherResult, ActivityLauncherResult.ActivityResultOk.INSTANCE)) {
            emitter.success(Unit.INSTANCE);
        }
    }
}
