package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.y8 */
/* loaded from: classes7.dex */
public final class C9999y8 extends C10024z8 implements ProtobufStateSerializer {
    public C9999y8(@NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull AESEncrypter aESEncrypter) {
        super(protobufStateSerializer, aESEncrypter);
    }
}
