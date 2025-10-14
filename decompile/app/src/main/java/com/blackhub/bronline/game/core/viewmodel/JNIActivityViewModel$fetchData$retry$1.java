package com.blackhub.bronline.game.core.viewmodel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JNIActivityViewModel.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel", m7120f = "JNIActivityViewModel.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, m7122l = {997, 999, 1012, 1019}, m7123m = "fetchData$retry", m7124n = {"$backupApiCall", "$primaryApiCall", "$onSuccess", "this$0", "$onFailure", "$maxCountOfErrors", "$timeoutForRepeatRequest", "$maxCountOfErrorsReserve", "countOfErrors", "useBackupApi", "$backupApiCall", "$primaryApiCall", "$onSuccess", "this$0", "$onFailure", "$maxCountOfErrors", "$timeoutForRepeatRequest", "$maxCountOfErrorsReserve", "countOfErrors", "useBackupApi", "$backupApiCall", "$primaryApiCall", "$onSuccess", "this$0", "$onFailure", "response", "$maxCountOfErrors", "$timeoutForRepeatRequest", "$maxCountOfErrorsReserve", "countOfErrors", "useBackupApi", "$backupApiCall", "$primaryApiCall", "$onSuccess", "this$0", "$onFailure", "$maxCountOfErrors", "$timeoutForRepeatRequest", "$maxCountOfErrorsReserve", "useBackupApi", "updatedCountOfErrors"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "I$1", "I$2", "I$3"})
/* loaded from: classes2.dex */
public final class JNIActivityViewModel$fetchData$retry$1<T> extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;

    public JNIActivityViewModel$fetchData$retry$1(Continuation<? super JNIActivityViewModel$fetchData$retry$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return JNIActivityViewModel.fetchData$retry(0, 0, null, null, null, null, 0L, 0, null, 0, false, this);
    }
}
