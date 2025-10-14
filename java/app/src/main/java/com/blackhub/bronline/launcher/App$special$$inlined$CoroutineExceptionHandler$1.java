package com.blackhub.bronline.launcher;

import com.blackhub.bronline.game.core.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineExceptionHandler.kt */
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 App.kt\ncom/blackhub/bronline/launcher/App\n*L\n1#1,110:1\n32#2,2:111\n*E\n"})
/* loaded from: classes7.dex */
public final class App$special$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public App$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Companion companion) {
        super(companion);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        UtilsKt.crashlyticsRecordNewException("App onCreate CoroutineExceptionHandler " + exception.getMessage());
    }
}

