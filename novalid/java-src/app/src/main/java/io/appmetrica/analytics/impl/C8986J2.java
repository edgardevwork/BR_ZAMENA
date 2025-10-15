package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.J2 */
/* loaded from: classes6.dex */
public class C8986J2 implements ExternalAttribution {

    /* renamed from: a */
    public final C10000y9 f6804a;

    public C8986J2(@NotNull C10000y9 c10000y9) {
        this.f6804a = c10000y9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    @NotNull
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f6804a);
    }

    @NotNull
    public final String toString() {
        return "ExternalAttribution(type=`" + AbstractC8969I9.m5265a(this.f6804a.f9361a) + "`value=`" + new String(this.f6804a.f9362b, Charsets.UTF_8) + "`)";
    }
}
