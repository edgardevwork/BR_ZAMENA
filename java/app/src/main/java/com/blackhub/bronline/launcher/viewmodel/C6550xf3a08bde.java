package com.blackhub.bronline.launcher.viewmodel;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineExceptionHandler.kt */
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 MainActivityViewModel.kt\ncom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel\n*L\n1#1,110:1\n218#2,3:111\n*E\n"})
/* renamed from: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkUpdate$$inlined$CoroutineExceptionHandler$1 */
/* loaded from: classes7.dex */
public final class C6550xf3a08bde extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6550xf3a08bde(CoroutineExceptionHandler.Companion companion, MainActivityViewModel mainActivityViewModel) {
        super(companion);
        this.this$0 = mainActivityViewModel;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        this.this$0.mutableOnErrorResponse.postValue(exception.getMessage());
        FirebaseCrashlytics.getInstance().recordException(exception);
    }
}

