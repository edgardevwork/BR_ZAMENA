package com.sdkit.paylib.paylibnetwork.impl.domain;

import android.content.Context;
import android.content.res.Resources;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p051io.CloseableKt;
import kotlin.p051io.TextStreamsKt;
import kotlin.text.Charsets;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.f */
/* loaded from: classes6.dex */
public final class C8480f {

    /* renamed from: a */
    public final Context f4180a;

    /* renamed from: b */
    public final PaylibLoggerFactory f4181b;

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.f$a */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Lazy f4182a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Lazy lazy) {
            super(0);
            this.f4182a = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return C8480f.m3854b(this.f4182a);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.f$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ List f4183a;

        /* renamed from: b */
        public final /* synthetic */ C8480f f4184b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, C8480f c8480f) {
            super(0);
            this.f4183a = list;
            this.f4184b = c8480f;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() throws Resources.NotFoundException {
            List list = this.f4183a;
            C8480f c8480f = this.f4184b;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InputStream stream = c8480f.f4180a.getResources().openRawResource(((Number) it.next()).intValue());
                try {
                    Intrinsics.checkNotNullExpressionValue(stream, "stream");
                    String text = TextStreamsKt.readText(new InputStreamReader(stream, Charsets.UTF_8));
                    CloseableKt.closeFinally(stream, null);
                    arrayList.add(text);
                } finally {
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList2.add(next);
                }
            }
            return arrayList2;
        }
    }

    public C8480f(Context context, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f4180a = context;
        this.f4181b = loggerFactory;
    }

    /* renamed from: b */
    public static final List m3854b(Lazy lazy) {
        return (List) lazy.getValue();
    }

    /* renamed from: a */
    public static /* synthetic */ C8479e m3852a(C8480f c8480f, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c8480f.m3855a(list, z);
    }

    /* renamed from: a */
    public final C8479e m3855a(List certificates, boolean z) {
        Intrinsics.checkNotNullParameter(certificates, "certificates");
        return new C8479e(new a(LazyKt__LazyJVMKt.lazy(new b(certificates, this))), z, this.f4181b);
    }
}
