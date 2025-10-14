package com.blackhub.bronline.game.core.viewmodel;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineExceptionHandler.kt */
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 JNIActivityViewModel.kt\ncom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel\n*L\n1#1,110:1\n125#2,2:111\n*E\n"})
/* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$special$$inlined$CoroutineExceptionHandler$1 */
/* loaded from: classes3.dex */
public final class C3559xd6cdf0c2 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public C3559xd6cdf0c2(CoroutineExceptionHandler.Companion companion) {
        super(companion);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        FirebaseCrashlytics.getInstance().recordException(exception);
    }
}

