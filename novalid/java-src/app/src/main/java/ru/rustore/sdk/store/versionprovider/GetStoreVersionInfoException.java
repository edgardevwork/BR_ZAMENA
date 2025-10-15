package ru.rustore.sdk.store.versionprovider;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.core.exception.RuStoreException;

@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m7105d2 = {"Lru/rustore/sdk/store/versionprovider/GetStoreVersionInfoException;", "Lru/rustore/sdk/core/exception/RuStoreException;", "errorMessage", "", "(Ljava/lang/String;)V", "sdk-public-store-versionprovider_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class GetStoreVersionInfoException extends RuStoreException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStoreVersionInfoException(String errorMessage) {
        super(errorMessage);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
