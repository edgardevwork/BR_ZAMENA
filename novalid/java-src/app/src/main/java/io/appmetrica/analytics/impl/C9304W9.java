package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p048io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: io.appmetrica.analytics.impl.W9 */
/* loaded from: classes5.dex */
public final class C9304W9 {

    /* renamed from: a */
    public final File f7397a;

    /* renamed from: b */
    public FileLock f7398b;

    /* renamed from: c */
    public RandomAccessFile f7399c;

    /* renamed from: d */
    public FileChannel f7400d;

    /* renamed from: e */
    public int f7401e;

    public C9304W9(Context context, String str) {
        this(m5714a(context, str));
    }

    /* renamed from: a */
    public final synchronized void m5715a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f7397a, "rw");
            this.f7399c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f7400d = channel;
            if (this.f7401e == 0) {
                this.f7398b = channel.lock();
            }
            this.f7401e++;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized void m5716b() {
        try {
            this.f7397a.getAbsolutePath();
            int i = this.f7401e - 1;
            this.f7401e = i;
            if (i == 0) {
                AbstractC8946Ha.m5244a(this.f7398b);
            }
            AbstractC9664kn.m6341a((Closeable) this.f7399c);
            AbstractC9664kn.m6341a((Closeable) this.f7400d);
            this.f7399c = null;
            this.f7398b = null;
            this.f7400d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C9304W9(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public C9304W9(File file) {
        this.f7401e = 0;
        this.f7397a = file;
    }

    /* renamed from: a */
    public static File m5714a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
