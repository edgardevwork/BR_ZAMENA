package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p048io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.b7 */
/* loaded from: classes6.dex */
public final class C9423b7 {

    /* renamed from: a */
    public final InterfaceC8990J6 f7769a;

    /* renamed from: b */
    public final List f7770b;

    /* renamed from: c */
    public final boolean f7771c;

    public C9423b7(InterfaceC8990J6 interfaceC8990J6, ArrayList arrayList, boolean z) {
        this.f7769a = interfaceC8990J6;
        this.f7770b = arrayList;
        this.f7771c = z;
    }

    /* renamed from: a */
    public final String m5899a(Context context, InterfaceC9349Y6 interfaceC9349Y6) {
        File parentFile;
        try {
            File fileMo5298a = this.f7769a.mo5298a(context, interfaceC9349Y6.mo5703b());
            if (!fileMo5298a.exists() && (parentFile = fileMo5298a.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                m5900a(context, interfaceC9349Y6.mo5702a(), fileMo5298a);
            }
            return fileMo5298a.getPath();
        } catch (Throwable unused) {
            return interfaceC9349Y6.mo5703b();
        }
    }

    /* renamed from: a */
    public final void m5900a(Context context, String str, File file) {
        List list = this.f7770b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File fileMo5298a = ((InterfaceC8990J6) it.next()).mo5298a(context, str);
            if (fileMo5298a.exists()) {
                try {
                    if (this.f7771c) {
                        FileUtils.copyToNullable(fileMo5298a, file);
                    } else {
                        FileUtils.move(fileMo5298a, file);
                    }
                    String path = fileMo5298a.getPath();
                    String path2 = file.getPath();
                    for (String str2 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"-journal", "-shm", "-wal"})) {
                        File file2 = new File(path + str2);
                        File file3 = new File(path2 + str2);
                        if (this.f7771c) {
                            FileUtils.copyToNullable(file2, file3);
                        } else {
                            FileUtils.move(file2, file3);
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }
}
