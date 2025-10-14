package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.core.StringCodec;
import javax.xml.bind.DatatypeConverter;

/* loaded from: classes5.dex */
public class Base64JAXBCodec implements StringCodec {
    @Override // com.thoughtworks.xstream.core.StringCodec
    public byte[] decode(String str) {
        return DatatypeConverter.parseBase64Binary(str);
    }

    @Override // com.thoughtworks.xstream.core.StringCodec
    public String encode(byte[] bArr) {
        return DatatypeConverter.printBase64Binary(bArr);
    }
}
