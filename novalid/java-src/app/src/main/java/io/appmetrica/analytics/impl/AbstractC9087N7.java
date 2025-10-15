package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.N7 */
/* loaded from: classes8.dex */
public abstract class AbstractC9087N7 {

    /* renamed from: a */
    public final Context f7018a;

    /* renamed from: b */
    public final ProtobufStateStorage f7019b;

    /* renamed from: c */
    public final AbstractC9135P7 f7020c;

    /* renamed from: d */
    public final InterfaceC9414an f7021d;

    /* renamed from: e */
    public final InterfaceC9101Nl f7022e;

    /* renamed from: f */
    public final InterfaceC9709mi f7023f;

    /* renamed from: g */
    public final InterfaceC9659ki f7024g;

    /* renamed from: h */
    public final InterfaceC8767A6 f7025h;

    /* renamed from: i */
    public InterfaceC9111O7 f7026i;

    public AbstractC9087N7(Context context, ProtobufStateStorage protobufStateStorage, AbstractC9135P7 abstractC9135P7, InterfaceC9414an interfaceC9414an, InterfaceC9101Nl interfaceC9101Nl, InterfaceC9709mi interfaceC9709mi, InterfaceC9659ki interfaceC9659ki, InterfaceC8767A6 interfaceC8767A6, InterfaceC9111O7 interfaceC9111O7) {
        this.f7018a = context;
        this.f7019b = protobufStateStorage;
        this.f7020c = abstractC9135P7;
        this.f7021d = interfaceC9414an;
        this.f7022e = interfaceC9101Nl;
        this.f7023f = interfaceC9709mi;
        this.f7024g = interfaceC9659ki;
        this.f7025h = interfaceC8767A6;
        this.f7026i = interfaceC9111O7;
    }

    @NotNull
    /* renamed from: a */
    public final synchronized InterfaceC9111O7 m5433a() {
        return this.f7026i;
    }

    /* renamed from: b */
    public final synchronized boolean m5436b(@NotNull InterfaceC9182R7 interfaceC9182R7) {
        try {
            boolean z = false;
            if (interfaceC9182R7.mo5271a() == EnumC9159Q7.f7145b) {
                return false;
            }
            if (Intrinsics.areEqual(interfaceC9182R7, this.f7026i.mo5322b())) {
                return false;
            }
            List listMo5321a = (List) this.f7021d.invoke(this.f7026i.mo5321a(), interfaceC9182R7);
            boolean z2 = listMo5321a != null;
            if (listMo5321a == null) {
                listMo5321a = this.f7026i.mo5321a();
            }
            if (this.f7020c.mo5030a(interfaceC9182R7, this.f7026i.mo5322b())) {
                z = true;
            } else {
                interfaceC9182R7 = (InterfaceC9182R7) this.f7026i.mo5322b();
            }
            if (z || z2) {
                InterfaceC9111O7 interfaceC9111O7 = this.f7026i;
                InterfaceC9111O7 interfaceC9111O72 = (InterfaceC9111O7) this.f7022e.invoke(interfaceC9182R7, listMo5321a);
                this.f7026i = interfaceC9111O72;
                this.f7019b.save(interfaceC9111O72);
                AbstractC9984xi.m6965a("Update distribution data: %s -> %s", interfaceC9111O7, this.f7026i);
            }
            return z;
        } finally {
        }
    }

    /* renamed from: c */
    public final synchronized InterfaceC9182R7 m5437c() {
        try {
            if (!this.f7024g.mo5224a()) {
                InterfaceC9182R7 interfaceC9182R7 = (InterfaceC9182R7) this.f7023f.invoke();
                this.f7024g.mo5225b();
                if (interfaceC9182R7 != null) {
                    m5436b(interfaceC9182R7);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC9182R7) this.f7026i.mo5322b();
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC9182R7 m5434a(@NotNull InterfaceC9182R7 interfaceC9182R7) {
        InterfaceC9182R7 interfaceC9182R7M5437c;
        this.f7025h.mo4928a(this.f7018a);
        synchronized (this) {
            m5436b(interfaceC9182R7);
            interfaceC9182R7M5437c = m5437c();
        }
        return interfaceC9182R7M5437c;
    }

    @NotNull
    /* renamed from: b */
    public final InterfaceC9182R7 m5435b() {
        this.f7025h.mo4928a(this.f7018a);
        return m5437c();
    }
}
