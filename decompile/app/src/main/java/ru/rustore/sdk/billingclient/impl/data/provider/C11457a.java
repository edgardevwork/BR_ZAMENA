package ru.rustore.sdk.billingclient.impl.data.provider;

import com.sdkit.paylib.paylibpayment.api.config.BackendUrlProvider;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibContext;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import ru.rustore.sdk.billingclient.BuildConfig;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11427e;
import ru.rustore.sdk.billingclient.impl.data.repository.C11478f;
import ru.rustore.sdk.billingclient.impl.data.repository.C11486n;
import ru.rustore.sdk.billingclient.impl.data.repository.C11488p;
import ru.rustore.sdk.billingclient.impl.data.repository.C11496x;
import ru.rustore.sdk.billingclient.impl.domain.model.C11505b;
import ru.rustore.sdk.billingclient.impl.domain.model.C11506c;
import ru.rustore.sdk.billingclient.impl.domain.model.C11511h;
import ru.rustore.sdk.billingclient.impl.p067di.C11497a;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.a */
/* loaded from: classes7.dex */
public final class C11457a implements BackendUrlProvider {

    /* renamed from: a */
    public final C11478f f10246a;

    public C11457a() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        this.f10246a = (C11478f) C11497a.C11965b.m7463a().f10395u.getValue();
    }

    @Override // com.sdkit.paylib.paylibpayment.api.config.BackendUrlProvider
    public final String baseUrl(PaylibContext paylibContext) {
        return BackendUrlProvider.DefaultImpls.baseUrl(this, paylibContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    @Override // com.sdkit.paylib.paylibpayment.api.config.BackendUrlProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getBaseUrl() {
        C11506c c11506c;
        String str;
        Lazy<C11497a> lazy = C11497a.f10328u0;
        int iM7466a = C11505b.m7466a(((C11486n) C11497a.C11965b.m7463a().f10336H.getValue()).m7456a());
        if (iM7466a == 0) {
            C11427e c11427e = ((C11488p) C11497a.C11965b.m7463a().f10393t.getValue()).f10306d;
            synchronized (c11427e) {
                c11506c = c11427e.f10213a;
            }
            if (c11506c != null) {
                str = c11506c.f10488c;
            }
        } else {
            if (iM7466a != 1) {
                throw new NoWhenBranchMatchedException();
            }
            C11511h c11511hM7461a = ((C11496x) C11497a.C11965b.m7463a().f10338J.getValue()).m7461a();
            str = c11511hM7461a != null ? c11511hM7461a.f10498c : null;
        }
        if (str != null) {
            return str;
        }
        this.f10246a.f10291a.getClass();
        return BuildConfig.SBER_BACKEND_URL;
    }
}
