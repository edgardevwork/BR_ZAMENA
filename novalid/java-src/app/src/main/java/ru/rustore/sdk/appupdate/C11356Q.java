package ru.rustore.sdk.appupdate;

import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.InstallState;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;
import ru.rustore.sdk.reactive.subject.StateSubject;
import ru.rustore.sdk.reactive.subject.SubjectExtensionsKt;

/* renamed from: ru.rustore.sdk.appupdate.Q */
/* loaded from: classes6.dex */
public final class C11356Q {

    /* renamed from: a */
    @NotNull
    public final MutableStateSubject<InstallState> f10059a;

    /* renamed from: b */
    @NotNull
    public final StateSubject<InstallState> f10060b;

    public C11356Q() {
        MutableStateSubject<InstallState> mutableStateSubject = new MutableStateSubject<>(InstallState.INSTANCE.empty$sdk_public_appupdate_release());
        this.f10059a = mutableStateSubject;
        this.f10060b = SubjectExtensionsKt.asStateSubject(mutableStateSubject);
    }
}
