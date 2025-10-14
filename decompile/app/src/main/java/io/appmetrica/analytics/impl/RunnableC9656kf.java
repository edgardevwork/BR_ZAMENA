package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.kf */
/* loaded from: classes5.dex */
public final class RunnableC9656kf implements Runnable {

    /* renamed from: a */
    public final File f8514a;

    /* renamed from: b */
    public final Consumer f8515b;

    /* renamed from: c */
    public final C9328X9 f8516c;

    public RunnableC9656kf(File file, C8862E1 c8862e1, C9328X9 c9328x9) {
        this.f8514a = file;
        this.f8515b = c8862e1;
        this.f8516c = c9328x9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] fileArrListFiles;
        if (this.f8514a.exists() && this.f8514a.isDirectory() && (fileArrListFiles = this.f8514a.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                C9900u9 c9900u9M5743a = this.f8516c.m5743a(file.getName());
                try {
                    c9900u9M5743a.f9170a.lock();
                    c9900u9M5743a.f9171b.m5715a();
                    this.f8515b.consume(file);
                    c9900u9M5743a.m6854c();
                } catch (Throwable unused) {
                    c9900u9M5743a.m6854c();
                }
            }
        }
    }
}
