package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.cf */
/* loaded from: classes8.dex */
public final class C9456cf implements ProtobufStateStorage {

    /* renamed from: a */
    public final String f7845a;

    /* renamed from: b */
    public final IBinaryDataHelper f7846b;

    /* renamed from: c */
    public final ProtobufStateSerializer f7847c;

    /* renamed from: d */
    public final ProtobufConverter f7848d;

    public C9456cf(@NonNull String str, @NonNull IBinaryDataHelper iBinaryDataHelper, @NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f7845a = str;
        this.f7846b = iBinaryDataHelper;
        this.f7847c = protobufStateSerializer;
        this.f7848d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f7846b.remove(this.f7845a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    @NonNull
    public final Object read() {
        try {
            byte[] bArr = this.f7846b.get(this.f7845a);
            if (bArr != null && bArr.length != 0) {
                return this.f7848d.toModel((MessageNano) this.f7847c.toState(bArr));
            }
            return this.f7848d.toModel((MessageNano) this.f7847c.defaultValue());
        } catch (Throwable unused) {
            return this.f7848d.toModel((MessageNano) this.f7847c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(@NonNull Object obj) {
        this.f7846b.insert(this.f7845a, this.f7847c.toByteArray((MessageNano) this.f7848d.fromModel(obj)));
    }
}
