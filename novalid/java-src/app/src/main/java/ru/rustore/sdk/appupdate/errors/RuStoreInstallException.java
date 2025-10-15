package ru.rustore.sdk.appupdate.errors;

import kotlin.Metadata;
import ru.rustore.sdk.core.exception.RuStoreException;

@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lru/rustore/sdk/appupdate/errors/RuStoreInstallException;", "Lru/rustore/sdk/core/exception/RuStoreException;", "code", "", "(I)V", "getCode", "()I", "sdk-public-appupdate_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class RuStoreInstallException extends RuStoreException {
    private final int code;

    public RuStoreInstallException(int i) {
        super("app update error");
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
