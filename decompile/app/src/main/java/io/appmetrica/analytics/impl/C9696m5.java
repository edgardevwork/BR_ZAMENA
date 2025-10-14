package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.m5 */
/* loaded from: classes5.dex */
public class C9696m5 {

    /* renamed from: a */
    public final C9646k5 f8623a;

    /* renamed from: b */
    public final C9671l5 f8624b;

    /* renamed from: c */
    @NonNull
    protected final Context f8625c;

    /* renamed from: d */
    public final C9396a5 f8626d;

    /* renamed from: e */
    public final C8840D4 f8627e;

    /* renamed from: f */
    public final AbstractC9521f5 f8628f;

    /* renamed from: g */
    @NonNull
    protected final C9637jl f8629g;

    /* renamed from: h */
    public final InterfaceC8827Cg f8630h;

    /* renamed from: i */
    public final C8869E8 f8631i;

    /* renamed from: j */
    public final ICommonExecutor f8632j;

    /* renamed from: k */
    public final C8772Ab f8633k;

    /* renamed from: l */
    public final int f8634l;

    public C9696m5(Context context, C9396a5 c9396a5, C8840D4 c8840d4, AbstractC9521f5 abstractC9521f5, C9637jl c9637jl, InterfaceC8827Cg interfaceC8827Cg, ICommonExecutor iCommonExecutor, int i, C8772Ab c8772Ab) {
        this(context, c9396a5, c8840d4, abstractC9521f5, c9637jl, interfaceC8827Cg, iCommonExecutor, new C8869E8(), i, new C9646k5(c8840d4.f6445a), new C9671l5(context, c9396a5), c8772Ab);
    }

    /* renamed from: c */
    public static C9303W8 m6464c(C9571h5 c9571h5) {
        return new C9303W8(c9571h5);
    }

    /* renamed from: a */
    public final C8992J8 m6466a() {
        Context context = this.f8625c;
        C9396a5 c9396a5 = this.f8626d;
        return new C8992J8(new C9112O8(context, c9396a5), this.f8634l);
    }

    /* renamed from: b */
    public final C9062M6 m6469b(C9571h5 c9571h5) {
        return new C9062M6(c9571h5, C9398a7.m5836a(this.f8625c).m5842c(this.f8626d), new C8966I6(c9571h5.mo5025c()), new C9573h7());
    }

    /* renamed from: d */
    public final C9646k5 m6472d() {
        return this.f8623a;
    }

    /* renamed from: e */
    public final C9671l5 m6473e() {
        return this.f8624b;
    }

    /* renamed from: f */
    public final C9964wn m6474f() {
        C9964wn c9964wn;
        InterfaceC8784An c9376z9;
        C10039zn c10039znM6363A = C9676la.f8552C.m6363A();
        C9396a5 c9396a5 = this.f8626d;
        synchronized (c10039znM6363A) {
            try {
                String strValueOf = String.valueOf(c9396a5);
                LinkedHashMap linkedHashMap = c10039znM6363A.f9410b;
                Object c9964wn2 = linkedHashMap.get(strValueOf);
                if (c9964wn2 == null) {
                    C9755oe c9755oe = new C9755oe(C9398a7.m5836a(c10039znM6363A.f9409a).m5840b(c9396a5));
                    if (c9396a5.mo5829d()) {
                        String str = "appmetrica_vital_" + c9396a5.f7669b + ".dat";
                        c9376z9 = new C9746o5(CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m7112to(str, new C9376Z9(c10039znM6363A.f9409a, str)), TuplesKt.m7112to("appmetrica_vital_main.dat", new C9376Z9(c10039znM6363A.f9409a, "appmetrica_vital_main.dat"))}));
                    } else {
                        c9376z9 = new C9376Z9(c10039znM6363A.f9409a, "appmetrica_vital_" + c9396a5.f7669b + ".dat");
                    }
                    c9964wn2 = new C9964wn(c9755oe, c9376z9, strValueOf);
                    linkedHashMap.put(strValueOf, c9964wn2);
                }
                c9964wn = (C9964wn) c9964wn2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9964wn;
    }

