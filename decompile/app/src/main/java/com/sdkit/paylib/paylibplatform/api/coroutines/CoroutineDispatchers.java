package com.sdkit.paylib.paylibplatform.api.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005¨\u0006\u0011"}, m7105d2 = {"Lcom/sdkit/paylib/paylibplatform/api/coroutines/CoroutineDispatchers;", "", "default", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "io", "getIo", "sequentialWork", "getSequentialWork", "ui", "getUi", "uiImmediate", "getUiImmediate", "createSingleThreadDispatcher", "threadName", "", "com-sdkit-assistant_paylib_platform_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public interface CoroutineDispatchers {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static CoroutineDispatcher getDefault(CoroutineDispatchers coroutineDispatchers) {
            return Dispatchers.getDefault();
        }

        public static CoroutineDispatcher getIo(CoroutineDispatchers coroutineDispatchers) {
            return Dispatchers.getIO();
        }

        public static CoroutineDispatcher getUi(CoroutineDispatchers coroutineDispatchers) {
            return Dispatchers.getMain();
        }

        public static CoroutineDispatcher getUiImmediate(CoroutineDispatchers coroutineDispatchers) {
            return Dispatchers.getMain().getImmediate();
        }
    }

    CoroutineDispatcher createSingleThreadDispatcher(String threadName);

    CoroutineDispatcher getDefault();

    CoroutineDispatcher getIo();

    CoroutineDispatcher getSequentialWork();

    CoroutineDispatcher getUi();

    CoroutineDispatcher getUiImmediate();
}
