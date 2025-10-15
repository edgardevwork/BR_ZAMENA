package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.kg */
/* loaded from: classes6.dex */
public final class C9657kg implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C9757og f8517a;

    public C9657kg(C9757og c9757og) {
        this.f8517a = c9757og;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        C9527fb c9527fb = (C9527fb) obj;
        C9757og c9757og = this.f8517a;
        String str = c9527fb.f8111h;
        String str2 = c9527fb.f8108e;
        Integer num = c9527fb.f8109f;
        String str3 = c9527fb.f8110g;
        C9520f4 c9520f4 = new C9520f4(str, str2, num, str3, c9527fb.f8112i);
        String str4 = c9527fb.f8105b;
        byte[] bArr = c9527fb.f8104a;
        int i = c9527fb.f8106c;
        HashMap map = c9527fb.f8107d;
        String str5 = c9527fb.f8113j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(bArr, str4, 5889, orCreatePublicLogger);
        c9445c4.f7811q = map;
        c9445c4.f7315g = i;
        c9445c4.f7311c = str5;
        C8865E4 c8865e4 = new C8865E4(new C9487dl(), new C8840D4(), null);
        c9757og.f8855c.m6692a(c9520f4, c8865e4).mo5290a(c9445c4, c8865e4);
        c9757og.f8855c.m6693a(num.intValue(), str2, str3);
    }
}