    public C9696m5(Context context, C9396a5 c9396a5, C8840D4 c8840d4, AbstractC9521f5 abstractC9521f5, C9637jl c9637jl, InterfaceC8827Cg interfaceC8827Cg, ICommonExecutor iCommonExecutor, C8869E8 c8869e8, int i, C9646k5 c9646k5, C9671l5 c9671l5, C8772Ab c8772Ab) {
        this.f8625c = context;
        this.f8626d = c9396a5;
        this.f8627e = c8840d4;
        this.f8628f = abstractC9521f5;
        this.f8629g = c9637jl;
        this.f8630h = interfaceC8827Cg;
        this.f8632j = iCommonExecutor;
        this.f8631i = c8869e8;
        this.f8634l = i;
        this.f8623a = c9646k5;
        this.f8624b = c9671l5;
        this.f8633k = c8772Ab;
    }

    /* renamed from: c */
    public final C9147Pj m6470c() {
        return new C9147Pj(this.f8625c, this.f8626d);
    }

    /* renamed from: d */
    public final C9121Oh m6471d(C9571h5 c9571h5) {
        C9121Oh c9121Oh = new C9121Oh(c9571h5, this.f8628f.mo5749a(), this.f8632j);
        C8772Ab c8772Ab = this.f8633k;
        synchronized (c8772Ab) {
            c8772Ab.f6323c.add(c9121Oh);
        }
        return c9121Oh;
    }

    /* renamed from: a */
    public final C9607ig m6467a(C9571h5 c9571h5) {
        return new C9607ig(new C8852Dg(c9571h5, this.f8630h, new C9250U3()), this.f8629g, new C8777Ag(this.f8627e));
    }

    /* renamed from: a */
    public static C9338Xj m6460a(C9571h5 c9571h5, C9964wn c9964wn, C9546g5 c9546g5) {
        C9314Wj c9314Wj = new C9314Wj(c9964wn);
        return new C9338Xj(c9571h5, c9314Wj, c9546g5, new C9526fa(c9571h5, c9314Wj, new C9411ak(c9571h5.m6210g(), "foreground"), AbstractC9742o1.m6565a(), new SystemTimeProvider()), new C8938H2(c9571h5, c9314Wj, new C9411ak(c9571h5.m6210g(), "background"), AbstractC9742o1.m6565a(), new SystemTimeProvider()), new C9017K9(c9571h5.f8228a));
    }

    /* renamed from: b */
    public static C9446c5 m6463b() {
        return new C9446c5();
    }

    /* renamed from: a */
    public final C9625j9 m6468a(C9755oe c9755oe, C9964wn c9964wn, C9338Xj c9338Xj, C9062M6 c9062m6, C9491e0 c9491e0, C9147Pj c9147Pj, C9121Oh c9121Oh) {
        return new C9625j9(c9755oe, c9964wn, c9338Xj, c9062m6, c9491e0, this.f8631i, c9147Pj, this.f8634l, new C9621j5(c9121Oh), new C9160Q8(c9964wn, new C9183R8(c9964wn)), new SystemTimeProvider());
    }

    /* renamed from: a */
    public static C9073Mh m6459a(C9571h5 c9571h5, C9303W8 c9303w8) {
        return new C9073Mh(c9303w8, c9571h5);
    }

    /* renamed from: a */
    public static C8866E5 m6458a(C9062M6 c9062m6) {
        return new C8866E5(c9062m6);
    }

    /* renamed from: a */
    public static C9803qc m6462a(C9062M6 c9062m6, C9607ig c9607ig) {
        return new C9803qc(c9062m6, c9607ig);
    }

    /* renamed from: a */
    public static C9775p9 m6461a(ArrayList arrayList, InterfaceC9850s9 interfaceC9850s9) {
        return new C9775p9(arrayList, interfaceC9850s9);
    }

    /* renamed from: a */
    public final C8864E3 m6465a(C9755oe c9755oe) {
        Context context = this.f8625c;
        return new C8864E3(context, c9755oe, context.getPackageName(), new SafePackageManager());
    }
}
