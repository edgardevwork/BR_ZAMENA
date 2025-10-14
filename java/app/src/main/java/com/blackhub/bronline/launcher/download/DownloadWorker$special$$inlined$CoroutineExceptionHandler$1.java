package com.blackhub.bronline.launcher.download;

import android.util.Log;
import android.widget.Toast;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineExceptionHandler.kt */
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker\n*L\n1#1,110:1\n106#2,6:111\n*E\n"})
/* loaded from: classes7.dex */
public final class DownloadWorker$special$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public final /* synthetic */ DownloadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Companion companion, DownloadWorker downloadWorker) {
        super(companion);
        this.this$0 = downloadWorker;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        Toast.makeText(this.this$0.context, "Ошибка " + exception, 1).show();
        exception.printStackTrace();
        Log.e("DOWNLOAD_WORKER", "coroutineContext " + context + " " + Unit.INSTANCE);
    }
}

