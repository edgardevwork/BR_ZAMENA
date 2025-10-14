package io.ktor.utils.p050io;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReadSession.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m7105d2 = {"Lio/ktor/utils/io/HasReadSession;", "", "endReadSession", "", "startReadSession", "Lio/ktor/utils/io/SuspendableReadSession;", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface HasReadSession {
    void endReadSession();

    @NotNull
    SuspendableReadSession startReadSession();
}
