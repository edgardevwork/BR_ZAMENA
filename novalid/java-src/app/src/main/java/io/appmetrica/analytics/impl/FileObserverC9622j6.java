package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* renamed from: io.appmetrica.analytics.impl.j6 */
/* loaded from: classes5.dex */
public final class FileObserverC9622j6 extends FileObserver {

    /* renamed from: a */
    public final Consumer f8405a;

    /* renamed from: b */
    public final File f8406b;

    /* renamed from: c */
    public final C9352Y9 f8407c;

    public FileObserverC9622j6(File file, C8862E1 c8862e1, C9352Y9 c9352y9) {
        super(file.getAbsolutePath(), UnixStat.PERM_MASK);
        this.f8405a = c8862e1;
        this.f8406b = file;
        this.f8407c = c9352y9;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f8405a;
        C9352Y9 c9352y9 = this.f8407c;
        File file = this.f8406b;
        c9352y9.getClass();
        consumer.consume(new File(file, str));
    }
}
