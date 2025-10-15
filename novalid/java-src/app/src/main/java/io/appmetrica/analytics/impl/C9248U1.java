package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserModel;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.U1 */
/* loaded from: classes5.dex */
public final class C9248U1 implements InterfaceC9715n {

    /* renamed from: a */
    public final ArrayList f7306a = new ArrayList();

    /* renamed from: b */
    public volatile C8768A7 f7307b = null;

    /* renamed from: a */
    public final void m5625a(@NonNull C8768A7 c8768a7) {
        ArrayList arrayListM5624a;
        synchronized (this) {
            this.f7307b = c8768a7;
            arrayListM5624a = m5624a();
        }
        Iterator it = arrayListM5624a.iterator();
        while (it.hasNext()) {
            ((InterfaceC9954wd) it.next()).consume(c8768a7);
        }
    }

    /* renamed from: b */
    public final void m5626b() {
        C9820r4.m6725i().f8970e.m6616a(this, EnumC9690m.CREATED);
    }

    /* renamed from: c */
    public final void m5627c() {
        C9820r4.m6725i().f8970e.m6618b(this, EnumC9690m.CREATED);
    }

    /* renamed from: a */
    public final synchronized ArrayList m5624a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f7306a);
        this.f7306a.clear();
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9715n
    @MainThread
    /* renamed from: a */
    public final void mo5297a(@NonNull Activity activity, @NonNull EnumC9690m enumC9690m) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", ActivityChooserModel.ATTRIBUTE_ACTIVITY, new C9200S1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        C9224T1 c9224t1 = new C9224T1(dataString);
        synchronized (this) {
            try {
                C8768A7 c8768a7 = this.f7307b;
                if (c8768a7 == null) {
                    this.f7306a.add(c9224t1);
                } else {
                    ((C9975x9) C9820r4.m6725i().f8968c.m6201a()).f9301b.post(new RunnableC9176R1(c9224t1, c8768a7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
