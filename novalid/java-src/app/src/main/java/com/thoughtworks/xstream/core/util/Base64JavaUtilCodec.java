package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.core.StringCodec;
import java.util.Base64;

/* loaded from: classes5.dex */
public class Base64JavaUtilCodec implements StringCodec {
    public final Base64.Decoder decoder;
    public final Base64.Encoder encoder;

    public Base64JavaUtilCodec() {
        this(Base64.getEncoder(), Base64.getMimeDecoder());
    }

    public Base64JavaUtilCodec(Base64.Encoder encoder, Base64.Decoder decoder) {
        this.encoder = encoder;
        this.decoder = decoder;
    }

    @Override // com.thoughtworks.xstream.core.StringCodec
    public byte[] decode(String str) {
        return this.decoder.decode(str);
    }

    @Override // com.thoughtworks.xstream.core.StringCodec
    public String encode(byte[] bArr) {
        return this.encoder.encodeToString(bArr);
    }
}
