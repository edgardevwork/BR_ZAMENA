package com.sdkit.paylib.paylibpayment.impl.domain.network.applications;

import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.modules.SerializersModule;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.applications.f */
/* loaded from: classes8.dex */
public final /* synthetic */ class C8519f {
    /* renamed from: a */
    public static Object m3975a(Class cls, SerializersModule serializersModule, InterfaceC8556a interfaceC8556a, String str) {
        return interfaceC8556a.decodeFromString(SerializersKt.serializer(serializersModule, Reflection.typeOf(cls)), str);
    }
}
